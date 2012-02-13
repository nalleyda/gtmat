/*
 * Text coloring filter applied to any editor window by adding
 * it with the lines:
 *
        if (styledDoc instanceof AbstractDocument) {
            doc = (AbstractDocument)styledDoc;
            doc.setDocumentFilter(new ColorFilter());
        } else {
            System.err.println("Text pane's document isn't an AbstractDocument!");
            System.exit(-1);
        }
 * 
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.text.*;
import javax.swing.text.DocumentFilter.*;
import java.util.StringTokenizer;
/**
 *
 * @author dsmith
 */
public class ColorFilter extends DocumentFilter implements Runnable {

    private EditWindow window = null;
    private AbstractDocument doc = null;

    public ColorFilter() {
    }

    public ColorFilter(EditWindow theWin) {
        window = theWin;
    }

    public void setWindow(EditWindow window) {
        this.window = window;
        if (window != null) {
            doc = window.doc;
        }
    }

    @Override
    public void insertString(FilterBypass fb,
                         int offset,
                         String string,
                         AttributeSet attr)
                  throws BadLocationException {
        DocumentAnalyzer analyzer = new DocumentAnalyzer(string, offset);
        ArrayList<Token> tokens = analyzer.analyze();
        for (Token t : tokens) {
            super.insertString(fb, t.getOffset(), t.getToken(), t.getAttr());
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length,
            String text, AttributeSet attrs) throws BadLocationException {
        super.replace(fb, offset, length, text, attrs);
    }

    public void run() {
        String str = null;
        doc = window.doc;
        int start = doc.getStartPosition().getOffset();
        int N = doc.getLength();
        try {
            str = doc.getText(start, N);
            DocumentAnalyzer analyzer = new DocumentAnalyzer(str, start);
            ArrayList<Token> tokens = analyzer.analyze();
            for (Token t : tokens) {
                ((StyledDocument)doc).setCharacterAttributes(t.getOffset(),
                        t.getToken().length(), t.getAttr(), true);
            }
        } catch(BadLocationException e) {};
        System.out.println("run color filter on: " + str);
    }

    private class Token {

        private String token;
        private AttributeSet attr;
        private int offset;

        public Token(String token, AttributeSet attr, int offset) {
            this.token = token;
            this.attr = attr;
            this.offset = offset;
        }

        public AttributeSet getAttr() {
            return attr;
        }

        public String getToken() {
            return token;
        }

        public int getOffset() {
            return offset;
        }
    }

    private class DocumentAnalyzer {

        private String input;
        private int initialOffset;

        private String keyWords[] = { "function",
                              "if",
                              "else",
                              "elseif",
                              "end",
                              "while",
                              "for",
                              "switch",
                              "case",
                              "try",
                              "catch",
                              "global"
        };
        private static final String STRING_DELIM  = " \t\n\r(){}[]<>+-*~!|\\@&/.,:;=\"''%";
        private static final String ALPHANUMERIC_REGEX = "[0-9a-zA-Z_-]+";
        private static final byte NONE = (1 << 0);
        private static final byte CHAR_FLAG = (1 << 1);
        private static final byte COMMENT_FLAG = (1 << 2);
        private static final byte PARENTHESIS_FLAG = (1 << 3);

        public DocumentAnalyzer(String input, int initialOffset) {
            this.input = input;
            this.initialOffset = initialOffset;
        }
        
        public ArrayList<Token> analyze() {
            ArrayList<Token> output = new ArrayList<Token>();

            StringTokenizer tokenizer = new StringTokenizer(input, STRING_DELIM, true);
            String previousToken = "";
            byte flag = NONE;
            int whereToInsert = initialOffset;
            AttributeSet attr = createAttributeSetWithColor(Color.BLACK);

            while(tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                int parenthesisCount = 0;

                if (token.equals("\n")) {
                    flag = NONE;
                    previousToken = "";
                }

                switch(flag) {
                    case (COMMENT_FLAG):{
                        // Comment flag is set when % mark that is not inside quotation mark is found
                        // Everything should be commented after the % mark if the flag is set,
                        // hence it is checked first
                        attr = colorizeString(token, COMMENT_FLAG);
                        break;
                    }
                    case (CHAR_FLAG):{
                        if(isQuote(token)) {
                            // Closing quotation mark found
                            flag = NONE;
                        }
                        // Color it magenta
                        attr = colorizeString(token, CHAR_FLAG);
                        break;
                    }
                    case (PARENTHESIS_FLAG):{
                        if(token.equals("%")) {
                            // % mark that is not inside a quotation marks is a comment
                            flag = COMMENT_FLAG;
                            attr = colorizeString(token, COMMENT_FLAG);
                        } else if(isQuote(token) && !previousToken.matches(ALPHANUMERIC_REGEX)) {
                            // Opening quotation mark found
                            flag = CHAR_FLAG | PARENTHESIS_FLAG;
                            attr = colorizeString(token, CHAR_FLAG);
                        } else if(isParenthesisClose(token)) {
                            // Closing quotation mark found
                            parenthesisCount--;
                            if(parenthesisCount == 0) {
                                // If parenthesis count is 0. It is balanced,
                                // return to "none" state
                                flag = NONE;
                                attr = colorizeString(token, PARENTHESIS_FLAG);
                            } else {
                                // If parenthesis count is not 0. It is not balanced,
                                // so it should still stay in the "parenthesis" state
                                attr = colorizeString(token, PARENTHESIS_FLAG);
                            }
                        } else {
                            attr = colorizeString(token, PARENTHESIS_FLAG);
                        }
                        break;
                    }
                    case (CHAR_FLAG | PARENTHESIS_FLAG):{
                        if(isQuote(token)) {
                            // Closing quotation mark found
                            flag = PARENTHESIS_FLAG;
                        } 
                        // Color it magenta
                        attr = colorizeString(token, CHAR_FLAG);
                        break;
                    }
                    case (NONE):{
                        if(token.equals("%")) {
                            // % mark that is not inside a quotation marks is a comment
                            flag = COMMENT_FLAG;
                            attr = colorizeString(token, COMMENT_FLAG);
                        } else if(isQuote(token) && !previousToken.matches(ALPHANUMERIC_REGEX)) {
                            // Opening quotation mark found
                            flag = CHAR_FLAG;
                            attr = colorizeString(token, CHAR_FLAG);
                        } else if(isParenthesisOpen(token) && previousToken.matches(ALPHANUMERIC_REGEX)) {
                            // Opening indexing or function call (shouldn't be colored unless it's a char)
                            parenthesisCount++;
                            flag = PARENTHESIS_FLAG;
                            attr = colorizeString(token, PARENTHESIS_FLAG);
                        } else {
                            attr = colorizeString(token, NONE);
                        }
                        break;
                    }
                    default:{
                        // It should never get here
                        attr = colorizeString(token, flag);
                        break;
                    }
                }

                previousToken = token;
                output.add(new Token(token, attr, whereToInsert));
                whereToInsert += token.length();
            }

            return output;
        }

        private AttributeSet createAttributeSetWithColor(Color color) {
            SimpleAttributeSet newAttrs = new SimpleAttributeSet();
            StyleConstants.setForeground(newAttrs, color);
            StyleConstants.setFontFamily(newAttrs, "Monospaced");
            return newAttrs;
        }

        private AttributeSet colorizeString(String string, int flag) {
            switch(flag){
                case COMMENT_FLAG:{
                    return createAttributeSetWithColor(new Color(0, 100, 0));
                }
                case CHAR_FLAG:{
                    return createAttributeSetWithColor(new Color(244, 0, 161));
                }
                case PARENTHESIS_FLAG:{
                    return createAttributeSetWithColor(Color.black);
                }
                case NONE:{
                    for(int i = 0; i < keyWords.length; i++) {
                        if (string.equals(keyWords[i])) {
                            return createAttributeSetWithColor(Color.blue);
                        }
                    }
                    return createAttributeSetWithColor(Color.black);
                }
                default:{
                    return createAttributeSetWithColor(Color.black);
                }
            }
        }

        private boolean isQuote(String token) {
            return token.equals("'") || token.equals("\"");
        }

        private boolean isParenthesisOpen(String token) {
            return token.equals("{") || token.equals("(");
        }

        private boolean isParenthesisClose(String token) {
            return token.equals("}") || token.equals(")");
        }
    }
}

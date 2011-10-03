/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import parser.TreeWalker;

/**
 *
 * @author dsmith
 */
public class GT_Token implements Token {

    private String text;
    private int type;
    private int line;

    public GT_Token(int ty, String tx) {
        type = ty;
        text = new String(tx);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int ttype) {
        type = ttype;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCharPositionInLine() {
        return 0;
    }

    public void setCharPositionInLine(int pos) {
    }

    public int getChannel() {
        return 0;
    }

    public void setChannel(int channel) {
    }

    public int getTokenIndex() {
        return 0;
    }

    public void setTokenIndex(int index) {
    }

    public CharStream getInputStream() {
        return null;
    }

    public void setInputStream(CharStream input) {
    }
    
    public String toString() {
        return "<" + TreeWalker.convert(type) + ", '" + text + "'>"; 
    }        
}

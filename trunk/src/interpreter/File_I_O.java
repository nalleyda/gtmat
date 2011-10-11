/*
 * I/O tools for the ANTLR BaseTree
 */
package interpreter;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;
import main.*;
import parser.*;

/**
 *
 * @author dsmith
 */
public class File_I_O {

    private static LinkedList<TreeNode> nodes = null;
    private static File newFile;
    public static String currentTFile = null;

    public static void readandRunTFile(String name) throws Exception {
        int rootIndex = 0;
        BufferedReader in = null;
        boolean keepGoing = true;
        LinkedList<CommonTree> treeList = new LinkedList();
        nodes = new LinkedList();
        CommonTree theTree = null;
        currentTFile = name;
        if (name != null) {
            try {
                in = new BufferedReader(new FileReader(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("File " + name + " did not open");
                System.exit(1);
            }
            try {
                String str = in.readLine();
                str = in.readLine();
                // check version number and store the root index
                StringTokenizer tk = new StringTokenizer(str, ":");
                String token = tk.nextToken();   // GTMat etc.
                token = tk.nextToken();   // Version number
                if (token.equals(Main.version)) {
                    token = tk.nextToken();   // Root node label
                    token = tk.nextToken();   // root node
                    rootIndex = Integer.parseInt(token);
                    while (str != null) {
                        // typical: |21|1 '14'|1 '17'|1 '18'|1 '23'|1 '27'|% IF
                        str = in.readLine();
                        if (str == null) {
                            break;
                        }
                        tk = new StringTokenizer(str, "|");
                        token = tk.nextToken();  // sequence number
                        token = tk.nextToken();  // line number
                        int lineStr = Integer.parseInt(token);
                        token = tk.nextToken();  // Node type
                        int type = Integer.parseInt(token);
                        String tname = "" + TreeWalker.convert(type);
                        keepGoing = true;
                        GT_Token gttk = new GT_Token(type, tname);
                        gttk.setLine(lineStr);
                        theTree = new CommonTree(gttk);
                        while (keepGoing && tk.hasMoreTokens()) {
                            token = tk.nextToken();
                            keepGoing = token.charAt(0) != '%';
                            if (keepGoing) {
                                CommonTree child = TreeNode.parse(token, treeList);
                                theTree.addChild(child);
                            }
                        }
                        treeList.add(theTree);
                    }
                    if (rootIndex + 1 == treeList.size()) {
                        System.out.println("Read in the tree, now walk it:");
                        DataHolder dh = new DataHolder(theTree);
                        Main.wstack.peek().setDataHolder(dh);
                        TreeWalker.process(theTree);
                    } else {
                        Interpreter.displayError("Something rotten in the State of Denmark");
                    }
                } else {
                    Interpreter.displayError("File out of date - version: " + token
                            + "; System version" + Main.version);
                }
            } catch (IOException e) {
                System.err.println("File " + name + " did not open");
                System.exit(1);
            }
        }
    }

    public static void deleteCurrent() {
        delete(currentTFile);
    }

    public static void delete(String fileName) {
        // A File object to represent the filename
        File f = new File(fileName);

        // Make sure the file or directory exists and isn't write protected
        if (!f.exists()) {
            throw new IllegalArgumentException(
                    "Delete: no such file or directory: " + fileName);
        }

        if (!f.canWrite()) {
            throw new IllegalArgumentException("Delete: write protected: "
                    + fileName);
        }

        // If it is a directory, make sure it is empty
        if (f.isDirectory()) {
            String[] files = f.list();
            if (files.length > 0) {
                throw new IllegalArgumentException(
                        "Delete: directory not empty: " + fileName);
            }
        }

        // Attempt to delete it
        boolean success = f.delete();

        if (!success) {
            throw new IllegalArgumentException("Delete: deletion failed");
        }
    }

    private static String serialize(int rootNum) {
        String res = "GT_Mat version:" + Main.version
                + ": root node:" + rootNum + "\n";
        for (int i = 0; i < nodes.size(); i++) {
            res += "|" + i + nodes.get(i) + "\n";
        }
        return res;
    }

    public static File saveTFile(String name, String str, String header) {
        PrintStream output = null;
        File res = new File(name);
        try {
            output = new PrintStream(res);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("saveTFile " + name + " not found");
        };
        CommonTree tr = GTParser.makeTree(str);
        String treeStr = outputTree(tr);
        output.print(header + "\n");
        output.print(treeStr);
        output.close();
        return res;
    }
    private static int opens = 0;

    private static void checkToken(String token) {
        if (token.equals("function")) {
            throw new RuntimeException("helper function with no preceding end");
        }
        if (token.equals("end")) {
            opens--;
        } else if (token.equals("if")
                || token.equals("switch")
                || token.equals("for")
                || token.equals("while")) {
            opens++;
        }
    }

    private static String stripQuotes(String str) {
        boolean keepGoing = true;
        int from, to;
        int ticks = 0;
        // first scan the string for a % outside quotes
        // if found, it's a comment - remove the rest of the line
        for(int i = 0; keepGoing && (i < str.length()); i++) {
            char ch = str.charAt(i);
            switch(ch) {
                case '\'':
                    ticks++;
                    break;
                case '%':
                    if((ticks & 1) == 0) {
                        str = str.substring(0, i);
                        keepGoing = false;
                    }
                    break;
            }
        }
        keepGoing = true;
        while (keepGoing) {
            from = str.indexOf('\'');
            keepGoing = from >= 0;
            if (keepGoing) {
                to = str.indexOf('\'', from + 1);
                str = str.substring(0, from) + str.substring(to + 1);
            }
        }
        return str;
    }

    private static String nameFromHeader(String str) {
        StringTokenizer stk;
        int eq = str.indexOf('=');
        if (eq > 0) {
            str = str.substring(eq + 1);
            stk = new StringTokenizer(str, " (");
        } else {
            stk = new StringTokenizer(str, " (");
            stk.nextToken();  // get the function
        }
        return stk.nextToken();
    }
    private static BufferedReader br = null;
    private static String toAdd = null;
    private static String result = null;
    private static int level = 0;
    private static int line;
    /*
     * stripIndexEnds
     * we want to keep copying buffer to the above result.  However,
     * internally, we need to ignore any ends contained in (..) or [..}
     * Unfortunately, these could span multiple lines so we need some ghastly 
     * scan of continued lines
     */

    private static String stripIndexEnds(String buffer)
            throws IOException {
        int i = 0;
        int from = 1000;
        int to = 0;
        char ch;
        String res = buffer;
        while (level == 0 && i < buffer.length()) {
            ch = buffer.charAt(i++);
            if (ch == '(' || ch == '{') {
                level++;
            }
        }
        if (level > 0) {
            from = i - 1;
            while (level > 0 && i < buffer.length()) {
                ch = buffer.charAt(i++);
                if (ch == '(' || ch == '{') {
                    level++;
                }
                if (ch == ')' || ch == '}') {
                    level--;
                }
            }
            to = i;
            res = buffer.substring(0, from) + buffer.substring(to);
            while (level > 0) {
                from = 0;
                i = 0;
                result += toAdd;
                buffer = br.readLine();
                toAdd = buffer + '\n';
                line++;
                buffer = stripQuotes(buffer);
                while (level > 0 && i < buffer.length()) {
                    ch = buffer.charAt(i++);
                    if (ch == '(' || ch == '{') {
                        level++;
                    }
                    if (ch == ')' || ch == '}') {
                        level--;
                    }
                }
                to = i;
                res += buffer.substring(0, from) + buffer.substring(to);
            }
        }
        return res;
    }

    private static boolean saveOneFunction(String prefix)
            throws IOException {
        boolean res = true;
        String header = br.readLine();
        result = "";
        String buffer;
        String token;
        line = 1;
        /* find the file header */
        while (header != null) {
            StringTokenizer stk = new StringTokenizer(header, " ");
            if (stk.hasMoreTokens()) {
                token = stk.nextToken();
            } else {
                token = null;
            }
            if (token != null && token.equals("function")) {
                break;
            }
            header = br.readLine();
            line++;
        }
        if (header == null) {
            return false;
        }
        String name = nameFromHeader(header);
        String tName = Main.getCurrentDirectory() + File.separator
                + prefix + name + ".t";
        /* parse the file until end of file or a lost END token */
        buffer = br.readLine();
        toAdd = buffer + '\n';
        line++;
        opens = 0;
        boolean done = false;
        while (buffer != null && !done) {
            /* tokenize every line */
            buffer = stripQuotes(buffer);
            level = 0;
            buffer = stripIndexEnds(buffer);
            StringTokenizer stk = new StringTokenizer(buffer, " ,;()[]{}");
            while (stk.hasMoreTokens() && !done) {
                token = stk.nextToken();
                checkToken(token);
                done = opens < 0;
            }
            if (!done) {
                result += toAdd;
                buffer = br.readLine();
                toAdd = buffer + '\n';
                line++;
            }
        }
        if (buffer == null) {
            res = false;
        }
        newFile = saveTFile(tName, result, header);
        return res;
    }

    /*
     * File saveFunctionTFile(name, br)
     * Most of this functionality will be in a helper function saveOneFunction
     * - reopen the source file
     * - repeat the fillowing
     * -- find the function header
     * -- keep reading the file until you reach EOF
     * --         or you hit an unbalanced end
     * -- an end symbol balances with if, switch, while or for
     * -- when you find the unbalanced end, build the T-File from the
     * -- code so far
     * -- if this is the first time through, save the tFile to return
     * -- to the user
     */
    public static File saveFunctionTFile(String name) {
        String fileName = Main.getCurrentDirectory() + File.separator
                + name + ".m";
        boolean keepGoing = true;
        File tFile = null;
        String prefix = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            while (keepGoing) {
                keepGoing = saveOneFunction(prefix);
                if (tFile == null) {
                    tFile = newFile;
                    prefix = name + "_";
                }
            }
        } catch (Exception e1) {
            throw new RuntimeException("function stream " + e1);
        }
        return tFile;
    }

    /** Serialize a whole tree not just a node */
    public static String outputTree(CommonTree tr) {
        nodes = new LinkedList();
        TreeElement res = writeTree(tr);
        return serialize(Integer.parseInt(res.text));
    }

    private static TreeElement store(TreeNode nd) {
        TreeElement res = new TreeElement(1, "" + nd.getID());
        nodes.add(nd);
//        Main.debug.println("at " + res.text + " Stored " + nd);
        return res;
    }

    private static TreeElement store(int ln, int typ, LinkedList<TreeElement> ll) {
        TreeElement res = null;
        TreeNode nn = new TreeNode(nodes.size(), typ, ln, ll);
        res = store(nn);
        return res;
    }

    private static TreeElement writeTree(CommonTree tr) {
        List children = tr.getChildren();
        int n;
        if (children == null) {
            n = 0;
        } else {
            n = children.size();
        }
        TreeElement res = null;
        if (n == 0) {
            res = new TreeElement(tr.getType(), tr.getText());
        } else {
            LinkedList<TreeElement> elements = new LinkedList();
            for (int i = 0; i < n; i++) {
                CommonTree ct = (CommonTree) tr.getChild(i);
                TreeElement it = writeTree(ct);
                elements.add(it);
            }
            res = store(tr.getLine(), tr.getType(), elements);
        }
        return res;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import main.Main;
import interpreter.TreeElement;
import java.util.LinkedList;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.StringTokenizer;

/**
 *
 * @author dsmith
 */
public class TreeNode {
    private int ID;
    private int type;
    private int line;
    private String text;
    private LinkedList<TreeElement> children;
    
    public TreeNode(int id, int ty, int ln) {
        this(id, ty, ln, "");
    }
    
    public TreeNode(int id, int ty, int ln, String tx) {
        ID = id;
        type = ty;
        text = new String(tx);
        children = new LinkedList();
        line = ln;
    }
    
    public TreeNode(int id, int ty, int ln, LinkedList<TreeElement> ll) {
        this(id, ty, ln);
        int n = ll.size();
        for(int i = 0; i < n; i++) {
            TreeElement el = new TreeElement(ll.get(i));
            add(el);
        }
    }
    
    public int getID() {
        return ID;
    }
    
    public int size() {
        return children.size();
    }
    
    public TreeElement get(int i) {
        return children.get(i);
    }
    
    public void add(TreeElement it) {
        children.add(it);
    }
    
        public static CommonTree parse(String str, LinkedList<CommonTree> lst) {
        CommonTree res = null;
        StringTokenizer tk = new StringTokenizer(str, " '");
        // typical: 1 '14'
        String token = tk.nextToken();
        int ty = Integer.parseInt(token);
        if (ty == TreeWalker.TYPE.STRING_LITERAL.ordinal()) {
            token = tk.nextToken("'");
//            token = tk.nextToken("'");
            while(tk.hasMoreTokens()) {
                token = token + "'" + tk.nextToken("'");
            }
        } else {
            token = tk.nextToken();
        }
        if(ty == 1) {
            int ndx = Integer.parseInt(token);
            res = lst.get(ndx);
        } else {
            GT_Token gttk = new GT_Token(ty, token);
            res = new CommonTree(gttk);
        }
        return res;
    }

    
    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if( o instanceof TreeNode ) {
            TreeNode tn = (TreeNode) o;
            if(tn.size() == size() ) {
                int n = size();
                res = true;
                for(int i = 0; i < n; i++) {
                    if(!tn.get(i).equals(get(i))) {
                        res = false;
                        break;
                    }
                }
            }
        }
        return res;
    }
    
    public String toString() {
        TreeWalker.TYPE tp = TreeWalker.convert(type);
        String res = "|" + line + "|" + type;
        for(int i = 0; i < children.size(); i++) {
            res += "|" + children.get(i);
        }
        return res + "|% " + tp;
    }
}

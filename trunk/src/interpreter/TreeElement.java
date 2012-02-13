/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;


/**
 *
 * @author dsmith
 */
public class TreeElement {
    int type;
    String text;
    
    public TreeElement(TreeElement t) {
        type = t.type;
        text = t.text;
    }
    
    public TreeElement(int ty, String tx) {
        type = ty;
        text = tx;
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if( o instanceof TreeElement ) {
            TreeElement tn = (TreeElement) o;
            res = (type == tn.type) && (text.equals(tn.text));
        }
        return res;
    }
    
    public String toString() {
        return "" + type + "'" + text + "'";
    }
}

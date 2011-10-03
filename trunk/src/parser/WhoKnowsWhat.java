/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author dsmith
 */
public class WhoKnowsWhat {
    public String str;
    public int size;
    
    public WhoKnowsWhat(String s, int n) {
        str = s;
        size = n;
    }
    
    public String toString() {
        return str + ", " + size;
    }
}

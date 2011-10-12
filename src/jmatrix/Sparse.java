/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

import java.util.ArrayList;
/**
 *
 * @author dsmith
 */
public class Sparse extends Matrix {

    private ArrayList<Entry> entries;
    
    public Sparse() {
        data = null;
        entries = null;
    }
    
    public Sparse(Matrix mr, Matrix mc, Matrix mv) {
        data = null;
        entries = new ArrayList();
        for(int i = 1; i <= mr.n; i++) {
            entries.add(new Entry(mr.geti(i), mc.geti(i), mv.get(i)));
        }
    }
    
    
    public void set(int r, int c, double v) {
        int i = findEntry(r, c);
        if(i >= 0) {
            Entry it = entries.get(i);
            it.val = v;
        }
        else {
            entries.add(new Entry(r, c, v));
        }
    }
    
    public double get(int r, int c) {
        double res = 0;
        int i = findEntry(r, c);
        if(i >= 0) {
            res = entries.get(i).val;
        }
        return res;
    }
    
    public static Sparse sparse(Matrix r, Matrix c, Matrix v) {
        return new Sparse(r, c, v);
    }
    
    
    private int findEntry(int r, int c) {
        int res = -1;
        for(int i = 0; i < entries.size(); i++) {
            Entry it = entries.get(i);
            if(it.row == r && it.col == c) {
                res = i;
                break;
            }
        }
        return res;
    }
    
    private class Entry {
        int row;
        int col;
        double val;
        
        public Entry(int r, int c, double v) {
            row = r;
            col = c;
            val = v;
        }
    }
}

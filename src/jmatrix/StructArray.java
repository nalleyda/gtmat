/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;

import main.*;

/**
 *
 * @author dsmith
 */
public class StructArray extends MatObject {
    private Structure theArray[];

    public StructArray() {
        type = STRUCT;
        theArray = new Structure[0];
    }

    public StructArray(Structure s) {
        this(1,1);
        theArray[0] = s;
    }

    
    public StructArray(int rows, int cols, Structure... data){
        super(rows, cols);
        copyData(data);
        type = STRUCT;
        checkFields();
    }

    public StructArray(int rows, int cols){
        super(rows, cols);
        if(n > 0) {
            theArray = new Structure[n];
        } else {
            theArray = null;
        }
        type = STRUCT;
    }
    
    @Override
    public StructArray clone() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.copyData(theArray);
        return res;
    }

    public StructArray copy() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.copyData(theArray);
        return res;
    }

    public StructArray zeroed() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.nullData();
        return res;
    }

    public StructArray empty() {
        return new StructArray();
    }

    public void copyValues(Matrix ndx, MatObject src) throws Exception{
        int in = ndx.length();
        int sn = src.length();
        StructArray it = (StructArray) src;
        if(sn == 1) {
            Structure val = it.get(1);
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, val);
            }
        } else {
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, it.get(i));
            }
        }
    }

    public void copyData(Structure[] data) {
        for(int i = 0; i < n; i++) {
            theArray[i] = data[i].clone();
        }
    }
    
    public void nullData() {
        for(int i = 0; i < n; i++) {
            theArray[i] = null;
        }
    }
    
    private String[] name;
    
    private boolean isFound(String str) {
        boolean res = false;
        for(int i = 0; i < name.length; i++) {
            if(str.equals(name[i])) {
                res = true;
                break;
            }
        }
        return res;
    }
    
    private void check(int ndx) {
        String itsName[] = theArray[ndx].fieldNames();
        if(itsName.length != name.length) {
            throw new RuntimeException("bad number of fields");
        }
        for(int i = 0; i < name.length; i++) {
            if(!isFound(itsName[i])) {
                throw new RuntimeException("bad field name: " + itsName[i]);
            }
        }
    }

    private void checkFields() {
        if(n > 1) {
            name = theArray[0].fieldNames();
            for(int i = 1; i < n; i++) {
                check(i);
            }
        }
    }
    
    public MatObject getField(String fld) {
        if(n == 1) return theArray[0].getField(fld);
        else throw new RuntimeException("can't extract from arrays yet");
    }
    
    public void setField(String fld, MatObject o) {
        for(int i = 0; i < n; i++) {
            theArray[i] = theArray[i].setField(fld, o);
        }
    }
    
    public void setField(int ndx, String fld, MatObject o) {
        theArray[ndx-1] = theArray[ndx-1].setField(fld, o);
    }
    
    
    public static Structure get(StructArray m, int r, int c) {
        return m.get(r,c);
    }

    public static Structure get(StructArray m, int i) throws Exception {
        return m.get(i);
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public Structure get(int i) throws Exception {
        try{
       return theArray[i - 1];
        }
        catch (Exception e){
            throw new Exception("??? Index out of Bounds");
        }
        
    }
    

    
    public Structure get(int r, int c) {
        return theArray[(c-1) * size[ROW] + (r-1)];
    }

    public String[] fieldNames() {
        String res[] = new String[0];
        if(n > 0) res = theArray[0].fieldNames();
        return res;
    }
    
    public boolean isField(String fld) {
        boolean res = false;
        if(n > 0) res = theArray[0].isField(fld);
        return res;
    }
    
    private void extend(int rw, int cl) {
        if (rw > size[ROW]
                || cl > size[COL]
                || (cl == 1 && rw > size[ROW] * size[COL])) {
            int rm = rw > size[ROW] ? rw : size[ROW];
            int cm = cl > size[COL] ? cl : size[COL];
            Structure nd[] = new Structure[rm * cm];
            for (int r = 1; r <= size[ROW]; r++) {
                for (int c = 1; c <= size[COL]; c++) {
                    Structure d = get(r, c);
                    nd[(c - 1) * rm + (r - 1)] = d;
                }
            }
            theArray = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }

    public void set(int r, int c, Structure s) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        theArray[(c-1) * size[ROW] + (r-1)] = s;
    }

    public void set(int i, Structure s) {
        if (i > n) {
            throw new RuntimeException("StructArray:set(i...) i too big");
        }
        ;
        theArray[i - 1] = s;
    }

    public StructArray hcat(Structure s) {
        return hcat(new StructArray(s));
    }
    
    public StructArray vcat(Structure s) {
        return vcat(new StructArray(s));
    }
    
    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public StructArray hcat(StructArray o) {
        StructArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int ocols = o.size[COL];
        int cols = size[COL];
        if (o.size[ROW] != size[ROW]) {
            throw new RuntimeException("StructArray.hcat bad rows");
        }
        res = new StructArray(rows, cols + ocols);
        // copy all matrices into res
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                res.set(r, c, get(r, c));
            }
            for (int c = 1; c <= ocols; c++) {
                res.set(r, c + cols, o.get(r, c));
            }
        }
        res.checkFields();
        return res;
    }

    /**
     * vertical concatenation Matrix
     * @param m
     * @return
     */
    public StructArray vcat(StructArray ca) {
        StructArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int carows = ca.size[ROW];
        int cols = size[COL];
        if (ca.size[COL] != size[COL]) {
            throw new RuntimeException("StructArray.vcat bad cols");
        }
        res = new StructArray(rows + carows, cols);
        // copy all cells into res
        for (int c = 1; c <= cols; c++) {
            for (int r = 1; r <= rows; r++) {
                res.set(r, c, get(r, c));
            }
            for (int r = 1; r <= carows; r++) {
                res.set(r + rows, c, ca.get(r, c));
            }
        }
        res.checkFields();
        return res;
    }

    @Override
    public String toString() {
        String ret = "";
        if(n == 1) ret = theArray[0].toString();
        else {
            ret = "" + size[ROW] + "x" + size[COL] + " Structure with fields:\n";
            String fn[] = theArray[0].fieldNames();
            for (int i = 0; i < fn.length; i++) {
                ret = ret + fn[i] + "\n";
            }
        }
        return ret;
    }
    
    
    public static void main(String[] args) throws Exception{
        String names[] = {"a","b","c"};
        MatObject avals[] = {new Matrix(1), new Matrix(2), new MatString("abc")};
        MatObject bvals[] = {new Matrix(4), new Matrix(5), new MatString("def")};
        MatObject cvals[] = {new Matrix(7), new Matrix(8), new MatString("ghijk")};
        Structure str[] = {new Structure(names, avals),
                           new Structure(names, bvals),
                           new Structure(names, cvals)};
        StructArray sa = new StructArray(1, 3, str);
        System.out.println(sa);
        System.out.println(sa.get(1));
        sa = sa.hcat(str[1]);
        System.out.println(sa);
        names[1] = "xx";
        Structure bad = new Structure(names, cvals);
        sa = sa.hcat(bad);
        System.out.println(sa + "\n" + sa.get(5));
    }
}

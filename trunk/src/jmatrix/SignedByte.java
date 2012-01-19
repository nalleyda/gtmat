/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

import main.Main;
import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 *
 * @author dsmith
 */
public class SignedByte extends MatObject {

    public byte data[];  // 

    /* Constructors */
    /**
     * empty
     */
    public SignedByte() {
        this(0);
    }

    /**
     * 1.1 a scalar
     * @param x - the value
     */
    public SignedByte(int num) {
        n = num;
        size = new int[2];
        dimensions = 2;
        type = Type.BYTE;
        data = new byte[num];
        size[COL] = num;
        size[ROW] = 1;
    }

    public SignedByte(byte x[], int num) {
        this(num);
        for (int i = 0; i < n; i++) {
            data[i] = x[i];
        }
    }

    /**
     * a rectangular array
     * @param rows
     * @param cols
     */
    public SignedByte(int rows, int cols) {
        n = rows * cols;
        if (n > 0) {
            data = new byte[n];
        } else {
            data = null;
        }
        type = Type.BYTE;
        size = new int[2];
        size[ROW] = rows;
        size[COL] = cols;
        dimensions = 2;
    }

    /**
     * 3. an array of bytes
     * @param x - the value
     */
    public SignedByte(double x[]) {
        this(x.length);
        for (int i = 0; i < n; i++) {
            data[i] = (byte) x[i];
        }
    }

    /**
     * clone a matrix
     * @param v
     */
    public SignedByte(SignedByte v) {
        this(v.n);
        for (int i = 0; i < n; i++) {
            data[i] = v.data[i];
        }
    }

    public SignedByte empty() {
        return new SignedByte();
    }
    @Override
    public SignedByte clone() {
        return new SignedByte(this);
    }

    public SignedByte copy() {
        return new SignedByte(this);
    }

    public SignedByte zeroed() {
        return new SignedByte(this);
    }


    /* accessors */
    private void extend(int rw, int cl) {
        if (rw > size[ROW]
                || cl > size[COL]
                || (cl == 1 && rw > size[ROW] * size[COL])) {
            int rm = rw > size[ROW] ? rw : size[ROW];
            int cm = cl > size[COL] ? cl : size[COL];
            byte nd[] = new byte[rm * cm];
            for (int r = 1; r <= size[ROW]; r++) {
                for (int c = 1; c <= size[COL]; c++) {
                    byte d = get(r, c);
                    nd[(c - 1) * rm + (r - 1)] = d;
                }
            }
            data = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }
    

    public void append(byte ba[], int num) {
        int rm = 1;
        int cm = num + size[COL];
        byte nd[] = new byte[cm];
        for (int i = 0; i < n; i++) {
            nd[i] = data[i];
        }
        for (int i = 0; i < num; i++) {
            nd[i+n] = ba[i];
        }
        data = nd;
        n = rm * cm;
        size[ROW] = rm;
        size[COL] = cm;
    }

    private void extend(int to) {
        if (to > size[ROW] * size[COL]) {
            SignedByte m = reshape(size[ROW] * size[COL], 1);
            m.extend(to, 1);
            data = m.data;
            n = m.n;
            size = m.size;
        }
    }

    /**
     * get a value from a matrix
     * @param r - the row  [offset 1]
     * @param c - the column
     * @return
     */
    public byte get(int r, int c) {
        return data[(c - 1) * size[ROW] + (r - 1)];
    }

    /**
     * set a value in a matrix
     * @param r - the row
     * @param c - the column
     * @param val - the value
     */
    public void set(int r, int c, byte val) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        data[(c - 1) * size[ROW] + (r - 1)] = val;
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public byte get(int i) {
        return data[i - 1];
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public int geti(int i) {
        return (int) data[i - 1];
    }

    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        SignedByte it = (SignedByte) src;
        if(sn == 1) {
            byte val = it.get(1);
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

    /**
     * set a value in a linearized array
     * @param i
     * @param val
     */
    public void set(int i, byte val) {
        if (i > n) {
            throw new RuntimeException("Matrix:set(i...) i too big");
        }
        ;
        data[i - 1] = val;
    }

    /**
     * Copy a Byte into a Byte
     * @param rndx - target rows
     * @param cndx - target columns
     * @param vals -  source data
     */
    public void set(Matrix rndx, Matrix cndx, SignedByte vals) {
//        Main.debug.println("set " + this + " at rows " + rndx
//                + " at cols " + cndx + " to " + vals);
        if (rndx.size[ROW] != 1
                || cndx.size[ROW] != 1) {
            throw new RuntimeException("Matrix.set bad row or col vector");
        }
        if (rndx.size[COL] != vals.size[ROW]
                || cndx.size[COL] != vals.size[COL]) {
            throw new RuntimeException("Matrix.set bad row or col vector size");
        }
        int mxr = (int) ((SignedByte) rndx.max().get(1, 1)).data[0];
        int mxc = (int) ((SignedByte) cndx.max().get(1, 2)).data[0];
        if (mxr > size[ROW]) {
            extend(mxr, size[COL]);
        }
        if (mxc > size[COL]) {
            extend(size[ROW], mxc);
        }
        for (int ri = 0; ri < rndx.size[COL]; ri++) {
            for (int ci = 0; ci < cndx.size[COL]; ci++) {
                set((int) rndx.data[ri],
                        (int) cndx.data[ci],
                        vals.get(ri + 1, ci + 1));
            }
        }
    }

    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public static SignedByte hcat(SignedByte[] m) {
        SignedByte res;
        int cols = 0;
        int rows = m[0].size[ROW];
        int col = 0;
        // calculate cols and check rows
        for (int i = 0; i < m.length; i++) {
            cols += m[i].size[COL];
            if (m[i].size[ROW] != rows) {
                throw new RuntimeException("Matrix.hcat bad rows in item " + i);
            }
        }
        res = new SignedByte(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            SignedByte it = m[i];
            for (int c = 1; c <= it.size[COL]; c++) {
                for (int r = 1; r <= rows; r++) {
                    res.set(r, c + col, it.get(r, c));
                }
            }
            col += it.size[COL];
        }
        return res;
    }

    /**
     * vertical concatenation (array of matrices)
     * @param m
     * @return
     */
    public static SignedByte vcat(SignedByte[] m) {
        SignedByte res;
        int rows = 0;
        int cols = m[0].size[COL];
        int row = 0;
        // calculate cols and check rows
        for (int i = 0; i < m.length; i++) {
            rows += m[i].size[ROW];
            if (m[i].size[COL] != cols) {
                throw new RuntimeException("Matrix.hcat bad columns in item " + i);
            }
        }
        res = new SignedByte(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            SignedByte it = m[i];
            for (int c = 1; c <= cols; c++) {
                for (int r = 1; r <= it.size[ROW]; r++) {
                    res.set(r + row, c, it.get(r, c));
                }
            }
            row += it.size[ROW];
        }
        return res;
    }

    /**
     * reshape
     * @param rows
     * @param cols
     * @return
     */
    public SignedByte reshape(int rows, int cols) {
        if (n != rows * cols) {
            throw new RuntimeException("Matrix.reshape bad size");
        }
        SignedByte res = new SignedByte(this);
        res.size[ROW] = rows;
        res.size[COL] = cols;
        return res;
    }

    /**
     *  index an array
     * @param ri
     * @param ci
     * @return
     */
    public SignedByte index(Matrix ri, Matrix ci) {
        if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
            throw new RuntimeException("Matrix.index indices must be vectors");
        }
        SignedByte res = new SignedByte(ri.n, ci.n);
        for (int r = 1; r <= ri.n; r++) {
            int rndx = (int) ri.get(r);
            for (int c = 1; c <= ci.n; c++) {
                int cndx = (int) ci.get(c);
                res.set(r, c, get(rndx, cndx));
            }
        }
        return res;
    }

    /**
     * index a vector
     * @param ci
     * @return
     */
    public SignedByte index(Matrix ci) {
        if (ci.size[ROW] != 1) {
            throw new RuntimeException("Byte.index index must be a vector");
        }
        SignedByte res = new SignedByte(1, ci.n);
        for (int c = 1; c <= ci.n; c++) {
            int cndx = (int) ci.get(c);
            res.set(1, c, get(1, cndx));
        }
        return res;
    }

    public double getMin() {
        double res = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] < res) {
                res = data[i];
            }
        }
        return res;
    }

    public double getMax() {
        double res = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] > res) {
                res = data[i];
            }
        }
        return res;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public String toString() {
        int rows = size[ROW];
        int cols = size[COL];
        String res = "SignedByte of size " + rows + "*" + cols;
        return res;
    }
}

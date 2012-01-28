/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 *
 * @author dsmith
 */
public class UnsignedByte extends MatObject {

    double data[];  // always store a vector of doubles
    // stored in column order

    /* Constructors */
    /**
     * empty
     */
    public UnsignedByte() {
        this(0.0);
    }

    /**
     * 1.1 a scalar
     * @param x - the value
     */
    public UnsignedByte(double x) {
        n = 1;
        size = new int[2];
        type = Type.BYTE;
        data = new double[1];
        // byte boundary
        if (x > 255){
            x = 255;
        }
        else if (x < 0){
            x = 0;
        }
        data[0] = x;
        size[COL] = 1;
        size[ROW] = 1;
    }

    /**
     * 1.3 3 scalars
     * @param x - one value
     * @param y - another value
     */
    public UnsignedByte(double x, double y, double z) {
        n = 3;
        size = new int[2];
        type = Type.BYTE;
        data = new double[3];
        if (x > 255){
            x = 255;
        }else if (x < 0){
            x = 0;
        }
        if (y > 255){
            y = 255;
        }else if (y < 0){
            y = 0;
        }
        if (z > 255){
            z = 255;
        }else if (z < 0){
            z = 0;
        }
        data[0] = x;
        data[1] = y;
        data[2] = z;
        size[COL] = 3;
        size[ROW] = 1;
    }

    /**
     * 1.2 2 scalars
     * @param x - one value
     * @param y - another value
     */
    public UnsignedByte(double x, double y) {
        n = 2;
        size = new int[2];
        type = Type.BYTE;
        data = new double[2];
        if (x > 255){
            x = 255;
        }else if (x < 0){
            x = 0;
        }
        if (y > 255){
            y = 255;
        }else if (y < 0){
            y = 0;
        }
        data[0] = x;
        data[1] = y;
        size[COL] = 2;
        size[ROW] = 1;
    }
    
    public UnsignedByte(Matrix m) {
        this(m.data);
    }

    /* Constructors */
    /**
     * 2. an array of doubles
     * @param x - the value
     */
    public UnsignedByte(double x[]) {
        n = x.length;
        size = new int[2];
        type = Type.BYTE;
        data = new double[n];
        for(int i = 0; i < n; i++) {
            if (x[i] > 255){
                x[i] = 255;
            }else if (x[i] < 0){
                x[i] = 0;
            }
            data[i] = x[i];
        }
        size[COL] = n;
        size[ROW] = 1;
    }
    /**
     * 3. an array of bytes
     * @param x - the value
     */
    public UnsignedByte(byte x[]) {
        n = x.length;
        size = new int[2];
        type = Type.BYTE;
        data = new double[n];
        for(int i = 0; i < n; i++) {
            data[i] = x[i] >= 0 ? x[i] : 0;
        }
        size[COL] = n;
        size[ROW] = 1;
    }
    /**
     * a rectangular array
     * @param rows
     * @param cols
     */
    public UnsignedByte(int rows, int cols) {
        n = rows * cols;
        if (n > 0) {
            data = new double[n];
        } else {
            data = null;
        }
        type = Type.BYTE;
        size = new int[2];
        size[ROW] = rows;
        size[COL] = cols;
    }

    /**
     * clone a matrix
     * @param v
     */
    public UnsignedByte(UnsignedByte v) {
        data = new double[v.n];
        n = v.n;
        for (int i = 0; i < n; i++) {
            data[i] = v.data[i];
        }
        type = v.type;
        size = new int[v.size.length];
        for (int i = 0; i < v.size.length; i++) {
            size[i] = v.size[i];
        }
    }

    public UnsignedByte(UnsignedByte v, int init) {
        data = new double[v.n];
        n = v.n;
        for (int i = 0; i < n; i++) {
            data[i] = init;
        }
        type = v.type;
        size = new int[v.size.length];
        for (int i = 0; i < v.size.length; i++) {
            size[i] = v.size[i];
        }
    }

    public UnsignedByte empty() {
        return new UnsignedByte();
    }

    public UnsignedByte copy() {
        return new UnsignedByte(this);
    }

    public UnsignedByte zeroed() {
        return new UnsignedByte(this, 0);
    }

/**
     * tokenize a string
     * @param str
     */
    public UnsignedByte(String str) {
        ArrayList<Double> a = new ArrayList<Double>();
        StringTokenizer tk = new StringTokenizer(str, "[], ");

        while (tk.hasMoreTokens()) {
            String token = tk.nextToken();
            Double it = Double.parseDouble(token);
            a.add(it);
        }
        n = a.size();
        data = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = a.get(i);
        }
        size = new int[2];
        size[COL] = n;
        size[ROW] = 1;
        type = Type.DOUBLE;
    }

    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        UnsignedByte it = new UnsignedByte((Matrix) src);
        if(sn == 1) {
            double val = it.get(1);
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

    //Convert limit value from 0 to 255
    public int bound0to255(double x){
        // byte boundary
        if (x > 255){
            x = 255;
        }
        else if (x < 0){
            x = 0;
        }
        return (int) x;
    }

    public static double max(UnsignedByte ma[], int ndx) {
        double res = ma[0].data[ndx];
        for(int i = 1; i < ma.length; i++) {
            if(ma[i].data[ndx] > res) res = ma[i].data[ndx];
        }
        return res;
    }
    
    public static double min(UnsignedByte ma[], int ndx) {
        double res = ma[0].data[ndx];
        for(int i = 1; i < ma.length; i++) {
            if(ma[i].data[ndx] < res) res = ma[i].data[ndx];
        }
        return res;
    }
    /* accessors */

    private void extend(int rw, int cl) {
        if (rw > size[ROW]
                || cl > size[COL]
                || (cl == 1 && rw > size[ROW] * size[COL])) {
            int rm = rw > size[ROW] ? rw : size[ROW];
            int cm = cl > size[COL] ? cl : size[COL];
            double nd[] = new double[rm * cm];
            for (int r = 1; r <= size[ROW]; r++) {
                for (int c = 1; c <= size[COL]; c++) {
                    double d = get(r, c);
                    nd[(c - 1) * rm + (r - 1)] = d;
                }
            }
//            Main.debug.println("extending " + this + " to ["
//                    + rw + "," + cl + "]");
            data = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }

    private void extend(int to) {
        if (to > size[ROW] * size[COL]) {
            UnsignedByte m = reshape(size[ROW] * size[COL], 1);
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
    public double get(int r, int c) {
        return data[(c - 1) * size[ROW] + (r - 1)];
    }

    /**
     * set a value in a matrix
     * @param r - the row
     * @param c - the column
     * @param val - the value
     */
    public void set(int r, int c, double val) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        // byte boundary
        if (val > 255){
            val = 255;
        }
        else if (val < 0){
            val = 0;
        }
        data[(c - 1) * size[ROW] + (r - 1)] = val;
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public double get(int i) {
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

    /**
     * set a value in a linearized array
     * @param i
     * @param val
     */
    public void set(int i, double val) {
        if(i > n) {
            throw new RuntimeException("Matrix:set(i...) i too big");
        };
        // byte boundary
        if (val > 255){
            val = 255;
        }
        else if (val < 0){
            val = 0;
        }
        data[i - 1] = val;
    }

    /**
     * Copy a Matrix into a Matrix
     * @param rndx - target rows
     * @param cndx - target columns
     * @param vals -  source data
     */
    public void set(UnsignedByte rndx, UnsignedByte cndx, UnsignedByte vals) {
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
        int mxr = (int) ((UnsignedByte) rndx.max().get(1,1)).data[0];
        int mxc = (int) ((UnsignedByte) cndx.max().get(1,2)).data[0];
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

    /* static methods */
    private static double interp1(UnsignedByte x, UnsignedByte y, double x0) {
        if ((x0 < x.data[0]) || (x0 > x.data[x.n - 1])) {
            return Double.NaN;
        }
        double res = 0;
        boolean found = false;
        for (int i = 1; !found && (i < x.n); i++) {
            found = (x.data[i] >= x0);
            if (found) {
                res = y.data[i - 1]
                        + (y.data[i] - y.data[i - 1]) * (x0 - x.data[i - 1]) / (x.data[i] - x.data[i - 1]);
            }
        }
        return res;
    }

    /**
     * linear interpolation
     * @param x
     * @param y
     * @param xi
     * @return
     */
    public static UnsignedByte interp1(UnsignedByte x, UnsignedByte y, UnsignedByte xi) {
        if (x.size[ROW] != 1
                || y.size[ROW] != 1
                || xi.size[ROW] != 1) {
            throw new RuntimeException("Matrix.interp1 params must be vectors");
        }
        UnsignedByte res = new UnsignedByte(xi);
        for (int i = 0; i < xi.n; i++) {
            res.data[i] = interp1(x, y, xi.data[i]);
        }
        return res;
    }

    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public static UnsignedByte hcat(UnsignedByte[] m) {
        UnsignedByte res;
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
        res = new UnsignedByte(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            UnsignedByte it = m[i];
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
    public static UnsignedByte vcat(UnsignedByte[] m) {
        UnsignedByte res;
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
        res = new UnsignedByte(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            UnsignedByte it = m[i];
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
     * zeros
     * @param rows
     * @param cols
     * @return
     */
    public static UnsignedByte zeros(int rows, int cols) {
        UnsignedByte res = new UnsignedByte(rows, cols);
        for (int i = 0; i < res.n; i++) {
            res.data[i] = 0;
        }
        return res;
    }

    /**
     * ones
     * @param rows
     * @param cols
     * @return
     */
    public static UnsignedByte ones(int rows, int cols) {
        UnsignedByte res = new UnsignedByte(rows, cols);
        for (int i = 0; i < res.n; i++) {
            res.data[i] = 1;
        }
        return res;
    }

    /**
     * rand
     * @param rows
     * @param cols
     * @return
     */
    public static UnsignedByte rand(int rows, int cols) {
        UnsignedByte res = new UnsignedByte(rows, cols);
        for (int i = 0; i < res.n; i++) {
            res.data[i] = Math.random();
        }
        return res;
    }

    /**
     * colon
     * @param from
     * @param to
     * @return
     */
    public static UnsignedByte colon(double from, double to) {
        return colon(from, 1, to);
    }

    /**
     * colon
     * @param from
     * @param inc
     * @param to
     * @return
     */
    public static UnsignedByte colon(double from, double inc, double to) {
        UnsignedByte res = null;
        double newv;

        if (Math.abs(inc) < 0.0000000000001) {
            throw new RuntimeException("Matrix.colon with zero increment");
        }
        int n = (int) ((to - from) / inc) + 1;
        if (n > 0) {
            res = new UnsignedByte(1, n);
            res.data[0] = from;
            res.n = 1;
            if (inc > 0) {
                newv = res.data[0] + inc;
                while (newv <= to) {
                    res.data[res.n++] = newv;
                    newv += inc;
                }
            } else {
                newv = res.data[0] + inc;
                while (newv >= to) {
                    res.data[res.n++] = newv;
                    newv += inc;
                }
            }
        } else {
            res = new UnsignedByte(1, 0);
        }
        return res;
    }

    /**
     * linspace
     * @param from
     * @param to
     * @return
     */
    public static UnsignedByte linspace(double from, double to) {
        return linspace(from, to, 100);
    }

    /**
     * linspace
     * @param from
     * @param to
     * @param n
     * @return
     */
    public static UnsignedByte linspace(double from, double to, int n) {
        UnsignedByte res = null;
        double dv = 0;
        if (n < 0) {
            throw new RuntimeException("Matrix.linspace negative count");
        }
        if (n > 1) {
            dv = (to - from) / (n - 1);
        }
        res = new UnsignedByte(1, n);
        res.data[0] = from;
        res.n = n;
        for (int i = 1; i < n; i++) {
            res.data[i] = res.data[i - 1] + dv;
        }
        return res;
    }

    // Make an identity sMatrix.
    /**
     * eye
     * @param sz
     * @return
     */
    public static UnsignedByte identity(int sz) {
        UnsignedByte m = zeros(sz, sz);

        //Fill diagonal with 1's
        for (int x = 1; x <= sz; x++) {
            m.set(x, x, 1);
        }
        return (m);
    }

    /**
     * magic (odd indices only)
     * @param n
     * @return
     */
    public static UnsignedByte magic(int n) {
        if (n % 2 == 0) {
            throw new RuntimeException("Matrix.magic must have odd parameters");
        }
        UnsignedByte m = zeros(n, n);
        int i, j;
        int nn = n * 3 / 2;
        int num = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                int r = 1 + (j - i + nn) % n;
                int c = 1 + (i * 2 - j + n) % n;
                m.set(r, c, num++);
            }
        }
        return m;
    }

    /**
     * polyfit
     * @param x
     * @param y
     * @param power
     * @return
     */
    public static UnsignedByte polyfit(UnsignedByte x, UnsignedByte y, int power) {
        int size = power + 1;
        UnsignedByte it = null;

        UnsignedByte A = zeros(size, size);
        UnsignedByte B = zeros(size, 1);
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                it = x.pow(2 * size - r - c);
                A.set(r, c, it.sum().data[0]);
            }
            B.set(r, 1, it.mult(y).sum().data[0]);
        }
        UnsignedByte Ai = A.inv();
        UnsignedByte cf = Ai.matMult(B);
        return cf;
    }

    /**
     * polyval
     * @param cf
     * @param x
     * @return
     */
    public static UnsignedByte polyval(UnsignedByte cf, UnsignedByte x) {
        /* evaluate the polynomial c0*x^n + c1*x^n-1 + ... + cn-1*x + cn
        returning a sVector of the same length as x */
        UnsignedByte res = UnsignedByte.ones(1, x.n).mult(cf.data[0]);
        for (int nc = 1; nc < cf.n; nc++) {
            for (int id = 0; id < res.n; id++) {
                res.data[id] = res.data[id] * x.data[id] + cf.data[nc];
            }
        }
        return res;
    }

    /* 
     * spline
     *  compute the cubic spline that fits [x y] at the points [xi yi]
     *   Algorithm nicely explained by Sky McKinley and Megain Levine
     *   of the College of the Redwoods in Eureka, Ca
     * @param x
     * @param y
     * @param xi
     * @return
     */
    public static UnsignedByte spline(UnsignedByte x, UnsignedByte y, UnsignedByte xi) {
        UnsignedByte res = UnsignedByte.ones(1, xi.n);
        int np = x.n;
        if (y.n != np || x.size[ROW] != 1 || y.size[ROW] != 1) {
            throw new RuntimeException("Matrix.spline bad x or y inputs");
        }
        /*
         * we need to solve n-2 equations to determine the curvature values Mi
         * at each of the interior [x y] points.
         * we also assume that the x values are uniformly spaced at h
         * and that they are monotonically increasing.  [An ugly sort might
         * remove this constraint later]
         */
        double h = (x.data[np - 1] - x.data[0]) / (np - 1);
        // build an (n-2 by n-2) array to invert
        UnsignedByte A = UnsignedByte.zeros(np - 2, np - 2);
        A.set(1, 1, 6);
        A.set(np - 2, np - 2, 6);
        for (int r = 2; r < (np - 2); r++) {
            A.set(r, r - 1, 1);
            A.set(r, r, 4);
            A.set(r, r + 1, 1);
        }
        // now create B - the RHS
        UnsignedByte B = UnsignedByte.zeros(np - 2, 1);
        for (int r = 1; r <= (np - 2); r++) {
            B.set(r, 1, (y.get(r) - 2 * y.get(r + 1) + y.get(r + 2)) * 6 / (h * h));
        }
        UnsignedByte M = A.inv().matMult(B);
        double Mi = 2 * M.get(1) - M.get(2);
        double Mip1;
        double cf[] = new double[4];
        int at = 0;
        boolean keepGoing = false;
        for (int i = 1; i < np; i++) {
            if (i < (np - 1)) {
                Mip1 = M.get(i);
            } else {
                Mip1 = 2 * M.get(np - 2) - M.get(np - 3);
            }
            cf[0] = (Mip1 - Mi) / (6 * h);                            // ai
            cf[1] = Mi / 2;                                         // bi
            cf[2] = (y.get(i + 1) - y.get(i)) / h - (Mip1 + 2 * Mi) * h / 6;// ci
            cf[3] = y.get(i);                                     // di
            while (at < xi.n && (keepGoing || xi.data[at] <= x.get(i+1))) {
                double it = xi.data[at] - x.get(i);
                res.data[at] = ((cf[0] * it + cf[1]) * it + cf[2]) * it
                        + cf[3];
                at++;
            }
            Mi = Mip1;
            keepGoing = i == (np - 2);
        }
        return res;
    }
    
    public static CellArray meshgrid(UnsignedByte x, UnsignedByte y) {
        if (x.size[ROW] > 1 || y.size[ROW] > 1) {
            throw new RuntimeException("Matrix.meshgrid must have vector inputs");
        }
        CellArray res = new CellArray(1,2);
        UnsignedByte xx = new UnsignedByte(y.n, x.n);   
        UnsignedByte yy = new UnsignedByte(y.n, x.n);
        for(int r = 1; r <= y.n; r++) {
            for(int c = 1; c <= x.n; c++) {
                xx.set(r, c, x.get(1,c));
                yy.set(r, c, y.get(1,r));
            }
        }
        res.set(1, 1, xx);
        res.set(1, 2, yy);
        return res;
    }

    public static UnsignedByte applyFunction(String fName, UnsignedByte a, UnsignedByte b) {
        if(a.n != b.n ) {
            throw new RuntimeException("Matrix.applyFunction bad a or b inputs");
        }
        UnsignedByte res = new UnsignedByte(a);
        res.data = applyMathMethodToVector(a.data, fName, b.data);
        return res;
    }

    /* dynamic methods */

    public UnsignedByte applyFunction(String fName) {
        UnsignedByte res = new UnsignedByte(this);
        res.data = applyMathMethodToVector(data, fName);
        return res;
    }

    
    /** add in the ability to use any of our Matlab types - just a simple casting based on a string input*/
    /**
     * Applies any function defined in the java.lang.Math package to a vector of doubles.
     *
     * @param vec is the vector of doubles to which we apply the method
     * @param methodName is the name of the method as a String (i.e. "cos")
     * @param otherParams is just a list of any other parameters you might have
     *
     * @return is the vector which is obtained from applying the method to each element in vec
     */
    private static double[] applyMathMethodToVector(double[] vec, String methodName, double[] vec2) {

        double[] newvec = new double[vec.length];

        try {

            //Create instances of the Math and double classes (use Double.TYPE for the wrapper)
            Class doubleClass = double.class;
            Class mathClass = Math.class; //Class.forName("java.lang.Math"); // <-- alternative way

            //Create an array of Object parameters from input, and assume all parameter
            //types are doubles (for now)
            Object[] params = {doubleClass, doubleClass};
            Class[] parTypes = {doubleClass, doubleClass};

            //Get an instance of the method that we want to use
            Method meth = mathClass.getMethod(methodName, parTypes);

            //Apply the method to everything in the input vector one element at a time
            for (int i = 0; i < vec.length; i++) {
                params[0] = vec[i];
                
                //Check dimensions
                if (vec2.length == vec.length)
                	params[1] = vec2[i];
                else if (vec2.length == 1)
                	params[1] = vec2[0];
                else
                	throw new RuntimeException("Matrix dimensions must agree.");
                
                newvec[i] = (Double) meth.invoke(Double.class, params);
            }



        } catch (Throwable e) {
            System.err.println(e);
        }

        return newvec;

    }
    
    /**
     * This takes in no second parameter, and is intended for functions such as "cos"
     * @param vec
     * @param methodName
     * @return
     */
    private static double[] applyMathMethodToVector(double[] vec, String methodName) {

        double[] newvec = new double[vec.length];

        try {

            //Create instances of the Math and double classes (use Double.TYPE for the wrapper)
            Class doubleClass = double.class;
            Class mathClass = Math.class; //Class.forName("java.lang.Math"); // <-- alternative way

            //Create an array of Object parameters from input, and assume all parameter
            //types are doubles (for now)
            Class[] parTypes = {doubleClass};
            Object[] params = new Object[1];

            //Get an instance of the method that we want to use
            Method meth = mathClass.getMethod(methodName, parTypes);

            //Apply the method to everything in the input vector one element at a time
            for (int i = 0; i < vec.length; i++) {
            	params[0] = vec[i];
                newvec[i] = (Double) meth.invoke(Double.class, params);
            }



        } catch (Throwable e) {
            System.err.println(e);
        }

        return newvec;

    }

    /**
     *
     * @return
     */
    public UnsignedByte sum() {
        UnsignedByte res;

        if (size[ROW] == 1) {
            double total = 0;
            for (int c = 0; c < size[COL]; c++) {
                total += data[c];
            }
            res = new UnsignedByte(total);
        } else {
            res = zeros(1, size[COL]);
            for (int c = 1; c <= size[COL]; c++) {
                for (int r = 1; r <= size[ROW]; r++) {
                    res.set(1, c, res.get(1, c) + get(r, c));
                }
            }
        }
        return res;
    }

    /**
     * reshape
     * @param rows
     * @param cols
     * @return
     */
    public UnsignedByte reshape(int rows, int cols) {
        if (n != rows * cols) {
            throw new RuntimeException("Matrix.reshape bad size");
        }
        UnsignedByte res = new UnsignedByte(this);
        res.size[ROW] = rows;
        res.size[COL] = cols;
        return res;
    }

    /**
     *
     * @return
     */
    public UnsignedByte sort() {
        UnsignedByte res = new UnsignedByte(this);
        Arrays.sort(res.data);
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte add(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] + x;
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte pow(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = Math.pow(data[i], x);
        }
        return res;
    }

    /**
     *
     * @return
     */
    public UnsignedByte sin() {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = Math.sin(data[i]);
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte sub(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] - x;
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte mult(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] * x;
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte div(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] / x;
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public UnsignedByte exp(double x) {
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = Math.pow(data[i], x);
        }
        return res;
    }

    /**
     * add a matrix
     * @param v matrix to add
     * @return
     */
    public UnsignedByte add(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] + v.data[i];
        }
        return res;
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public void addIP(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 0; i < n; i++) {
            data[i] = data[i] + v.data[i];
        }
    }

    /**
     * multiply a matrix in place
     * @param v matrix to add
     * @return
     */
    public void multIP(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 0; i < n; i++) {
            data[i] = data[i] * v.data[i];
        }
    }

    /**
     * divide a matrix in place
     * @param v matrix to add
     * @return
     */
    public void divIP(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 0; i < n; i++) {
            data[i] = data[i] / v.data[i];
        }
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public void subIP(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 0; i < n; i++) {
            data[i] = data[i] - v.data[i];
        }
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public void addIP(double x) {
        for (int i = 0; i < n; i++) {
            data[i] = data[i] + x;
        }
    }

    /**
     * multiply a scalar in place
     * @param v matrix to add
     * @return
     */
    public void multIP(double x) {
        for (int i = 0; i < n; i++) {
            data[i] = data[i] * x;
        }
    }

    /**
     * divide a scalar in place
     * @param v matrix to add
     * @return
     */
    public void divIP(double x) {
        for (int i = 0; i < n; i++) {
            data[i] = data[i] / x;
        }
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public void subIP(double x) {
        for (int i = 0; i < n; i++) {
            data[i] = data[i] - x;
        }
    }

    /**
     *
     * @param v
     * @return
     */
    public UnsignedByte sub(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.sub unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] - v.data[i];
        }
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public UnsignedByte mult(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.mult unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] * v.data[i];
        }
        return res;
    }

    /**
     *
     * @param a
     * @return
     */
    public UnsignedByte matMult(UnsignedByte a) {
        if (size[COL] != a.size[ROW]) {
            throw new RuntimeException("Matrix.mult unequal inner dimensions");
        }
        int nc = size[COL];
        UnsignedByte res = new UnsignedByte(size[ROW], a.size[COL]);
        for (int r = 1; r <= size[ROW]; r++) {
            for (int c = 1; c <= a.size[COL]; c++) {
                double sum = 0;
                for (int it = 1; it <= nc; it++) {
                    double v1 = get(r, it);
                    double v2 = a.get(it, c);
                    sum += v1 * v2;
                }
                res.set(r, c, sum);
            }
        }
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public UnsignedByte div(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.div unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = data[i] / v.data[i];
        }
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public UnsignedByte exp(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.exp unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            res.data[i] = Math.pow(data[i], v.data[i]);
        }
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public UnsignedByte gt(UnsignedByte v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.gt unequal sizes");
        }
        UnsignedByte res = new UnsignedByte(this);
        for (int i = 0; i < n; i++) {
            if (data[i] > v.data[i]) {
                res.data[i] = 1;
            } else {
                res.data[i] = 0;
            }
        }
        res.type = Type.LOGICAL;
        return res;
    }

    /**
     *
     * @return
     */
    public UnsignedByte floor() {
        UnsignedByte res = new UnsignedByte(this);
        res.type = Type.INTEGER;
        return res;
    }

    /**
     *  index an array
     * @param ri
     * @param ci
     * @return
     */
    public UnsignedByte index(UnsignedByte ri, UnsignedByte ci) {
        if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
            throw new RuntimeException("Matrix.index indices must be vectors");
        }
        UnsignedByte res = new UnsignedByte(ri.n, ci.n);
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
    public UnsignedByte index(UnsignedByte ci) {
        if (ci.size[ROW] != 1) {
            throw new RuntimeException("Matrix.index index must be a vector");
        }
        UnsignedByte res = new UnsignedByte(1, ci.n);
        for (int c = 1; c <= ci.n; c++) {
            int cndx = (int) ci.get(c);
            res.set(1, c, get(1, cndx));
        }
        return res;
    }

    /**
     * transpose a matrix
     * @return transposed matrix
     */
    public UnsignedByte transpose() {
        UnsignedByte res = new UnsignedByte(size[COL], size[ROW]);
        for (int r = 1; r <= size[ROW]; r++) {
            for (int c = 1; c <= size[COL]; c++) {
                res.set(c, r, get(r, c));
            }
        }
        return res;
    }

    /**
     *
     * @return
     */
    public UnsignedByte inv() {
        if (size.length != 2
                || (size[ROW] != size[COL])) {
            throw new RuntimeException("Matrix.inv matrix must be square");
        }
        int n = size[ROW];
        int bcols = 2 * n;
        UnsignedByte them[] = new UnsignedByte[2];
        them[0] = new UnsignedByte(this);
        them[1] = identity(n);
        UnsignedByte m = hcat(them);
        // repeat the following three steps for all columns except the last
        for (int col = 1; col <= n; col++) {
            if (col < n) {
                // swap largest row to top
                double mxv = Math.abs(m.get(col + 1, col));
                int at = col;
                for (int r = col + 1; r <= n; r++) {
                    double it = Math.abs(m.get(r, col));
                    if (it > mxv) {
                        mxv = it;
                        at = r;
                    }
                }
                if (at != col) {
                    // swap all of row at with row col
                    for (int c = 1; c <= bcols; c++) {
                        double temp = m.get(col, c);
                        double it = m.get(at, c);
                        m.set(col, c, it);
                        m.set(at, c, temp);
                    }
                }
            }
//            Main.debug.println("swap to top " + col + " -> " + m);
            // force diagonal to one
            double val = m.get(col, col);
            if (val == 0) {
                throw new RuntimeException("Matrix.inv not invertible");
            }
            for (int c = 1; c <= bcols; c++) {
                double it = m.get(col, c) / val;
                m.set(col, c, it);
            }
//            Main.debug.println("diag one " + col + " -> " + m);
            // subtract row (col) from each row except (col) scaled by its first val
            for (int r = 1; r <= n; r++) {
                if (r != col) {
                    double factor = m.get(r, col);
                    for (int c = 1; c <= bcols; c++) {
                        double it = m.get(r, c) - m.get(col, c) * factor;
                        m.set(r, c, it);
                    }
                }
//                Main.debug.println("zero off diag " + col + " " + r + " -> " + m);
            }
        }
        UnsignedByte rndx = UnsignedByte.colon(1, n);
        return m.index(rndx, rndx.add(n));
    }

    /**
     *  Find the max and location of a Matrix
     * @return
     */
    public CellArray max() {
        CellArray res = new CellArray(1, 2);
        if (size[ROW] == 1) {
            double best = data[0];
            int where = 1;
            for (int c = 1; c < size[COL]; c++) {
                if (data[c] > best) {
                    best = data[c];
                    where = c + 1;
                }
            }
            res.set(1,1,new UnsignedByte(best));
            res.set(1,2,new UnsignedByte(where));
        } else {
            UnsignedByte bestm = new UnsignedByte(1, size[COL]);
            UnsignedByte wherem = new UnsignedByte(1, size[COL]);
            for (int c = 0; c < size[COL]; c++) {
                CellArray ca =
                        index(colon(1, size[ROW]), new UnsignedByte(c + 1)).transpose().max();
                bestm.data[c] = ((UnsignedByte) ca.get(1,1)).data[0];
                wherem.data[c] = ((UnsignedByte) ca.get(1,2)).data[0];
            }
            res.set(1,1, new UnsignedByte(bestm));
            res.set(1,2, new UnsignedByte(wherem));
        }
        return res;
    }

    public double getMin() {
        double res = data[0];
        for(int i = 1; i < n; i++) {
            if(data[i] < res) res = data[i];
        }
        return res;
    }

    public double getMax() {
        double res = data[0];
        for(int i = 1; i < n; i++) {
            if(data[i] > res) res = data[i];
        }
        return res;
    }

    /**
     *  Find the max and location of a Matrix
     * @return
     */
    public CellArray min() {
        CellArray res = new CellArray(1, 2);
        if (size[ROW] == 1) {
            double best = data[0];
            int where = 1;
            for (int c = 1; c < size[COL]; c++) {
                if (data[c] < best) {
                    best = data[c];
                    where = c + 1;
                }
            }
            res.set(1,1,new UnsignedByte(best));
            res.set(1,2,new UnsignedByte(where));
        } else {
            UnsignedByte bestm = new UnsignedByte(1, size[COL]);
            UnsignedByte wherem = new UnsignedByte(1, size[COL]);
            for (int c = 0; c < size[COL]; c++) {
                CellArray ca =
                        index(colon(1, size[ROW]), new UnsignedByte(c + 1)).transpose().min();
                bestm.data[c] = ((UnsignedByte) ca.get(1,1)).data[0];
                wherem.data[c] = ((UnsignedByte) ca.get(1,2)).data[0];
            }
            res.set(1,1, new UnsignedByte(bestm));
            res.set(1,2, new UnsignedByte(wherem));
        }
        return res;
    }

    /**
     * 
     * @param m
     * @return
     */
    public UnsignedByte diag(UnsignedByte m) {
        UnsignedByte res = null;
        if (m.size[ROW] == 1) {
            int n = m.n;
            res = zeros(n, n);
            for (int i = 1; i <= n; i++) {
                res.set(i, i, m.get(i));
            }
        } else {
            int sz = m.size[COL];
            if (m.size[ROW] < sz) {
                sz = m.size[ROW];
            }
            res = zeros(sz, 1);
            for (int i = 1; i <= sz; i++) {
                res.set(i, 1, m.get(i, i));
            }
        }
        return res;
    }

    /**
     *
     * @param m
     * @param offset
     * @return
     */
    public UnsignedByte diag(UnsignedByte m, int offset) {
        UnsignedByte rowIndex;
        UnsignedByte colIndex;

        if (offset > 0) {
            if (offset >= m.size[COL]) {
                throw new RuntimeException("Matrix.diag offset too big");
            }
            // remove the firstoffset columns
            rowIndex = colon(0, m.size[ROW] - 1);
            colIndex = colon(offset, m.size[COL] - 1);
        } else {
            if (-offset >= m.size[ROW]) {
                throw new RuntimeException("Matrix.diag offset too big");
            }
            rowIndex = colon(-offset, m.size[ROW] - 1);
            colIndex = colon(0, m.size[COL] - 1);
        }
        UnsignedByte shrunk = m.index(rowIndex, colIndex);
        return diag(shrunk);
    }

    public void setLower(int ndx, UnsignedByte m) {
        for(int i = 0; i < m.n; i++) {
            if(m.data[i] < data[ndx-1]) data[ndx-1] = m.data[i];
        }
    }

    public void setUpper(int ndx, UnsignedByte m) {
        for(int i = 0; i < m.n; i++) {
            if(m.data[i] > data[ndx-1]) data[ndx-1] = m.data[i];
        }
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
        String res;
        double d;
        if (rows > 1) {
            res = "[\n   ";
        } else {
            res = "[";
        }
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                d = get(r, c);
                switch (type) {
                    case DOUBLE:
                        if (d % 1 == 0) {
                            res += " " + (int) d;
                        } else {
                            res += " " + Format.format(d, 4);
                        }
                        break;
                    case LOGICAL:
                        if (d > 0) {
                            res += " t";
                        } else {
                            res += " f";
                        }
                        break;
                    case INTEGER:
                        res += " " + (int) d;
                        break;
                }
            }
            if ((rows > 1) && (r < rows)) {
                res += "\n   ";
            }
        }
        res += " ]";
        return res;
    }
    
public static void main(String a[]) {
    UnsignedByte byteparam[];
    UnsignedByte m = new UnsignedByte(500);
    System.out.println(m);

    UnsignedByte uint8test = new UnsignedByte(-40);
        System.out.println("uint8test = " + uint8test);

        UnsignedByte uint8num = new UnsignedByte(500);
        System.out.println("uint8num = " + uint8num.bound0to255(500));

//        UnsignedByte xyz = new UnsignedByte(-42);
//        debug.println("UnsignedByte xyz is " + xyz + ":: " + xyz.info());
        byteparam = new UnsignedByte[2];
        byteparam[0] = new UnsignedByte(
                "[350 20 6 26 19 279]");
        System.out.println(
                "byteparam[0] is " + byteparam[0]);
        byteparam[1] = new UnsignedByte(
                "[3 32,887,219,23, 25]");
        System.out.println(
                "byteparam[1] is " + byteparam[1]);
        UnsignedByte bytevc = UnsignedByte.vcat(byteparam);
        System.out.println(
                "vc (vertical stack) is " + bytevc);
}


}

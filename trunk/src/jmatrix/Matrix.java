/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

// import main.Main;
import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.reflect.Method;
/**
 *
 * @author dsmith
 */
public class Matrix extends MatObject {

    public double data[];  // always store a vector of doubles
    // stored in column order

    /* Constructors */
    /**
     * 1.1 a scalar
     * @param x - the value
     */
    public Matrix() {
        type = Type. DOUBLE;
        data = new double[0];
    }

    public Matrix(double x) {
        n = 1;
        size = new int[2];
        dimensions = 2;
        type = Type. DOUBLE;
        data = new double[1];
        data[0] = x;
        size[COL] = 1;
        size[ROW] = 1;
    }

    /**
     * @newtag
     * @param rows
     * @param cols
     * @param data
     */
    public Matrix(int rows, int cols, double... data) {
        this.data = data;
        n = rows * cols;
        size = new int[2];
        type = Type. DOUBLE;
        size[COL] = cols;
        size[ROW] = rows;
        dimensions = 2;
    }

    /**
     * @newtag
     * Creates a Matrix given the vector of data in the right format
     */
    public Matrix(double[] data, int rows, int cols) {
        if (rows * cols != data.length) {
            throw new RuntimeException("Dimension Mismatch Error");
        }


        this.data = data;
        n = rows * cols;
        size = new int[2];
        dimensions = 2;
        type = Type. DOUBLE;
        size[COL] = cols;
        size[ROW] = rows;
    }

    /**
     * 1.3 3 scalars
     * @param x - one value
     * @param y - another value
     */
    public Matrix(double x, double y, double z) {
        n = 3;
        size = new int[2];
        dimensions = 2;
        type = Type. DOUBLE;
        data = new double[3];
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
    public Matrix(double x, double y) {
        n = 2;
        size = new int[2];
        dimensions = 2;
        type = Type. DOUBLE;
        data = new double[2];
        data[0] = x;
        data[1] = y;
        size[COL] = 2;
        size[ROW] = 1;
    }

    /* Constructors */
    /**
     * 2. an array
     * @param x - the value
     */
    public Matrix(double x[]) {
        n = x.length;
        size = new int[2];
        dimensions = 2;
        type = Type. DOUBLE;
        data = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = x[i];
        }
        size[COL] = n;
        size[ROW] = 1;
    }

    /**
     * a rectangular array
     * @param rows
     * @param cols
     */
    public Matrix(int rows, int cols) {
        n = rows * cols;
        if (n > 0) {
            data = new double[n];
        } else {
            data = null;
        }
        type = Type. DOUBLE;
        size = new int[2];
        size[ROW] = rows;
        size[COL] = cols;
        dimensions = 2;
    }

    /**
     * clone a matrix
     * @param v
     */
    public Matrix(Matrix v) {
        data = new double[v.n];
        n = v.n;
        for (int i = 0; i < n; i++) {
            data[i] = v.data[i];
        }
        type = v.type;
        dimensions = v.dimensions;
        size = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            size[i] = v.size[i];
        }
    }

    /**
     * clone a matObject
     * @param v
     */
    public Matrix(MatObject o) {
        data = new double[o.n];
        n = o.n;
        if (o instanceof Matrix) {
            for (int i = 0; i < n; i++) {
                data[i] = ((Matrix) o).data[i];
            }
        } else if (o instanceof SignedByte) {
            for (int i = 0; i < n; i++) {
                data[i] = ((SignedByte) o).data[i];
            }
        } else if (o instanceof MatString) {
            for (int i = 0; i < n; i++) {
                data[i] = ((MatString) o).data[i];
            }
        } else if (o instanceof UnsignedByte) {
            for (int i = 0; i < n; i++) {
                data[i] = ((UnsignedByte) o).data[i];
            }
        } else {
            throw new RuntimeException("illegal math operation");
        }
        type = Type. DOUBLE;
        dimensions = o.dimensions;
        size = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            size[i] = o.size[i];
        }
    }

    /**
     * clone a matObject
     * @param v
     */
    public Matrix(MatObject o, int init) {
        data = new double[o.n];
        n = o.n;
        for (int i = 0; i < n; i++) {
            data[i] = init;
        }
        type = Type. DOUBLE;
        dimensions = o.dimensions;
        size = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            size[i] = o.size[i];
        }
    }

    @Override
    public Matrix clone() {
        return new Matrix(this);
    }

    public Matrix copy() {
        return new Matrix(this);
    }

    public Matrix zeroed() {
        return new Matrix(this, 0);
    }

    public Matrix empty() {
        return new Matrix();
    }

    /**
     * tokenize a string
     * @param str
     */
    public Matrix(String str) {
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
        type = Type. DOUBLE;
    }

    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        Matrix it = (Matrix) src;
        if (sn == 1) {
            double val = it.get(1);
            for (int i = 1; i <= in; i++) {
                int col = 1;
                int row = ndx.geti(i);
                while (row > size[ROW]) {
                    row -= size[ROW];
                    col++;
                }
                set(row, col, val);
            }
        } else {
            for (int i = 1; i <= in; i++) {
                int col = 1;
                int row = ndx.geti(i);
                while (row > size[ROW]) {
                    row -= size[ROW];
                    col++;
                }
                set(row, col, it.get(i));
            }
        }
    }

    public static void set(Matrix m, int r, int c, double val) {
        m.set(r, c, val);
    }

    public static void set(Matrix m, int i, double val) {
        m.set(i, val);
    }

    public static void set(Matrix m, Matrix rn, Matrix cn, Matrix val) {
        m.oldset(rn, cn, val);
    }

    public static Matrix index(Matrix m, Matrix ri, Matrix ci) {
        return m.index(ri, ci);
    }

    public static double max(Matrix ma[], int ndx) {
        double res = ma[0].get(ndx+1);
        for (int i = 1; i < ma.length; i++) {
            if (ma[i].get(ndx+1) > res) {
                res = ma[i].get(ndx+1);
            }
        }
        return res;
    }

    public static double min(Matrix ma[], int ndx) {
        double res = ma[0].get(ndx+1);
        for (int i = 1; i < ma.length; i++) {
            if (ma[i].get(ndx+1) < res) {
                res = ma[i].get(ndx+1);
            }
        }
        return res;
    }

    public static Matrix gt(Matrix a, Matrix b) {
        return a.gt(b);
    }

    public static Matrix lt(Matrix a, Matrix b) {
        return a.lt(b);
    }

    public static Matrix ge(Matrix a, Matrix b) {
        return a.ge(b);
    }

    public static Matrix le(Matrix a, Matrix b) {
        return a.le(b);
    }

    public static Matrix eq(Matrix a, Matrix b) {
        return a.eq(b);
    }

    public static Matrix ne(Matrix a, Matrix b) {
        return a.ne(b);
    }

    public static Matrix and(Matrix a, Matrix b) {
        return a.and(b);
    }

    public static Matrix or(Matrix a, Matrix b) {
        return a.or(b);
    }
    /* accessors */

    public boolean isAll() {
        boolean res = true;
        for (int i = 1; i <= n; i++) {
            if (geti(i) != i) {
                res = false;
                break;
            }
        }
        return res;
    }

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
            data = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }

    private void extend(int to) {
        if (to > size[ROW] * size[COL]) {
            Matrix m = reshape(size[ROW] * size[COL], 1);
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
        int it = (c - 1) * size[ROW] + (r - 1);
        if(it == 25) {
            it = 25;
        }
        return data[it];
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
        data[(c - 1) * size[ROW] + (r - 1)] = val;
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public double getEnd() {
        return data[n - 1];
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public double get(int i) {
        if(data == null) {
            System.out.println("Houston, we have a problem\n");
        }
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
        if (i > n) {
            throw new RuntimeException("Matrix:set(i...) i too big");
        }
        ;
        data[i - 1] = val;
    }

    public static void set(Matrix m, Matrix indices, Matrix values) {
        m.set(indices, values);
    }

    public void set(Matrix indices, Matrix values) {
        int maxsize = size[ROW] * size[COL];
        double[] ind = indices.data;
        double[] vals = values.data;

        if (ind.length != vals.length) {
            throw new RuntimeException("Dimension Mismatch Error");
        }

        for (int i = 0; i < ind.length; i++) {
            if (ind[i] > maxsize) {
                throw new RuntimeException("Index Out Of Bounds");
            }
            set((int) ind[i], vals[i]);
        }

    }

    /**
     * Copy a Matrix into a Matrix
     * @param rndx - target rows
     * @param cndx - target columns
     * @param vals -  source data
     */
    public void oldset(Matrix rndx, Matrix cndx, Matrix vals) {
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
        int mxr = (int) ((Matrix) rndx.max().get(1, 1)).get(1);
        int mxc = (int) ((Matrix) cndx.max().get(1, 2)).get(1);
        if (mxr > size[ROW]) {
            extend(mxr, size[COL]);
        }
        if (mxc > size[COL]) {
            extend(size[ROW], mxc);
        }
        for (int ri = 1; ri <= rndx.size[COL]; ri++) {
            for (int ci = 1; ci <= cndx.size[COL]; ci++) {
                set(rndx.geti(ri), cndx.geti(ci),
                        vals.get(ri, ci));
            }
        }
    }

    /*
     *  static methods
     */
    public static Matrix applyFunction(Matrix m, String fName) {
        return m.applyFunction(fName);
    }

    /**
     *
     * @return
     */
    public static Matrix sum(Matrix m) {
        return m.sum();
    }

    /**
     * reshape
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix reshape(Matrix m, int rows, int cols) {
        return m.reshape(rows, cols);
    }

    /**
     *
     * @return
     */
    public static CellArray sort(Matrix m) {
        return m.sort();
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix add(Matrix m, double x) {
        return m.add(x);
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix pow(Matrix m, double x) {
        return m.pow(x);
    }

    /**
     *
     * @return
     */
    public static Matrix sin(Matrix m) {
        return m.sin();
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix sub(Matrix m, double x) {
        return m.sub(x);
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix mult(Matrix m, double x) {
        return m.mult(x);
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix div(Matrix m, double x) {
        return m.div(x);
    }

    /**
     *
     * @param x
     * @return
     */
    public static Matrix mexp(Matrix m, double x) {
        return m.mexp(x);
    }

    /**
     * add a matrix
     * @param v matrix to add
     * @return
     */
    public static Matrix add(Matrix m, Matrix v) {
        return m.add(v);
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public static void addIP(Matrix m, Matrix v) {
        m.addIP(v);
    }

    /**
     * multiply a matrix in place
     * @param v matrix to add
     * @return
     */
    public static void multIP(Matrix m, Matrix v) {
        m.multIP(v);
    }

    /**
     * divide a matrix in place
     * @param v matrix to add
     * @return
     */
    public static void divIP(Matrix m, Matrix v) {
        m.divIP(v);
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public static void subIP(Matrix m, Matrix v) {
        m.subIP(v);
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public static void addIP(Matrix m, double x) {
        m.addIP(x);
    }

    /**
     * multiply a scalar in place
     * @param v matrix to add
     * @return
     */
    public static void multIP(Matrix m, double x) {
        m.multIP(x);
    }

    /**
     * divide a scalar in place
     * @param v matrix to add
     * @return
     */
    public static void divIP(Matrix m, double x) {
        m.divIP(x);
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public static void subIP(Matrix m, double x) {
        m.subIP(x);
    }

    /**
     *
     * @param v
     * @return
     */
    public static Matrix sub(Matrix m, Matrix v) {
        return m.sub(v);
    }

    /**
     *
     * @param v
     * @return
     */
    public static Matrix mult(Matrix m, Matrix v) {
        return m.mult(v);
    }

    /**
     *
     * @param a
     * @return
     */
    public static Matrix matMult(Matrix m, Matrix a) {
        return m.matMult(a);
    }

    /**
     *
     * @param v
     * @return
     */
    public static Matrix div(Matrix m, Matrix v) {
        return m.div(v);
    }

    /**
     *
     * @param v
     * @return
     */
    public static Matrix mexp(Matrix m, Matrix v) {
        return m.mexp(v);
    }

    /**
     *
     * @return
     */
    public static Matrix floor(Matrix m) {
        return m.floor();
    }

    /**
     *  index an array
     * @param ri
     * @param ci
     * @return
     */
    public static Matrix sindex(Matrix m, Matrix ri, Matrix ci) {
        return m.index(ri, ci);
    }

    /**
     * index a vector
     * @param ci
     * @return
     */
    public static Matrix sindex(Matrix m, Matrix ci) {
        return m.index(ci);
    }

    public static double get(Matrix m, int r, int c) {
        return m.get(r, c);
    }

    public static double get(Matrix m, int i) {
        return m.get(i);
    }

    public static double getEnd(Matrix m) {
        return m.getEnd();
    }

    public static Matrix find(Matrix m) {
        Matrix res = m.empty();
        for (int i = 1; i <= m.n; i++) {
            if (m.get(i) != 0) {
                res.set(1, res.n + 1, i);
            }
        }
        return res;
    }

    /**
     * @newtag
     * @param m
     * @param ri
     * @param ci
     * @return
     */
    public static Matrix get(Matrix m, Matrix ri, Matrix ci) throws Exception {
        double[] rows = ri.data;
        double[] cols = ci.data;
        int i = 0;
        double[] mdata = m.data;
        int rowsize = m.size[ROW];
        int colsize = m.size[COL];
        double[] newmat = new double[rows.length * cols.length];
        for (int c = 0; c < cols.length; c++) {
            for (int r = 0; r < rows.length; r++) {
                try {
                    int cind = (int) cols[c] - 1;
                    int rind = (int) rows[r] - 1;
                    newmat[i] = mdata[cind * rowsize + rind];
                    i++;
                } catch (Exception e) {
                    throw new Exception("??? Index out of bounds");
                }
            }
        }


        return new Matrix(newmat, rows.length, cols.length);
    }

    /**
     * @newtag
     * @param m
     * @param ind
     * @return
     */
    public static Matrix get(Matrix m, Matrix ind) throws Exception {
        double[] mdata = m.data;
        double[] indices = ind.data;
        double[] newmat = new double[indices.length];

        /* for (int i = 0; i < indices.length; i++){
        if (indices[i] >= mdata.length){
        throw new Exception("Index must be integer.");
        }
        if (indices[i]){
        
        }
        }
        }
         **/

        for (int i = 0; i < indices.length; i++) {
            try {
                newmat[i] = mdata[(int) indices[i] - 1];
            } catch (Exception e) {
                throw new Exception("??? Index out of bounds.");
            }
        }
        Matrix res = new Matrix(newmat, ind.size[ROW], ind.size[COL]);
        res.size[ROW] = ind.size[ROW];
        res.size[COL] = ind.size[COL];
        return res;
    }

    /**
     * transpose a matrix
     * @return transposed matrix
     */
    public static Matrix transpose(Matrix m) {
        return m.transpose();
    }

    /*
     * the cross product of two vectors a and b is defined as:
     *    i*(ay*bz-az*by) + j*(az*bx-ax*bz) + k*(ax*by-ay*bx)
     */
    public static Matrix cross(Matrix a, Matrix b) {
        Matrix res = new Matrix(3);
        double ax = a.get(1);
        double bx = b.get(1);
        double ay = a.get(2);
        double by = b.get(2);
        double az = a.get(3);
        double bz = b.get(4);
        res.set(1, 1, ay * bz - az * by);
        res.set(1, 2, az * bx - ax * bz);
        res.set(1, 3, ax * by - ay * bx);
        return res;
    }

    /**
     *
     * @return
     */
    public static Matrix inv(Matrix m) {
        return m.inv();
    }

    /**
     *  Find the max and location of a Matrix
     * @return
     */
    public static CellArray max(Matrix m) {
        return m.max();
    }

    public static double getMin(Matrix m) {
        return m.getMin();
    }

    public static double getMax(Matrix m) {
        return m.getMax();
    }

    /**
     *  Find the max and location of a Matrix
     * @return
     */
    public static CellArray min(Matrix m) {
        return m.min();
    }

    private static double interp1(Matrix x, Matrix y, double x0) {
        if ((x0 < x.get(1)) || (x0 > x.get(x.n))) {
            return Double.NaN;
        }
        double res = 0;
        boolean found = false;
        for (int i = 1; !found && (i < x.n); i++) {
            found = (x.get(i+1) >= x0);
            if (found) {
                res = y.get(i)
                        + (y.get(i+1) - y.get(i)) * (x0 - x.get(i)) 
                                         / (x.get(i+1) - x.get(i));
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
    public static Matrix interp1(Matrix x, Matrix y, Matrix xi) {
        if (x.size[ROW] != 1
                || y.size[ROW] != 1
                || xi.size[ROW] != 1) {
            throw new RuntimeException("Matrix.interp1 params must be vectors");
        }
        Matrix res = new Matrix(xi);
        for (int i = 1; i <= xi.n; i++) {
            res.set(i, interp1(x, y, xi.get(i)));
        }
        return res;
    }

    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public static Matrix hcat(Matrix[] m) {
        Matrix res;
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
        res = new Matrix(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            Matrix it = m[i];
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
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public Matrix hcat(Matrix m) {
        Matrix res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int mcols = m.size[COL];
        int cols = size[COL];
        if (m.size[ROW] != size[ROW]) {
            throw new RuntimeException("Matrix.hcat bad rows");
        }
        res = new Matrix(rows, cols + mcols);
        res.type = m.type;
        // copy all matrices into res
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                res.set(r, c, get(r, c));
            }
            for (int c = 1; c <= mcols; c++) {
                res.set(r, c + cols, m.get(r, c));
            }
        }
        return res;
    }

    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public Matrix negate() {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, -get(i));
        }
        return res;
    }

    /**
     * vertical concatenation (array of matrices)
     * @param m
     * @return
     */
    public static Matrix vcat(Matrix[] m) {
        Matrix res;
        int rows = 0;
        int cols = m[0].size[COL];
        int row = 0;
        // calculate cols and check rows
        for (int i = 0; i < m.length; i++) {
            rows += m[i].size[ROW];
            if (m[i].size[COL] != cols) {
                throw new RuntimeException("Matrix.vcat bad columns in item " + i);
            }
        }
        res = new Matrix(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            Matrix it = m[i];
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
     * vertical concatenation Matrix
     * @param m
     * @return
     */
    public Matrix vcat(Matrix m) {
        Matrix res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int mrows = m.size[ROW];
        int cols = size[COL];
        if (m.size[COL] != size[COL]) {
            throw new RuntimeException("Matrix.vcat bad cols");
        }
        res = new Matrix(rows + mrows, cols);
        // copy all matrices into res
        for (int c = 1; c <= cols; c++) {
            for (int r = 1; r <= rows; r++) {
                res.set(r, c, get(r, c));
            }
            for (int r = 1; r <= mrows; r++) {
                res.set(r + rows, c, m.get(r, c));
            }
        }
        return res;
    }

    public static Matrix zeros(int rows, int cols) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, 0);
        }
        return res;
    }

    /**
     * zeros
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix zeros(Matrix rowmat, Matrix colmat) {
        int rows = (int) rowmat.get(1);
        int cols = (int) colmat.get(1);
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, 0);
        }
        return res;
    }

    /**
     * ones
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix ones(Matrix rowmat, Matrix colmat) {
        int rows = (int) rowmat.get(1);
        int cols = (int) colmat.get(1);
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, 1);
        }
        return res;
    }

    /**
     * ones
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix ones(int rows, int cols) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, 1);
        }
        return res;
    }

    /**
     * rand
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix rand(Matrix mrows, Matrix mcols) {
        int rows = (int) mrows.get(1);
        int cols = (int) mcols.get(1);
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, Math.random());
        }
        return res;
    }
    /**
     * rand
     * @param rows
     * @param cols
     * @return
     */
    public static Matrix rand(int rows, int cols) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 1; i <= res.n; i++) {
            res.set(i, Math.random());
        }
        return res;
    }

    public static Matrix ceil(Matrix m) {
        return m.ceil();
    }
    /*
     *  CUMSUM
     * For vectors, CUMSUM(X) is a vector containing the cumulative sum of
    the elements of X. For matrices, CUMSUM(X) is a matrix the same size
    as X containing the cumulative sums over each column.  

     */
    public static Matrix cumsum(Matrix m) {
        Matrix res = new Matrix(m);
        if(res.size[ROW] == 1) {
            for(int i = 2; i <= res.size[COL]; i++) {
//                res.data[i] += res.data[i-1];
                res.set(i, res.get(i) + res.get(i-1));
            }
        } else {
            for(int c = 0; c < res.size[COL]; c++) {
                for(int r = 2; r <= res.size[ROW]; r++) {
                    int i = (c - 1) * res.size[ROW] + (r - 1);
//                    res.data[i] += res.data[i-1];
                    res.set(i, res.get(i) + res.get(i-1));
                }
            }
        }
        return res;
    }
    
    /*
     *  CUMPROD
     * For vectors, CUMSUM(X) is a vector containing the cumulative sum of
    the elements of X. For matrices, CUMSUM(X) is a matrix the same size
    as X containing the cumulative sums over each column.  

     */
    public static Matrix cumprod(Matrix m) {
        Matrix res = new Matrix(m);
        if(res.size[ROW] == 1) {
            for(int i = 2; i <= res.size[COL]; i++) {
//                res.data[i] *= res.data[i-1];
                res.set(i, res.get(i) * res.get(i-1));
            }
        } else {
            for(int c = 0; c < res.size[COL]; c++) {
                for(int r = 1; r < res.size[ROW]; r++) {
                    int i = (c - 1) * res.size[ROW] + (r - 1);
//                    res.data[i] *= res.data[i-1];
                      res.set(i, res.get(i) * res.get(i-1));
                }
            }
        }
        return res;
    }
    
    
    public Matrix ceil() {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, Math.ceil(get(i)));
        }
        res.type = Type. INTEGER;
        return res;
    }

    public static Matrix round(Matrix m) {
        return m.round();
    }

    public Matrix round() {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, Math.round(get(i)));
        }
        res.type = Type. INTEGER;
        return res;
    }

    /**
     * colon
     * @param from
     * @param to
     * @return
     */
    public static Matrix colon(double from, double to) {
        return colon(from, 1, to);
    }

    /**
     * colon
     * @param from
     * @param to
     * @return
     */
    public static Matrix colon(Matrix from, Matrix to) {
        return colon(from.get(1), 1, to.get(1));
    }

    /**
     * colon
     * @param from
     * @param inc
     * @param to
     * @return
     */
    public static Matrix colon(Matrix from, Matrix inc, Matrix to) {
        return colon(from.get(1), inc.get(1), to.get(1));
    }

    /**
     * colon
     * @param from
     * @param inc
     * @param to
     * @return
     */
    public static Matrix colon(double from, double inc, double to) {
        Matrix res = null;

        if (Math.abs(inc) < 0.0000000000001) {
            throw new RuntimeException("Matrix.colon with zero increment");
        }
        int n = (int) ((to - from) / inc) + 1;
        if (n > 0) {
            res = new Matrix(1, n);
            res.set(1, from);
            res.n = n;
            for(int i = 2; i <= n; i++) {
                from += inc;
                res.set(i, from);
            }
        } else {
            res = new Matrix(1, 0);
        }
        return res;
    }

    /**
     * linspace
     * @param from
     * @param to
     * @return
     */
    public static Matrix linspace(double from, double to) {
        return linspace(from, to, 100);
    }

    /**
     * linspace
     * @param from
     * @param to
     * @return
     */
    public static Matrix linspace(Matrix from, Matrix to) {
        return linspace(from.get(1, 1), to.get(1, 1), 100);
    }

    /**
     * linspace
     * @param from
     * @param to
     * @return
     */
    public static Matrix linspace(Matrix from, Matrix to, Matrix mn) {
        return linspace(from.get(1, 1), to.get(1, 1), (int) mn.get(1, 1));
    }

    /**
     * linspace
     * @param from
     * @param to
     * @param n
     * @return
     */
    public static Matrix linspace(double from, double to, int n) {
        Matrix res = null;
        double dv = 0;
        if (n < 0) {
            throw new RuntimeException("Matrix.linspace negative count");
        }
        if (n > 1) {
            dv = (to - from) / (n - 1);
        }
        res = new Matrix(1, n);
        res.set(1, from);
        res.n = n;
        for (int i = 2; i <= n; i++) {
            res.set(i, res.get(i-1) + dv);
        }
        return res;
    }

    // Make an identity sMatrix.
    /**
     * eye
     * @param sz
     * @return
     */
    public static Matrix identity(int sz) {
        Matrix m = zeros(sz, sz);

        //Fill diagonal with 1's
        for (int x = 1; x <= sz; x++) {
            m.set(x, x, 1);
        }
        return (m);
    }

    //public static Matrix magic()
    /**
     * magic (odd indices only)
     * @param n
     * @return
     */
    public static Matrix magic(Matrix n1) {
        if (n1.n != 1) {
            throw new RuntimeException("Magic must be called with an integer, scalar argument");
        }

        int n = n1.geti(1);
        if (n % 2 == 0) {
            throw new RuntimeException("Matrix.magic must have odd parameters");
        }
        Matrix m = zeros(n, n);
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
    public static Matrix polyfit(Matrix x, Matrix y, int power) {
        int size = power + 1;
        Matrix it = null;

        Matrix A = zeros(size, size);
        Matrix B = zeros(size, 1);
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                it = x.pow(2 * size - r - c);
                A.set(r, c, it.sum().get(1));
            }
            B.set(r, 1, it.mult(y).sum().get(1));
        }
        Matrix Ai = A.inv();
        Matrix cf = Ai.matMult(B);
        return cf;
    }

    /**
     * polyval
     * @param cf
     * @param x
     * @return
     */
    public static Matrix polyval(Matrix cf, Matrix x) {
        /* evaluate the polynomial c0*x^n + c1*x^n-1 + ... + cn-1*x + cn
        returning a sVector of the same length as x */
        Matrix res = Matrix.ones(1, x.n).mult(cf.get(1));
        for (int nc = 2; nc <= cf.n; nc++) {
            for (int id = 1; id <= res.n; id++) {
                res.set(id, res.get(id) * x.get(id) + cf.get(nc));
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
    public static Matrix spline(Matrix x, Matrix y, Matrix xi) {
        Matrix res = Matrix.ones(1, xi.n);
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
        double h = (x.get(np) - x.get(1)) / (np - 1);
        // build an (n-2 by n-2) array to invert
        Matrix A = Matrix.zeros(np - 2, np - 2);
        A.set(1, 1, 6);
        A.set(np - 2, np - 2, 6);
        for (int r = 2; r < (np - 2); r++) {
            A.set(r, r - 1, 1);
            A.set(r, r, 4);
            A.set(r, r + 1, 1);
        }
        // now create B - the RHS
        Matrix B = Matrix.zeros(np - 2, 1);
        for (int r = 1; r <= (np - 2); r++) {
            B.set(r, 1, (y.get(r) - 2 * y.get(r + 1) + y.get(r + 2)) * 6 / (h * h));
        }
        Matrix M = A.inv().matMult(B);
        double Mi = 2 * M.get(1) - M.get(2);
        double Mip1;
        double cf[] = new double[4];
        int at = 1;
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
            while (at <= xi.n && (keepGoing || xi.get(at) <= x.get(i + 1))) {
                double it = xi.get(at) - x.get(i);
                res.set(at, ((cf[0] * it + cf[1]) * it + cf[2]) * it + cf[3]);
                at++;
            }
            Mi = Mip1;
            keepGoing = i == (np - 2);
        }
        return res;
    }

    public static CellArray meshgrid(Matrix x, Matrix y) {
        if (x.size[ROW] > 1 || y.size[ROW] > 1) {
            throw new RuntimeException("Matrix.meshgrid must have vector inputs");
        }
        CellArray res = new CellArray(1, 2);
        Matrix xx = new Matrix(y.n, x.n);
        Matrix yy = new Matrix(y.n, x.n);
        for (int r = 1; r <= y.n; r++) {
            for (int c = 1; c <= x.n; c++) {
                xx.set(r, c, x.get(1, c));
                yy.set(r, c, y.get(1, r));
            }
        }
        res.set(1, 1, xx);
        res.set(1, 2, yy);
        return res;
    }

    public static CellArray peaks(int n) {
        double x, y, z;
        Matrix xv = linspace(-3, 3, n);
        CellArray ca = meshgrid(xv, xv);
        Matrix xx = (Matrix) ca.get(1, 1);
        Matrix yy = (Matrix) ca.get(1, 2);
        Matrix zz = new Matrix(n, n);
        CellArray res = new CellArray(1, 3);
        res.set(1, 1, xx);
        res.set(1, 2, yy);
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                x = xx.get(r, c);
                y = yy.get(r, c);
                z = 3 * Math.pow(1 - x, 2)
                        * Math.exp(-Math.pow(x, 2) - Math.pow(y + 1, 2))
                        - 10 * (x / 5 - Math.pow(x, 3) - Math.pow(y, 5))
                        * Math.exp(-Math.pow(x, 2) - Math.pow(y, 2))
                        - 1 / 3 * Math.exp(-Math.pow(x + 1, 2) - Math.pow(y, 2));
                zz.set(r, c, z);
            }
        }
        res.set(1, 1, xx);
        res.set(1, 2, yy);
        res.set(1, 3, zz);
        return res;
    }

    public static CellArray peaks() {
        return peaks(49);
    }

    public static Matrix applyFunction(String fName, Matrix a, Matrix b) {
        if (a.n != b.n) {
            throw new RuntimeException("Matrix.applyFunction bad a or b inputs");
        }
        Matrix res = new Matrix(a);
        res.data = applyMathMethodToVector(a.data, fName, b.data);
        return res;
    }

    /*
     * dynamic methods
     */
    public Matrix applyFunction(String fName) {
        Matrix res = new Matrix(this);
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
    public static double[] applyMathMethodToVector(double[] vec, String methodName, double[] vec2) {

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
                if (vec2.length == vec.length) {
                    params[1] = vec2[i];
                } else if (vec2.length == 1) {
                    params[1] = vec2[0];
                } else {
                    throw new RuntimeException("Matrix dimensions must agree.");
                }

                newvec[i] = (Double) meth.invoke(Double.class, params);
            }



        } catch (Throwable e) {
            System.err.println(e);
        }

        return newvec;

    }

    public static Matrix applyMathMethodToMatrix(String methodName, MatObject... matarr) {
        if (matarr.length == 1) {
            return new Matrix(applyMathMethodToVector(((Matrix) matarr[0]).data, methodName), ((Matrix) matarr[0]).size[ROW], ((Matrix) matarr[0]).size[COL]);
        } else if (matarr.length == 2) {
            return new Matrix(applyMathMethodToVector(((Matrix) matarr[0]).data, methodName, ((Matrix) matarr[1]).data), ((Matrix) matarr[0]).size[ROW], ((Matrix) matarr[0]).size[COL]);
        }

        return null;
    }

    /**
     * This takes in no second parameter, and is intended for functions such as "cos"
     * @param vec
     * @param methodName
     * @return
     */
    public static double[] applyMathMethodToVector(double[] vec, String methodName) {

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

            // Can't cast from long to double >.<
            if (methodName.equals("round")) {
                for (int i = 0; i < vec.length; i++) {
                    params[0] = vec[i];
                    newvec[i] = (Long) meth.invoke(Double.class, params);
                }
            } else {
                //Apply the method to everything in the input vector one element at a time
                for (int i = 0; i < vec.length; i++) {
                    params[0] = vec[i];
                    newvec[i] = (Double) meth.invoke(Double.class, params);
                }
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
    public Matrix sum() {
        Matrix res;

        if (size[ROW] == 1) {
            double total = 0;
            for (int c = 0; c < size[COL]; c++) {
                total += data[c];
            }
            res = new Matrix(total);
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
    public Matrix reshape(int rows, int cols) {
        if (n != rows * cols) {
            throw new RuntimeException("Matrix.reshape bad size");
        }
        Matrix res = new Matrix(this);
        res.size[ROW] = rows;
        res.size[COL] = cols;
        return res;
    }
    private Pair pa[];

    private int partition(int first, int last) {
        Pair pivot = pa[first];
        int low = first + 1;
        int high = last;
        while (high > low) {
            // Search forward from the left
            while (low <= high && pa[low].value <= pivot.value) {
                low++;
            }
            // Search backwards from the right
            while (low <= high && pa[high].value > pivot.value) {
                high--;
            }
            // Swap high and low
            if (high > low) {
                Pair temp = pa[high];
                pa[high] = pa[low];
                pa[low] = temp;
            }
        }
        while (high > first && pa[high].value >= pivot.value) {
            high--;
        }
        // Swap pivot with list[high]
        if (pivot.value > pa[high].value) {
            pa[first] = pa[high];
            pa[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    /*
     * quick sort
     */
    private void sort(int first, int last) {
        if (last > first) {
            int pi = partition(first, last);
            sort(first, pi - 1);
            sort(pi + 1, last);
        }
    }

    /**
     *
     * @return
     */
    public CellArray sort() {
        CellArray res = new CellArray(1, 2);
        pa = new Pair[n];
        for (int i = 1; i <= n; i++) {
            pa[i-1] = new Pair(get(i), i);
        }
        sort(0, n - 1);
        Matrix v = new Matrix(1, n);
        Matrix o = new Matrix(1, n);
        for (int i = 1; i <= n; i++) {
            v.set(i,  pa[i-1].value);
            o.set(i,  pa[i-1].order);
        }
        res.set(1, 1, v);
        res.set(1, 2, o);
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix add(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, get(i) + x);
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix pow(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = Math.pow(data[i], x);
            res.set(i,  Math.pow(get(i), x));
        }
        return res;
    }

    /**
     *
     * @return
     */
    public Matrix sin() {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = Math.sin(data[i]);
            res.set(i,  Math.sin(get(i)));
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix sub(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = data[i] - x;
            res.set(i, get(i) - x);
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix mult(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = data[i] * x;
            res.set(i, get(i) * x);
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix div(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = data[i] / x;
            res.set(i, get(i) / x);
        }
        return res;
    }

    /**
     *
     * @param x
     * @return
     */
    public Matrix mexp(double x) {
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
//            res.data[i] = Math.pow(data[i], x);
            res.set(i,  Math.pow(get(i), x));
        }
        return res;
    }

    /**
     * add a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix add(Matrix v) {
        Matrix res = new Matrix(this);
        if (n != v.n) {
            if (n == 1) {
                res = new Matrix(v);
                for (int i = 1; i <= v.n; i++) {
//                    res.data[i] = data[0] + res.data[i];
                    res.set(i, get(1) + v.get(i));
                }
            } else if (v.n == 1) {
                for (int i = 1; i <= n; i++) {
//                    res.data[i] = v.data[0] + data[i];
                    res.set(i, v.get(1) + get(i));
                }
            } else {
                throw new RuntimeException("Matrix.add unequal sizes");
            }
        } else {
            for (int i = 1; i <= n; i++) {
 //               res.data[i] = data[i] + v.data[i];
                    res.set(i, get(i) + v.get(i));
            }
        }
        return res;
    }

    /**
     * subtract a matrix
     * @param v matrix to add
     * @return
     */
public Matrix sub(Matrix v) {
        Matrix res = new Matrix(this);
        if (n != v.n) {
            if (n == 1) {
                res = new Matrix(v);
                for (int i = 1; i <= v.n; i++) {
//                    res.data[i] = data[0] + res.data[i];
                    res.set(i, get(1) - v.get(i));
                }
            } else if (v.n == 1) {
                for (int i = 1; i <= n; i++) {
//                    res.data[i] = v.data[0] + data[i];
                    res.set(i, v.get(1) - get(i));
                }
            } else {
                throw new RuntimeException("Matrix.add unequal sizes");
            }
        } else {
            for (int i = 1; i <= n; i++) {
 //               res.data[i] = data[i] + v.data[i];
                    res.set(i, get(i) - v.get(i));
            }
        }
        return res;
    }

    /**
     * mult a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix mult(Matrix v) {
        Matrix res = new Matrix(this);
        if (n != v.n) {
            if (n == 1) {
                res = new Matrix(v);
                for (int i = 1; i <= v.n; i++) {
//                    res.data[i] = data[0] + res.data[i];
                    res.set(i, get(1) * v.get(i));
                }
            } else if (v.n == 1) {
                for (int i = 1; i <= n; i++) {
//                    res.data[i] = v.data[0] + data[i];
                    res.set(i, v.get(1) * get(i));
                }
            } else {
                throw new RuntimeException("Matrix.add unequal sizes");
            }
        } else {
            for (int i = 1; i <= n; i++) {
 //               res.data[i] = data[i] + v.data[i];
                    res.set(i, get(i) * v.get(i));
            }
        }
        return res;
    }

    /**
     * div a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix div(Matrix v) {
        Matrix res = new Matrix(this);
        if (n != v.n) {
            if (n == 1) {
                res = new Matrix(v);
                for (int i = 1; i <= v.n; i++) {
//                    res.data[i] = data[0] + res.data[i];
                    res.set(i, get(1) / v.get(i));
                }
            } else if (v.n == 1) {
                for (int i = 1; i <= n; i++) {
//                    res.data[i] = v.data[0] + data[i];
                    res.set(i, v.get(1) / get(i));
                }
            } else {
                throw new RuntimeException("Matrix.add unequal sizes");
            }
        } else {
            for (int i = 1; i <= n; i++) {
 //               res.data[i] = data[i] + v.data[i];
                    res.set(i, get(i) / v.get(i));
            }
        }
        return res;
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public void addIP(Matrix v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 1; i <= n; i++) {
            set(i, get(i) + v.get(i));
        }
    }

    /**
     * multiply a matrix in place
     * @param v matrix to add
     * @return
     */
    public void multIP(Matrix v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 1; i <= n; i++) {
            set(i, get(i) * v.get(i));
        }
    }

    /**
     * divide a matrix in place
     * @param v matrix to add
     * @return
     */
    public void divIP(Matrix v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 1; i <= n; i++) {
            set(i, get(i) / v.get(i));
        }
    }

    /**
     * add a matrix in place
     * @param v matrix to add
     * @return
     */
    public void subIP(Matrix v) {
        if (n != v.n) {
            throw new RuntimeException("Matrix.add unequal sizes");
        }
        for (int i = 1; i <= n; i++) {
            set(i, get(i) - v.get(i));
        }
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public void addIP(double x) {
        for (int i = 1; i <= n; i++) {
            set(i, get(i) + x);
        }
    }

    /**
     * multiply a scalar in place
     * @param v matrix to add
     * @return
     */
    public void multIP(double x) {
        for (int i = 1; i <= n; i++) {
            set(i, get(i) * x);
        }
    }

    /**
     * divide a scalar in place
     * @param v matrix to add
     * @return
     */
    public void divIP(double x) {
        for (int i = 1; i <= n; i++) {
            set(i, get(i) / x);
        }
    }

    /**
     * add a scalar in place
     * @param v matrix to add
     * @return
     */
    public void subIP(double x) {
        for (int i = 1; i <= n; i++) {
            set(i, get(i) - x);
        }
    }

    /**
     *
     * @param a
     * @return
     */
    public Matrix matMult(Matrix a) {
        if(n == 1 || a.n == 1) {
            return mult(a);
        }
        if (size[COL] != a.size[ROW]) {
            throw new RuntimeException("Matrix.mult unequal inner dimensions");
        }
        int nc = size[COL];
        Matrix res = new Matrix(size[ROW], a.size[COL]);
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
     * divide this by a
     * @param a
     * @return (a'\this')'
     */
    public Matrix matDiv(Matrix a) {
        if (a.size[COL] != a.size[ROW]) {
            throw new RuntimeException("Matrix.divide not square");
        }
        Matrix res = inv(a.transpose()).matMult(transpose()).transpose();
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix mexp(Matrix v) {
        Matrix res = new Matrix(this);
        if (n != v.n) {
            if (n == 1) {
                res = new Matrix(v);
                for (int i = 1; i <= v.n; i++) {
//                    res.data[i] = Math.pow(data[0], v.data[i]);
                    res.set(i, Math.pow(get(1), v.get(i)));
                }
            } else if (v.n == 1) {
                for (int i = 1; i <= n; i++) {
//                    res.data[i] = Math.pow(data[i], v.data[0]);
                    res.set(i, Math.pow(v.get(1),  get(i)));
                }
            } else {
                throw new RuntimeException("Matrix.add unequal sizes");
            }
        } else {
            for (int i = 1; i <= n; i++) {
 //               res.data[i] = Math.pow(data[i], v.data[i]);
                    res.set(i, Math.pow(get(i), v.get(i)));
            }
        }
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix exp(Matrix v) {
        Matrix res = new Matrix(this);
        if (v.n > 1) {
            throw new RuntimeException("exponent must be scalar");
        }
        if (n == 1) {
            res = res.mexp(v);
        } else if (v.get(1) % 1 != 0) {
            throw new RuntimeException("exponent must not be fractional");
        } else {
            int nt = (int) v.get(1);
            if (nt == 0) {
                res = Matrix.ones(size[ROW], size[COL]);
            } else if (nt < 0) {
                nt = -nt;
                res = inv(res);
            }
            for (int i = 0; i < nt; i++) {
                res = res.matMult(res);
            }
        }
        return res;
    }

    public static Matrix all(Matrix m) {
        Matrix res = new Matrix(1);
        res.type = Type. LOGICAL;
        for (int i = 1; i <= m.n; i++) {
            if (m.get(i) == 0) {
                res.set(1, 0);
                break;
            }
        }
        return res;
    }

    public static Matrix any(Matrix m) {
        Matrix res = new Matrix(0);
        res.type = Type. LOGICAL;
        for (int i = 1; i <= m.n; i++) {
            if (m.get(i) != 0) {
                res.set(1, 1);
                break;
            }
        }
        return res;
    }

    private static Matrix lt1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (v < m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix gt1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (v > m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix ge1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (v >= m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix le1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (v <= m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix eq1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (Math.abs(v - m.get(i)) < Math.ulp(v)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix ne1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, (Math.abs(v - m.get(i)) >= Math.ulp(v)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    public static Matrix isNotNaN(Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            res.set(i, Double.isNaN(m.get(i)) ? 0 : 1);
        }
        res.type = Type. LOGICAL;
        res = find(res);
        return res;
    }

    private static Matrix and1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            double x = m.get(i);
            res.set(i, (v > Math.ulp(v) && x > Math.ulp(x)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    private static Matrix or1(double v, Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 1; i <= m.n; i++) {
            double x = m.get(i);
            res.set(i, (v > Math.ulp(v) || x > Math.ulp(x)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix gt(Matrix m) {
        if (n == 1) {
            return gt1(get(1), m);
        }
        if (m.n == 1) {
            return lt1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.gt unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, (get(i) > m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix lt(Matrix m) {
        if (n == 1) {
            return lt1(get(1), m);
        }
        if (m.n == 1) {
            return gt1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.lt unequal sizes");
        }
        Matrix res = new Matrix(this);
         for (int i = 1; i <= n; i++) {
            res.set(i, (get(i) < m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix ge(Matrix m) {
        if (n == 1) {
            return ge1(get(1), m);
        }
        if (m.n == 1) {
            return le1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.ge unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, (get(i) >= m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix le(Matrix m) {
        if (n == 1) {
            return le1(get(1), m);
        }
        if (m.n == 1) {
            return ge1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.le unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, (get(i) <= m.get(i)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix eq(Matrix m) {
        if (n == 1) {
            return eq1(get(1), m);
        }
        if (m.n == 1) {
            return eq1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.eq unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, ((get(i) - m.get(i) < Math.ulp(get(i)))) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix ne(Matrix m) {
        if (n == 1) {
            return ne1(get(1), m);
        }
        if (m.n == 1) {
            return ne1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.ne unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            res.set(i, ((get(i) - m.get(i) >= Math.ulp(get(i)))) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix and(Matrix m) {
        if (n == 1) {
            return and1(get(1), m);
        }
        if (m.n == 1) {
            return and1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.ne unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            double x = m.get(i);
            res.set(i, (get(i) > Math.ulp(get(i)) && x > Math.ulp(x)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @param v
     * @return
     */
    public Matrix or(Matrix m) {
        if (n == 1) {
            return or1(get(1), m);
        }
        if (m.n == 1) {
            return or1(m.get(1), this);
        }
        if (n != m.n) {
            throw new RuntimeException("Matrix.ne unequal sizes");
        }
        Matrix res = new Matrix(this);
        for (int i = 1; i <= n; i++) {
            double x = m.get(i);
            res.set(i, (get(i) > Math.ulp(get(i)) || x > Math.ulp(x)) ? 1 : 0);
        }
        res.type = Type. LOGICAL;
        return res;
    }

    /**
     *
     * @return
     */
    public Matrix floor() {
        Matrix res = new Matrix(this);
        res.type = Type. INTEGER;
        for (int i = 1; i <= n; i++) {
            res.set(i, Math.floor(get(i)));
        }
        return res;
    }

    /**
     *  index an array
     * @param ri
     * @param ci
     * @return
     */
    public Matrix index(Matrix ri, Matrix ci) {
        if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
            throw new RuntimeException("Matrix.index indices must be vectors");
        }
        Matrix res = new Matrix(ri.n, ci.n);
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
    public Matrix index(Matrix ci) {
        if (ci.size[ROW] != 1) {
            throw new RuntimeException("Matrix.index index must be a vector");
        }
        Matrix res = new Matrix(1, ci.n);
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
    public Matrix transpose() {
        Matrix res = new Matrix(size[COL], size[ROW]);
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
    public Matrix del2() {
        int rows = size[ROW];
        int cols = size[COL];
        Matrix res = zeros(rows, cols);
        for(int r = 1; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                int n = 0;
                double s = 0;
                double it;
                for(int dr = -1; dr <= 1; dr++) {
                    if(r > 1 && r < rows) {
                        for(int dc = -1; dc <= 1; dc++) {
                             if(c > 1 && c < cols && (dr != 0 || dc != 0)) {
                                 n++;
                                 s += get(r+dr, c+dc);
                             }
                        }
                    }
                }
                if(n > 0) {
                    it = get(r,c) - s/n;
                    res.set(r, c, it);
                }
            }
        }
        return res;  
    }
    /**
     *
     * @return
     */
    public Matrix inv() {
        if (dimensions != 2
                || (size[ROW] != size[COL])) {
            throw new RuntimeException("Matrix.inv matrix must be square");
        }
        int n = size[ROW];
        int bcols = 2 * n;
        Matrix them[] = new Matrix[2];
        them[0] = new Matrix(this);
        them[1] = identity(n);
        Matrix m = hcat(them);
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
        Matrix rndx = Matrix.colon(1, n);
        return m.index(rndx, rndx.add(n));
    }

    /**
     *  Find the max and location of a Matrix
     * @return
     */
    public CellArray max() {
        CellArray res = new CellArray(1, 2);
        if (size[ROW] == 1) {
            double best = get(1);
            int where = 1;
            for (int c = 2; c <= size[COL]; c++) {
                if (get(c) > best) {
                    best = get(c);
                    where = c;
                }
            }
            res.set(1, 1, new Matrix(best));
            res.set(1, 2, new Matrix(where));
        } else {
            Matrix bestm = new Matrix(1, size[COL]);
            Matrix wherem = new Matrix(1, size[COL]);
            for (int c = 1; c <= size[COL]; c++) {
                CellArray ca =
                        index(colon(1, size[ROW]), new Matrix(c)).transpose().max();
                bestm.set(c, ((Matrix) ca.get(1, 1)).get(1));
                wherem.set(c, ((Matrix) ca.get(1, 2)).get(1));
            }
            res.set(1, 1, new Matrix(bestm));
            res.set(1, 2, new Matrix(wherem));
        }
        return res;
    }

    public double getMin() {
        double res = get(1);
        for (int i = 2; i <= n; i++) {
            if (get(i) < res) {
                res = get(i);
            }
        }
        return res;
    }

    public double getMax() {
        double res = get(1);
        for (int i = 1; i < n; i++) {
            if (get(i) > res) {
                res = get(i);
            }
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
            double best = get(1);
            int where = 1;
            for (int c = 2; c <= size[COL]; c++) {
                if (get(c) < best) {
                    best = get(c);
                    where = c;
                }
            }
            res.set(1, 1, new Matrix(best));
            res.set(1, 2, new Matrix(where));
        } else {
            Matrix bestm = new Matrix(1, size[COL]);
            Matrix wherem = new Matrix(1, size[COL]);
            for (int c = 1; c <= size[COL]; c++) {
                CellArray ca =
                        index(colon(1, size[ROW]), new Matrix(c + 1)).transpose().min();
                bestm.set(c, ((Matrix) ca.get(1, 1)).get(1));
                wherem.set(c, ((Matrix) ca.get(1, 2)).get(1));
            }
            res.set(1, 1, new Matrix(bestm));
            res.set(1, 2, new Matrix(wherem));
        }
        return res;
    }

    /**
     *
     * @param m
     * @return
     */
    public Matrix diag(Matrix m) {
        Matrix res = null;
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
    public Matrix diag(Matrix m, int offset) {
        Matrix rowIndex;
        Matrix colIndex;

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
        Matrix shrunk = m.index(rowIndex, colIndex);
        return diag(shrunk);
    }

    public void setLower(int ndx, Matrix m) {
        for (int i = 1; i <= m.n; i++) {
            if (m.get(i) < get(ndx)) {
                set(ndx, m.get(i));
            }
        }
    }

    public void setUpper(int ndx, Matrix m) {
        for (int i = 1; i <= m.n; i++) {
            if (m.get(i) > get(ndx)) {
                set(ndx, m.get(i));
            }
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
        String res = "";
        double d;
        if (type == Type.END) {
            return "end: " + geti(1);
        }
        if (n == 0) {
            return "[]";
        }
        if (rows > 1) {
            res += "[\n   ";
        } else if (cols > 1) {
            res += "[";
        }
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                d = get(r, c);
                if (Double.isNaN(d)) {
                    res+=" NaN";
                } else if (Double.isInfinite(d)) {
                    res += " inf";
                } else {
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
            }
            if ((rows > 1) && (r < rows)) {
                res += "\n   ";
            }
        }
        if (length() > 1) {
            res += " ]";
        }
        return res.toString();
    }

    public String workspaceString() {
        int rows = size[ROW];
        int cols = size[COL];
        String res;
        double d;
        if (rows > 1) {
            res = "[";
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
                res += "; ";
            }
        }
        res += "]";
        return res;
    }

    public static void main(String a[]) throws Exception {
        Matrix m = Matrix.magic(new Matrix(7));
        System.out.println(m);

        double[] vecdata = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Matrix vec = new Matrix(vecdata, 3, 3);
        System.out.println(vec);
        Matrix newvec;
        double[] insertdata = {13, 23};
        Matrix vals = new Matrix(insertdata, 1, 2);
        Matrix rind = new Matrix(1, 2, 1, 2);
        Matrix cind = new Matrix(new double[]{3}, 1, 1);
        System.out.println(cind);
        newvec = get(vec, rind, cind);
        System.out.println("\n\n");
        System.out.println(newvec);

        Matrix vec2 = get(vec, rind);
        System.out.println(vec2 + "\n\n");

        vec.set(new Matrix(2, 2, 1, 3, 7, 9), new Matrix(1, 4, 0, 0, 0, 0));
        System.out.println(vec);

        set(vec, new Matrix(1, 2, 1, 3), new Matrix(1, 2, 1, 3), new Matrix(2, 2, 1, 1, 1, 1));
        System.out.println(vec);

        Matrix x = linspace(new Matrix(1), new Matrix(2), new Matrix(10000));

        StringBuilder sb = new StringBuilder(10);
        sb.append("xa");
        System.out.println(sb.toString());
    }

    class Pair {

        double value;
        int order;

        public Pair(double v, int i) {
            value = v;
            order = i;
        }
    }
}

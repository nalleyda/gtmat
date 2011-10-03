package jmatrix;

/*
 * Parent of all Matlab classes with dimensions
 */
import java.lang.RuntimeException;
import interpreter.*;
import parser.*;
import main.*;
import workspace.*;

/**
 *
 * @author dsmith
 */
public abstract class MatObject {
    /*public enum type{
    NONE, DOUBLE, INTEGER, LOGICAL, CHAR, CELL, STRUCT, BYTE, COMPLEX
    }*/

    public static final int NONE = 0;
    public static final int DOUBLE = 1;
    public static final int INTEGER = 2;
    public static final int LOGICAL = 3;
    public static final int CHAR = 4;
    public static final int CELL = 5;
    public static final int STRUCT = 6;
    public static final int BYTE = 7;
    public static final int COMPLEX = 8;
    public static final int UINT8 = 9;
    public static final int END = 10;
    public static final int ROW = 0;
    public static final int COL = 1;
    public static final int CLR = 2;
    private static String label[] = {
        "none",
        "double",
        "integer",
        "logical",
        "char",
        "cell",
        "struct",
        "byte",
        "complex",
        "uint8",
        "end"
    };
    public int n;          // number of data items
    public int size[];     // sizes of each dimension [rows cols clrs]
    public int dimensions; // size of size
    public int type;       // see types above

    public abstract MatObject copy();
    public abstract MatObject empty();
    public abstract MatObject zeroed();
    public abstract void copyValues(Matrix ndx, MatObject src) throws Exception;
    
    public MatObject() {
        n = 0;
        size = new int[2];
        dimensions = 2;
        type = NONE;
        size[ROW] = 1;
        size[COL] = 0;
    }

    public MatObject(int sz) {
        n = sz;
        size = new int[2];
        dimensions = 2;
        type = NONE;
        size[ROW] = 1;
        size[COL] = sz;
    }

    public MatObject(int rows, int cols) {
        n = rows * cols;
        size = new int[2];
        dimensions = 2;
        type = NONE;
        size[ROW] = rows;
        size[COL] = cols;
    }

    public MatObject(int rows, int cols, int clrs) {
        n = rows * cols * clrs;
        size = new int[3];
        dimensions = 3;
        type = NONE;
        size[ROW] = rows;
        size[COL] = cols;
        size[CLR] = clrs;
    }

    public MatObject(MatObject mo) {
            this.n = mo.n;
            this.size = mo.size;
            this.dimensions = mo.dimensions;
            this.type = mo.type;
    }
    
    public static Matrix length(MatObject o) {
        return new Matrix(o.length());
    }

    public static Matrix castToMatrix(MatObject o) {
        Matrix ov;
        if (o instanceof Matrix) {
            ov = (Matrix) o;
        } else {
            ov = new Matrix(o);
        }
        return ov;
    }

    public static MatComplex castToComplex(MatObject o) {
        MatComplex ov;
        if (o instanceof MatComplex) {
            ov = (MatComplex) o;
        } else {
            ov = new MatComplex((Matrix) o);
        }
        return ov;
    }

    public static MatString castToMatString(MatObject o) {
        MatString ov;
        if (o instanceof MatString) {
            ov = (MatString) o;
        } else {
            ov = new MatString(o);
        }
        return ov;
    }
    
    public static MatComplex complex(Matrix rl, Matrix im) {
        MatComplex res = new MatComplex(rl, im);
        return res;
    }
    
    /**
     * add a matrix
     * @param v matrix to add
     * @return
     */
    public MatObject add(MatObject o) {
        MatObject res = null;
        if(o instanceof Matrix) {
            res = new Matrix(this);
            Matrix ov = castToMatrix(o);
            res = ((Matrix) res).add(ov);
        } else if(o instanceof MatComplex) {
            res = castToComplex(this);
            MatComplex cv = (MatComplex) o;
            res = ((MatComplex) res).add(cv);
        } 
        return res;
    }

    /**
     * sub a matrix
     * @param v matrix to add
     * @return
     */
    public MatObject sub(MatObject o) {
        MatObject res = null;
        if(o instanceof Matrix) {
            res = new Matrix(this);
            Matrix ov = castToMatrix(o);
            res = ((Matrix) res).sub(ov);
        } else if(o instanceof MatComplex) {
            res = castToComplex(this);
            MatComplex cv = (MatComplex) o;
            res = ((MatComplex) res).sub(cv);
        } 
        return res;
    }

    /**
     * mult a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix mult(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return res.matMult(ov);
    }

    /**
     * div a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix div(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return res.matDiv(ov);
    }


    /**
     * dot mult a matrix
     * @param v matrix to add
     * @return
     */
    public MatObject dotmult(MatObject o) {
        MatObject res = null;
        if(o instanceof Matrix) {
            res = new Matrix(this);
            Matrix ov = castToMatrix(o);
            res = ((Matrix) res).mult(ov);
        } else if(o instanceof MatComplex) {
            res = castToComplex(this);
            MatComplex cv = (MatComplex) o;
            res = ((MatComplex) res).mult(cv);
        } 
        return res;
    }

    /**
     * ./ a matrix
     * @param v matrix to add
     * @return
     */
    public MatObject dotdiv(MatObject o) {
        MatObject res = null;
        if(o instanceof Matrix) {
            res = new Matrix(this);
            Matrix ov = castToMatrix(o);
            res = ((Matrix) res).div(ov);
        } else if(o instanceof MatComplex) {
            res = castToComplex(this);
            MatComplex cv = (MatComplex) o;
            res = ((MatComplex) res).div(cv);
        } 
        return res;
    }

    /**
     * ^ a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix caret(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return res.exp(ov);
    }

    /**
     * ./ a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix dotcaret(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.mexp(res, ov);
    }

    /**
     * negate a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix negate() {
        Matrix res = new Matrix(this);
        return res.negate();
    }

    /**
     * > a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix gt(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.gt(res, ov);
    }

    /**
     * < a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix lt(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.lt(res, ov);
    }

    /**
     * >= a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix ge(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.ge(res, ov);
    }

    /**
     * <= a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix le(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.le(res, ov);
    }

    /**
     * == a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix eq(MatObject o) {
        Matrix res = new Matrix(this);
        if(o instanceof Matrix) {
            Matrix ov = castToMatrix(o);
            res =  Matrix.eq(res, ov);
        } else if(o instanceof MatString) {
            MatString mst = (MatString) o;
            res = mst.eq(this);
        }
        return res;
    }

    /**
     * ~= a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix ne(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.ne(res, ov);
    }

    /**
     * and a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix and(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.ne(res, ov);
    }

    /**
     * or a matrix
     * @param v matrix to add
     * @return
     */
    public Matrix or(MatObject o) {
        Matrix res = new Matrix(this);
        Matrix ov = castToMatrix(o);
        return Matrix.ne(res, ov);
    }

    public static MatString charCast(MatObject o) {
        return castToMatString(o);
    }

    public static Matrix doubleCast(MatObject o) {
        return castToMatrix(o);
    }

    public static String getClass(MatObject o) {
        return label[o.type];
    }

    public static boolean isChar(MatObject o) {
        return o.type == CHAR;
    }

    public double[] size() {
        double res[] = new double[dimensions];
        for (int i = 0; i < dimensions; i++) {
            res[i] = size[i];
        }
        return res;
    }

    public int rows() {
        return size[ROW];
    }

    public int cols() {
        return size[COL];
    }

    public int clrs() {
        return size[CLR];
    }

    public int length() {
        if (n == 0) {
            return 0;
        }
        int mx = size[0];
        for (int i = 1; i < dimensions; i++) {
            if (size[i] > mx) {
                mx = size[i];
            }
        }
        return mx;
    }

    public String workspaceString() {
        return null;
    }
    
    public MatObject hcat(MatObject o) {
        return null;
    }

    public String info() {
        String res = label[type] + "[";
        for (int i = 0; i < dimensions; i++) {
            res += " " + size[i];
            if (i < (dimensions - 1)) {
                res += " x";
            }
        }
        res += " ] -- " + getClass().getName();
        return res;
    }
    
    public static MatObject get(MatObject m, Matrix ind) throws Exception {
        if(ind.type == LOGICAL) {
            ind = Matrix.find(ind);
        }
        switch (m.type) {
            case DOUBLE:
                return Matrix.get((Matrix) m, (Matrix) ind);
            case LOGICAL:

                break;
            case CHAR:
                return MatString.get((MatString) m, (Matrix) ind);
            case CELL:

                break;
            case STRUCT:
                return ((StructArray) m).get((int) ind.get(1));
                
            case BYTE:

                break;
            case COMPLEX:

                break;

        }

        throw new RuntimeException("Calling MatObject's get method - undefined behavior");
    }

    public static MatObject get(MatObject m, Matrix ri, Matrix ci) throws Exception {
        switch (m.type) {
            case DOUBLE:
                return Matrix.get((Matrix) m, (Matrix) ri, (Matrix) ci);
            case LOGICAL:

                break;
            case CHAR:

                break;
            case CELL:

                break;
            case STRUCT:

                break;
            case BYTE:

                break;
            case COMPLEX:

                break;
            case UINT8:
                return Uint8.get((Matrix) m, (Matrix) ri, (Matrix) ci);
        }
        throw new RuntimeException("Calling MatObject's get method - undefined behavior");
    }

    public static MatObject get(MatObject m, Matrix ri, Matrix ci, Matrix clri) {
        switch (m.type) {
            case DOUBLE:
                return Matrix.get((Matrix) m, ri, ci, clri);
            case LOGICAL:

                break;
            case CHAR:

                break;
            case CELL:

                break;
            case STRUCT:

                break;
            case BYTE:

                break;
            case COMPLEX:

                break;
            case UINT8:
                return Uint8.get((Uint8) m, ri, ci,  clri);
        }
        throw new RuntimeException("Calling MatObject's get method - undefined behavior");
    }
    
    
    private static boolean isIn(int k, Matrix m) {
        boolean res = false;
        for(int i = 1; i <= m.n; i++) {
            if(k == m.geti(i)) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static void index(String name, CellArray ca, MatObject expr, boolean showIt) throws Exception{
        /* 
         * How this is supposed to work:
         * - we are dealing with a matlab line like: B([1 3 5], [2 7]) = something.
         * - the vslue of expr is the RHS
         * - the cell array index contains the multiple dimensions of indexing for B
         * - with everything else going on, the user might decide to put an empty vector
         * - into parts of B (sigh!)
         * We will deal with the multiple dimensions by linearizing the array
         * B might not exist, in which case we make an empty copy of the rhs array
         * So in the example above, we fetch the [1 3 5] from the cell array
         * if there were no other dimensions, this would be the data values at
         * 1, 3 and 5.  But there is another dimension.  
         * When we fetch the [2 7] the actual access becomes:
         * [[1 3 5] + rows*(2-1), [1 3 5] + rows*(7-1)] 
         *      - a nice feature: individual dimensions could be logical - need to
         *      - run find on them
         * 
         */
        Workspace curW = Interpreter.getWorkspace();
        MatObject val = Interpreter.getValue(name);
        if(val == null) {
            val = expr.zeroed();
        }
        int en = expr.n;
        Matrix offset = null;
        Matrix lastOne = null;
        int dim = 1;
        int oi = 0;
        for(int i = 1; i <= ca.n; i++) {
            Matrix index = (Matrix) ca.get(1, i);
            if(index.type == LOGICAL) {
                index = Matrix.find((Matrix) index);
            }
            if(i == 1) {
                offset = new Matrix(index);
                lastOne = new Matrix(index);
            } else {
                dim = dim * val.size[i-2];
                for(int ni = 0; ni < index.n; ni++) {
                    for(int li = 0; li < lastOne.n; li++) {
                        offset.set(1, ++oi, 
                                lastOne.data[li] + dim*(index.data[ni]-1));
                    }
                }
                lastOne = new Matrix(offset);
            }
        }
        if (en > 1 && en != offset.n) {
            throw new RuntimeException("assignment dimension mismatch");
        }
        if(en == 0) { // putting empty vector in
            Matrix keeps = ((Matrix)val).empty();
            for(int i = 1; i <= val.n; i++) {
                if(!isIn(i, offset)) {
                    keeps.set(1, keeps.n+1, i);
                }
            }
            val = get(val, keeps);
        } else {
            val.copyValues(offset, expr);
        }
        curW.add(new Variable(name, val));
        if (showIt) {
            Interpreter.displayString(name + " = " + val + "\n");
        }
        TabbedPane.list.setModel(Main.wstack.peek().getVarList());
    }
    
    

    public String toString() {
        String res = "MatObject of type " + label[type] + "; sized " + size[ROW] + "x" + size[COL];
        return res;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;

/**
 *
 * @author dsmith
 */
public class MatString extends UnsignedByte {
    public MatString(String s) {
        super(s.getBytes());
        type = CHAR;
    }
        /**
     * clone a matObject
     * @param v
     */
    public MatString(MatObject o) {
        data = new double[o.n];
        n = o.n;
        if ( o instanceof Matrix)  {
            for (int i = 0; i < n; i++) {
                data[i] = ((Matrix) o).data[i];
            }
        } else if ( o instanceof SignedByte)  {
            for (int i = 0; i < n; i++) {
                data[i] = ((SignedByte) o).data[i];
            }
        } else if ( o instanceof MatString)  {
            for (int i = 0; i < n; i++) {
                data[i] = ((MatString) o).data[i];
            }
        } else if ( o instanceof UnsignedByte)  {
            for (int i = 0; i < n; i++) {
                data[i] = ((UnsignedByte) o).data[i];
            }
        } else {
            throw new RuntimeException("illegal math operation");
        }
        type = CHAR;
        dimensions = o.dimensions;
        size = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            size[i] = o.size[i];
        }
    }
    
    /**
     * @newtag
     * Creates a Matrix given the vector of data in the right format
     */
    public MatString(double[] data, int rows, int cols) {
        if (rows * cols != data.length) {
            throw new RuntimeException("Dimension Mismatch Error");
        }


        this.data = data;
        n = rows * cols;
        size = new int[2];
        dimensions = 2;
        type = DOUBLE;
        size[COL] = cols;
        size[ROW] = rows;
    }

    public Matrix eq(MatObject o) {
        int it = 0;;
        String a = toString();
        String b = o.toString();
        if(a.equals(b)) it = 1;
        return new Matrix(it);
    }

    /**
     * @newtag
     * @param m
     * @param ind
     * @return
     */
    public static MatString get(MatString m, Matrix ind) throws Exception {
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
        MatString res = new MatString(newmat, ind.size[ROW], ind.size[COL]);
        res.size[ROW] = ind.size[ROW];
        res.size[COL] = ind.size[COL];
        return res;
    }

    public MatString clone() {
        return new MatString(this);
    }


    @Override
    public String toString() {
        int i = 0;
        byte ar[] = new byte[cols()];
        for(;i < cols(); i++) {
            ar[i] = (byte) data[i];
        }
        return new String(ar);
    }
}

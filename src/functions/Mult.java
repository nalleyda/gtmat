package functions;

import jmatrix.*;

public class Mult {
	public static MatObject mult(MatObject o1, MatObject o2) throws Exception{
		throw new Exception("Calling a dummy method.");
	}
	
	
	/**
	 * Multiply two matrices
	 * @param m a matrix
	 * @param v another matrix
	 * @return m * v
	 */
	public static Matrix mult(Matrix m, Matrix v) {
        Matrix res = new Matrix(m);
        if (m.n != v.n) {
            if (m.n == 1) {
                res = new Matrix(v);
                for (int i = 0; i < v.n; i++) {
                    res.data[i] = m.data[0] * res.data[i];
                }
            } else if (v.n == 1) {
                for (int i = 0; i < m.n; i++) {
                    res.data[i] = v.data[0] * m.data[i];
                }
            } else {
                //TODO Dimension mismatch exception
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = m.data[i] * v.data[i];
            }
        }
        return res;
	}
}

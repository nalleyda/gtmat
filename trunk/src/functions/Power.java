package functions;

import gtmatException.MatrixDimensionsException;
import jmatrix.*;

public class Power {
	public static MatObject power(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)Power.class.getMethod("power", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * TODO Check that this shouldn't be matrix exponentiation instead of element-by-element
	 * Raise one matrix to another
	 * @param m one matrix
	 * @param v another matrix
	 * @return a matrix where ret(i) = m(i) ^ v(i), or ret(i) = m(i) ^ v if length(v) == 1
	 */
	public static Matrix power(Matrix m, Matrix v) {
        Matrix res = new Matrix(m);
        if (m.n != v.n) {
            if (m.n == 1) {
                res = new Matrix(v);
                for (int i = 0; i < v.n; i++) {
                    res.data[i] = Math.pow(m.data[0], v.data[i]);
                }
            } else if (v.n == 1) {
                for (int i = 0; i < m.n; i++) {
                    res.data[i] = Math.pow(m.data[i], v.data[0]);
                }
            } else {
            	throw(new MatrixDimensionsException());
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = Math.pow(m.data[i], v.data[i]);
            }
        }
        return res;
	}
}

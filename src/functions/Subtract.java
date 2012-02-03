package functions;

import jmatrix.*;

public class Subtract {
	public static MatObject subtract(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)Subtract.class.getMethod("subtract", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Subtract one matrix from another
	 * @param m one matrix
	 * @param v another matrix
	 * @return m-v
	 */
	public static Matrix subtract(Matrix m, Matrix v) {
        Matrix res = new Matrix(m);
        if (m.n != v.n) {
            if (m.n == 1) {
                res = new Matrix(v);
                for (int i = 0; i < v.n; i++) {
                    res.data[i] = m.data[0] - v.data[i];
                }
            } else if (v.n == 1) {
                for (int i = 0; i < m.n; i++) {
                    res.data[i] = m.data[i] - v.data[0];
                }
            } else {
                //TODO Dimension mismatch exception.
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = m.data[i] - v.data[i];
            }
        }
        return res;
	}
}

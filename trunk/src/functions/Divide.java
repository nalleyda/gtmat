package functions;

import java.lang.reflect.InvocationTargetException;

import jmatrix.*;

public class Divide {
	public static MatObject divide(MatObject o1, MatObject o2) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return (MatObject)Divide.class.getMethod("divide", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Divide one matrix by another
	 * @param m one matrix
	 * @param v another matrix
	 * @return m * inv(b)
	 */
	public static Matrix divide(Matrix m, Matrix v) {
        Matrix res = new Matrix(m);
        if (m.n != v.n) {
            if (m.n == 1) {
                res = new Matrix(v);
                for (int i = 0; i < v.n; i++) {
                    res.data[i] = m.data[0] / res.data[i];
                }
            } else if (v.n == 1) {
                for (int i = 0; i < m.n; i++) {
                    res.data[i] = m.data[i] / v.data[0];
                }
            } else {
                //TODO Dimension mismatch exception
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = m.data[i] / v.data[i];
            }
        }
        return res;
	}
}

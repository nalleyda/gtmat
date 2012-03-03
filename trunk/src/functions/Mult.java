package functions;

import jmatrix.*;
import gtmatException.*;

public class Mult {
	public static MatObject mult(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)Mult.class.getMethod("mult", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
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
                throw(new MatrixDimensionsException("unknown"));
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = m.data[i] * v.data[i];
            }
        }
        return res;
	}
	
	public static void main(String[] args){
		MatObject a = new Matrix(3);
		MatObject b = new Matrix(4);
		try {
			System.out.println(Mult.mult(a,b));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

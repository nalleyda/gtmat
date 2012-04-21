package functions;

import jmatrix.*;
import gtmatException.*;

public class MatMult {
	public static MatObject matMult(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)MatMult.class.getMethod("matMult", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Matrix multiply two matrices
	 * @param m a matrix
	 * @param a another matrix
	 * @return m * a
	 * @throws Exception 
	 */
	public static Matrix matMult(Matrix m, Matrix a) throws Exception {
        if(m.n == 1 || a.n == 1) {
            return Mult.mult(m, a);
        }
        if (m.size[MatObject.COL] != a.size[MatObject.ROW]) {
            throw(new InnerMatrixDimensionsException());
        }
        int nc = m.size[MatObject.COL];
        Matrix res = new Matrix(m.size[MatObject.ROW], a.size[MatObject.COL]);
        for (int r = 1; r <= m.size[MatObject.ROW]; r++) {
            for (int c = 1; c <= a.size[MatObject.COL]; c++) {
                double sum = 0;
                for (int it = 1; it <= nc; it++) {
                    double v1 = m.get(r, it);
                    double v2 = a.get(it, c);
                    sum += v1 * v2;
                }
                res = Set.set(res, r, c, sum);
            }
        }
        return res;
	}
}

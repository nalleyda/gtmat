package functions;

import jmatrix.*;
import jmatrix.MatObject.Type;
import gtmatException.*;

public class GreaterEqual {
	public static MatObject greaterEqual(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)GreaterEqual.class.getMethod("greaterEqual", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Method to see where Matrix a >= Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) >= b(i)
	 * @throws Exception 
	 */
	public static Matrix greaterEqual(Matrix a, Matrix b) throws Exception {
		if (a.n == 1) {
			return dGEm(a.get(1), b);
		}
		if (b.n == 1) {
			return mGEd(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = (a.data[i] >= b.data[i]) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
	public static Matrix dGEm(double v, Matrix m) throws Exception {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (v >= m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
	public static Matrix mGEd(double v, Matrix m) throws Exception {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (v <= m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
//	public static MatObject lessEqual(Matrix m1, Matrix m2)
}

package functions;

import jmatrix.*;
import jmatrix.MatObject.Type;
import gtmatException.*;

public class IsEqual {
	public static MatObject isEqual(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)IsEqual.class.getMethod("isEqual", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Method to see where Matrix a == Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) <= b(i)
	 */
	public static Matrix isEqual(Matrix a, Matrix b) {
		if (a.n == 1) {
			return le1(a.get(1), b);
		}
		if (b.n == 1) {
			return ge1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException("unknown"));
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = (a.data[i] == b.data[i]) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
	public static Matrix le1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res.set(i, (v <= m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
	public static Matrix ge1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res.set(i, (v >= m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
//	public static MatObject lessEqual(Matrix m1, Matrix m2)
}

package functions;

import gtmatException.MatrixDimensionsException;
import jmatrix.*;
import jmatrix.MatObject.Type;

public class NotEqual {
	
	public static MatObject notEqual(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)NotEqual.class.getMethod("notEqual", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
//	public static Matrix notEqual(Matrix a, Matrix b) throws Exception{
//		Matrix eq = IsEqual.isEqual(a, b);
//		eq = (Matrix)BoolNegate.boolNegate(eq);
//		return eq;
//	}
	/**
	 * Method to see where Matrix a ~= Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) ~= b(i)
	 */
	public static Matrix notEqual(Matrix a, Matrix b) {
		if (a.n == 1) {
			return ne1(a.get(1), b);
		}
		if (b.n == 1) {
			return ne1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = ((a.data[i] - b.data[i]) >= Math.ulp(a.data[i])) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}
	
	private static Matrix ne1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			Set.set(res, i, (Math.abs(v - m.get(i)) >= Math.ulp(v)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

}

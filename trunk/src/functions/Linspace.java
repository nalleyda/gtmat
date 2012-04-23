package functions;

import jmatrix.Matrix;

public class Linspace {
	public static Matrix linspace(Matrix from, Matrix to, Matrix n) {
		Matrix res = null;
		double dv = 0;
		if (n.get(0) < 0) {
			return new Matrix(to);
		}
		if (n.get(0) > 1) {
			dv = (to.get(0) - from.get(0)) / (n.get(0) - 1);
		}
		res = new Matrix(1, n.get(0));
		res.set(1, from.get(0));
		res.n = n.length();
		for (int i = 2; i <= n.get(0); i++) {
			res.set(i, res.get(i-1) + dv);
		}
		return res;
	}
}

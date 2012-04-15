package functions;

import jmatrix.*;

public class Negate {//e.g., -x, rather than a boolean negation ~x
	
	public static MatObject negate(MatObject o) throws Exception{
		return (MatObject)Negate.class.getMethod("negate", o.getClass()).invoke(null, new Object[] {o});
	}
	
	/**
	 * horizontal concatenation (an array of matrices)
	 * @param m
	 * @return
	 */
	public static Matrix negate(Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= res.n; i++) {
			res.set(i, -m.get(i));
		}
		return res;
	}

}

package functions;

import jmatrix.*;

public class ShortCircuitAnd {
	public static MatObject shortCircuitAnd(MatObject o1, MatObject o2) throws Exception{
		Logical l1 = new Logical(o1);
		Logical l2 = new Logical(o2);
		Matrix ret = new Matrix(1);
		ret.type = MatObject.Type.LOGICAL;
		ret.set(1, l1.get(1) && l2.get(1) ? 1 : 0);
		return ret;
	}
}

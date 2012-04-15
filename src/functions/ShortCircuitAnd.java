package functions;

import gtmatException.CustomException;
import jmatrix.*;

public class ShortCircuitAnd {
	public static MatObject shortCircuitAnd(MatObject o1, MatObject o2) throws Exception{
		if(o1.n != 1 || o2.n != 1) {
			throw new CustomException("Operands to the || and && operators must be convertible to logical scalar values.");
		}
		Logical l1 = new Logical(o1);
		Logical l2 = new Logical(o2);
		Matrix ret = new Matrix(1);
		ret.type = MatObject.Type.LOGICAL;
		ret.set(1, l1.get(1) && l2.get(1) ? 1 : 0);
		return ret;
	}
}

package functions;

import gtmatException.CustomException;
import jmatrix.*;

public class ElementOr {
	public static MatObject elementOr(MatObject o1, MatObject o2) throws Exception{
		if(o1.n != 1 && o2.n != 1 && o1.n != o2.n) {
			throw new CustomException("Inputs must have the same size.");
		}
		Logical l1 = new Logical(o1);
		Logical l2 = new Logical(o2);
		Matrix out;
		if(o1.n == 1) {
			out = new Matrix(o2);
			for(int i = 1; i <= o2.n; i++ ) {
				Set.set(out, i, l1.get(1) || l2.get(i) ? 1 : 0);
			}
		} else if(o2.n == 1) {
			out = new Matrix(o1);
			for(int i = 1; i <= o1.n; i++ ) {
				Set.set(out, i, l1.get(i) || l2.get(1) ? 1 : 0);
			}
		} else {
			out = new Matrix(o2);
			for(int i = 1; i <= o1.n; i++) {
				Set.set(out, i, l1.get(i) || l2.get(i) ? 1 : 0);
			}
		}
		out.type = MatObject.Type.LOGICAL;
		return out;
		
	}
}

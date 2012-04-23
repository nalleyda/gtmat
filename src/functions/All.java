package functions;

import jmatrix.MatObject;
import jmatrix.Matrix;

public class All {
	public static MatObject all(MatObject o) throws Exception {
		return all((Matrix)o);
	}
	
	public static Matrix all(Matrix m) throws Exception {
		Matrix out = new Matrix(m);
		out = IsEqual.isEqual(out,new Matrix(0));
		if(Any.any(Any.any(out)).get(1)==0) {
			out = new Matrix(1);
		}
		else {
			out = new Matrix(0);
		}
		out.type=MatObject.Type.LOGICAL;
		return out;
	}
}

package functions;

import jmatrix.*;

public class BoolNegate {
//	public static MatObject boolNegate(MatObject o) throws Exception{
//		//throw new Exception("Calling a dummy method.");	
//		return (MatObject)BoolNegate.class.getMethod("boolNegate", o.getClass()).invoke(null, new Object[] {o});
//	}
	
	public static MatObject boolNegate(MatObject o) throws Exception{
		Matrix out;
		if ((o instanceof Matrix) || (o instanceof Logical)){
			out = new Matrix(o);
			Logical l1 = new Logical(o);
			
			for (int i = 1; i<=o.n; i++){
				Set.set(out, i, l1.get(i) == false ? 1 : 0);
			}
			
			out.type = MatObject.Type.LOGICAL;
		} else throw new Exception("Passed boolNegate(MatObject) an unexpected datatype. Expected inputs are Matrix and Logical.");
		return out;
	}
}

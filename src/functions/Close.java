package functions;

import jmatrix.MatObject;
import jmatrix.Matrix;

public class Close {
	
	public static MatObject close() throws Exception{
		return new Matrix(1);
		/*if (o1 instanceof Matrix && o2 instanceof Matrix)
			return Add.add((Matrix)o1, (Matrix)o2);*/
		//throw new Exception("Calling a dummy method.");
		//return (MatObject)Add.class.getMethod("add", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}

}

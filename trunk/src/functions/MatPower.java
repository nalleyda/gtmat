package functions;

import jmatrix.*;

public class MatPower {
	
	public static MatObject matPower(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)MatPower.class.getMethod("matPower", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}

}

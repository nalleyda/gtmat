package functions;

import jmatrix.*;

public class Power {
	public static MatObject power(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)Power.class.getMethod("power", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
}

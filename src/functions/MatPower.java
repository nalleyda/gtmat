package functions;

import jmatrix.*;

public class MatPower {

	public static MatObject matPower(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)MatPower.class.getMethod("matPower", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}

	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 * @throws Exception
	 */
	public static Matrix matPower(Matrix m1, Matrix m2) throws Exception{
		if (m2.n != 1){
			throw new Exception("Only scalar powers of matrices are currently supported.");
		}
		if (m1.rows() != m1.cols()){
			throw new Exception("Can't raise a non-square matrix to a scalar power.");
		}
		if(m1.n==1){
			return new Matrix(Math.pow(m1.data[0],m2.data[0]));
		}

		int power = (int)m2.get(1);
		if (Math.abs(power - m2.get(1)) > .0000000000000001){
			throw new Exception("Only integer powers are supported!");
		}
		Matrix res = m1.copy();
		//TODO multiplying like this is stupid. At the very least, do exponentiation by squaring.
		for (int i = 1; i < power; i++){
			res = MatMult.matMult(res, m1);
		}
		return res;

	}

}

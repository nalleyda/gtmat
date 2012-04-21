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
		double eps = .0000000001;
		double power = m2.get(1) + eps; //if it's an int, get rid of rounding error (e.g, if 3 is represented as 2.99998)
		boolean isIntPower = (power - (int)(power)) < eps;
		if (m1.n != 1 && !isIntPower){
			throw new Exception("Matrices to non-integer powers not currently supported.");
		}

		Matrix res = m1.copy();
		if (isIntPower){//matrix or scalar to integer power
			//TODO multiplying like this is stupid. At the very least, do exponentiation by squaring.
			for (int i = 1; i < (int)power; i++){
				res = MatMult.matMult(res, m1);
			}
			return res;
		}
		else{//scalar to any non-integer power
			power -= eps;//we skewed the power
			for (int i = 1; i <= m1.n; i++){
				res = Set.set(res, i, Math.pow(m1.get(i), power));
			}
			return res;
		}
	}

}

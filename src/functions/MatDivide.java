package functions;

import jmatrix.*;
import gtmatException.*;

public class MatDivide {
	public static MatObject matDivide(MatObject o1, MatObject o2) throws Exception{
		return (MatObject)MatDivide.class.getMethod("matDivide", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Matrix Divide one matrix by another
	 * @param m one matrix
	 * @param v another matrix
	 * @return (inv(m') * v')'
	 * @throws Exception 
	 */
	public static Matrix matDivide(Matrix m, Matrix v) throws Exception {
        /*if (v.size[MatObject.COL] != v.size[MatObject.ROW]) {
            throw(new MatrixDimensionsException("unknown"));
        }
        Matrix res = null;
		try {
			res = (Matrix) Transpose.transpose(MatMult.matMult(MatInverse.matInverse(Transpose.transpose(v)), Transpose.transpose(m)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return res;*/
		if (v.n == 1){//scalar division = dot division
			Matrix res = m.copy();
			double divisor = v.get(1);
			for (int i = 1; i <= m.n; i++){
				res = Set.set(res, i, m.get(i)/divisor);
			}
			return res;
		}
		else if (m.n == 1){
			throw new Exception("Matrix dimensions must agree.");
		}
		else{//neeed to invert
			Matrix left = MatInverse.matInverse(v);
			Matrix ret = MatMult.matMult(m, left);
			return ret;//MatMult.matMult(m, MatInverse.matInverse(v));
			//throw new Exception("Non-scalar division not yet implemented.");
		}
		//return res;
	}
	
	/*public static void main(String[] args){
		System.out.println(MatDivide.matDivide(new Matrix(3), new Matrix(2)));
	}*/
}

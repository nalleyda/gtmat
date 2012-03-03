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
	 */
	public static Matrix matDivide(Matrix m, Matrix v) {
        if (v.size[MatObject.COL] != v.size[MatObject.ROW]) {
            throw(new MatrixDimensionsException("unknown"));
        }
        Matrix res = null;
		try {
			res = (Matrix) Transpose.transpose(MatMult.matMult(MatInverse.matInverse(Transpose.transpose(v)), Transpose.transpose(m)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return res;
	}
	
	public static void main(String[] args){
		System.out.println(MatDivide.matDivide(new Matrix(3), new Matrix(2)));
	}
}

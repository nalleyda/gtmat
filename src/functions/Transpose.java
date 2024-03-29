package functions;

import jmatrix.*;

public class Transpose {
	public static MatObject transpose(MatObject o) throws Exception{
		throw new Exception("Calling dummy method.");
	}

	/**
	 * Transpose a matrix
	 * @param m the matrix to transpose
	 * @return transpose of m
	 * @throws Exception 
	 */
	public static Matrix transpose(Matrix m) throws Exception {
		 Matrix res = new Matrix(m.size[MatObject.COL], m.size[MatObject.ROW]);
		 for (int r = 1; r <= m.size[MatObject.ROW]; r++) {
			 for (int c = 1; c <= m.size[MatObject.COL]; c++) {
				 res = Set.set(res, c, r, m.get(r, c));
			 }
		 }
		 return res;
	}
}

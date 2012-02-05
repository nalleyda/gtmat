package functions;

import java.util.ArrayList;

import jmatrix.*;

public class HorizontalConcatenate {
	/*public static MatObject horizontalConcatenate(ArrayList<MatObject> args) throws Exception{
		return (MatObject)HorizontalConcatenate.class.getMethod("horizontalConcatenate", args.getClass()).invoke(null, new Object[] {args});
	}*/
	
	public static MatObject horizontalConcatenateCell(MatObject... arr) throws Exception{
		throw new Exception("Calling a dummy method.");
	}
	
	public static Matrix horizontalConcatenate(ArrayList<MatObject> mArr){
		return horizontalConcatenate(mArr.toArray(new Matrix[0]));
	}
	/**
	 * horizontal concatenation (an array of matrices)
	 * @param m
	 * @return
	 */
	public static Matrix horizontalConcatenate(Matrix... m) {
		Matrix res;
		int cols = 0;
		int rows = m[0].size[MatObject.ROW];
		int col = 0;
		// calculate cols and check rows
		for (int i = 0; i < m.length; i++) {
			cols += m[i].size[MatObject.COL];
			if (m[i].size[MatObject.ROW] != rows) {
				throw new RuntimeException("Matrix.hcat bad rows in item " + i);
			}
		}
		res = new Matrix(rows, cols);
		// copy all matrices into res
		for (int i = 0; i < m.length; i++) {
			Matrix it = m[i];
			for (int c = 1; c <= it.size[MatObject.COL]; c++) {
				for (int r = 1; r <= rows; r++) {
					res.set(r, c + col, it.get(r, c));
				}
			}
			col += it.size[MatObject.COL];
		}
		return res;
	}
	
	/*public static void main(String[] args) throws Exception{
		MatObject m1 = new Matrix(1);
		MatObject m2 = new Matrix(2);
		System.out.println(horizontalConcatenate(m1, m2));
	}*/
}

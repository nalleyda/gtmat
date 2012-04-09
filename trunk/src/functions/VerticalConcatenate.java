package functions;

import java.util.ArrayList;
import gtmatException.*;

import jmatrix.*;

public class VerticalConcatenate {
	/*public static MatObject verticalConcatenate(MatObject... arr) throws Exception{
		throw new Exception("Calling a dummy method.");
	}*/
	
	public static Matrix verticalConcatenate(ArrayList<MatObject> mArr){
		return verticalConcatenate(mArr.toArray(new Matrix[0]));
	}
	/**
	 * vertical concatenation (an array of matrices)
	 * @param m
	 * @return
	 */
	public static Matrix verticalConcatenate(Matrix... m) {
		Matrix res;
		int rows = 0;
		int cols = m[0].size[MatObject.COL];
		int row = 0;
		// calculate cols and check rows
		for (int i = 0; i < m.length; i++) {
			rows += m[i].size[MatObject.ROW];
			if (m[i].size[MatObject.COL] != cols) {
				throw(new CustomException("Array column diminsions must agree"));
				//throw new RuntimeException("Matrix.vcat bad columns in item " + i);
			}
		}
		res = new Matrix(rows, cols);
		// copy all matrices into res
		for (int i = 0; i < m.length; i++) {
			Matrix it = m[i];
			for (int c = 1; c <= cols; c++) {
				for (int r = 1; r <= it.size[MatObject.ROW]; r++) {
					res.set(r + row, c, it.get(r, c));
				}
			}
			row += it.size[MatObject.ROW];
		}
		return res;
	}
	
	public static MatObject verticalConcatenateCell(MatObject... arr) throws Exception{
		throw new Exception("Calling a dummy method.");
	}
}

package functions;

import java.util.ArrayList;
import gtmatException.*;

import jmatrix.*;

public class HorizontalConcatenate {
	/*public static MatObject horizontalConcatenate(ArrayList<MatObject> args) throws Exception{
		return (MatObject)HorizontalConcatenate.class.getMethod("horizontalConcatenate", args.getClass()).invoke(null, new Object[] {args});
	}*/

	public static MatObject horizontalConcatenateCell(MatObject... arr) throws Exception{
		//throw new Exception("Calling a dummy method.");
		//TODO generalize this method
		boolean allMat = true;
		for (MatObject m : arr){
			if (!(m instanceof Matrix)){
				allMat = false;
				break;
			}
		}
		if (allMat){
			Matrix[] marr = new Matrix[arr.length];
			for (int i = 0; i < marr.length; i++){
				marr[i] = (Matrix)arr[i];
			}
			return horizontalConcatenate(marr);
		}
		else{
			return hCatCell(arr);
		}
	}

	public static CellArray hCatCell(MatObject... arr) throws Exception{
		boolean allSame = true;
		CellArray ret = new CellArray();
		if (arr.length == 0) return ret;

		for (int i = 0; i < arr.length; i++){
			ret.set(1, i+1, arr[i]);
		}
		return ret;
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
				throw(new CustomException("unknown","Array row dimensions must agree"));
				//throw new RuntimeException("Matrix.hcat bad rows in item " + i);
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

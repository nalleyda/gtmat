package functions;

import java.util.ArrayList;
import gtmatException.*;

import jmatrix.*;

public class VerticalConcatenate {
	/*public static MatObject verticalConcatenate(MatObject... arr) throws Exception{
		throw new Exception("Calling a dummy method.");
	}*/
	
	public static Matrix verticalConcatenate(ArrayList<MatObject> mArr) throws Exception{
		return verticalConcatenate(mArr.toArray(new Matrix[0]));
	}
	/**
	 * vertical concatenation (an array of matrices)
	 * @param m
	 * @return
	 * @throws Exception 
	 */
	public static Matrix verticalConcatenate(Matrix... m) throws Exception {
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
					res = Set.set(res, r + row, c, it.get(r, c));
				}
			}
			row += it.size[MatObject.ROW];
		}
		return res;
	}
	
	public static MatString vCatStr(ArrayList<MatObject> arr) throws Exception{
		try{
		double [] data;
		int n=0;
		int rows=0;
		for(MatObject o: arr){
			if(o instanceof MatString){
				n+=((MatString)o).n;
				rows+=((MatString)o).size[MatObject.ROW];
			}
			else{
				n+=((Matrix)o).n;
				rows+=((Matrix)o).size[MatObject.ROW];
			}
		}
		data = new double[n];
		int i = 0;
		for(MatObject o: arr){
			if(o instanceof MatString){
				for(int c=0; c<((MatString)o).size[MatObject.COL]; c++) {
					data[c*rows+i]=((MatString)o).get(c+1);
				}
			}
			else{
				if(((Matrix)o).type==MatObject.Type.LOGICAL)
					throw new CustomException("Converting from logical to char is impossible");
				for(int c=0; c<((Matrix)o).size[MatObject.COL]; c++) {
					data[c*rows+i]=((Matrix)o).get(c+1);
				}
			}
			i++;
		}
		MatString out = new MatString(data, rows ,((MatString)arr.get(0)).size[MatObject.COL]);
		return out;
		}
		catch(Exception e) {
			if(e instanceof gtmatException.GTMatException)
				throw e;
			else
				throw new CustomException("Dimension missmatch in VCAT for Char");
		}
	}
	
	public static MatObject verticalConcatenateCell(MatObject... arr) throws Exception{
		throw new Exception("Calling a dummy method.");
	}
}

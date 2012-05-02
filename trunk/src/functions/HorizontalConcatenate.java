package functions;

import java.awt.Dialog.ModalityType;
import java.util.ArrayList;
import gtmatException.*;
import functions.*;

import jmatrix.*;

public class HorizontalConcatenate {
	/*public static MatObject horizontalConcatenate(ArrayList<MatObject> args) throws Exception{
		return (MatObject)HorizontalConcatenate.class.getMethod("horizontalConcatenate", args.getClass()).invoke(null, new Object[] {args});
	}*/

	public static MatObject horizontalConcatenateCell(MatObject... arr) throws Exception{
		CellArray ret = new CellArray(1, arr.length);
		if (arr.length == 0) return ret;

		for (int i = 0; i < arr.length; i++){
			ret.set(1, i+1, arr[i]);
		}
		return ret;
		
		/*//throw new Exception("Calling a dummy method.");
		//TODO generalize this method
		boolean allMat = true;
		for (MatObject m : arr){
			if (!(m instanceof Matrix)){
				allMat = false;
				break;
			}
		}
		if (false){//allMat){
			Matrix[] marr = new Matrix[arr.length];
			for (int i = 0; i < marr.length; i++){
				marr[i] = (Matrix)arr[i];
			}
			return horizontalConcatenate(marr);
		}
		else{
			return hCatCell(arr);
		}*/
	}

	/*public static CellArray hCatCell(MatObject... arr) throws Exception{
		CellArray ret = new CellArray(1, arr.length);
		if (arr.length == 0) return ret;

		for (int i = 0; i < arr.length; i++){
			ret.set(1, i+1, arr[i]);
		}
		return ret;
	}*/
	
	public static MatString hCatStr(ArrayList<MatObject> arr) throws Exception{
		try{
		double [] data;
		int n=0;
		int cols=0;
		for(MatObject o: arr){
			if(o instanceof MatString){
				n+=((MatString)o).n;
				cols+=((MatString)o).size[MatObject.COL];
			}
			else{
				if(((Matrix)o).type==MatObject.Type.LOGICAL)
					throw new CustomException("Converting from logical to char is impossible");
				n+=((Matrix)o).n;
				cols+=((Matrix)o).size[MatObject.COL];
			}
		}
		data = new double[n];
		int i = 0;
		for(MatObject o: arr){
			if(o instanceof MatString) {
				for(int ind=1; ind<=((MatString)o).n; ind++){
					data[i++]=((MatString)o).get(ind);
				}
			}
			else{
				for(int ind=1; ind<=o.n; ind++){
					data[i++]=((Matrix)o).get(ind);
				}
			}
		}
		MatString out = new MatString(data, ((MatString)arr.get(0)).size[MatObject.ROW],cols);
		return out;
		}
		catch (Exception e){
			if(e instanceof GTMatException)
				throw e;
			throw new CustomException("Dimension mismatch in HCAT for type Char");
		}
	}

	public static Matrix horizontalConcatenate(ArrayList<MatObject> mArr) throws Exception{
		return horizontalConcatenate(mArr.toArray(new Matrix[0]));
	}
	/**
	 * horizontal concatenation (an array of matrices)
	 * @param m
	 * @return
	 * @throws Exception 
	 */
	public static Matrix horizontalConcatenate(Matrix... m) throws Exception {
		Matrix res;
		int cols = 0;
		int rows = -1;//m[0].size[MatObject.ROW];
		int col = 0;
		// calculate cols and check rows
		for (int i = 0; i < m.length; i++) {
			if (m[i].n == 0 || m[i].size[MatObject.ROW] == 0) continue;
			if (rows == -1) rows = m[i].size[MatObject.ROW];
			cols += m[i].size[MatObject.COL];
			if (m[i].size[MatObject.ROW] != rows) {
				throw(new CustomException("Array row dimensions must agree"));
				//throw new RuntimeException("Matrix.hcat bad rows in item " + i);
			}
		}
		res = new Matrix(rows, cols);
		res.type = m[0].type;
		// copy all matrices into res
		for (int i = 0; i < m.length; i++) {
			Matrix it = m[i];
			for (int c = 1; c <= it.size[MatObject.COL]; c++) {
				for (int r = 1; r <= rows; r++) {
					res = Set.set(res, r, c + col, it.get(r, c));
				}
			}
			col += it.size[MatObject.COL];
		}
		res.type = m[0].type;
		return res;
	}

	/*public static void main(String[] args) throws Exception{
		MatObject m1 = new Matrix(1);
		MatObject m2 = new Matrix(2);
		System.out.println(horizontalConcatenate(m1, m2));
	}*/
}

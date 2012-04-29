package functions;

import fileIO.FileIO;
import jmatrix.MatObject;
import jmatrix.Matrix;
import plotting.Figure;

public class Close {
	/**
	 * According to MATLAB documentation, argumentless close should only delete the current figure.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static MatObject close(MatObject arg) throws Exception{
		//if (arg instanceof jmatrix.MatString){
		boolean result = Figure.close(1);
		//System.out.println("boolean result = "+result);
		int res = FileIO.fcloseAll();
		System.out.println("result of fcloseAll:"+res);
		Matrix output;
		if (result==true) output = new Matrix(1);
		else output = new Matrix(0);
		
		return output;
		
	}

}

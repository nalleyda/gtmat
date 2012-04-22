package functions;

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
		boolean result = Figure.close(1);
		//System.out.println("boolean result = "+result);
		Matrix output;
		if (result==true) output = new Matrix(1);
		else output = new Matrix(0);
		
		return output;
		
	}

}

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
	public static MatObject close() throws Exception{
		boolean result = Figure.close();
		if (result==true) return new Matrix(1);
		else return new Matrix(0);
		
		
	}

}

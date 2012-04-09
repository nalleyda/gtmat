package gtmatException;


/**
 * Array Dimension error.  For array addition and subtraction.
 * @author Josh Sizemore
 */

public class MatrixDimensionsException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Matrix dimensions must agree";
		return message;
	}
}

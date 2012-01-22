package exception;

/**
 * Array Dimension error.  For array addition and subtraction.
 * @author Josh Sizemore
 */

public class MatrixDimensions extends Exception {

	public MatrixDimensions(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber, stackTrace);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Matrix dimensions must agree";
		return message;
	}
}

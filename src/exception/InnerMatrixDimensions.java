package exception;

/**
 * Array inner dimension error.  For array multiplication and division.
 * @author Josh Sizemore
 */

public class InnerMatrixDimensions extends Exception {

	public InnerMatrixDimensions(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber, stackTrace);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Inner matrix dimensions must agree";
		return message;
	}
}

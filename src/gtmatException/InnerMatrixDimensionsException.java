package gtmatException;


/**
 * Array inner dimension error.  For array multiplication and division.
 * @author Josh Sizemore
 */

public class InnerMatrixDimensionsException extends GTMatException {

	public InnerMatrixDimensionsException(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Inner matrix dimensions must agree";
		return message;
	}
}

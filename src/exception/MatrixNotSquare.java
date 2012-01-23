package exception;

/**
 * Matrix not square exception.  For using exponents on arrays.
 * @author Josh Sizemore
 *
 */

public class MatrixNotSquare extends Exception {

	public MatrixNotSquare(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Matrix must be square";
		return message;
	}
}

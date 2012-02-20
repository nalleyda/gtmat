package gtmatException;


/**
 * For incorrectly resizing a matrix.
 * @author Josh Sizemore
 */

public class MatrixResizeException extends GTMatException {

	public MatrixResizeException(String filename) {
		super(filename);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "New matrix must have the same capacity as the old";
		return message;
	}
}
package exception;

/**
 * Exception for users attempting to access a non-cell array object with {}
 * @author Josh Sizemore
 */

public class InvalidCellAccess extends Exception {

	public InvalidCellAccess(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Cell contents reference from a non-cell array object";
		return message;
	}
}

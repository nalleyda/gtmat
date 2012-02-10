package gtmatException;


/**
 * Exception for users attempting to access a non-cell array object with {}
 * @author Josh Sizemore
 */

public class InvalidCellAccessException extends GTMatException {

	public InvalidCellAccessException(String filename, int lineNumber) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Cell contents reference from a non-cell array object";
		return message;
	}
}

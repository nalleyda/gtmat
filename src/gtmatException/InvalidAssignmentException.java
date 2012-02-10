package gtmatException;


/**
 * Exception for attempting an invalid assignment
 * @author Josh Sizemore
 */

public class InvalidAssignmentException extends GTMatException {

	public InvalidAssignmentException(String filename, int lineNumber) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "The expression to the left of the equals sign is not a valid target for assignment";
		return message;
	}
}

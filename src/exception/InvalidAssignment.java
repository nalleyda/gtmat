package exception;

/**
 * Exception for attempting an invalid assignment
 * @author Josh Sizemore
 */

public class InvalidAssignment extends Exception {

	public InvalidAssignment(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "The expression to the left of the equals sign is not a valid target for assignment";
		return message;
	}
}

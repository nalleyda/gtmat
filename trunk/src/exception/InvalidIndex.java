package exception;

/**
 * Invalid index for an array access. For users attempting to index into an array using a non-int, or negetive number
 * @author Josh Sizemore
 */

public class InvalidIndex extends Exception {

	public InvalidIndex(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Index must be positive integer or logical";
		return message;
	}
}

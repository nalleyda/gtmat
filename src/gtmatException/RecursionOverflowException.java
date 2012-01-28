package gtmatException;


/**
 * Recursion overflow error.  For functions that exceed the recursion limit.
 * @author Josh Sizemore
 */

public class RecursionOverflowException extends GTMatException {

	public RecursionOverflowException(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Maximum recursion limit reached";
		return message;
	}
}

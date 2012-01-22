package exception;

/**
 * Exception for strings not ended properly.
 * @author Josh Sizemore
 */

public class StringNotTerminated extends Exception {

	public StringNotTerminated(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber, stackTrace);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "String not terminated properly";
		return message;
	}
}

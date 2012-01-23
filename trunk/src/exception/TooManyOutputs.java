package exception;

/**
 * Exception for including too many output arguments
 * @author Josh Sizemore
 */

public class TooManyOutputs extends Exception {

	public TooManyOutputs(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too many output arguments";
		return message;
	}
}

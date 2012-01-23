package exception;

/**
 * Exception for using too few input arguments.
 * @author Josh Sizemore
 */

public class TooFewInputs extends Exception {

	public TooFewInputs(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too few input arguments";
		return message;
	}
}

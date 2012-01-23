package exception;

/**
 * Exception for having too many input arguments for a function
 * @author Josh Sizemore
 */

public class TooManyInputs extends Exception {

	public TooManyInputs(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too many input arguments";
		return message;
	}
}

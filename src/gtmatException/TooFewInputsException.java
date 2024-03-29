package gtmatException;


/**
 * Exception for using too few input arguments.
 * @author Josh Sizemore
 */

public class TooFewInputsException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too few input arguments";
		return message;
	}
}

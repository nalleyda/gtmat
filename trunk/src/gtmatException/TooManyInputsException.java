package gtmatException;


/**
 * Exception for having too many input arguments for a function
 * @author Josh Sizemore
 */

public class TooManyInputsException extends GTMatException {

	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too many input arguments";
		return message;
	}
}

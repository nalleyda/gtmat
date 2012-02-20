package gtmatException;


/**
 * Exception for including too many output arguments
 * @author Josh Sizemore
 */

public class TooManyOutputsException extends GTMatException {

	public TooManyOutputsException(String filename) {
		super(filename);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Too many output arguments";
		return message;
	}
}

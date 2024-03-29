package gtmatException;


/**
 * Exception for strings not ended properly.
 * @author Josh Sizemore
 */

public class StringNotTerminatedException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "String not terminated properly";
		return message;
	}
}

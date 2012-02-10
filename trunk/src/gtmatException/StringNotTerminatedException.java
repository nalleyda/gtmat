package gtmatException;


/**
 * Exception for strings not ended properly.
 * @author Josh Sizemore
 */

public class StringNotTerminatedException extends GTMatException {

	public StringNotTerminatedException(String filename, int lineNumber) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "String not terminated properly";
		return message;
	}
}

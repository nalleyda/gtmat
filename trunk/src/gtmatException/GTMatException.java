package gtmatException;

/**
 * Abstract Exception class.  Holds information that all exceptions need.
 * 
 * @author Josh Sizemore
 */

public abstract class GTMatException extends RuntimeException {
	
	protected String filename;
	protected int lineNumber;
	protected String message;
	
	public GTMatException(String filename, int lineNumber) {
		this.filename = filename;
		this.lineNumber = lineNumber;
	}
	
	public static void Throw(Exception e) {
		main.InteractionWindow.printError(e);
	}
}

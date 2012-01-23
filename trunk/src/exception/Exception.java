package exception;

/**
 * Abstract Exception class.  Holds information that all exceptions need.
 * 
 * @author Josh Sizemore
 */

public abstract class Exception {
	
	protected String filename;
	protected int lineNumber;
	protected String message;
	
	public Exception(String filename, int lineNumber) {
		this.filename = filename;
		this.lineNumber = lineNumber;
	}
}

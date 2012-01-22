package exception;

/**
 * Abstract Exception class.  Holds information that all exceptions need.
 * 
 * @author Josh Sizemore
 */

public abstract class Exception {
	
	protected String filename;
	protected int lineNumber;
	protected String stackTrace;
	protected String message;
	// protected int errorIndex; // potentially used to point to the location of a syntax error
	
	public Exception(String filename, int lineNumber, String stackTrace) {
		this.filename = filename;
		this.lineNumber = lineNumber;
		this.stackTrace = stackTrace;
	}
}

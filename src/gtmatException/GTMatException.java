package gtmatException;

/**
 * Abstract Exception class.  Holds information that all exceptions need.
 * 
 * @author Josh Sizemore
 */

public abstract class GTMatException extends RuntimeException {
	
	protected String filename;
	protected static int lineNumber;
	protected String message;
	
	
	public GTMatException() {
			filename = main.Main.wstack.peek().getFunctionName();
	}
	
	public static void Throw(GTMatException e) {
		main.Main.interactions.printError(e);
	}
	
	public static void setLineNumber(int ln) {
		lineNumber=ln;
	}
}

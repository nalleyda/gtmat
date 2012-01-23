package exception;

/**
 * Exception for an undefined variable
 * @author Josh Sizemore
 */

public class UndefinedVariable extends Exception {

	public UndefinedVariable(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Undefined function or variable";
		return message;
	}
}

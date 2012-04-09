package gtmatException;


/**
 * Exception for an undefined variable
 * @author Josh Sizemore
 */

public class UndefinedVariableException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Undefined function or variable";
		return message;
	}
}

package gtmatException;


/**
 * Exception for an undefined variable
 * @author Josh Sizemore
 */

public class UndefinedVariableException extends GTMatException {

	public UndefinedVariableException(String filename) {
		super(filename);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Undefined function or variable";
		return message;
	}
}
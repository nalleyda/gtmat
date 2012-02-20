package gtmatException;


/**
 * Undefined function.  For non-existent functions and invalid inputs.
 * @author Josh Sizemore
 */

public class UndefinedFunctionException extends GTMatException {
	
	public UndefinedFunctionException(String filename) {
		super(filename);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Undefined function for the given arguments";
		return message;
	}
}

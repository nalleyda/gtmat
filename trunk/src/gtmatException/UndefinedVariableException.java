package gtmatException;


/**
 * Exception for an undefined variable
 * @author Josh Sizemore
 */

public class UndefinedVariableException extends GTMatException {
	
	private String var;
	
	public UndefinedVariableException(String var) {
		this.var=var;
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Undefined function or variable, " + var;
		return message;
	}
}

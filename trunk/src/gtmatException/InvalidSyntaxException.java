package gtmatException;


/**
 * For invalid syntax.
 * @author Josh Sizemore
 */

public class InvalidSyntaxException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Invalid GTMAT Syntax";
		return message;
	}
}

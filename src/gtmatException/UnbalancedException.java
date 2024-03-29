package gtmatException;


/**
 * Unbalanced parenthesis, brackets, or braces.
 * @author Josh Sizemore
 */

public class UnbalancedException extends GTMatException {

	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Unbalanced or unexpected parenthesis or bracket";
		return message;
	}
}

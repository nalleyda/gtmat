package exception;

/**
 * Unbalanced parenthesis, brackets, or braces.
 * @author Josh Sizemore
 */

public class Unbalanced extends Exception {

	public Unbalanced(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber, stackTrace);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "Unbalanced or unexpected parenthesis or bracket";
		return message;
	}
}

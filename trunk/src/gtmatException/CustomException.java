package gtmatException;


/**
 * Array index out of bounds. For attempted access to indexes outside of an array.
 * @author Josh Sizemore
 */

public class CustomException extends GTMatException {

	private String userMessage;
	
	public CustomException(String filename, String userMessage) {
		super(filename);
		this.userMessage = userMessage;
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ userMessage;
		return message;
	}
}
package gtmatException;


/**
 * Array index out of bounds. For attempted access to indexes outside of an array.
 * @author Josh Sizemore
 */

public class IndexOOBException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "index exceeds matrix dimensions";
		return message;
	}
}

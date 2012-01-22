package exception;

/**
 * Array index out of bounds. For attempted access to indexes outside of an array.
 * @author Josh Sizemore
 */

public class IndexOOB extends Exception {

	public IndexOOB(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber, stackTrace);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "index exceeds matrix dimensions";
		return message;
	}
}

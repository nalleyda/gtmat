package exception;

/**
 * Subscripted assignment dimension mismatch.  When assigning A[I] = B, the dimensions of B and I must match.
 * @author Josh Sizemore
 */

public class SubscriptedAssignmentDimension extends Exception {

	public SubscriptedAssignmentDimension(String filename, int lineNumber, String stackTrace) {
		super(filename, lineNumber);
	}
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "When assigning A[I] = B, the number of elements of B and I must match";
		return message;
	}
}

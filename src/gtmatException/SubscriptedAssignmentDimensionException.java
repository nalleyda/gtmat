package gtmatException;


/**
 * Subscripted assignment dimension mismatch.  When assigning A[I] = B, the dimensions of B and I must match.
 * @author Josh Sizemore
 */

public class SubscriptedAssignmentDimensionException extends GTMatException {
	
	public String toString() {
		message = "Error at " + filename + ": " + "line " + lineNumber + "\n" 
					+ "When assigning A[I] = B, the number of elements of B and I must match";
		return message;
	}
}

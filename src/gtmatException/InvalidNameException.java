package gtmatException;

public class InvalidNameException extends GTMatException {

	String varName;
	public InvalidNameException(String filename, String varName) {
		super(filename);
		this.varName = varName;
		// TODO Auto-generated constructor stub
	} 
	
	public String toString() {
		return "Undefined function or variable '" + varName + "'.";
	}

}

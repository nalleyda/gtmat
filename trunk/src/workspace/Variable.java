package workspace; //test

import java.util.Comparator;
import jmatrix.*;

/**
 * This class represents an instance of a variable in a Workspace.
 * It will include the name, data, and data type.
 * A comparator is defined based on lexicographic ordering of variable name.
 * We implement Comparator rather than using compareTo for things like PriorityQueue.
 * @author Zach Wilt
 *
 */
public class Variable implements Comparator<Variable>{
	
	private String varName;
	private MatObject data;
	
	public Variable(String varName, MatObject data){
		this.varName = varName;
		this.data = data;
	}
	
	public void setData(MatObject data){
		this.data = data;
	}
	
	public Variable copy(Variable var){
		return new Variable(var.varName, var.data);
	}
	
	public MatObject getData(){
		return this.data;
	}
	
	public String getVarName(){
		return this.varName;
	}

	/**
	 * Returns -1 if var1 < var2, 0 if equal, and 1 otherwise.
	 */
	public int compare(Variable var1, Variable var2) {
		return var1.varName.compareTo(var2.varName);
	}
	
	/**
	 * Here we assume that any two variables with the same name are equal.
	 * @param var1
	 * @param var2
	 * @return
	 */
	public boolean equals(Variable var1, Variable var2){
		return var1.varName.equals(var2.varName);
	}
	
	public int compareTo(Variable var2){
		return compare(this, var2);
	}
	
	public String toString(){
            if (data == null){
                return varName + " = null";
            }
            else{
		return varName + " = " + data.toString();
            }
	}
	
	
	/**
	 * Used to test if a given variable name is valid - NOT COMPLETE.
	 * Should be run before adding a variable to a workspace or creating a variable in any way.
	 * @param name
	 * @return
	 */
	public boolean isValidName(String name){
		if (name == null)
			return false;
		int firstChar =  name.charAt(0);
		if ((firstChar < 'A' || firstChar > (int)'Z') && (firstChar < (int)'a' || firstChar > (int)'z'))
			return false;
		
		for (int i = 0; i < name.length(); i++){
			if (name.charAt(i) == ' ' || name.charAt(i) == '!' || name.charAt(i) == '%' || name.charAt(i) == '~'){
				return false;
			}
		}
		
		return true;
			
	}

}

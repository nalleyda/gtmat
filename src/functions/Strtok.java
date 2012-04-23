package functions;

import java.util.Scanner;

import gtmatException.TooManyInputsException;
import jmatrix.MatObject;
import jmatrix.MatString;
import jmatrix.Matrix;

public class Strtok {
	
	public static MatObject[] strtok(MatObject... args) {
		System.out.println(args);
		if(args.length == 1) {
			return strtok(new MatString(args[0]), new MatString(" "));
		} else if(args.length == 2){
			return strtok(new MatString(args[0]), new MatString(args[1]));
		} else {
			throw new TooManyInputsException();
		}
		
	}
	public static MatObject[] strtok(MatString str, MatString delimiter) {
		if(delimiter.length() < 1) {
			MatObject[] ret = new MatObject[] {str, new MatString("")};
			return ret;
		}
		
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= str.length(); i++) {
			s.append((char)str.get(i));
		}
		MatObject[] ret = new MatObject[2];
		String st = s.toString();
		int i = 0;
		while(i < s.length() && s.charAt(i) == (char)delimiter.get(1)) {
			i++;
		}
		
		int ind = st.indexOf((char)delimiter.get(1), i);
		if(ind != -1) {
			ret[0] = new MatString(st.substring(0, ind));
			ret[1] = new MatString(st.substring(ind));
		} else {
			ret[0] = new MatString(st);
			ret[1] = new MatString("");
		}
		
		
		return ret;
	}
	
}

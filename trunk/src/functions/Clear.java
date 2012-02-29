package functions;

import jmatrix.MatObject;
import jmatrix.Matrix;
import main.Main;

public class Clear {
	public static MatObject clear() {
		Main.wstack.clear();
		System.out.println("Clear was called!!!!!");
		return new Matrix(1);
	}
}

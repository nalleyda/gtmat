package functions;

import main.Main;
import jmatrix.MatObject;
import jmatrix.Matrix;

public class CLC {
	public static MatObject clc() {
		Main.interactions.clc();
		return new Matrix(1);
	}
}

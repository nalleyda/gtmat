package functions;

import gtmatException.*;
import jmatrix.*;

public class Extend {
	public static MatObject extend(MatObject[] arr) throws Exception {
		if(arr.length==3)
			return (MatObject)Extend.class.getMethod("extend", arr[0].getClass(), arr[1].getClass(), arr[2].getClass()).invoke(null, new Object[] {arr[0], arr[1], arr[2]});
		if(arr.length==2)
			return (MatObject)Extend.class.getMethod("extend", arr[0].getClass(), arr[1].getClass()).invoke(null, new Object[] {arr[0], arr[1]});
		if(arr.length>3)
			throw(new TooManyInputsException());
		else throw(new TooFewInputsException());
	}
	
	public static Matrix extend(Matrix mat, int rw, int cl) {
		Matrix newMat = mat;
		if (rw > newMat.size[MatObject.ROW]
				|| cl > newMat.size[MatObject.COL]
						|| (cl == 1 && rw > newMat.size[MatObject.ROW] * newMat.size[MatObject.COL])) {
			int rm = rw > newMat.size[MatObject.ROW] ? rw : newMat.size[MatObject.ROW];
			int cm = cl > newMat.size[MatObject.COL] ? cl : newMat.size[MatObject.COL];
			double nd[] = new double[rm * cm];
			for (int r = 1; r <= newMat.size[MatObject.ROW]; r++) {
				for (int c = 1; c <= newMat.size[MatObject.COL]; c++) {
					double d = newMat.get(r, c);
					nd[(c - 1) * rm + (r - 1)] = d;
				}
			}
			newMat.data = nd;
			newMat.n = rm * cm;
			newMat.size[MatObject.ROW] = rm;
			newMat.size[MatObject.COL] = cm;
		}
		return newMat;
	}

	public static Matrix extend(Matrix mat, int to) {
		Matrix newMat = mat;
		if (to > newMat.size[MatObject.ROW] * newMat.size[MatObject.COL]) {
			Matrix m = newMat.reshape(newMat.size[MatObject.ROW] * newMat.size[MatObject.COL], 1);
			Matrix me = extend(m, to, 1);
			newMat.data = me.data;
			newMat.n = me.n;
			newMat.size = me.size;
		}
		return newMat;
	}
}

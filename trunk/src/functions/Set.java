package functions;

import gtmatException.CustomException;
import gtmatException.IndexOOBException;
import gtmatException.MatrixDimensionsException;
import gtmatException.TooFewInputsException;
import gtmatException.TooManyInputsException;
import jmatrix.MatObject;
import jmatrix.Matrix;

public class Set {
	public static MatObject set(MatObject[] arr) throws Exception {
		if(arr.length==4)
			return (MatObject)Set.class.getMethod("set", arr[0].getClass(), arr[1].getClass(), arr[2].getClass(), arr[3].getClass()).invoke(null, new Object[] {arr[0], arr[1], arr[2], arr[3]});
		if(arr.length>4)
			throw(new TooManyInputsException());
		else throw(new TooFewInputsException());
	}
	
	
	public static Matrix set(Matrix m, Matrix rndx, Matrix cndx, Matrix vals) throws Exception {
		Matrix newMat = m;
		if (rndx.size[MatObject.ROW] != 1
				|| cndx.size[MatObject.ROW] != 1) {
			throw(new CustomException("Matrix.set bad row or col vector"));
		}
		if (rndx.size[MatObject.COL] != vals.size[MatObject.ROW]
				|| cndx.size[MatObject.COL] != vals.size[MatObject.COL]) {
			throw(new CustomException("Matrix.set bad row or col vector size"));
		}
		int mxr = (int) ((Matrix) rndx.max().get(1, 1)).get(1);
		int mxc = (int) ((Matrix) cndx.max().get(1, 2)).get(1);
		if (mxr > m.size[MatObject.ROW]) {
			newMat = Extend.extend(m, mxr, m.size[MatObject.COL]);
		}
		if (mxc > m.size[MatObject.COL]) {
			newMat = Extend.extend(m, m.size[MatObject.ROW], mxc);
		}
		for (int ri = 1; ri <= rndx.size[MatObject.COL]; ri++) {
			for (int ci = 1; ci <= cndx.size[MatObject.COL]; ci++) {
				newMat = set(m, rndx.geti(ri), cndx.geti(ci),
						vals.get(ri, ci));
			}
		}
		return newMat;
	}
	
	public static Matrix set(Matrix m, double rndx, double cndx, double val) throws Exception {
		return set(m, rndx, cndx, val);
	}

	/**
	 * set a value in a matrix
	 * @param r - the row
	 * @param c - the column
	 * @param val - the value
	 * @throws Exception 
	 */
	public static Matrix set(Matrix m, int r, int c, double val) throws Exception {
		Matrix newMat = m;
		if (r > newMat.size[MatObject.ROW]) {
			newMat = Extend.extend(m, r, m.size[MatObject.COL]);
		}
		if (c > m.size[MatObject.COL]) {
			newMat = Extend.extend(m, m.size[MatObject.ROW], c);
		}
		newMat.data[(c - 1) * newMat.size[MatObject.ROW] + (r - 1)] = val;
		return newMat;
	}
	
	/**
	 * set a value in a linearized array
	 * @param i
	 * @param val
	 */
	public static Matrix set(Matrix m, int i, double val) {
		if (i > m.n) {
			throw(new CustomException("Matrix:set(i...) i too big"));
		}
		Matrix newMat = m;
		newMat.data[i - 1] = val;
		return newMat;
	}

	/**
	 * Set the values of matrix m at indices indices to values.
	 * @param m the matrix to change
	 * @param indices the indices to use 
	 * @param values the values  to use
	 */
	public static Matrix set(Matrix m, Matrix indices, Matrix values) {
		Matrix newMat = m;
		int maxsize = m.size[MatObject.ROW] * m.size[MatObject.COL];
		double[] ind = indices.data;
		double[] vals = values.data;

		if (ind.length != vals.length) {
			throw(new MatrixDimensionsException());
		}

		for (int i = 0; i < ind.length; i++) {
			if (ind[i] > maxsize) {
				throw(new IndexOOBException());
			}
			newMat.data[i - 1] = vals[i];
		}
		return newMat;
	}

	/**
	 * Convenience method for set using Matrices.
	 * @param m the matrix to change 
	 * @param r the row index
	 * @param c the column index
	 * @param values the value
	 * @throws Exception 
	 */
	public static Matrix set(Matrix m, double[] r, double[] c, double value) throws Exception {
		return set(m, r, c, value);
	}
}

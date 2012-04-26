package functions;

import jmatrix.*;
import gtmatException.*;

public class MatInverse {
	public static MatObject inv(MatObject o) throws Exception {
		return (MatObject)MatInverse.class.getMethod("matInverse", o.getClass()).invoke(null, new Object[] {o});
	}
	
	public static Matrix matInverse(Matrix m1) throws Exception {
		if (m1.size.length != 2
				 || (m1.size[MatObject.ROW] != m1.size[MatObject.COL])) {
			 throw(new MatrixNotSquareException());
		 }
		 int n = m1.size[MatObject.ROW];
		 int bcols = 2 * n;
		 Matrix them[] = new Matrix[2];
		 them[0] = new Matrix(m1);
		 them[1] = m1.identity(n);
		 
		 Matrix m = HorizontalConcatenate.horizontalConcatenate(them[0], them[1]);
		 // repeat the following three steps for all columns except the last
		 for (int col = 1; col <= n; col++) {
			 if (col < n) {
				 // swap largest row to top
				 double mxv = Math.abs(m.get(col + 1, col));
				 int at = col;
				 for (int r = col + 1; r <= n; r++) {
					 double it = Math.abs(m.get(r, col));
					 if (it > mxv) {
						 mxv = it;
						 at = r;
					 }
				 }
				 if (at != col) {
					 // swap all of row at with row col
					 for (int c = 1; c <= bcols; c++) {
						 double temp = m.get(col, c);
						 double it = m.get(at, c);
						 m = Set.set(m, col, c, it);
						 m = Set.set(m, at, c, temp);
					 }
				 }
			 }
			 //            Main.debug.println("swap to top " + col + " -> " + m);
			 // force diagonal to one
			 double val = m.get(col, col);
			 if (val == 0) {
				 throw new RuntimeException("Matrix.inv not invertible");
			 }
			 for (int c = 1; c <= bcols; c++) {
				 double it = m.get(col, c) / val;
				 m = Set.set(m, col, c, it);
			 }
			 //            Main.debug.println("diag one " + col + " -> " + m);
			 // subtract row (col) from each row except (col) scaled by its first val
			 for (int r = 1; r <= n; r++) {
				 if (r != col) {
					 double factor = m.get(r, col);
					 for (int c = 1; c <= bcols; c++) {
						 double it = m.get(r, c) - m.get(col, c) * factor;
						 m = Set.set(m, r, c, it);
					 }
				 }
				 //                Main.debug.println("zero off diag " + col + " " + r + " -> " + m);
			 }
		 }
		 Matrix rndx = Matrix.colon(1, n);
		 return m.index(rndx, Add.add(rndx, new Matrix(n)));
	}
}

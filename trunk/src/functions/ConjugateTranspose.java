package functions;

import jmatrix.*;

public class ConjugateTranspose {
//	public static MatObject conjugateTranspose(MatObject o) throws Exception{
//		//throw new Exception("Calling dummy method.");
//		MatObject moOut = null;
//		if (o instanceof Matrix){
//			
//			Matrix mout = Transpose.transpose((Matrix)o);
//			//return mout;
////			Matrix res = new Matrix(m.size[MatObject.COL], m.size[MatObject.ROW]);
////			 for (int r = 1; r <= m.size[MatObject.ROW]; r++) {
////				 for (int c = 1; c <= m.size[MatObject.COL]; c++) {
////					 res.set(c, r, m.get(r, c));
////				 }
////			 }
//			moOut = mout;
//		}else if (o instanceof MatComplex){
//			Matrix rl = MatComplex.real((MatComplex)o);
//			Matrix im = MatComplex.imag((MatComplex)o);
//			rl = Transpose.transpose(rl);
//			im = Transpose.transpose(im);
//			im.multIP(-1);
//			MatComplex mc = new MatComplex(rl, im);
//			moOut = mc;
//			
//		}
//		return moOut;
//	}
	public static MatObject conjugateTranspose(MatObject o) throws Exception{
		MatObject mo = null;
		try{
			
		}catch(Exception e){
			throw new Exception("Calling dummy method.");
		}
		return mo;
	}
	
	public static Matrix conjugateTranspose(Matrix o) throws Exception{
		Matrix mout = Transpose.transpose(o);
		return mout;
	}
	
	public static MatComplex conjugateTranspose(MatComplex o) throws Exception{
		Matrix rl = MatComplex.real((MatComplex)o);
		Matrix im = MatComplex.imag((MatComplex)o);
		rl = Transpose.transpose(rl);
		im = Transpose.transpose(im);
		im.multIP(-1);
		MatComplex mc = new MatComplex(rl, im);
		return mc;
	}

}

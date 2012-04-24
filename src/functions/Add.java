package functions;

import jmatrix.*;
import java.lang.reflect.*;
import gtmatException.*;

public class Add {
	public static MatObject add(MatObject o1, MatObject o2) throws Exception{
		/*if (o1 instanceof Matrix && o2 instanceof Matrix)
			return Add.add((Matrix)o1, (Matrix)o2);*/
		//throw new Exception("Calling a dummy method.");
		return (MatObject)Add.class.getMethod("add", o1.getClass(), o2.getClass()).invoke(null, new Object[] {o1, o2});
	}
	
	/**
	 * Add one matrix to another
	 * @param m one matrix
	 * @param v another matrix
	 * @return m + v
	 */
	public static Matrix add(Matrix m, Matrix v) {
        Matrix res = new Matrix(m);
        if (m.n != v.n) {
            if (m.n == 1) {
                res = new Matrix(v);
                for (int i = 0; i < v.n; i++) {
                    res.data[i] = m.data[0] + res.data[i];
                }
            } else if (v.n == 1) {
                for (int i = 0; i < m.n; i++) {
                    res.data[i] = v.data[0] + m.data[i];
                }
            } else {
                throw(new MatrixDimensionsException());
            }
        } else {
            for (int i = 0; i < m.n; i++) {
                res.data[i] = m.data[i] + v.data[i];
            }
        }
        return res;
	}
	
	public static Matrix add(MatString s, Matrix m) {
		Matrix res = new Matrix(s);
		res=Add.add(res, m);
		return res;
	}
	
	public static Matrix add(Matrix m, MatString s) {
		Matrix res = new Matrix(s);
		res = Add.add(m,res);
		return res;
	}
	
	public static Matrix add(MatString s, MatString t) {
		Matrix sMat = new Matrix(s);
		Matrix tMat = new Matrix(t);
		Matrix res = Add.add(sMat,tMat);
		return res;
	}
	
	public static void main(String[] args) throws Exception{
		MatObject a = new Matrix(3);
		MatObject b = new Matrix(4);
		System.out.println(Add.add(a,b));
		
		Class c = Add.class;
		Method m = c.getMethod("add", a.getClass(), b.getClass());
		System.out.println(m.invoke(null, new Object[] {a, b}));

	}
	
}

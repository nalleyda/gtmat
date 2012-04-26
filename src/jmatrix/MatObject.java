package jmatrix;

/*
 * Parent of all Matlab classes with dimensions
 */
import java.lang.RuntimeException;
import java.util.ArrayList;

import functions.*;
import gui.TabbedPane;
import interpreter.*;
import main.*;
import workspace.*;

/**
 *
 * @author dsmith
 */
public abstract class MatObject {

	//returns true iff this would cause an if statement to execute in Matlab
	public boolean conditionalIsTrue() throws Exception{
		throw new Exception("Calling a dummy method. This should be implemented in the child classes.");
	}
	
	public static Matrix islogical(MatObject m){
		Matrix ret = m.type == MatObject.Type.LOGICAL ? new Matrix(1) : new Matrix(0);
		ret.type = MatObject.Type.LOGICAL;
		return ret;
	}
	
	public static Matrix ischar(MatObject m){
		Matrix ret = m instanceof MatString ? new Matrix(1) : new Matrix(0);
		ret.type = MatObject.Type.LOGICAL;
		return ret;
	}
	
	public static Matrix isnumeric(MatObject m){
		Matrix ret = m.type == MatObject.Type.DOUBLE || m.type == MatObject.Type.INTEGER ? new Matrix(1) : new Matrix(0);
		ret.type = MatObject.Type.LOGICAL;
		return ret;
	}

	/** 
	 * Enum to represent the type of an object.
	 * @author taylorhope
	 *
	 */
	public enum Type{
		NONE("none"), 
		DOUBLE("double"), 
		INTEGER("integer"), 
		LOGICAL("logical"), 
		CHAR("char"), 
		CELL("cell"), 
		STRUCT("struct"), 
		BYTE("byte"), 
		COMPLEX("complex"),
		UINT8("uint8"),
		END("end");

		private final String name;
		private Type(String string) {
			this.name = string;
		}

		public String toString() {
			return name;
		}

	}

	public static final int ROW = 0;
	public static final int COL = 1;
	public static final int CLR = 2;
	public int n;          // number of data items
	public int size[];     // sizes of each dimension [rows cols clrs]
	public Type type;       // see types above

	public abstract MatObject copy();
	public abstract MatObject empty();
	public abstract MatObject zeroed();
	public abstract void copyValues(Matrix ndx, MatObject src) throws Exception;



	/**
	 * Create a MatObject with the given sizes.
	 * @param sizes a list of sizes, going row, col, 3rd dim...
	 */
	public MatObject(int ... sizes) {
		n = 1;
		size = new int[sizes.length];
		type = Type.NONE;
		for(int i = 0; i < sizes.length; i++) {
			n *= sizes[i];
			size[i] = sizes[i];
		}
	}

	/**
	 * Create a copy of the given MatObject
	 * @param mo the MatObject to copy.
	 */
	public MatObject(MatObject mo) {
		this.n = mo.n;
		this.size = mo.size;
		this.type = mo.type;
	}

	/**
	 * Get the length of a MatObject.
	 * @param o the MatObject to get the length of.
	 * @return a Matrix representing the length of the MatObject.
	 */
	public static Matrix length(MatObject o) {
		return new Matrix(o.length());
	}

	public static Matrix castToMatrix(MatObject o) {
		Matrix ov;
		if (o instanceof Matrix) {
			ov = (Matrix) o;
		} else {
			ov = new Matrix(o);
		}
		return ov;
	}

	public static MatComplex castToComplex(MatObject o) {
		MatComplex ov;
		if (o instanceof MatComplex) {
			ov = (MatComplex) o;
		} else {
			ov = new MatComplex((Matrix) o);
		}
		return ov;
	}
	
	public static Matrix castToLogical(MatObject o) {
		Matrix ret = new Matrix(o);
		ret.type = Type.LOGICAL;
		return ret;
	}

	public static MatString castToMatString(MatObject o) {
		MatString ov;
		if (o instanceof MatString) {
			ov = (MatString) o;
		} else {
			ov = new MatString(o);
		}
		return ov;
	}

	public static MatComplex complex(Matrix rl, Matrix im) {
		MatComplex res = new MatComplex(rl, im);
		return res;
	}

	/**
	 * add a matrix
	 * @param v matrix to add
	 * @return
	 */
	public MatObject add(MatObject o) {
		MatObject res = null;
		if(o instanceof Matrix) {
			res = new Matrix(this);
			Matrix ov = castToMatrix(o);
			res = ((Matrix) res).add(ov);
		} else if(o instanceof MatComplex) {
			res = castToComplex(this);
			MatComplex cv = (MatComplex) o;
			res = ((MatComplex) res).add(cv);
		} 
		return res;
	}

	/**
	 * sub a matrix
	 * @param v matrix to add
	 * @return
	 */
	public MatObject sub(MatObject o) {
		MatObject res = null;
		if(o instanceof Matrix) {
			res = new Matrix(this);
			Matrix ov = castToMatrix(o);
			res = ((Matrix) res).sub(ov);
		} else if(o instanceof MatComplex) {
			res = castToComplex(this);
			MatComplex cv = (MatComplex) o;
			res = ((MatComplex) res).sub(cv);
		} 
		return res;
	}

	/**
	 * mult a matrix
	 * @param v matrix to add
	 * @return
	 * @throws Exception 
	 */
	public Matrix mult(MatObject o) throws Exception {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return MatMult.matMult(res,ov);
	}

	/**
	 * div a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix div(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		try {
			return (Matrix) MatDivide.matDivide(res, ov);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * dot mult a matrix
	 * @param v matrix to add
	 * @return
	 */
	public MatObject dotmult(MatObject o) {
		MatObject res = null;
		if(o instanceof Matrix) {
			res = new Matrix(this);
			Matrix ov = castToMatrix(o);
			res = ((Matrix) res).mult(ov);
		} else if(o instanceof MatComplex) {
			res = castToComplex(this);
			MatComplex cv = (MatComplex) o;
			res = ((MatComplex) res).mult(cv);
		} 
		return res;
	}

	/**
	 * ./ a matrix
	 * @param v matrix to add
	 * @return
	 */
	public MatObject dotdiv(MatObject o) {
		MatObject res = null;
		if(o instanceof Matrix) {
			res = new Matrix(this);
			Matrix ov = castToMatrix(o);
			res = ((Matrix) res).div(ov);
		} else if(o instanceof MatComplex) {
			res = castToComplex(this);
			MatComplex cv = (MatComplex) o;
			res = ((MatComplex) res).div(cv);
		} 
		return res;
	}

	/**
	 * ^ a matrix
	 * @param v matrix to add
	 * @return
	 * @throws Exception 
	 */
	public Matrix caret(MatObject o) throws Exception {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return res.exp(ov);
	}

	/**
	 * ./ a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix dotcaret(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Power.power(res, ov);//Matrix.mexp(res, ov);
	}

	/**
	 * negate a matrix
	 * @param v matrix to add
	 * @return
	 * @throws Exception 
	 */
	public Matrix negate() throws Exception {
		Matrix res = new Matrix(this);
		return res.negate();
	}

	/**
	 * > a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix gt(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.gt(res, ov);
	}

	/**
	 * < a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix lt(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.lt(res, ov);
	}

	/**
	 * >= a matrix
	 * @param v matrix to add
	 * @return
	 * @throws Exception 
	 */
	public Matrix ge(MatObject o) throws Exception {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.ge(res, ov);
	}

	/**
	 * <= a matrix
	 * @param v matrix to add
	 * @return
	 * @throws Exception 
	 */
	public Matrix le(MatObject o) throws Exception {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return LessEqual.lessEqual(res, ov);
	}

	/**
	 * == a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix eq(MatObject o) {
		Matrix res = new Matrix(this);
		if(o instanceof Matrix) {
			Matrix ov = castToMatrix(o);
			res =  Matrix.eq(res, ov);
		} else if(o instanceof MatString) {
			MatString mst = (MatString) o;
			res = mst.eq(this);
		}
		return res;
	}

	/**
	 * ~= a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix ne(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.ne(res, ov);
	}

	/**
	 * and a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix and(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.ne(res, ov);
	}

	/**
	 * or a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix or(MatObject o) {
		Matrix res = new Matrix(this);
		Matrix ov = castToMatrix(o);
		return Matrix.ne(res, ov);
	}

	public static MatString charCast(MatObject o) {
		return castToMatString(o);
	}

	public static Matrix doubleCast(MatObject o) {
		return castToMatrix(o);
	}

	public static String getClass(MatObject o) {
		return o.type.toString();
	}

	public static boolean isChar(MatObject o) {
		return o.type == Type.CHAR;
	}

	public double[] size() {
		double res[] = new double[size.length];
		for (int i = 0; i < size.length; i++) {
			res[i] = size[i];
		}
		return res;
	}

	public int rows() {
		return size[ROW];
	}

	public int cols() {
		return size[COL];
	}

	public int clrs() {
		return size[CLR];
	}

	public int length() {
		if (n == 0) {
			return 0;
		}
		int mx = size[0];
		for (int i = 1; i < size.length; i++) {
			if (size[i] > mx) {
				mx = size[i];
			}
		}
		return mx;
	}

	public String workspaceString() {
		return null;
	}

	public MatObject hcat(MatObject o) {
		return null;
	}

	public String info() {
		String res = type + "[";
		for (int i = 0; i < size.length; i++) {
			res += " " + size[i];
			if (i < (size.length - 1)) {
				res += " x";
			}
		}
		res += " ] -- " + getClass().getName();
		return res;
	}

	public static MatObject get(MatObject m, Matrix ind) throws Exception {
		if(ind.type == Type.LOGICAL) {
			ind = Matrix.find(ind);
		}
		switch (m.type) {
		case DOUBLE:
			return Matrix.get((Matrix) m, (Matrix) ind);
		case INTEGER:
			return Matrix.get((Matrix) m, (Matrix) ind);
		case LOGICAL:

			break;
		case CHAR:
			return MatString.get((MatString) m, (Matrix) ind);
		case CELL:

			break;
		case STRUCT:
			return ((StructArray) m).get((int) ind.get(1));

		case BYTE:

			break;
		case COMPLEX:

			break;

		}

		/* if (m instanceof CellArray){
			 return CellArray.get(m, ind);
		 }*/

		throw new RuntimeException("Calling MatObject's get method - undefined behavior");
	}

	public static MatObject get(MatObject m, Matrix ri, Matrix ci) throws Exception {
		switch (m.type) {
		case DOUBLE:
			return Matrix.get((Matrix) m, (Matrix) ri, (Matrix) ci);
		case LOGICAL:

			break;
		case CHAR:
			return MatString.get((MatString)m, (Matrix) ri, (Matrix) ci);
		case CELL:

			break;
		case STRUCT:

			break;
		case BYTE:

			break;
		case COMPLEX:

			break;
		case UINT8:
			return Uint8.get((Matrix) m, (Matrix) ri, (Matrix) ci);
		}
		throw new RuntimeException("Calling MatObject's get method - undefined behavior");
	}

	public static MatObject get(MatObject m, Matrix ri, Matrix ci, Matrix clri) {
		switch (m.type) {
		case DOUBLE:
			return Matrix.get((Matrix) m, ri, ci, clri);
		case LOGICAL:

			break;
		case CHAR:

			break;
		case CELL:

			break;
		case STRUCT:

			break;
		case BYTE:

			break;
		case COMPLEX:

			break;
		case UINT8:
			return Uint8.get((Uint8) m, ri, ci,  clri);
		}
		throw new RuntimeException("Calling MatObject's get method - undefined behavior");
	}

	public static void index(String name, CellArray ca, MatObject expr, boolean showIt) throws Exception {
		MatObject ret = null;
		
		for(int i = 0; i < ca.n; i++) {
			ret = index(name, (CellArray)ca.get(i+1), expr);
		}
		
		Interpreter.getWorkspace().add(new Variable(name, ret));
		if (showIt) {
			Interpreter.displayString(name + " = " + ret + "\n");
		}
		TabbedPane.list.setModel(Main.wstack.peek().getVarList());
		
	}
	
	public static MatObject index(String name, CellArray ca, MatObject expr) throws Exception{
		Workspace curW = Interpreter.getWorkspace();
		MatObject val = Interpreter.getValue(name)[0];
		if(val == null) {//didn't exist previously

			if (expr.n == 1){//assigning a scalar value

				int[] dim = new int[ca.n];//one dimension per comma
				for (int i = 0; i < dim.length; i++){
					Matrix indices = (Matrix)ca.get(i+1);
					double max = indices.get(1);
					for (int j = 2; j <= indices.n; j++){
						max = Math.max(indices.get(j), max);
					}
					dim[i] = (int)max;
				}
				if (expr instanceof Matrix){
					val = new Matrix(dim);
				}
				else{//TODO other data types
					throw new RuntimeException("Define indexing with scalars for non-matrices, now!");
				}

			}
			//val = expr.zeroed();//TODO not entirely sure why things work with this line present...
		}
		/*
		if(ca.n == 1) {
			MatObject ret;
			int sz[] = new int[] {1, (int)((Matrix)ca.get(1)).getMax()};
			if(sz[1] < val.n)
				sz[1] = val.n;
			Matrix m = (Matrix) ca.get(1);
			if(val instanceof Matrix)
				ret = new Matrix(sz);
			else if(val instanceof MatString)
				ret = new MatString(sz);
			else if(val instanceof UnsignedByte)
				ret = new UnsignedByte(sz);
			else if(val instanceof CellArray)
				ret = new CellArray(sz);
			else if(val instanceof StructArray) 
				ret = new StructArray(sz);
			else
				ret = new Matrix(sz);
			
			for(int i = 1; i <= val.n; i++) {
				ret.set(val.get(new int[]{1, i}), new int[]{1, i});
			}
			for(int i = 1; i <= m.n; i++) {
				ret.set(expr.get(new int[]{1, i}), new int[] {1, (int)m.get(i)});
			}
			
			curW.add(new Variable(name, ret));
			if (showIt) {
				Interpreter.displayString(name + " = " + ret + "\n");
			}
			TabbedPane.list.setModel(Main.wstack.peek().getVarList());
			return;
		}*/
		
		int s = val.size.length > ca.n ? val.size.length : ca.n;
		int newsize[] = new int[s];
		if(ca.n == 1) 
			newsize = val.size;
		else
		for(int i = 0; i < s; i++) {
			newsize[i] = i >= ca.n || val.size[i] > ((Matrix)ca.get(i+1)).getMax() ? val.size[i] : (int)((Matrix)ca.get(i+1)).getMax();
		}
		MatObject outval;
		if(val instanceof Matrix)
			outval = new Matrix(newsize);
		else if(val instanceof MatString)
			outval = new MatString(newsize);
		else if(val instanceof UnsignedByte)
			outval = new UnsignedByte(newsize);
		else if(val instanceof CellArray)
			outval = new CellArray(newsize);
		else if(val instanceof StructArray) 
			outval = new StructArray(newsize);
		else
			outval = new Matrix(newsize);
		
		int offsetvec[] = new int[newsize.length];
		//Need 1 for the next row, row for the next column, row*column for the next layer...
		offsetvec[0] = 1;
		for(int i = 1; i < newsize.length; i++) {
			offsetvec[i] = offsetvec[i-1] * newsize[i-1];
		}
		
		int k = 1;
		int indices[] = new int[val.size.length];
		for(int i = 0; i < indices.length; i++) {
			indices[i] = 1;
		}
		double v = 0;
		
		while(indices[indices.length-1] <= val.size[val.size.length-1]) {
			outval.set(val.get(indices), indices);
			k++;
			for(int i = 0; i < indices.length; i++) {
				indices[i]++;
				if(i < indices.length-1 && indices[i] > val.size[i] ) {
					indices[i] = 1;
				} else {
					break;
				}
					
			}
		}
		
		
		int newindices[] = new int[ca.n];
		for(int i = 0; i < ca.n; i++) {
			newindices[i] = 1;
		}
		
		int[] a = new int[ca.n];
		int ind;
		k = 1;
		while(newindices[newindices.length-1] <= ((Matrix)ca.get(ca.n)).n) {
			ind = 0;
			if(expr.n==1)
				k = 1;
			for(int i = 0; i < ca.n; i++) {
				a[i] = (int)((Matrix)((Matrix)ca.get(i+1)).get(new int[]{newindices[i]})).data[i];
			}
			
			
			outval.set(new Matrix(((Matrix)expr).get(k++)), a);
			for(int i = 0; i < newindices.length; i++) {
				newindices[i]++;
				if(i < newindices.length-1 && newindices[i] > ca.get(i+1).n ) {
					newindices[i] = 1;
				} else {
					break;
				}
					
			}
		}
		
		return outval;
		
	
	}
	
	public abstract void set(MatObject m, int indices[]);
	public abstract MatObject get(int indices[]);
	
	public static int arr2lin(int size[], int ...ind) {
		int offsetvec[] = new int[size.length];
		//Need 1 for the next row, row for the next column, row*column for the next layer...
		offsetvec[0] = 1;
		for(int i = 1; i < size.length; i++) {
			offsetvec[i] = offsetvec[i-1] * size[i-1];
		}
		int k = 1;
		for(int i = 0; i < ind.length; i++) {
			k += (ind[i]-1) * offsetvec[i];
		}
		return k;
	}
	
	
	private static boolean isIn(int k, Matrix m) {
		boolean res = false;
		for(int i = 1; i <= m.n; i++) {
			if(k == m.geti(i)) {
				res = true;
				break;
			}
		}
		return res;
	}

	
	
	public Logical logicalCast(MatObject o) {
		return new Logical(o);
	}


	public String toString() {
		String res = "MatObject of type " + type + "; sized " + size[ROW] + "x" + size[COL];
		return res;
	}
}

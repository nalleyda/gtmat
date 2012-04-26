/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

// import main.Main;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.reflect.Method;
import java.io.File;
import java.io.FileWriter;

import functions.*;
import gtmatException.*;

/**
 *
 * @author dsmith
 */
public class Matrix extends MatObject {
	
	public static final double EPSILON = .0000000001;
	
	public boolean conditionalIsTrue(){
		//double error = .0000001;
		for (int i = 0; i < data.length; i++){
			if (data[i] == 0) return false;//return any(this)
		}
		return true;
	}

	public double data[];  // always store a vector of doubles
	// stored in column order

	/* Constructors */
	/**
	 * 1.1 a scalar
	 * @param x - the value
	 */
	public Matrix() {
		type = Type.DOUBLE;
		data = new double[0];
		n=0;
		size = new int[]{0,0};
	}

	public Matrix(double x) {
		n = 1;
		size = new int[2];
		type = Type.DOUBLE;
		data = new double[1];
		data[0] = x;
		size[COL] = 1;
		size[ROW] = 1;
	}

	/**
	 * @newtag
	 * @param rows
	 * @param cols
	 * @param data
	 */
	public Matrix(int rows, int cols, double... data) {
		this.data = data;
		n = rows * cols;
		size = new int[2];
		type = Type.DOUBLE;
		size[COL] = cols;
		size[ROW] = rows;

	}

	/**
	 * @newtag
	 * Creates a Matrix given the vector of data in the right format
	 */
	public Matrix(double[] data, int rows, int cols) {
		if (rows * cols != data.length) {
			throw(new MatrixDimensionsException());
		}


		this.data = data;
		n = rows * cols;
		size = new int[2];
		type = Type.DOUBLE;
		size[COL] = cols;
		size[ROW] = rows;
	}

	/**
	 * 1.3 3 scalars
	 * @param x - one value
	 * @param y - another value
	 */
	public Matrix(double x, double y, double z) {
		n = 3;
		size = new int[2];
		type = Type.DOUBLE;
		data = new double[3];
		data[0] = x;
		data[1] = y;
		data[2] = z;
		size[COL] = 3;
		size[ROW] = 1;
	}

	/**
	 * 1.2 2 scalars
	 * @param x - one value
	 * @param y - another value
	 */
	public Matrix(double x, double y) {
		n = 2;
		size = new int[2];
		type = Type.DOUBLE;
		data = new double[2];
		data[0] = x;
		data[1] = y;
		size[COL] = 2;
		size[ROW] = 1;
	}

	/* Constructors */
	/**
	 * 2. an array
	 * @param x - the value
	 */
	public Matrix(double x[]) {
		n = x.length;
		size = new int[2];
		type = Type.DOUBLE;
		data = new double[n];
		for (int i = 0; i < n; i++) {
			data[i] = x[i];
		}
		size[COL] = n;
		size[ROW] = 1;
	}

	/**
	 * a rectangular array
	 * @param rows
	 * @param cols
	 */
	public Matrix(int rows, int cols) {
		n = rows * cols;
		if (n > 0) {
			data = new double[n];
		} else {
			data = null;
		}
		type = Type.DOUBLE;
		size = new int[2];
		size[ROW] = rows;
		size[COL] = cols;
	}
	
	public Matrix(int[] dims){
		n = 1;
		for (int x : dims) n *= x;
		if (n > 0){
			data = new double[n];
		}
		else{
			data = null;
		}
		type = Type.DOUBLE;
		size = dims;
	}

	/**
	 * clone a matrix
	 * @param v
	 */
	public Matrix(Matrix v) {
		data = new double[v.n];
		n = v.n;
		for (int i = 0; i < n; i++) {
			data[i] = v.data[i];
		}
		type = v.type;
		size = new int[v.size.length];
		for (int i = 0; i < v.size.length; i++) {
			size[i] = v.size[i];
		}
	}

	/**
	 * clone a matObject
	 * @param v
	 */
	public Matrix(MatObject o) {
		data = new double[o.n];
		n = o.n;
		if (o instanceof Matrix) {
			for (int i = 0; i < n; i++) {
				data[i] = ((Matrix) o).data[i];
			}
		} else if (o instanceof SignedByte) {
			for (int i = 0; i < n; i++) {
				data[i] = ((SignedByte) o).data[i];
			}
		} else if (o instanceof MatString) {
			for (int i = 0; i < n; i++) {
				data[i] = ((MatString) o).data[i];
			}
		} else if (o instanceof UnsignedByte) {
			for (int i = 0; i < n; i++) {
				data[i] = ((UnsignedByte) o).data[i];
			}
		} else {
			throw(new CustomException("illegal math operation"));
		}
		type = Type.DOUBLE;
		size = new int[o.size.length];
		for (int i = 0; i < o.size.length; i++) {
			size[i] = o.size[i];
		}
	}

	/**
	 * clone a matObject
	 * @param v
	 */
	public Matrix(MatObject o, int init) {
		data = new double[o.n];
		n = o.n;
		for (int i = 0; i < n; i++) {
			data[i] = init;
		}
		type = Type.DOUBLE;
		size = new int[o.size.length];
		for (int i = 0; i < o.size.length; i++) {
			size[i] = o.size[i];
		}
	}

	@Override
	public Matrix clone() {
		return new Matrix(this);
	}

	public Matrix copy() {
		return new Matrix(this);
	}

	public Matrix zeroed() {
		return new Matrix(this, 0);
	}

	public Matrix empty() {
		return new Matrix();
	}

	//TODO: save method taking only a name, searches local ws for matrix

	/*
	 * Used to save as a .mat file
	 */
	public static void save(Matrix m, String name) throws Exception{

		FileWriter fw = new FileWriter(new File(name + ".mat"));
		fw.flush();
		StringBuilder ret = new StringBuilder(name + "=[");
		int rows = m.size[ROW];
		int cols = m.size[COL];

		for (int r = 1; r <= rows; r++){
			for (int c = 1; c <= cols; c++){
				ret.append(m.get(r,c) + ",");
			}
			ret.replace(ret.length()-1, ret.length(), ";");
		}
		ret.replace(ret.length()-1, ret.length(), "];");
		System.out.println(ret);
		fw.write(ret.toString());
		fw.close();
	}

	/**
	 * tokenize a string
	 * @param str
	 */
	public Matrix(String str) {
		ArrayList<Double> a = new ArrayList<Double>();
		StringTokenizer tk = new StringTokenizer(str, "[], ");

		while (tk.hasMoreTokens()) {
			String token = tk.nextToken();
			Double it = Double.parseDouble(token);
			a.add(it);
		}
		n = a.size();
		data = new double[n];
		for (int i = 0; i < n; i++) {
			data[i] = a.get(i);
		}
		size = new int[2];
		size[COL] = n;
		size[ROW] = 1;
		type = Type.DOUBLE;
	}

	public void copyValues(Matrix ndx, MatObject src) throws Exception {
		int in = ndx.length();
		int sn = src.length();
		Matrix it = (Matrix) src;
		if (sn == 1) {
			double val = it.get(1);
			for (int i = 1; i <= in; i++) {
				int col = 1;
				int row = ndx.geti(i);
				while (row > size[ROW]) {
					row -= size[ROW];
					col++;
				}
				Set.set(this, row, col, val);
			}
		} else {
			for (int i = 1; i <= in; i++) {
				int col = 1;
				int row = ndx.geti(i);
				while (row > size[ROW]) {
					row -= size[ROW];
					col++;
				}
				Set.set(this, row, col, it.get(i));
			}
		}
	}

	
	public void set(MatObject m, int... tempInd) {
		int[] index = new int[tempInd.length];
		for(int i = 0; i < tempInd.length; i++)
			index[i] = tempInd[i];
		boolean extend = false;
		if(index.length == 1) {
			int arrind[] = new int[size.length];
			index[0]--;
			int []ov = new int[size.length];
			ov[0] = 1;
			arrind[0] = 1;
			for(int i = 1; i < size.length; i++) {
				int x = ov[i-1];
				int y  = size[i-1];
				ov[i] = ov[i-1] * size[i-1];
				arrind[i] = 1;
			}
			
			int div;
			
			for(int i = ov.length-1; i >= 0; i--) {
				if (ov[i] == 0) break;
				arrind[i] += index[0]/ov[i];
				index[0] %= ov[i];
				if(ov[i] == 1)
					break;
			}
			index = arrind;
		}
		double val = ((Matrix)m).get(1);
		//Find the total number of elements, as well as the new size of the array
		int newn = 1;
		int newsize[] = new int[index.length == 1 ? size.length : index.length];
		for(int i = 0; i < (index.length > size.length ? index.length : size.length); i++) {
			if(i >= size.length || (i < index.length && index[i] > size[i])) {
				extend = true;
				newsize[i] = index[i];
			} else 
				newsize[i] = size[i];
			newn *= newsize[i];
		}
		//If we need to extend the array, say so here
		if(size.length < newsize.length)
			extend = true;
		
		
		//Now we transform the array indices of the old values into the linear indices for the new array
		int linind = 0;
		int trueind = 0;
		int vecind[] = new int[size.length];
		//vecind represents the array indices
		for(int i = 0; i < size.length; i++) 
			vecind[i] = 1;
		
		//offsetvec[i] tells you how much you need to multiply by for index i to go from array indices to linear indices
		int offsetvec[] = new int[newsize.length];
		//Need 1 for the next row, row for the next column, row*column for the next layer...
		offsetvec[0] = 1;
		for(int i = 1; i < newsize.length; i++) {
			offsetvec[i] = offsetvec[i-1] * newsize[i-1];
		}
		//Now, let's extend if needed
		if(extend) {
			double newdata[] = new double[newn];
			//For each index of our old array...
			while(vecind[size.length-1] <= size[size.length-1]) {
				//Put in the current value
				newdata[linind] = data[trueind++];
				//Calculate the new linear index, and update the array indices
				linind = 0;
				for(int i = 0; i < size.length; i++) {
					vecind[i]++;
					if(i != size.length-1 && vecind[i] > size[i])	
						vecind[i] = 1;
					else {
						break;
					}
				}
				for(int i = 0; i < size.length; i++) {
					linind += (vecind[i]-1) * offsetvec[i];
				}
			}
			data = newdata;
			size = newsize;
			n = newn;
		} 
		int ind = 0;
		for(int i = 0; i < index.length; i++) {
			ind += (index[i]-1) * offsetvec[i];
		}
		data[ind] = val;
	}

	


	public void set(double val, int... index) {
		boolean extend = false;

		if(index.length == 1) {
			int arrind[] = new int[size.length];
			
			int []ov = new int[size.length];
			ov[0] = 1;
			for(int i = 1; i < size.length; i++) {
				ov[i] = ov[i-1] * ov[i-1];
				arrind[i] = 1;
			}
			
			int div;
			
			for(int i = ov.length-1; i >= 0; i--) {
				arrind[ov.length-i-1] += index[0]/ov[i];
				index[0] %= ov[i];
			}
			index = arrind;
		}
		
		//Find the total number of elements, as well as the new size of the array
		int newn = 1;
		int newsize[] = new int[index.length];
		for(int i = 0; i < index.length; i++) {
			if(i >= size.length || index[i] > size[i]) {
				extend = true;
				newsize[i] = index[i];
			} else 
				newsize[i] = size[i];
			newn *= newsize[i];
		}
		//If we need to extend the array, say so here
		if(size.length < newsize.length)
			extend = true;
		
		
		//Now we transform the array indices of the old values into the linear indices for the new array
		int linind = 0;
		int trueind = 0;
		int vecind[] = new int[size.length];
		//vecind represents the array indices
		for(int i = 0; i < size.length; i++) 
			vecind[i] = 1;
		
		//offsetvec[i] tells you how much you need to multiply by for index i to go from array indices to linear indices
		int offsetvec[] = new int[newsize.length];
		//Need 1 for the next row, row for the next column, row*column for the next layer...
		offsetvec[0] = 1;
		for(int i = 1; i < newsize.length; i++) {
			offsetvec[i] = offsetvec[i-1] * newsize[i-1];
		}
		//Now, let's extend if needed
		if(extend) {
			double newdata[] = new double[newn];
			//For each index of our old array...
			while(vecind[size.length-1] <= size[size.length-1]) {
				//Put in the current value
				newdata[linind] = data[trueind++];
				//Calculate the new linear index, and update the array indices
				linind = 0;
				for(int i = 0; i < size.length; i++) {
					vecind[i]++;
					if(i != size.length-1 && vecind[i] > size[i])	
						vecind[i] = 1;
					else {
						break;
					}
				}
				for(int i = 0; i < size.length; i++) {
					linind += (vecind[i]-1) * offsetvec[i];
				}
			}
			data = newdata;
			size = newsize;
			n = newn;
		} 
		int ind = 0;
		for(int i = 0; i < index.length; i++) {
			ind += (index[i]-1) * offsetvec[i];
		}
		data[ind] = val;
	}

	public static double max(Matrix ma[], int ndx) {
		double res = ma[0].get(ndx+1);
		for (int i = 1; i < ma.length; i++) {
			if (ma[i].get(ndx+1) > res) {
				res = ma[i].get(ndx+1);
			}
		}
		return res;
	}

	public static double min(Matrix ma[], int ndx) {
		double res = ma[0].get(ndx+1);
		for (int i = 1; i < ma.length; i++) {
			if (ma[i].get(ndx+1) < res) {
				res = ma[i].get(ndx+1);
			}
		}
		return res;
	}

	/**
	 * Method to see where Matrix a > Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) > b(i)
	 */
	public static Matrix gt(Matrix a, Matrix b) {
		if (a.n == 1) {
			return gt1(a.get(1), b);
		}
		if (b.n == 1) {
			return lt1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = (a.data[i] > b.data[i]) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 * Method to see where Matrix a < Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) < b(i)
	 */
	public static Matrix lt(Matrix a, Matrix b) {
		if (a.n == 1) {
			return lt1(a.get(1), b);
		}
		if (b.n == 1) {
			return gt1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = (a.data[i] < b.data[i]) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 * Method to see where Matrix a >= Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) >= b(i)
	 * @throws Exception 
	 */
	public static Matrix ge(Matrix a, Matrix b) throws Exception {
		if (a.n == 1) {
			return LessEqual.ge1(a.get(1), b);
		}
		if (b.n == 1) {
			return LessEqual.le1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = (a.data[i] >= b.data[i]) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}



	/**
	 * Method to see where Matrix a == Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) == b(i)
	 */
	public static Matrix eq(Matrix a, Matrix b) {
		if (a.n == 1) {
			return eq1(a.get(1), b);
		}
		if (b.n == 1) {
			return eq1(b.get(1), a);
		}
		if (b.n != a.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = ((a.data[i] - b.data[i]) < Math.ulp(a.data[i])) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 * Method to see where Matrix a ~= Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) ~= b(i)
	 */
	public static Matrix ne(Matrix a, Matrix b) {
		if (a.n == 1) {
			return ne1(a.get(1), b);
		}
		if (b.n == 1) {
			return ne1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			res.data[i] = ((a.data[i] - b.data[i]) >= Math.ulp(a.data[i])) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 * Method to compute Matrix a && Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) && b(i)
	 */
	public static Matrix and(Matrix a, Matrix b) {
		if (a.n == 1) {
			return and1(a.get(1), b);
		}
		if (b.n == 1) {
			return and1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			double x = b.data[i];
			res.data[i] = (a.data[i] > Math.ulp(a.data[i]) && x > Math.ulp(x)) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 * Method to compute Matrix a || Matrix b
	 * @param a 
	 * @param b
	 * @return A matrix of logicals true at i iff a(i) || b(i)
	 */
	public static Matrix or(Matrix a, Matrix b) {
		if (a.n == 1) {
			return or1(a.get(1), b);
		}
		if (b.n == 1) {
			return or1(b.get(1), a);
		}
		if (a.n != b.n) {
			throw(new MatrixDimensionsException());
		}
		Matrix res = new Matrix(a);
		for (int i = 0; i < a.n; i++) {
			double x = b.data[i];
			res.data[i] = (a.data[i] > Math.ulp(a.data[i]) || x > Math.ulp(x)) ? 1 : 0;
		}
		res.type = Type.LOGICAL;
		return res;
	}

	public boolean isAll() {
		boolean res = true;
		for (int i = 1; i <= n; i++) {
			if (geti(i) != i) {
				res = false;
				break;
			}
		}
		return res;
	}



	/**
	 * get a value from a matrix
	 * @param r - the row  [offset 1]
	 * @param c - the column
	 * @return
	 */
	public double get(int r, int c) {
		int it = (c - 1) * size[ROW] + (r - 1);
		if(size.length == 1) {
			it = r > c ? r : c;
			it--;
		}
		return data[it];
	}



	/**
	 * get from a linearized matrix
	 * @param i - the index (offset 1)
	 * @return
	 */
	public double getEnd() {
		return data[n - 1];
	}

	/**
	 * get from a linearized matrix
	 * @param i - the index (offset 1)
	 * @return
	 */
	public double get(int i) {
		if(data == null) {
			System.out.println("Houston, we have a problem\n");
		}
		if(i<1)
			throw(new InvalidIndexException());
		return data[i - 1];
	}

	/**
	 * get from a linearized matrix
	 * @param i - the index (offset 1)
	 * @return
	 */
	public int geti(int i) {
		return (int) data[i - 1];
	}

	


	/*
	 *  static methods
	 */
	public static Matrix applyFunction(Matrix m, String fName) {
		return m.applyFunction(fName);
	}

	/**
	 * @param m The matrix to sum.
	 * @return the sum of the matrix
	 * @throws Exception 
	 */
	public static Matrix sum(Matrix m) throws Exception {
		Matrix res;

		if (m.size[ROW] == 1) {
			double total = 0;
			for (int c = 0; c < m.size[COL]; c++) {
				total += m.data[c];
			}
			res = new Matrix(total);
		} else {
			res = zeros(1, m.size[COL]);
			for (int c = 1; c <= m.size[COL]; c++) {
				for (int r = 1; r <= m.size[ROW]; r++) {
					res = Set.set(res, 1, c, res.get(1, c) + m.get(r, c));
				}
			}
		}
		return res;
	}

	/**
	 * @param the matrix to reshape 
	 * @param dimensions the new dimensions 
	 * @return a matrix with the elements of the given matrix and the size of the given dimensions
	 */
	public static Matrix reshape(Matrix m, int ... dimensions) {
		Matrix res = new Matrix(m);
		res.size = dimensions;
		int prod = 1;
		for(int i : dimensions) {
			prod *= i;
		}
		if (m.n != prod) {
			throw(new MatrixResizeException());
		}
		return res;
	}

	/**
	 * 
	 * @return
	 */
	public static CellArray sort(Matrix m) {
		return m.sort();
	}
	

	

	/**
	 * Raise a matrix to a power
	 * @param m The matrix to raise
	 * @param x The double to raise by
	 * @return A new matrix with every element of m raised to x
	 */
	public static Matrix pow(Matrix m, double x) {
        Matrix res = new Matrix(m);
        for (int i = 0; i < m.n; i++) {
            res.data[i] = Math.pow(m.data[i], x);
        }
        return res;
	}

	/**
	 * Take the sin of every element in a matrix
	 * @param m the matrix to use
	 * @return a matrix such that ret(i) = sin(m(i))
	 */
	public static Matrix sin(Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 0; i < m.n; i++) {
            res.data[i] = Math.sin(m.data[i]);
        }
        return res;
	}


	


	
	


	

	/**
	 * Floor each element in m.
	 * @param m the matrix to floor
	 * @return A matrix where ret(i) = floor(m(i))
	 */
	public static Matrix floor(Matrix m) {
        Matrix res = new Matrix(m);
        res.type = Type.INTEGER;
        for (int i = 0; i < m.n; i++) {
            res.data[i] = Math.floor(m.data[i]);
        }
        return res;
	}

	/**
	 *  index an array
	 * @param ri
	 * @param ci
	 * @return
	 * @throws Exception 
	 */
	public static Matrix sindex(Matrix m, Matrix ri, Matrix ci) throws Exception {
        if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
        	throw(new IndexOOBException());
        }
        Matrix res = new Matrix(ri.n, ci.n);
        for (int r = 1; r <= ri.n; r++) {
            int rndx = (int) ri.get(r);
            for (int c = 1; c <= ci.n; c++) {
                int cndx = (int) ci.get(c);
                res = Set.set(res, r, c, m.get(rndx, cndx));
            }
        }
        return res;
	}

	/**
	 * index a vector
	 * @param ci
	 * @return
	 * @throws Exception 
	 */
	public static Matrix sindex(Matrix m, Matrix ci) throws Exception {
        if (ci.size[ROW] != 1) {
        	throw(new IndexOOBException());
        }
        Matrix res = new Matrix(1, ci.n);
        for (int c = 1; c <= ci.n; c++) {
            int cndx = (int) ci.get(c);
            res = Set.set(res, 1, c, m.get(1, cndx));
        }
        return res;
	}

	public static double get(Matrix m, int r, int c) {
        int it = (c - 1) * m.size[ROW] + (r - 1);
        if(it<1)
        	throw(new InvalidIndexException());
        if(it>m.length())
        	throw(new IndexOOBException());
        return m.data[it];
	}

	public static double get(Matrix m, int i) {
		return m.data[i-1];
	}

	public static double getEnd(Matrix m) {
		return m.data[m.n-1];
	}

	public static Matrix find(Matrix m) throws Exception {
		Matrix res = m.empty();
		for (int i = 1; i <= m.n; i++) {
			if (m.get(i) != 0) {
				res = Set.set(res, 1, res.n + 1, i);
			}
		}
		return res;
	}

	/**
	 * @newtag
	 * @param m
	 * @param ri
	 * @param ci
	 * @return
	 */
	public static Matrix get(Matrix m, Matrix ri, Matrix ci){
		double[] rows = ri.data;
		double[] cols = ci.data;
		int i = 0;
		double[] mdata = m.data;
		int rowsize = m.size[ROW];
		int colsize = m.size[COL];
		double[] newmat = new double[rows.length * cols.length];
		for (int c = 0; c < cols.length; c++) {
			for (int r = 0; r < rows.length; r++) {
				try {
					int cind = (int) cols[c] - 1;
					int rind = (int) rows[r] - 1;
					newmat[i] = mdata[cind * rowsize + rind];
					i++;
				} catch (Exception e) {
					e.printStackTrace();
					throw(new IndexOOBException());
				}
			}
		}


		return new Matrix(newmat, rows.length, cols.length);
	}

	/**
	 * @newtag
	 * @param m
	 * @param ind
	 * @return
	 */
	public static Matrix get(Matrix m, Matrix ind){
		double[] mdata = m.data;
		double[] indices = ind.data;
		double[] newmat = new double[indices.length];
		if(ind.type == Type.LOGICAL) {
			Matrix temp = new Matrix(ind);
			for(int i = 0; i < ind.rows(); i++)
				for(int j = 0; j < ind.cols(); j++) {
					if(ind.get(i, j) != 0)
						temp.set(i + j * ind.size[ROW] + 1, i + j * ind.size[ROW] + 1);
				}
			ind = temp;
			
		}
		for (int i = 0; i < indices.length; i++) {
			try {
				newmat[i] = mdata[(int) indices[i] - 1];
			} catch (Exception e) {
				if(indices[i]%1!=0)
					throw(new InvalidIndexException());
				throw(new IndexOOBException());
				//return null;
			}
		}
		Matrix res = new Matrix(newmat, ind.size[ROW], ind.size[COL]);
		res.size[ROW] = ind.size[ROW];
		res.size[COL] = ind.size[COL];
		return res;
	}

	

	/**
	 * The cross product of two vectors
	 * @param a a 1x3 vector
	 * @param b a 1x3 vector
	 * @return a cross b
	 * @throws Exception 
	 */
	
	public static MatObject cross(Matrix a, Matrix b) throws Exception {

		Matrix res = new Matrix(3);
		double ax = a.get(1);
		double bx = b.get(1);
		double ay = a.get(2);
		double by = b.get(2);
		double az = a.get(3);
		double bz = b.get(3);
		res = Set.set(res, 1, 1, ay * bz - az * by);
		res = Set.set(res, 1, 2, az * bx - ax * bz);
		res = Set.set(res, 1, 3, ax * by - ay * bx);
		return res;
	}

	

	/**
	 * Find the max and index of a matrix
	 * @param m the matrix to use
	 * @return A cell array with the first index being the max values, the second being the indices.
	 * @throws Exception 
	 */
	public static CellArray max(Matrix m) throws Exception {
        CellArray res = new CellArray(1, 2);
        if (m.size[ROW] == 1) {
            double best = m.data[0];
            int where = 1;
            for (int c = 1; c < m.size[COL]; c++) {
                if (m.data[c] > best) {
                    best = m.data[c];
                    where = c + 1;
                }
            }
            res.set(1, 1, new Matrix(best));
            res.set(1, 2, new Matrix(where));
        } else {
            Matrix bestm = new Matrix(1, m.size[COL]);
            Matrix wherem = new Matrix(1, m.size[COL]);
            for (int c = 0; c < m.size[COL]; c++) {
                CellArray ca =
                        Transpose.transpose(m.index(colon(1, m.size[ROW]), new Matrix(c + 1))).max();
                bestm.data[c] = ((Matrix) ca.get(1, 1)).data[0];
                wherem.data[c] = ((Matrix) ca.get(1, 2)).data[0];
            }
            res.set(1, 1, new Matrix(bestm));
            res.set(1, 2, new Matrix(wherem));
        }
        return res;
	}

	public static double getMin(Matrix m) {
        double res = m.data[0];
        for (int i = 1; i < m.n; i++) {
            if (m.data[i] < res) {
                res = m.data[i];
            }
        }
        return res;
	}

	public static double getMax(Matrix m) {
        double res = m.data[0];
        for (int i = 1; i < m.n; i++) {
            if (m.data[i] > res) {
                res = m.data[i];
            }
        }
        return res;
	}

	/**
	 *  Find the max and location of a Matrix
	 * @return
	 * @throws Exception 
	 */
	public static CellArray min(Matrix m) throws Exception {
		return m.min();
	}

	private static double interp1(Matrix x, Matrix y, double x0) {
		if ((x0 < x.get(1)) || (x0 > x.get(x.n))) {
			return Double.NaN;
		}
		double res = 0;
		boolean found = false;
		for (int i = 1; !found && (i < x.n); i++) {
			found = (x.get(i+1) >= x0);
			if (found) {
				res = y.get(i)
						+ (y.get(i+1) - y.get(i)) * (x0 - x.get(i)) 
						/ (x.get(i+1) - x.get(i));
			}
		}
		return res;
	}

	/**
	 * linear interpolation
	 * @param x
	 * @param y
	 * @param xi
	 * @return
	 * @throws Exception 
	 */
	public static Matrix interp1(Matrix x, Matrix y, Matrix xi) throws Exception {
		if (x.size[ROW] != 1
				|| y.size[ROW] != 1
				|| xi.size[ROW] != 1) {
			throw(new CustomException("Input must be vectors"));
		}
		Matrix res = new Matrix(xi);
		for (int i = 1; i <= xi.n; i++) {
			res = Set.set(res, i, interp1(x, y, xi.get(i)));
		}
		return res;
	}

	

	/**
	 * horizontal concatenation (an array of matrices)
	 * @param m
	 * @return
	 * @throws Exception 
	 */
	


	
	public static Matrix zeros(int rows, int cols) throws Exception {
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, 0);
		}
		return res;
	}

	/**
	 * zeros
	 * @param rows
	 * @param cols
	 * @return
	 * @throws Exception 
	 */
	public static Matrix zeros(Matrix rowmat, Matrix colmat) throws Exception {
		int rows = (int) rowmat.get(1);
		int cols = (int) colmat.get(1);
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, 0);
		}
		return res;
	}

	/**
	 * ones
	 * @param rows
	 * @param cols
	 * @return
	 * @throws Exception 
	 */
	public static Matrix ones(Matrix rowmat, Matrix colmat) throws Exception {
		int rows = (int) rowmat.get(1);
		int cols = (int) colmat.get(1);
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, 1);
		}
		return res;
	}

	/**
	 * ones
	 * @param rows
	 * @param cols
	 * @return
	 * @throws Exception 
	 */
	public static Matrix ones(int rows, int cols) throws Exception {
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, 1);
		}
		return res;
	}

	/**
	 * rand
	 * @param rows
	 * @param cols
	 * @return
	 * @throws Exception 
	 */
	public static Matrix rand(Matrix mrows, Matrix mcols) throws Exception {
		int rows = (int) mrows.get(1);
		int cols = (int) mcols.get(1);
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, Math.random());
		}
		return res;
	}
	/**
	 * rand
	 * @param rows
	 * @param cols
	 * @return
	 * @throws Exception 
	 */
	public static Matrix rand(int rows, int cols) throws Exception {
		Matrix res = new Matrix(rows, cols);
		for (int i = 1; i <= res.n; i++) {
			res = Set.set(res, i, Math.random());
		}
		return res;
	}

	/**
	 * Take the ceil of a matrix
	 * @param m the matrix to take the ceil of
	 * @return the ceil of m
	 */
	public static Matrix ceil(Matrix m) {
        Matrix res = new Matrix(m);
        for (int i = 0; i < m.n; i++) {
            res.data[i] = Math.ceil(m.data[i]);
        }
        res.type = Type.INTEGER;
        return res;
	}
	/**
	 * For vectors, CUMSUM(X) is a vector containing the cumulative sum of
     * the elements of X. For matrices, CUMSUM(X) is a matrix the same size
     * as X containing the cumulative sums over each column.  
	 * @throws Exception 
	 */
	public static Matrix cumsum(Matrix m) throws Exception {
		Matrix res = new Matrix(m);
		if(res.size[ROW] == 1) {
			for(int i = 2; i <= res.size[COL]; i++) {
				//                res.data[i] += res.data[i-1];
				res = Set.set(res, i, res.get(i) + res.get(i-1));
			}
		} else {
			for(int c = 0; c < res.size[COL]; c++) {
				for(int r = 2; r <= res.size[ROW]; r++) {
					int i = (c - 1) * res.size[ROW] + (r - 1);
					//                    res.data[i] += res.data[i-1];
					res = Set.set(res, i, res.get(i) + res.get(i-1));
				}
			}
		}
		return res;
	}
	
	public static Matrix cumprod(Matrix m) {
		Matrix res = new Matrix(m);
		if(res.size[ROW] == 1) {
			for(int i = 2; i <= res.size[COL]; i++) {
				//                res.data[i] *= res.data[i-1];
				res = Set.set(res, i, res.get(i) * res.get(i-1));
			}
		} else {
			for(int c = 0; c < res.size[COL]; c++) {
				for(int r = 1; r < res.size[ROW]; r++) {
					int i = (c - 1) * res.size[ROW] + (r - 1);
					//                    res.data[i] *= res.data[i-1];
					res = Set.set(res, i, res.get(i) * res.get(i-1));
				}
			}
		}
		return res;
	}


	public Matrix ceil() {
		Matrix res = new Matrix(this);
		for (int i = 1; i <= n; i++) {
			res = Set.set(res, i, Math.ceil(get(i)));
		}
		res.type = Type.INTEGER;
		return res;
	}

	public static Matrix round(Matrix m) {
		return m.round();
	}

	public Matrix round() {
		Matrix res = new Matrix(this);
		for (int i = 1; i <= n; i++) {
			res = Set.set(res, i, Math.round(get(i)));
		}
		res.type = Type.INTEGER;
		return res;
	}

	/**
	 * colon
	 * @param from
	 * @param to
	 * @return
	 */
	public static Matrix colon(double from, double to) {
		return colon(from, 1, to);
	}

	/**
	 * colon
	 * @param from
	 * @param to
	 * @return
	 */
	public static Matrix colon(Matrix from, Matrix to) {
		return colon(from.get(1), 1, to.get(1));
	}

	/**
	 * colon
	 * @param from
	 * @param inc
	 * @param to
	 * @return
	 */
	public static Matrix colon(Matrix from, Matrix inc, Matrix to) {
		return colon(from.get(1), inc.get(1), to.get(1));
	}

	/**
	 * colon
	 * @param from
	 * @param inc
	 * @param to
	 * @return
	 */
	public static Matrix colon(double from, double inc, double to) {
		Matrix res = null;
		double newv;

		if (Math.abs(inc) < 0.0000000000001) {
			throw(new CustomException("increment must be greater than zero"));
		}
		int n = (int) ((to - from) / inc) + 1;
		if (n > 0) {
			res = new Matrix(1, n);
			res = Set.set(res, 1, from);
			res.n = n;
			for(int i = 2; i <= n; i++) {
				from += inc;
				res = Set.set(res, i, from);
			}
		} else {
			res = new Matrix(1, 0);
		}
		return res;
	}

	/**
	 * linspace
	 * @param from
	 * @param to
	 * @return
	 */
	public static Matrix linspace(double from, double to) {
		return linspace(from, to, 100);
	}

	/**
	 * linspace
	 * @param from
	 * @param to
	 * @return
	 */
	public static Matrix linspace(Matrix from, Matrix to) {
		return linspace(from.get(1, 1), to.get(1, 1), 100);
	}

	/**
	 * linspace
	 * @param from
	 * @param to
	 * @return
	 */
	public static Matrix linspace(Matrix from, Matrix to, Matrix mn) {
		return linspace(from.get(1, 1), to.get(1, 1), (int) mn.get(1, 1));
	}

	/**
	 * linspace
	 * @param from
	 * @param to
	 * @param n
	 * @return
	 */
	public static Matrix linspace(double from, double to, int n) {
		Matrix res = null;
		double dv = 0;
		if (n < 0) {
			return new Matrix(to);
		}
		if (n > 1) {
			dv = (to - from) / (n - 1);
		}
		res = new Matrix(1, n);
		res = Set.set(res, 1, from);
		res.n = n;
		for (int i = 2; i <= n; i++) {
			res = Set.set(res, i, res.get(i-1) + dv);
		}
		return res;
	}

	// Make an identity sMatrix.
	/**
	 * eye
	 * @param sz
	 * @return
	 * @throws Exception 
	 */
	public static Matrix identity(int sz) throws Exception {
		Matrix m = zeros(sz, sz);

		//Fill diagonal with 1's
		for (int x = 1; x <= sz; x++) {
			m = Set.set(m, x, x, 1);
		}
		return (m);
	}

	//public static Matrix magic()
	/**
	 * magic (odd indices only)
	 * @param n
	 * @return
	 * @throws Exception 
	 */
	public static Matrix magic(Matrix n1) throws Exception {
		if (n1.n != 1) {
			throw(new CustomException("Magic must be called with an integer, scalar argument"));
		}

		int n = n1.geti(1);
		if (n % 2 == 0) {
			throw(new CustomException("Matrix.magic must have odd parameters"));
		}
		Matrix m = zeros(n, n);
		int i, j;
		int nn = n * 3 / 2;
		int num = 1;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				int r = 1 + (j - i + nn) % n;
				int c = 1 + (i * 2 - j + n) % n;
				m = Set.set(m, r, c, num++);
			}
		}
		return m;
	}

	/**
	 * polyfit
	 * @param x
	 * @param y
	 * @param power
	 * @return
	 * @throws Exception 
	 */
	public static Matrix polyfit(Matrix x, Matrix y, int power) throws Exception {
		int size = power + 1;
		Matrix it = null;

		Matrix A = zeros(size, size);
		Matrix B = zeros(size, 1);
		for (int r = 1; r <= size; r++) {
			for (int c = 1; c <= size; c++) {
				it = x.pow(2 * size - r - c);
				A = Set.set(A, r, c, it.sum().get(1));
			}
			B = Set.set(B, r, 1, it.mult(y).sum().get(1));
		}
		Matrix Ai = MatInverse.matInverse(A);
		Matrix cf = MatMult.matMult(Ai,B);
		return cf;
	}

	/**
	 * polyval
	 * @param cf
	 * @param x
	 * @return
	 * @throws Exception 
	 */
	public static Matrix polyval(Matrix cf, Matrix x) throws Exception {
		/* evaluate the polynomial c0*x^n + c1*x^n-1 + ... + cn-1*x + cn
        returning a sVector of the same length as x */
		Matrix res = Mult.mult(Matrix.ones(1, x.n), Matrix.get(cf, new Matrix(1)));
		for (int nc = 2; nc <= cf.n; nc++) {
			for (int id = 1; id <= res.n; id++) {
				res = Set.set(res, id, res.get(id) * x.get(id) + cf.get(nc));
			}
		}
		return res;
	}

	/*
	 * spline
	 *  compute the cubic spline that fits [x y] at the points [xi yi]
	 *   Algorithm nicely explained by Sky McKinley and Megain Levine
	 *   of the College of the Redwoods in Eureka, Ca
	 * @param x
	 * @param y
	 * @param xi
	 * @return
	 */
	public static Matrix spline(Matrix x, Matrix y, Matrix xi) throws Exception {
		Matrix res = Matrix.ones(1, xi.n);
		int np = x.n;
		if (y.n != np || x.size[ROW] != 1 || y.size[ROW] != 1) {
			throw(new CustomException("Matrix.spline bad x or y inputs"));
		}
		/* 
		 * we need to solve n-2 equations to determine the curvature values Mi
		 * at each of the interior [x y] points.
		 * we also assume that the x values are uniformly spaced at h
		 * and that they are monotonically increasing.  [An ugly sort might
		 * remove this constraint later]
		 */
		double h = (x.get(np) - x.get(1)) / (np - 1);
		// build an (n-2 by n-2) array to invert
		Matrix A = Matrix.zeros(np - 2, np - 2);
		A = Set.set(A, 1, 1, 6);
		A = Set.set(A, np - 2, np - 2, 6);
		for (int r = 2; r < (np - 2); r++) {
			A = Set.set(A, r, r - 1, 1);
			A = Set.set(A, r, r, 4);
			A = Set.set(A, r, r + 1, 1);
		}
		// now create B - the RHS
		Matrix B = Matrix.zeros(np - 2, 1);
		for (int r = 1; r <= (np - 2); r++) {
			B = Set.set(B, r, 1, (y.get(r) - 2 * y.get(r + 1) + y.get(r + 2)) * 6 / (h * h));
		}
		Matrix M = MatMult.matMult(MatInverse.matInverse(A), B);
		double Mi = 2 * M.get(1) - M.get(2);
		double Mip1;
		double cf[] = new double[4];
		int at = 1;
		boolean keepGoing = false;
		for (int i = 1; i < np; i++) {
			if (i < (np - 1)) {
				Mip1 = M.get(i);
			} else {
				Mip1 = 2 * M.get(np - 2) - M.get(np - 3);
			}
			cf[0] = (Mip1 - Mi) / (6 * h);                            // ai
			cf[1] = Mi / 2;                                         // bi
			cf[2] = (y.get(i + 1) - y.get(i)) / h - (Mip1 + 2 * Mi) * h / 6;// ci
			cf[3] = y.get(i);                                     // di
			while (at <= xi.n && (keepGoing || xi.get(at) <= x.get(i + 1))) {
				double it = xi.get(at) - x.get(i);
				res = Set.set(res, at, ((cf[0] * it + cf[1]) * it + cf[2]) * it + cf[3]);
				at++;
			}
			Mi = Mip1;
			keepGoing = i == (np - 2);
		}
		return res;
	}

	public static CellArray meshgrid(Matrix x, Matrix y) throws Exception {
		if (x.size[ROW] > 1 || y.size[ROW] > 1) {
			throw(new CustomException("Matrix.meshgrid must have vector inputs"));
		}
		CellArray res = new CellArray(1, 2);
		Matrix xx = new Matrix(y.n, x.n);
		Matrix yy = new Matrix(y.n, x.n);
		for (int r = 1; r <= y.n; r++) {
			for (int c = 1; c <= x.n; c++) {
				xx = Set.set(xx, r, c, x.get(1, c));
				yy = Set.set(yy, r, c, y.get(1, r));
			}
		}
		res.set(1, 1, xx);
		res.set(1, 2, yy);
		return res;
	}

	public static CellArray peaks(int n) throws Exception {
		double x, y, z;
		Matrix xv = linspace(-3, 3, n);
		CellArray ca = meshgrid(xv, xv);
		Matrix xx = (Matrix) ca.get(1, 1);
		Matrix yy = (Matrix) ca.get(1, 2);
		Matrix zz = new Matrix(n, n);
		CellArray res = new CellArray(1, 3);
		res.set(1, 1, xx);
		res.set(1, 2, yy);
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				x = xx.get(r, c);
				y = yy.get(r, c);
				z = 3 * Math.pow(1 - x, 2)
						* Math.exp(-Math.pow(x, 2) - Math.pow(y + 1, 2))
						- 10 * (x / 5 - Math.pow(x, 3) - Math.pow(y, 5))
						* Math.exp(-Math.pow(x, 2) - Math.pow(y, 2))
						- 1 / 3 * Math.exp(-Math.pow(x + 1, 2) - Math.pow(y, 2));
				zz = Set.set(zz, r, c, z);
			}
		}
		res.set(1, 1, xx);
		res.set(1, 2, yy);
		res.set(1, 3, zz);
		return res;
	}

	public static CellArray peaks() throws Exception {
		return peaks(49);
	}

	public static Matrix applyFunction(String fName, Matrix a, Matrix b) {
		if (a.n != b.n) {
			throw(new CustomException("Matrix.applyFunction bad a or b inputs"));
		}
		Matrix res = new Matrix(a);
		res.data = applyMathMethodToVector(a.data, fName, b.data);
		return res;
	}

	/*
	 * dynamic methods
	 */
	public Matrix applyFunction(String fName) {
		Matrix res = new Matrix(this);
		res.data = applyMathMethodToVector(data, fName);
		return res;
	}

	/** add in the ability to use any of our Matlab types - just a simple casting based on a string input*/
	/**
	 * Applies any function defined in the java.lang.Math package to a vector of doubles.
	 *
	 * @param vec is the vector of doubles to which we apply the method
	 * @param methodName is the name of the method as a String (i.e. "cos")
	 * @param otherParams is just a list of any other parameters you might have
	 *
	 * @return is the vector which is obtained from applying the method to each element in vec
	 */
	public static double[] applyMathMethodToVector(double[] vec, String methodName, double[] vec2) {

		double[] newvec = new double[vec.length];

		try {

			//Create instances of the Math and double classes (use Double.TYPE for the wrapper)
			Class doubleClass = double.class;
			Class mathClass = Math.class; //Class.forName("java.lang.Math"); // <-- alternative way

			//Create an array of Object parameters from input, and assume all parameter
			//types are doubles (for now)
			Object[] params = {doubleClass, doubleClass};
			Class[] parTypes = {doubleClass, doubleClass};

			//Get an instance of the method that we want to use
			Method meth = mathClass.getMethod(methodName, parTypes);

			//Apply the method to everything in the input vector one element at a time
			for (int i = 0; i < vec.length; i++) {
				params[0] = vec[i];

				//Check dimensions
				if (vec2.length == vec.length) {
					params[1] = vec2[i];
				} else if (vec2.length == 1) {
					params[1] = vec2[0];
				} else {
					throw(new MatrixDimensionsException());
				}

				newvec[i] = (Double) meth.invoke(Double.class, params);
			}



		} catch (Throwable e) {
			System.err.println(e);
		}

		return newvec;

	}

	public static Matrix applyMathMethodToMatrix(String methodName, MatObject... matarr) {
		if (matarr.length == 1) {
			return new Matrix(applyMathMethodToVector(((Matrix) matarr[0]).data, methodName), ((Matrix) matarr[0]).size[ROW], ((Matrix) matarr[0]).size[COL]);
		} else if (matarr.length == 2) {
			return new Matrix(applyMathMethodToVector(((Matrix) matarr[0]).data, methodName, ((Matrix) matarr[1]).data), ((Matrix) matarr[0]).size[ROW], ((Matrix) matarr[0]).size[COL]);
		}

		return null;
	}

	/**
	 * This takes in no second parameter, and is intended for functions such as "cos"
	 * @param vec
	 * @param methodName
	 * @return
	 */
	public static double[] applyMathMethodToVector(double[] vec, String methodName) {

		double[] newvec = new double[vec.length];

		try {

			//Create instances of the Math and double classes (use Double.TYPE for the wrapper)
			Class doubleClass = double.class;
			Class mathClass = Math.class; //Class.forName("java.lang.Math"); // <-- alternative way

			//Create an array of Object parameters from input, and assume all parameter
			//types are doubles (for now)
			Class[] parTypes = {doubleClass};
			Object[] params = new Object[1];

			//Get an instance of the method that we want to use
			Method meth = mathClass.getMethod(methodName, parTypes);

			// Can't cast from long to double >.<
			if (methodName.equals("round")) {
				for (int i = 0; i < vec.length; i++) {
					params[0] = vec[i];
					newvec[i] = (Long) meth.invoke(Double.class, params);
				}
			} else {
				//Apply the method to everything in the input vector one element at a time
				for (int i = 0; i < vec.length; i++) {
					params[0] = vec[i];
					newvec[i] = (Double) meth.invoke(Double.class, params);
				}
			}



		} catch (Throwable e) {
			System.err.println(e);
		}

		return newvec;

	}

	/**
	 *
	 * @return
	 * @throws Exception 
	 */
	public Matrix sum() throws Exception {
		Matrix res;

		if (size[ROW] == 1) {
			double total = 0;
			for (int c = 0; c < size[COL]; c++) {
				total += data[c];
			}
			res = new Matrix(total);
		} else {
			res = zeros(1, size[COL]);
			for (int c = 1; c <= size[COL]; c++) {
				for (int r = 1; r <= size[ROW]; r++) {
					res = Set.set(res, 1, c, res.get(1, c) + get(r, c));
				}
			}
		}
		return res;
	}

	/**
	 * reshape
	 * @param rows
	 * @param cols
	 * @return
	 */
	public Matrix reshape(int rows, int cols) {
		if (n != rows * cols) {
			throw(new MatrixResizeException());
		}
		Matrix res = new Matrix(this);
		res.size[ROW] = rows;
		res.size[COL] = cols;
		return res;
	}
	private Pair pa[];

	private int partition(int first, int last) {
		Pair pivot = pa[first];
		int low = first + 1;
		int high = last;
		while (high > low) {
			// Search forward from the left
			while (low <= high && pa[low].value <= pivot.value) {
				low++;
			}
			// Search backwards from the right
			while (low <= high && pa[high].value > pivot.value) {
				high--;
			}
			// Swap high and low
			if (high > low) {
				Pair temp = pa[high];
				pa[high] = pa[low];
				pa[low] = temp;
			}
		}
		while (high > first && pa[high].value >= pivot.value) {
			high--;
		}
		// Swap pivot with list[high]
		if (pivot.value > pa[high].value) {
			pa[first] = pa[high];
			pa[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	/*
	 * quick sort
	 */
	private void sort(int first, int last) {
		if (last > first) {
			int pi = partition(first, last);
			sort(first, pi - 1);
			sort(pi + 1, last);
		}
	}

	/**
	 *
	 * @return
	 */
	public CellArray sort() {
		CellArray res = new CellArray(1, 2);
		pa = new Pair[n];
		for (int i = 1; i <= n; i++) {
			pa[i-1] = new Pair(get(i), i);
		}
		sort(0, n - 1);
		Matrix v = new Matrix(1, n);
		Matrix o = new Matrix(1, n);
		for (int i = 1; i <= n; i++) {
			v = Set.set(v, i,  pa[i-1].value);
			o = Set.set(o, i,  pa[i-1].order);
		}
		res.set(1, 1, v);
		res.set(1, 2, o);
		return res;
	}



	/**
	 *
	 * @param x
	 * @return
	 */
	public Matrix pow(double x) {
		Matrix res = new Matrix(this);
		for (int i = 1; i <= n; i++) {
			//            res.data[i] = Math.pow(data[i], x);
			res = Set.set(res, i,  Math.pow(get(i), x));
		}
		return res;
	}

	/**
	 *
	 * @return
	 */
	public Matrix sin() {
		Matrix res = new Matrix(this);
		for (int i = 1; i <= n; i++) {
			//            res.data[i] = Math.sin(data[i]);
			res = Set.set(res, i,  Math.sin(get(i)));
		}
		return res;
	}

	

	/**
	 *
	 * @param x
	 * @return
	 */
	public Matrix mexp(double x) {
		Matrix res = new Matrix(this);
		for (int i = 1; i <= n; i++) {
			//            res.data[i] = Math.pow(data[i], x);
			res = Set.set(res, i,  Math.pow(get(i), x));
		}
		return res;
	}


	/**
	 * mult a matrix
	 * @param v matrix to add
	 * @return
	 */
	public Matrix mult(Matrix v) {
		Matrix res = new Matrix(this);
		if (n != v.n) {
			if (n == 1) {
				res = new Matrix(v);
				for (int i = 1; i <= v.n; i++) {
					//                    res.data[i] = data[0] + res.data[i];
					res = Set.set(res, i, get(1) * v.get(i));
				}
			} else if (v.n == 1) {
				for (int i = 1; i <= n; i++) {
					//                    res.data[i] = v.data[0] + data[i];
					res = Set.set(res, i, v.get(1) * get(i));
				}
			} else {
				throw(new InnerMatrixDimensionsException());
			}
		} else {
			for (int i = 1; i <= n; i++) {
				//               res.data[i] = data[i] + v.data[i];
				res = Set.set(res, i, get(i) * v.get(i));
			}
		}
		return res;
	}

	


	/**
	 * multiply a matrix in place
	 * @param v matrix to add
	 * @return
	 */
	public void multIP(Matrix v) {
		if (n != v.n) {
			throw(new InnerMatrixDimensionsException());
		}
		for (int i = 1; i <= n; i++) {
			Set.set(this, i, get(i) * v.get(i));
		}
	}

	

	/**
	 * multiply a scalar in place
	 * @param v matrix to add
	 * @return
	 */
	public void multIP(double x) {
		for (int i = 1; i <= n; i++) {
			Set.set(this, i, get(i) * x);
		}
	}


	

	

	/**
	 *
	 * @param v
	 * @return
	 */
	public Matrix mexp(Matrix v) {
		Matrix res = new Matrix(this);
		if (n != v.n) {
			if (n == 1) {
				res = new Matrix(v);
				for (int i = 1; i <= v.n; i++) {
					//                    res.data[i] = Math.pow(data[0], v.data[i]);
					res = Set.set(res, i, Math.pow(get(1), v.get(i)));
				}
			} else if (v.n == 1) {
				for (int i = 1; i <= n; i++) {
					//                    res.data[i] = Math.pow(data[i], v.data[0]);
					res = Set.set(res, i, Math.pow(v.get(1),  get(i)));
				}
			} else {
				throw(new MatrixNotSquareException());
			}
		} else {
			for (int i = 1; i <= n; i++) {
				//               res.data[i] = Math.pow(data[i], v.data[i]);
				res = Set.set(res, i, Math.pow(get(i), v.get(i)));
			}
		}
		return res;
	}

	/**
	 *
	 * @param v
	 * @return
	 * @throws Exception 
	 */
	public Matrix exp(Matrix v) throws Exception {
		Matrix res = new Matrix(this);
		if (v.n > 1) {
			throw(new CustomException("exponent must be scalar"));
		}
		if (n == 1) {
			res = res.mexp(v);
		} else if (v.get(1) % 1 != 0) {
			throw(new CustomException("exponent must not be fractional"));
		} else {
			int nt = (int) v.get(1);
			if (nt == 0) {
				res = Matrix.ones(size[ROW], size[COL]);
			} else if (nt < 0) {
				nt = -nt;
				res = MatInverse.matInverse(res);
			}
			for (int i = 0; i < nt; i++) {
				res = MatMult.matMult(res, res);
			}
		}
		return res;
	}

	public static Matrix all(Matrix m) {
		Matrix res = new Matrix(1);
		res.type = Type.LOGICAL;
		for (int i = 1; i <= m.n; i++) {
			if (m.get(i) == 0) {
				res = Set.set(res, 1, 0);
				break;
			}
		}
		return res;
	}

	public static Matrix any(Matrix m) {
		Matrix res = new Matrix(0);
		res.type = Type.LOGICAL;
		for (int i = 1; i <= m.n; i++) {
			if (m.get(i) != 0) {
				res = Set.set(res, 1, 1);
				break;
			}
		}
		return res;
	}

	private static Matrix lt1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (v < m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

	private static Matrix gt1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (v > m.get(i)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}


	private static Matrix eq1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (Math.abs(v - m.get(i)) < Math.ulp(v)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

	private static Matrix ne1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, (Math.abs(v - m.get(i)) >= Math.ulp(v)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

	public static Matrix isNotNaN(Matrix m) throws Exception {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			res = Set.set(res, i, Double.isNaN(m.get(i)) ? 0 : 1);
		}
		res.type = Type.LOGICAL;
		res = find(res);
		return res;
	}

	private static Matrix and1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			double x = m.get(i);
			res = Set.set(res, i, (v > Math.ulp(v) && x > Math.ulp(x)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

	private static Matrix or1(double v, Matrix m) {
		Matrix res = new Matrix(m);
		for (int i = 1; i <= m.n; i++) {
			double x = m.get(i);
			res = Set.set(res, i, (v > Math.ulp(v) || x > Math.ulp(x)) ? 1 : 0);
		}
		res.type = Type.LOGICAL;
		return res;
	}

	/**
	 *
	 * @return
	 */
	 public Matrix floor() {
		Matrix res = new Matrix(this);
		res.type = Type.INTEGER;
		for (int i = 1; i <= n; i++) {
			res = Set.set(res, i, Math.floor(get(i)));
		}
		return res;
	 }

	 /**
	  *  index an array
	  * @param ri
	  * @param ci
	  * @return
	 * @throws Exception 
	  */
	 public Matrix index(Matrix ri, Matrix ci) throws Exception {
		 if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
			 throw(new CustomException("Matrix.index indices must be vectors"));
		 }
		 Matrix res = new Matrix(ri.n, ci.n);
		 for (int r = 1; r <= ri.n; r++) {
			 int rndx = (int) ri.get(r);
			 for (int c = 1; c <= ci.n; c++) {
				 int cndx = (int) ci.get(c);
				 res = Set.set(res, r, c, get(rndx, cndx));
			 }
		 }
		 return res;
	 }

	 /**
	  * index a vector
	  * @param ci
	  * @return
	 * @throws Exception 
	  */
	 public Matrix index(Matrix ci) throws Exception {
		 if (ci.size[ROW] != 1) {
			 throw(new CustomException("Matrix.index index must be a vector"));
		 }
		 Matrix res = new Matrix(1, ci.n);
		 for (int c = 1; c <= ci.n; c++) {
			 int cndx = (int) ci.get(c);
			 res = Set.set(res, 1, c, get(1, cndx));
		 }
		 return res;
	 }

	 /**
	  *
	  * @return
	 * @throws Exception 
	  */
	 public Matrix del2() throws Exception {
		 int rows = size[ROW];
		 int cols = size[COL];
		 Matrix res = zeros(rows, cols);
		 for(int r = 1; r <= rows; r++) {
			 for(int c = 1; c <= cols; c++) {
				 int n = 0;
				 double s = 0;
				 double it;
				 for(int dr = -1; dr <= 1; dr++) {
					 if(r > 1 && r < rows) {
						 for(int dc = -1; dc <= 1; dc++) {
							 if(c > 1 && c < cols && (dr != 0 || dc != 0)) {
								 n++;
								 s += get(r+dr, c+dc);
							 }
						 }
					 }
				 }
				 if(n > 0) {
					 it = get(r,c) - s/n;
					 res = Set.set(res, r, c, it);
				 }
			 }
		 }
		 return res;  
	 }


	 /**
	  *  Find the max and location of a Matrix
	  * @return
	 * @throws Exception 
	  */
	 public CellArray max() throws Exception {
		 CellArray res = new CellArray(1, 2);
		 if (size[ROW] == 1) {
			 double best = get(1);
			 int where = 1;
			 for (int c = 2; c <= size[COL]; c++) {
				 if (get(c) > best) {
					 best = get(c);
					 where = c;
				 }
			 }
			 res.set(1, 1, new Matrix(best));
			 res.set(1, 2, new Matrix(where));
		 } else {
			 Matrix bestm = new Matrix(1, size[COL]);
			 Matrix wherem = new Matrix(1, size[COL]);
			 for (int c = 1; c <= size[COL]; c++) {
				 CellArray ca = Transpose.transpose(index(colon(1, size[ROW]), new Matrix(c))).max();
				 bestm = Set.set(bestm, c, ((Matrix) ca.get(1, 1)).get(1));
				 wherem = Set.set(wherem, c, ((Matrix) ca.get(1, 2)).get(1));
			 }
			 res.set(1, 1, new Matrix(bestm));
			 res.set(1, 2, new Matrix(wherem));
		 }
		 return res;
	 }

	 public double getMin() {
		 double res = get(1);
		 for (int i = 2; i <= n; i++) {
			 if (get(i) < res) {
				 res = get(i);
			 }
		 }
		 return res;
	 }

	 public double getMax() {
		 double res = get(1);
		 for (int i = 1; i < n; i++) {
			 if (get(i) > res) {
				 res = get(i);
			 }
		 }
		 return res;
	 }

	 /**
	  *  Find the max and location of a Matrix
	  * @return
	 * @throws Exception 
	  */
	 public CellArray min() throws Exception {
		 CellArray res = new CellArray(1, 2);
		 if (size[ROW] == 1) {
			 double best = get(1);
			 int where = 1;
			 for (int c = 2; c <= size[COL]; c++) {
				 if (get(c) < best) {
					 best = get(c);
					 where = c;
				 }
			 }
			 res.set(1, 1, new Matrix(best));
			 res.set(1, 2, new Matrix(where));
		 } else {
			 Matrix bestm = new Matrix(1, size[COL]);
			 Matrix wherem = new Matrix(1, size[COL]);
			 for (int c = 1; c <= size[COL]; c++) {
				 CellArray ca =
						 Transpose.transpose(index(colon(1, size[ROW]), new Matrix(c + 1))).min();
				 bestm = Set.set(bestm, c, ((Matrix) ca.get(1, 1)).get(1));
				 wherem = Set.set(wherem, c, ((Matrix) ca.get(1, 2)).get(1));
			 }
			 res.set(1, 1, new Matrix(bestm));
			 res.set(1, 2, new Matrix(wherem));
		 }
		 return res;
	 }

	 /**
	  *
	  * @param m
	  * @return
	 * @throws Exception 
	  */
	 public Matrix diag(Matrix m) throws Exception {
		 Matrix res = null;
		 if (m.size[ROW] == 1) {
			 int n = m.n;
			 res = zeros(n, n);
			 for (int i = 1; i <= n; i++) {
				 res = Set.set(res, i, i, m.get(i));
			 }
		 } else {
			 int sz = m.size[COL];
			 if (m.size[ROW] < sz) {
				 sz = m.size[ROW];
			 }
			 res = zeros(sz, 1);
			 for (int i = 1; i <= sz; i++) {
				 res = Set.set(res, i, 1, m.get(i, i));
			 }
		 }
		 return res;
	 }

	 /**
	  *
	  * @param m
	  * @param offset
	  * @return
	 * @throws Exception 
	  */
	 public Matrix diag(Matrix m, int offset) throws Exception {
		 Matrix rowIndex;
		 Matrix colIndex;

		 if (offset > 0) {
			 if (offset >= m.size[COL]) {
				 throw(new CustomException("Matrix.diag offset too big"));
			 }
			 // remove the firstoffset columns
			 rowIndex = colon(0, m.size[ROW] - 1);
			 colIndex = colon(offset, m.size[COL] - 1);
		 } else {
			 if (-offset >= m.size[ROW]) {
				 throw(new CustomException("Matrix.diag offset too big"));
			 }
			 rowIndex = colon(-offset, m.size[ROW] - 1);
			 colIndex = colon(0, m.size[COL] - 1);
		 }
		 Matrix shrunk = m.index(rowIndex, colIndex);
		 return diag(shrunk);
	 }

	 public void setLower(int ndx, Matrix m) {
		 for (int i = 1; i <= m.n; i++) {
			 if (m.get(i) < get(ndx)) {
				 Set.set(this, ndx, m.get(i));
			 }
		 }
	 }

	 public void setUpper(int ndx, Matrix m) {
		 for (int i = 1; i <= m.n; i++) {
			 if (m.get(i) > get(ndx)) {
				 Set.set(this, ndx, m.get(i));
			 }
		 }
	 }

	 private static int powMod(int base, int power, int mod){
		 long res = 1;
		 for (int i = 31; i >= 0; i--) {
			 res = (res*res) % mod;
			 if ((power & (1 << i)) != 0) {
				 res = (res*base) % mod;
			 }
		 }
		 return (int)res; // Will not truncate since modulus is an int
	 }

	 //Returns true iff prime
	 private static boolean millerRabinPass(int a, int n){
		 int d = n - 1;
		 int s = Integer.numberOfTrailingZeros(d);
		 d >>= s;
			 int a_to_power = powMod(a, d, n);
			 if (a_to_power == 1) return true;
			 for (int i = 0; i < s-1; i++) {
				 if (a_to_power == n-1) return true;
				 a_to_power = powMod(a_to_power, 2, n);
			 }
			 if (a_to_power == n-1) return true;
			 return false;
	 }

	 public static Matrix primes(Matrix m) throws Exception{
		 if (m.data.length > 1){
			 throw(new CustomException("Value must be a scalar."));
		 }
		 int cap = (int)m.get(1);
		 if (cap == 0) return new Matrix();
		 if (cap == 1) return new Matrix();
		 if (cap < 0) throw(new CustomException("Negative values don't make sense."));
		 int[] arr = new int[(int)m.get(1)+1];
		 arr[0] = 1;
		 arr[1] = 1;

		 for (int i = 4; i < arr.length; i+=2){
			 arr[i] = 1;
		 }

		 int primeCount = cap > 1 ? 1 : 0;
		 for (int i = 3; i < arr.length; i+=2){
			 if (arr[i] == 0){
				 primeCount++;
				 for (int j = i+i; j < arr.length; j+=i){
					 arr[j] = 1;
				 }
			 }
		 }

		 double[] data = new double[primeCount];
		 int ind = 0;
		 for (int i = 0; i < arr.length; i++){
			 if (arr[i] == 0){
				 data[ind++] = i;
			 }
		 }
		 return new Matrix(data, 1, data.length);
	 }

	 //@TODO - need Logical type...
	 public static Matrix isprime(Matrix m) throws Exception{
		 double[] vals = new double[m.data.length];
		 double d;
		 for (int i = 0; i < m.data.length; i++){
			 d = m.data[i];
			 if (d > Integer.MAX_VALUE){
				 throw(new CustomException("Maximum allowed value is " + Integer.MAX_VALUE + "."));
			 }
			 else if (d < 0){
				 throw(new CustomException("Negative values are not allowed."));
			 }
			 vals[i] = isPrime((int)d) ? 1 : 0;//@TODO don't allow non-integer arguments
		 }

		 Matrix ret = new Matrix(vals, m.rows(), m.cols());
		 ret.type = Type.LOGICAL;
		 return ret;
	 }

	 private static boolean isPrime(int n){


		 if (n <= 1) return false;
		 else if (n == 2) return true;
		 else if (millerRabinPass( 2, n) &&
				 (n <= 7  || millerRabinPass( 7, n)) &&
				 (n <= 61 || millerRabinPass(61, n)))
			 return true;
		 else
			 return false;
	 }

	 /**
	  *
	  * @param x
	  * @param y
	  * @return
	  */
	 public String toString() {
		 int rows, cols;
		 if(size.length > 1) {
			 rows = size[ROW];
			 cols = size[COL];
		 } else {
			 rows = 1;
		     cols = size[0];
		 }
		 String res = "";
		 double d;
		 if (type == Type.END) {
			 return "end: " + geti(1);
		 }
		 if (n == 0) {
			 return "[]";
		 }
		 if (rows > 1) {
			 res += "[\n   ";
		 } else if (cols > 1) {
			 res += "[";
		 }
		 for (int r = 1; r <= rows; r++) {
			 for (int c = 1; c <= cols; c++) {
				 d = get(r, c);
				 if (Double.isNaN(d)) {
					 res+=" NaN";
				 } else if (Double.isInfinite(d)) {
					 res += " inf";
				 } else {
					 switch (type) {
					 case DOUBLE:
						 if (d % 1 == 0) {
							 res += " " + (int) d;
						 } else {
							 res += " " + Format.format(d, 4);
						 }
						 break;
					 case LOGICAL:
						 if (d > 0) {
							 res += " t";
						 } else {
							 res += " f";
						 }
						 break;
					 case INTEGER:
						 res += " " + (int) d;
						 break;
					 }
				 }
			 }
			 if ((rows > 1) && (r < rows)) {
				 res += "\n   ";
			 }
		 }
		 if (length() > 1) {
			 res += " ]";
		 }
		 return res.toString();
	 }

	 public String workspaceString() {
		 int rows = size[ROW];
		 int cols = size[COL];
		 String res;
		 double d;
		 if (rows > 1) {
			 res = "[";
		 } else {
			 res = "[";
		 }
		 for (int r = 1; r <= rows; r++) {
			 for (int c = 1; c <= cols; c++) {
				 d = get(r, c);
				 switch (type) {
				 case DOUBLE:
					 if (d % 1 == 0) {
						 res += " " + (int) d;
					 } else {
						 res += " " + Format.format(d, 4);
					 }
					 break;
				 case LOGICAL:
					 if (d > 0) {
						 res += " t";
					 } else {
						 res += " f";
					 }
					 break;
				 case INTEGER:
					 res += " " + (int) d;
					 break;
				 }
			 }
			 if ((rows > 1) && (r < rows)) {
				 res += ";";
			 }
		 }
		 res += " ]";
		 return res;
	 }

	 /*public static void main(String a[]) throws Exception {
		 Matrix m = Matrix.magic(new Matrix(7));
		 System.out.println(m);

		 double[] vecdata = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 Matrix vec = new Matrix(vecdata, 3, 3);
		 System.out.println(vec);
		 Matrix newvec;
		 double[] insertdata = {13, 23};
		 Matrix vals = new Matrix(insertdata, 1, 2);
		 Matrix rind = new Matrix(1, 2, 1, 2);
		 Matrix cind = new Matrix(new double[]{3}, 1, 1);
		 System.out.println(cind);
		 newvec = get(vec, rind, cind);
		 System.out.println("\n\n");
		 System.out.println(newvec);

		 Matrix vec2 = get(vec, rind);
		 System.out.println(vec2 + "\n\n");

		 set(vec, new Matrix(2, 2, 1, 3, 7, 9), new Matrix(1, 4, 0, 0, 0, 0));
		 System.out.println(vec);

		 set(vec, new Matrix(1, 2, 1, 3), new Matrix(1, 2, 1, 3), new Matrix(2, 2, 1, 1, 1, 1));
		 System.out.println(vec);

		 Matrix x = linspace(new Matrix(1), new Matrix(2), new Matrix(10000));

		 StringBuilder sb = new StringBuilder(10);
		 sb.append("xa");
		 System.out.println(sb.toString());

		 save(new Matrix(2,3,1,2,3,4,5,6), "mymat");


		 System.out.println(isprime(new Matrix(79)));
		 System.out.println(isprime(new Matrix(42)));
		 /*System.out.println(isprime(primes(new Matrix(1000000)));//);
		 System.out.println("hasdfhasdf");
	 }*/

	 class Pair {

		 double value;
		 int order;

		 public Pair(double v, int i) {
			 value = v;
			 order = i;
		 }
	 }

	@Override
	public MatObject get(int... indices) {
		if(indices.length == 1)
			return new Matrix(data[indices[0]-1]);
		
		//offsetvec[i] tells you how much you need to multiply by for index i to go from array indices to linear indices
		int offsetvec[] = new int[size.length];
		//Need 1 for the next row, row for the next column, row*column for the next layer...
		offsetvec[0] = 1;
		for(int i = 1; i < size.length; i++) {
			offsetvec[i] = offsetvec[i-1] * size[i-1];
		}
		int k = 1;
		for(int i = 0; i < indices.length; i++) {
			k += (indices[i]-1) * offsetvec[i];
		}
		
		return new Matrix(data[k-1]);
	}
}

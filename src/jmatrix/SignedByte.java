/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

import main.Main;
import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.reflect.Method;

import jmatrix.MatObject.Type;

/**
 *
 * @author dsmith
 */
public class SignedByte extends MatObject {

	public byte data[];  // 

	/* Constructors */
	/**
	 * empty
	 */
	public SignedByte() {
		this(0);
	}

	/**
	 * 1.1 a scalar
	 * @param x - the value
	 */
	public SignedByte(int num) {
		n = num;
		size = new int[2];
		type = Type.BYTE;
		data = new byte[num];
		size[COL] = num;
		size[ROW] = 1;
	}

	public SignedByte(byte x[], int num) {
		this(num);
		for (int i = 0; i < n; i++) {
			data[i] = x[i];
		}
	}

	/**
	 * a rectangular array
	 * @param rows
	 * @param cols
	 */
	public SignedByte(int rows, int cols) {
		n = rows * cols;
		if (n > 0) {
			data = new byte[n];
		} else {
			data = null;
		}
		type = Type.BYTE;
		size = new int[2];
		size[ROW] = rows;
		size[COL] = cols;
	}

	/**
	 * 3. an array of bytes
	 * @param x - the value
	 */
	public SignedByte(double x[]) {
		this(x.length);
		for (int i = 0; i < n; i++) {
			data[i] = (byte) x[i];
		}
	}

	/**
	 * clone a matrix
	 * @param v
	 */
	public SignedByte(SignedByte v) {
		this(v.n);
		for (int i = 0; i < n; i++) {
			data[i] = v.data[i];
		}
	}

	public SignedByte empty() {
		return new SignedByte();
	}
	@Override
	public SignedByte clone() {
		return new SignedByte(this);
	}

	public SignedByte copy() {
		return new SignedByte(this);
	}

	public SignedByte zeroed() {
		return new SignedByte(this);
	}


	/* accessors */
	private void extend(int rw, int cl) {
		if (rw > size[ROW]
				|| cl > size[COL]
						|| (cl == 1 && rw > size[ROW] * size[COL])) {
			int rm = rw > size[ROW] ? rw : size[ROW];
			int cm = cl > size[COL] ? cl : size[COL];
			byte nd[] = new byte[rm * cm];
			for (int r = 1; r <= size[ROW]; r++) {
				for (int c = 1; c <= size[COL]; c++) {
					byte d = get(r, c);
					nd[(c - 1) * rm + (r - 1)] = d;
				}
			}
			data = nd;
			n = rm * cm;
			size[ROW] = rm;
			size[COL] = cm;
		}
	}


	public void append(byte ba[], int num) {
		int rm = 1;
		int cm = num + size[COL];
		byte nd[] = new byte[cm];
		for (int i = 0; i < n; i++) {
			nd[i] = data[i];
		}
		for (int i = 0; i < num; i++) {
			nd[i+n] = ba[i];
		}
		data = nd;
		n = rm * cm;
		size[ROW] = rm;
		size[COL] = cm;
	}

	private void extend(int to) {
		if (to > size[ROW] * size[COL]) {
			SignedByte m = reshape(size[ROW] * size[COL], 1);
			m.extend(to, 1);
			data = m.data;
			n = m.n;
			size = m.size;
		}
	}

	/**
	 * get a value from a matrix
	 * @param r - the row  [offset 1]
	 * @param c - the column
	 * @return
	 */
	 public byte get(int r, int c) {
		 return data[(c - 1) * size[ROW] + (r - 1)];
	 }

	 /**
	  * set a value in a matrix
	  * @param r - the row
	  * @param c - the column
	  * @param val - the value
	  */
	 public void set(int r, int c, byte val) {
		 if (r > size[ROW]) {
			 extend(r, size[COL]);
		 }
		 if (c > size[COL]) {
			 extend(size[ROW], c);
		 }
		 data[(c - 1) * size[ROW] + (r - 1)] = val;
	 }

	 /**
	  * get from a linearized matrix
	  * @param i - the index (offset 1)
	  * @return
	  */
	 public byte get(int i) {
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

	 public void copyValues(Matrix ndx, MatObject src) {
		 int in = ndx.length();
		 int sn = src.length();
		 SignedByte it = (SignedByte) src;
		 if(sn == 1) {
			 byte val = it.get(1);
			 for(int i = 1; i <= in; i++) {
				 int loc = (int) ndx.get(i);
				 set(1, loc, val);
			 }
		 } else {
			 for(int i = 1; i <= in; i++) {
				 int loc = (int) ndx.get(i);
				 set(1, loc, it.get(i));
			 }
		 }
	 }

	 /**
	  * set a value in a linearized array
	  * @param i
	  * @param val
	  */
	  public void set(int i, byte val) {
		  if (i > n) {
			  throw new RuntimeException("Matrix:set(i...) i too big");
		  }
		  ;
		  data[i - 1] = val;
	  }

	  /**
	   * Copy a Byte into a Byte
	   * @param rndx - target rows
	   * @param cndx - target columns
	   * @param vals -  source data
	   * @throws Exception 
	   */
	  public void set(Matrix rndx, Matrix cndx, SignedByte vals) throws Exception {
		  //        Main.debug.println("set " + this + " at rows " + rndx
		  //                + " at cols " + cndx + " to " + vals);
		  if (rndx.size[ROW] != 1
				  || cndx.size[ROW] != 1) {
			  throw new RuntimeException("Matrix.set bad row or col vector");
		  }
		  if (rndx.size[COL] != vals.size[ROW]
				  || cndx.size[COL] != vals.size[COL]) {
			  throw new RuntimeException("Matrix.set bad row or col vector size");
		  }
		  int mxr = (int) ((SignedByte) rndx.max().get(1, 1)).data[0];
		  int mxc = (int) ((SignedByte) cndx.max().get(1, 2)).data[0];
		  if (mxr > size[ROW]) {
			  extend(mxr, size[COL]);
		  }
		  if (mxc > size[COL]) {
			  extend(size[ROW], mxc);
		  }
		  for (int ri = 0; ri < rndx.size[COL]; ri++) {
			  for (int ci = 0; ci < cndx.size[COL]; ci++) {
				  set((int) rndx.data[ri],
						  (int) cndx.data[ci],
						  vals.get(ri + 1, ci + 1));
			  }
		  }
	  }

	  /**
	   * horizontal concatenation (an array of matrices)
	   * @param m
	   * @return
	   */
	  public static SignedByte hcat(SignedByte[] m) {
		  SignedByte res;
		  int cols = 0;
		  int rows = m[0].size[ROW];
		  int col = 0;
		  // calculate cols and check rows
		  for (int i = 0; i < m.length; i++) {
			  cols += m[i].size[COL];
			  if (m[i].size[ROW] != rows) {
				  throw new RuntimeException("Matrix.hcat bad rows in item " + i);
			  }
		  }
		  res = new SignedByte(rows, cols);
		  // copy all matrices into res
		  for (int i = 0; i < m.length; i++) {
			  SignedByte it = m[i];
			  for (int c = 1; c <= it.size[COL]; c++) {
				  for (int r = 1; r <= rows; r++) {
					  res.set(r, c + col, it.get(r, c));
				  }
			  }
			  col += it.size[COL];
		  }
		  return res;
	  }

	  /**
	   * vertical concatenation (array of matrices)
	   * @param m
	   * @return
	   */
	  public static SignedByte vcat(SignedByte[] m) {
		  SignedByte res;
		  int rows = 0;
		  int cols = m[0].size[COL];
		  int row = 0;
		  // calculate cols and check rows
		  for (int i = 0; i < m.length; i++) {
			  rows += m[i].size[ROW];
			  if (m[i].size[COL] != cols) {
				  throw new RuntimeException("Matrix.hcat bad columns in item " + i);
			  }
		  }
		  res = new SignedByte(rows, cols);
		  // copy all matrices into res
		  for (int i = 0; i < m.length; i++) {
			  SignedByte it = m[i];
			  for (int c = 1; c <= cols; c++) {
				  for (int r = 1; r <= it.size[ROW]; r++) {
					  res.set(r + row, c, it.get(r, c));
				  }
			  }
			  row += it.size[ROW];
		  }
		  return res;
	  }

	  /**
	   * reshape
	   * @param rows
	   * @param cols
	   * @return
	   */
	  public SignedByte reshape(int rows, int cols) {
		  if (n != rows * cols) {
			  throw new RuntimeException("Matrix.reshape bad size");
		  }
		  SignedByte res = new SignedByte(this);
		  res.size[ROW] = rows;
		  res.size[COL] = cols;
		  return res;
	  }

	  /**
	   *  index an array
	   * @param ri
	   * @param ci
	   * @return
	   */
	  public SignedByte index(Matrix ri, Matrix ci) {
		  if ((ri.size[ROW] != 1) || (ci.size[ROW] != 1)) {
			  throw new RuntimeException("Matrix.index indices must be vectors");
		  }
		  SignedByte res = new SignedByte(ri.n, ci.n);
		  for (int r = 1; r <= ri.n; r++) {
			  int rndx = (int) ri.get(r);
			  for (int c = 1; c <= ci.n; c++) {
				  int cndx = (int) ci.get(c);
				  res.set(r, c, get(rndx, cndx));
			  }
		  }
		  return res;
	  }

	  /**
	   * index a vector
	   * @param ci
	   * @return
	   */
	  public SignedByte index(Matrix ci) {
		  if (ci.size[ROW] != 1) {
			  throw new RuntimeException("Byte.index index must be a vector");
		  }
		  SignedByte res = new SignedByte(1, ci.n);
		  for (int c = 1; c <= ci.n; c++) {
			  int cndx = (int) ci.get(c);
			  res.set(1, c, get(1, cndx));
		  }
		  return res;
	  }

	  public double getMin() {
		  double res = data[0];
		  for (int i = 1; i < n; i++) {
			  if (data[i] < res) {
				  res = data[i];
			  }
		  }
		  return res;
	  }

	  public double getMax() {
		  double res = data[0];
		  for (int i = 1; i < n; i++) {
			  if (data[i] > res) {
				  res = data[i];
			  }
		  }
		  return res;
	  }

	  /**
	   *
	   * @param x
	   * @param y
	   * @return
	   */
	  public String toString() {
		  int rows = size[ROW];
		  int cols = size[COL];
		  String res = "";
		  byte d;

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
				  res+=" " + Byte.toString(d);
				  //					 switch (type) {
				  //					 case DOUBLE:
				  //						 if (d % 1 == 0) {
				  //							 res += " " + (int) d;
				  //						 } else {
				  //							 res += " " + Format.format(d, 4);
				  //						 }
				  //						 break;
				  //					 case LOGICAL:
				  //						 if (d > 0) {
				  //							 res += " t";
				  //						 } else {
				  //							 res += " f";
				  //						 }
				  //						 break;
				  //					 case INTEGER:
				  //						 res += " " + (int) d;
				  //						 break;
				  //					 }

			  }
			  if ((rows > 1) && (r < rows)) {
				  res += "\n   ";
			  }
		  }
		  if (length() > 1) {
			  res += " ]";
		  }
		  return res;
	  }
	  public static void main(String[] args){
		  int rows = 3;
		  int cols = 3;
		  byte i = 0;
		  SignedByte sb = new SignedByte(rows, cols);
		  for(int r = 1; r<=rows; r++){
			  for (int c = 1; c<=cols; c++){
				  sb.set(r, c, i);
				  i++;
				  System.out.println("set("+r+", "+c+", "+i+")");
			  }
		  }
		  System.out.println("Now testing sb.toString():");

		  System.out.println(sb.toString());
		  i = 0;
		  byte[] ba = new byte[4];
		  for (int c1 = 0; c1<ba.length; c1++){
			  ba[c1] = i;
			  i++;
		  }
		  System.out.println("Test 2 using the byte array [0 1 2 3] and num=4");
		  SignedByte sb1 = new SignedByte(ba, ba.length);
		  System.out.println(sb1.toString());

	  }


	  @Override
	  public void set(MatObject m, int... index) {
		  boolean extend = false;
		  byte val = (byte)((Matrix)m).get(1);
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
			  byte newdata[] = new byte[newn];
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

	  @Override
	  public MatObject get(int... indices) {
		  //offsetvec[i] tells you how much you need to multiply by for index i to go from array indices to linear indices
		  int offsetvec[] = new int[size.length];
		  //Need 1 for the next row, row for the next column, row*column for the next layer...
		  offsetvec[0] = 1;
		  for(int i = 1; i < size.length; i++) {
			  offsetvec[i] = offsetvec[i-1] * size[i-1];
		  }
		  int k = 0;
		  for(int i = 0; i < indices.length; i++) {
			  k += (indices[i]-1) * offsetvec[i];
		  }

		  return new UnsignedByte(data[k]);
	  }
}

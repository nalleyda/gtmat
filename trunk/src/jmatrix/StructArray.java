/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;

import jmatrix.MatObject.Type;
import main.*;

/**
 *
 * @author dsmith
 */
public class StructArray extends MatObject {
    private Structure data[];

    public StructArray() {
        type = Type.STRUCT;
        data = new Structure[0];
    }
    
    public StructArray(int... dims) {
    	super(dims);
    	type = type.STRUCT;
    	int k = 1;
    	for(int i = 0; i < dims.length; i++)
    		k *= dims[i];
    	data = new Structure[k];
    }

    public StructArray(Structure s) {
        this(1,1);
        data[0] = s;
    }

    
    public StructArray(int rows, int cols, Structure... s){
        super(rows, cols);
        copyData(s);
        type = Type.STRUCT;
        checkFields();
    }

    public StructArray(int rows, int cols){
        super(rows, cols);
        if(n > 0) {
            data = new Structure[n];
        } else {
            data = null;
        }
        type = Type.STRUCT;
    }
    
    @Override
    public StructArray clone() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.copyData(data);
        return res;
    }

    public StructArray copy() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.copyData(data);
        return res;
    }

    public StructArray zeroed() {
        StructArray res = new StructArray(size[ROW], size[COL]);
        res.nullData();
        return res;
    }

    public StructArray empty() {
        return new StructArray();
    }

    public void copyValues(Matrix ndx, MatObject src) throws Exception{
        int in = ndx.length();
        int sn = src.length();
        StructArray it = (StructArray) src;
        if(sn == 1) {
            Structure val = it.get(1);
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

    public void copyData(Structure[] s) {
        for(int i = 0; i < n; i++) {
            data[i] = s[i].clone();
        }
    }
    
    public void nullData() {
        for(int i = 0; i < n; i++) {
            data[i] = null;
        }
    }
    
    private String[] name;
    
    private boolean isFound(String str) {
        boolean res = false;
        for(int i = 0; i < name.length; i++) {
            if(str.equals(name[i])) {
                res = true;
                break;
            }
        }
        return res;
    }
    
    private void check(int ndx) {
        String itsName[] = data[ndx].fieldNames();
        if(itsName.length != name.length) {
            throw new RuntimeException("bad number of fields");
        }
        for(int i = 0; i < name.length; i++) {
            if(!isFound(itsName[i])) {
                throw new RuntimeException("bad field name: " + itsName[i]);
            }
        }
    }

    private void checkFields() {
        if(n > 1) {
            name = data[0].fieldNames();
            for(int i = 1; i < n; i++) {
                check(i);
            }
        }
    }
    
    public MatObject getField(String fld) {
        if(n == 1) return data[0].getField(fld);
        else throw new RuntimeException("can't extract from arrays yet");
    }
    
    public void setField(String fld, MatObject o) {
        for(int i = 0; i < n; i++) {
            data[i] = data[i].setField(fld, o);
        }
    }
    
    public void setField(String fld, MatObject o, CellArray ind) {
    	Matrix r, c;
    	if(ind.n > 1) {
    		r = (Matrix) ind.get(1);
    		c = (Matrix) ind.get(2);
    	} else {
    		r = new Matrix(1);
    		c = (Matrix) ind.get(1);
    	}
    	int maxval = (int)((int) r.getMax()*c.getMax());
    	if(maxval > data.length) {
    		Structure newdata[] = new Structure[maxval];
    		for(int i = 0; i < data.length; i++)
    			newdata[i] = data[i];
    		data = newdata;
    	}
    	
    	
		for(int i = 0; i < r.n; i++)
			for(int j = 0; j < c.n; j++) {
				if(data[r.geti(i+1)-1 + (c.geti(j+1)-1)*size[COL]] == null)
					data[r.geti(i+1)-1 + (c.geti(j+1)-1)*size[COL]] = new Structure();
				data[r.geti(i+1)-1 + (c.geti(j+1)-1)*size[COL]] = data[r.geti(i+1)-1 + (c.geti(j+1)-1)*size[COL]].setField(fld, o);
			}
		
		for(int i = 0; i < data.length; i++) {
			if(!data[i].isField(fld))
				data[i] = data[i].setField(fld, new Matrix());
		}
    }
    
    public void setField(int ndx, String fld, MatObject o) {
        data[ndx-1] = data[ndx-1].setField(fld, o);
    }
    
    
    public static Structure get(StructArray m, int r, int c) {
        return m.get(r,c);
    }

    public static Structure get(StructArray m, int i) throws Exception {
        return m.get(i);
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public Structure get(int i) {
       return data[i - 1];
    }
    

    
    public Structure get(int r, int c) {
        return data[(c-1) * size[ROW] + (r-1)];
    }

    public String[] fieldNames() {
        String res[] = new String[0];
        if(n > 0) res = data[0].fieldNames();
        return res;
    }
    
    public boolean isField(String fld) {
        boolean res = false;
        if(n > 0) res = data[0].isField(fld);
        return res;
    }
    
    private void extend(int rw, int cl) {
        if (rw > size[ROW]
                || cl > size[COL]
                || (cl == 1 && rw > size[ROW] * size[COL])) {
            int rm = rw > size[ROW] ? rw : size[ROW];
            int cm = cl > size[COL] ? cl : size[COL];
            Structure nd[] = new Structure[rm * cm];
            for (int r = 1; r <= size[ROW]; r++) {
                for (int c = 1; c <= size[COL]; c++) {
                    Structure d = get(r, c);
                    nd[(c - 1) * rm + (r - 1)] = d;
                }
            }
            data = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }

    public void set(int r, int c, Structure s) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        data[(c-1) * size[ROW] + (r-1)] = s;
    }

    public void set(int i, Structure s) {
        if (i > n) {
            throw new RuntimeException("StructArray:set(i...) i too big");
        }
        ;
        data[i - 1] = s;
    }

    public StructArray hcat(Structure s) {
        return hcat(new StructArray(s));
    }
    
    public StructArray vcat(Structure s) {
        return vcat(new StructArray(s));
    }
    
    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public StructArray hcat(StructArray o) {
        StructArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int ocols = o.size[COL];
        int cols = size[COL];
        if (o.size[ROW] != size[ROW]) {
            throw new RuntimeException("StructArray.hcat bad rows");
        }
        res = new StructArray(rows, cols + ocols);
        // copy all matrices into res
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                res.set(r, c, get(r, c));
            }
            for (int c = 1; c <= ocols; c++) {
                res.set(r, c + cols, o.get(r, c));
            }
        }
        res.checkFields();
        return res;
    }

    /**
     * vertical concatenation Matrix
     * @param m
     * @return
     */
    public StructArray vcat(StructArray ca) {
        StructArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int carows = ca.size[ROW];
        int cols = size[COL];
        if (ca.size[COL] != size[COL]) {
            throw new RuntimeException("StructArray.vcat bad cols");
        }
        res = new StructArray(rows + carows, cols);
        // copy all cells into res
        for (int c = 1; c <= cols; c++) {
            for (int r = 1; r <= rows; r++) {
                res.set(r, c, get(r, c));
            }
            for (int r = 1; r <= carows; r++) {
                res.set(r + rows, c, ca.get(r, c));
            }
        }
        res.checkFields();
        return res;
    }

    @Override
    public String toString() {
        String ret = "";
        if(n == 1) ret = data[0].toString();
        else {
            ret = "" + size[ROW] + "x" + size[COL] + " Structure with fields:\n";
            String fn[] = data[0].fieldNames();
            for (int i = 0; i < fn.length; i++) {
                ret = ret + fn[i] + "\n";
            }
        }
        return ret;
    }
    


	@Override
	public void set(MatObject m, int... index) {
		boolean extend = false;
		Structure val = ((StructArray)m.get(new int[]{1})).get(0);
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
			Structure newdata[] = new Structure[newn];
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
	
	public StructArray index(CellArray ca) {
		int s = ca.n == 1 ? size.length : ca.n;
		int[] newsize = new int[s];
		if(ca.n == 1)
			newsize = size;
		else
			for(int i = 0; i < s; i++) 
				newsize[i] = ca.get(i+1).n;
		Matrix r, c;
		if(ca.n == 1) {
			r = new Matrix(1);
			c = (Matrix) ca.get(1);
		} else {
			r = (Matrix)ca.get(1);
			c = (Matrix)ca.get(2);
		}
		StructArray outval = new StructArray(newsize);
		for(int i = 0; i < r.n; i++)
			for(int j = 0; j < c.n; j++) {
				outval.set(data[r.geti(i+1)-1 + (c.geti(j+1)-1)*newsize[COL]], i+j*newsize[COL]+1);
			}
		return outval;
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
		
		return data[k];
	}
}

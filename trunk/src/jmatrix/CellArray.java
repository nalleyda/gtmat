/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;

/**
 *
 * @author dsmith
 */
public class CellArray extends MatObject {
    private MatObject data[];

    public CellArray() {
        super();
        data = new MatObject[0];
        n = 0;
        type = Type.CELL;
        size = new int[] {0, 0};
    }

    public CellArray(int[] dims){
    	super(dims);
    }
    
    public MatObject[] getData(){
        return data;
    }

    public void setData(MatObject[] cell){
        this.data = cell;
    }

    public CellArray(MatObject[] c){
        this(1, c.length);
        data = c;
    }
    
    
    
    public CellArray(MatObject o) {
        this(1,1);
        data[0] = o;
    }

    
    public CellArray(int rows, int cols, MatObject... d){
        this(rows, cols);
        data = new MatObject[n];
        for(int i = 0; i < n; i++) {
            data[i] = d[i];
        }
    }

    
    public CellArray(int rows, int cols){
        super(rows, cols);
        if(n > 0) {
            data = new MatObject[n];
        } else {
            data = null;
        }
        type = Type.CELL;
    }

    public CellArray empty() {
        return new CellArray();
    }
    
    private void extend(int rw, int cl) {
        if (rw > size[ROW]
                || cl > size[COL]
                || (cl == 1 && rw > size[ROW] * size[COL])) {
            int rm = rw > size[ROW] ? rw : size[ROW];
            int cm = cl > size[COL] ? cl : size[COL];
            MatObject nd[] = new MatObject[rm * cm];
            for (int r = 1; r <= size[ROW]; r++) {
                for (int c = 1; c <= size[COL]; c++) {
                    MatObject o = get(r, c);
                    nd[(c - 1) * rm + (r - 1)] = o;
                }
            }
            data = nd;
            n = rm * cm;
            size[ROW] = rm;
            size[COL] = cm;
        }
    }

    public CellArray copy() {
        return new CellArray(this);
    }

    public CellArray zeroed() {
        return new CellArray(this);
    }

    public static MatObject get(CellArray m, int r, int c) {
        return m.get(r,c);
    }

    public static MatObject get(CellArray m, int i) {
        return m.get(i);
    }

    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        CellArray it = (CellArray) src;
        if(sn == 1) {
            MatObject val = it.get(1);
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
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public MatObject get(int i) {
    	
        return data[i - 1];
    }

    
    public MatObject get(int r, int c) {
        return data[(c-1) * size[ROW] + (r-1)];
    }

    public void set(int r, int c, MatObject m) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        data[(c-1) * size[ROW] + (r-1)] = m;
    }

    public CellArray hcat(MatObject o) {
        return hcat(new CellArray(o));
    }
    
    public CellArray vcat(MatObject o) {
        return vcat(new CellArray(o));
    }
    
    public CellArray hcat(String s) {
        return hcat(new MatString(s));
    }
    /**
     * horizontal concatenation (an array of matrices)
     * @param m
     * @return
     */
    public CellArray hcat(CellArray o) {
        CellArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int ocols = o.size[COL];
        int cols = size[COL];
        if (o.size[ROW] != size[ROW]) {
            throw new RuntimeException("CellArray.hcat bad rows");
        }
        res = new CellArray(rows, cols + ocols);
        // copy all matrices into res
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                res.set(r, c, get(r, c));
            }
            for (int c = 1; c <= ocols; c++) {
                res.set(r, c + cols, o.get(r, c));
            }
        }
        return res;
    }

    /**
     * vertical concatenation Matrix
     * @param m
     * @return
     */
    public CellArray vcat(CellArray ca) {
        CellArray res = null;
        int rows = size[ROW];
        // calculate cols and check rows
        int carows = ca.size[ROW];
        int cols = size[COL];
        if (ca.size[COL] != size[COL]) {
            throw new RuntimeException("CellArray.vcat bad cols");
        }
        res = new CellArray(rows + carows, cols);
        // copy all cells into res
        for (int c = 1; c <= cols; c++) {
            for (int r = 1; r <= rows; r++) {
                res.set(r, c, get(r, c));
            }
            for (int r = 1; r <= carows; r++) {
                res.set(r + rows, c, ca.get(r, c));
            }
        }
        return res;
    }

    public String toString() {
        int rows = size[ROW];
        int cols = size[COL];
        String res;
        MatObject d;
        if(rows > 1) res = "{\n   ";
        else res = "{";
        for(int r = 1; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                d = get(r,c);
                if(d instanceof MatString) {
                    res += " '" + d + "'";
                } else {
                    res += " [" + d + "]";
                }
            }
            if((rows > 1) && (r < rows)) res += "\n   ";
        }
        res += " }";
        return res;
    }
    public String toFormat(){
    	int rows = size[ROW];
        int cols = size[COL];
        String res="{ ";
        MatObject d;
//        if(rows > 1) res = "{\n   ";
//        else res = "{";
        for(int r = 1; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                d = get(r,c);
                
                if(d instanceof MatString) {
                	String matStr=d.toString().trim();
                    res += "'" + matStr + "'";
                } else {
                	
                    res += d ;
                }
                res+=" ";
            }
            if((rows > 1) && (r < rows)) res += ";";
        }
        res += " }\n";
        return res;
    }
/*{ first: 1; second: 2; }
             if(n == 0) return "[]";
        if (rows > 1) {
            res = "[\n   ";
        } else if (cols > 1) {
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
                res += "\n   ";
            }
        }
        if (length() > 1) {
            res += " ]";
        }
 */
    public static void main(String[] args){
        CellArray ca = new CellArray(2, 2, new Matrix(1), new Matrix(2), new Matrix(3), new Matrix(4));
        System.out.println(ca.toFormat());
        
    }

	@Override
	public void set(MatObject m, int... index) {
		boolean extend = false;
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
			MatObject newdata[] = new MatObject[newn];
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
		data[ind] = m;
		
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

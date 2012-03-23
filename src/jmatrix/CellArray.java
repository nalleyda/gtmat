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
    private MatObject cell[];

    public CellArray() {
        super();
        cell = new MatObject[0];
        n = 0;
        type = Type.CELL;
        size = new int[] {0, 0};
    }

    public MatObject[] getData(){
        return cell;
    }

    public void setData(MatObject[] data){
        this.cell = data;
    }

    public CellArray(MatObject[] data){
        this(1, data.length);
        cell = data;
    }
    
    
    
    public CellArray(MatObject o) {
        this(1,1);
        cell[0] = o;
    }

    
    public CellArray(int rows, int cols, MatObject... data){
        this(rows, cols);
        cell = new MatObject[n];
        for(int i = 0; i < n; i++) {
            cell[i] = data[i];
        }
    }

    
    public CellArray(int rows, int cols){
        super(rows, cols);
        if(n > 0) {
            cell = new MatObject[n];
        } else {
            cell = null;
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
            cell = nd;
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
    	
        return cell[i - 1];
    }

    
    public MatObject get(int r, int c) {
        return cell[(c-1) * size[ROW] + (r-1)];
    }

    public void set(int r, int c, MatObject m) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        cell[(c-1) * size[ROW] + (r-1)] = m;
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
        String res="{";
        MatObject d;
//        if(rows > 1) res = "{\n   ";
//        else res = "{";
        for(int r = 1; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                d = get(r,c);
                if(d instanceof MatString) {
                    res += "" + d + "";
                } else {
                    res += "" + d + "";
                }
            }
            if((rows > 1) && (r < rows)) res += ";";
        }
        res += " }\n";
        return res;
    }
/*
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
}

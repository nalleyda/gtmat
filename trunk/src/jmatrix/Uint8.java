/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmatrix;

import java.awt.image.BufferedImage;

/**
 *
 * @author dsmith
 */
public class Uint8 extends MatObject {

    private BufferedImage data;  // natural image storage

    /* Constructors */
    /**
     * empty
     */
    public Uint8() {
        super();
        data = null;
        type = Type.UINT8;
    }

    /**
     * clone an image
     * @param v
     */
    public Uint8(int rows, int cols) {
        super(rows, cols, 3);
        data = new BufferedImage(cols, rows, BufferedImage.TYPE_INT_RGB);
        type = Type.UINT8;
    }

    /**
     * clone an image
     * @param v
     */
    public Uint8(Uint8 v) {
        this(v.data.getHeight(), v.data.getWidth());
        for (int r = 0; r < size[ROW]; r++) {
            for (int c = 0; c < size[COL]; c++) {
                data.setRGB(c, r, v.data.getRGB(c, r));
            }
        }
    }
    public Uint8(Uint8 v, int init) {
        this(v.data.getHeight(), v.data.getWidth());
        for (int r = 0; r < size[ROW]; r++) {
            for (int c = 0; c < size[COL]; c++) {
                data.setRGB(c, r, init);
            }
        }
    }
    /**
     * clone an image
     * @param v
     */
    public Uint8(BufferedImage bi) {
        this(bi.getHeight(), bi.getWidth());
        for (int r = 0; r < size[ROW]; r++) {
            for (int c = 0; c < size[COL]; c++) {
                data.setRGB(c, r, bi.getRGB(c, r));
            }
        }
    }
    
    public Uint8 sizeTo(int w, int h) {
        int pw = data.getWidth();
        int ph = data.getHeight();
        Uint8 res = new Uint8(h, w);
        Matrix cndx = Matrix.linspace(1, pw, w);
        Matrix rndx = Matrix.linspace(1, ph, h);
        for(int c = 1; c <= w; c++) {
            for(int r = 1; r <= h; r++) {
                int val = get((int) rndx.get(r), (int) cndx.get(c));
                res.set(r, c, val);
            }
        }
        return res;
    }

    @Override
    public Uint8 clone() {
        return new Uint8(this);
    }
    
    public Uint8 copy() {
        return new Uint8(this);
    }
    
    public Uint8 zeroed() {
        return new Uint8(this, 0);
    }
    
    public Uint8 empty() {
        return new Uint8();
    }

    public BufferedImage getData() {
        return data;
    }

    public int getWidth() {
        return data.getWidth();
    }
    public int getHeight() {
        return data.getHeight();
    }
    
    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        Uint8 it = (Uint8) src;
        if(sn == 1) {
            int val = (int) it.get(1);
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, val);
            }
        } else {
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, (int) it.get(i));
            }
        }
    }

    public static Uint8 get(Uint8 it, Matrix ri, Matrix ci) {
        Uint8 res = new Uint8(ri.n, ci.n);
        for(int r = 1; r <= ri.n; r++) {
            for(int c = 1; c <= ci.n; c++) {
                int val = it.get((int) ri.get(r), (int) ci.get(c));
                res.set(r, c, val);
            }
        }
        return res;
    }
    
    private static int sortClrs(int v, int ci[]) {
        int res = 0;
        for(int i = 0; i < 3; i++) {
            if(ci[i] > 0) {
                int clr = getClr(ci[i], v);
                switch(i) {
                    case 0:  // load the red
                        res |= clr << 16;
                        break;
                    case 1:  // load the green
                        res |= clr << 8;
                        break;
                    case 2:  // load the blue
                        res |= clr;
                        break;
                }
            }
        }
        return res;
    }
    
    private static int[] getClrNdcs(Matrix m) {
        int res[] = new int[3];
        for(int i = 0; i < 3; i++) {
            if(i < m.n) res[i] = (int) m.get(i+1);
            else res[i] = 0;
        }
        return res;
    }
    
    public static Uint8 get(Uint8 it, Matrix ri, Matrix ci, Matrix cli) {
        if(cli.isAll()) return get(it, ri, ci);
        Uint8 res = new Uint8(ri.n, ci.n);
        int cnx[] = getClrNdcs(cli);
        for(int r = 1; r <= ri.n; r++) {
            for(int c = 1; c <= ci.n; c++) {
                int val = it.get((int) ri.get(r), (int) ci.get(c));
                int nv = sortClrs(val, cnx);
                res.set(r, c, nv);
            }
        }
        return res;
    }
    
    
    /**
     * get a pixel from an image
     * @param r - the row  [offset 1]
     * @param c - the column
     * @return
     */
    public int get(int r, int c) {
        return data.getRGB(c-1, r-1);
    }

    /**
     * get a color value from an image
     * @param r - the row  [offset 1]
     * @param c - the column
     * @param clr - the color
     * @return
     */
    public static int getClr(int cl, int pix) {
        int res = 0;
        switch (cl) {
            case 1:  // r
                res = (pix >> 16) & 0xff;
                break;
            case 2:  // g
                res = (pix >> 8) & 0xff;
                break;
            case 3:  // b
                res = pix & 0xff;
                break;
        }
        return res;
    }

    public void extend(int rows, int cols) {
        BufferedImage newData = new BufferedImage(cols, rows, BufferedImage.TYPE_INT_RGB);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                newData.setRGB(c, r, data.getRGB(c, r));
            }
        }
        data = newData;
        size[ROW] = rows;
        size[COL] = cols;
        size[CLR] = 3;
        n = rows * cols * 3;
    }

    /**
     * set a pixel in a matrix
     * @param r - the row
     * @param c - the column
     * @param val - the value
     */
    public void set(int r, int c, int val) {
        if (r > size[ROW]) {
            extend(r, size[COL]);
        }
        if (c > size[COL]) {
            extend(size[ROW], c);
        }
        data.setRGB(c-1, r-1, val);
    }

    /**
     * get from a linearized matrix
     * @param i - the index (offset 1)
     * @return
     */
    public double get(int i) {
        return 0; //data[i - 1];
    }

    /**
     * set a value in a linearized array
     * @param i
     * @param val
     */
    public void set(int i, int val) {
        if (i > n) {
            throw new RuntimeException("Uint8:set(i...) i too big");
        };
        val = val & 0XFF;
        // data[i - 1] = val;
    }

    /**
     * horizontal concatenation (an array of uint8's)
     * @param m
     * @return
     */
    public static Uint8 hcat(Uint8[] u) {
        Uint8 res;
        int cols = 0;
        int rows = u[0].size[ROW];
        int col = 0;
        // calculate cols and check rows
        for (int i = 0; i < u.length; i++) {
            cols += u[i].size[COL];
            if (u[i].size[ROW] != rows) {
                throw new RuntimeException("Matrix.hcat bad rows in item " + i);
            }
        }
        res = new Uint8(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < u.length; i++) {
            Uint8 it = u[i];
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
     * vertical concatenation (array of uint8's)
     * @param m
     * @return
     */
    public static Uint8 vcat(Uint8[] m) {
        Uint8 res;
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
        res = new Uint8(rows, cols);
        // copy all matrices into res
        for (int i = 0; i < m.length; i++) {
            Uint8 it = m[i];
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
     * zeros
     * @param rows
     * @param cols
     * @return
     */
    public static Uint8 zeros(int rows, int cols) {
        Uint8 res = new Uint8(rows, cols);
        for (int r = 0; r < res.size[ROW]; r++) {
            for (int c = 0; c < res.size[COL]; c++) {
                res.set(r, c, 0);
            }
        }
        return res;
    }

    /**
     * ones
     * @param rows
     * @param cols
     * @return
     */
    public static Uint8 ones(int rows, int cols) {
        Uint8 res = new Uint8(rows, cols);
        for (int r = 0; r < res.size[ROW]; r++) {
            for (int c = 0; c < res.size[COL]; c++) {
                res.set(r, c, 0X010101);
            }
        }
        return res;
    }

    /**
     * rand
     * @param rows
     * @param cols
     * @return
     */
    public static Uint8 rand(int rows, int cols) {
        Uint8 res = new Uint8(rows, cols);
        for (int r = 0; r < res.size[ROW]; r++) {
            for (int c = 0; c < res.size[COL]; c++) {
                int val = (int) (256 * Math.random());
                res.set(r, c, val);
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
        String res = "Uint8 w*h = " + cols + "*" + rows;
        return res;
    }

	@Override
	public void set(MatObject m, int... indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MatObject get(int... indices) {
		// TODO Auto-generated method stub
		return null;
	}
}

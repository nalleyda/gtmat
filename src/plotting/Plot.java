/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plotting;

import main.Main;
import jmatrix.*;
import main.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
/**
 *
 * @author dsmith
 */
public class Plot extends Plots {

    public static final int NONE = 1;
    public static final int PLOT_2 = 2;
    public static final int PLOT_3 = 3;
    public static final int MESH = 4;
    public static final int SURF = 5;
    public static final int FLAT = 6;
    public static final int INTERP = 7;
    public static final int IMSHOW = 8;
    public static final int IMAGE = 9;
    public static final int TEXT = 10;
    public static final String name[] = {
        "ZERO",
        "NONE",
        "PLOT_2",
        "PLOT_3",
        "MESH",
        "SURF",
        "FLAT",
        "INTERP",
        "IMSHOW",
        "IMAGE",
        "TEXT"
    };
    
    public Matrix x;
    public Matrix y;
    public Matrix z;
    private Color color;
    private boolean doLine;
    private boolean doSymb;
    private String symbol;
    public int type = NONE;
    protected Figure myFig;
    private String theString;
    public SubPlot hostSubplot = null;
    protected ColorMap colormap;  // only for COLOR plot type
                                  // everyone else uses subplot's color

    public Plot() {
        myFig = Figure.getCurrent();
    }

    public Plot(int type, Matrix y) throws Exception {
        this(type, Matrix.colon(1, y.length()), y, "b");
    }
    
    public Plot(int type, Matrix y, String clr) throws Exception {
        this(type, Matrix.colon(1, y.length()), y, clr);
    }

    public Plot(int type, Matrix x, Matrix y) throws Exception {
        this(type, x, y, "b");
    }

    public Plot(int type, Matrix xv, Matrix yv, String clrStr) throws Exception {
        myFig = Figure.getCurrent();
        x = new Matrix(xv);
        y = new Matrix(yv);
        z = null;
        setPlot(type, clrStr);
        Matrix keep = Matrix.isNotNaN(y);
        if(keep.n != x.n) {
            x = x.index(keep);
            y = y.index(keep);
        }
    }
    
    public Plot(int type, Matrix xv, Matrix yv, Matrix zv, String clrStr) throws Exception {
        x = new Matrix(xv);
        y = new Matrix(yv);
        z = new Matrix(zv);
        myFig = Figure.getCurrent();
        if(type == TEXT) {
            theString = clrStr;
            color = Color.black;
            this.type = type;
        } else {
            setPlot(type, clrStr);
            Matrix keep = Matrix.isNotNaN(y).or(Matrix.isNotNaN(z));
            if(keep.n != x.n) {
                x = x.index(keep);
                y = y.index(keep);
                z = z.index(keep);
            }
        }
    }
    
    private void setPlot(int type, String str) {
        color = Color.blue;
        doLine = true;
        doSymb = false;
        symbol = "";
        this.type = type;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch(ch) {
                case 'r':
                    color = Color.red;
                    break;
                case 'g':
                    color = Color.green;
                    break;
                case 'b':
                    color = Color.blue;
                    break;
                case 'c':
                    color = Color.cyan;
                    break;
                case 'y':
                    color = Color.yellow;
                    break;
                case 'm':
                    color = Color.magenta;
                    break;
                case 'w':
                    color = Color.white;
                    break;
                case 'k':
                    color = Color.black;
                    break;
                case '-':
                    doLine = true;
                    break;
                case '.':
                case 'o':
                case 's':
                case '^':
                case 'v':
                case '*':
                    char ar[] = new char[1];
                    ar[0] = ch;
                    doSymb = true;
                    doLine = false;
                    symbol = new String(ar);
                    break;
            }
        }
    }


    public boolean is_2D() {
        boolean res = (type == PLOT_2) || (type == IMAGE) || (type == IMSHOW);
        return res;
    }
    
    private Matrix transform(int ndx, Axes ax) throws Exception {
        return ax.transform(x.get(ndx), y.get(ndx));
    }

    private Matrix transform3(int ndx, Axes ax) throws Exception {
        return ax.transform(x.get(ndx), y.get(ndx), z.get(ndx));
    }

    public void draw(Graphics g, Axes ax) throws Exception {
        switch(type) {
            case PLOT_2:
                draw2(g, ax);
                break;
            case PLOT_3:
                draw3(g, ax);
                break;
            case TEXT:
                showText(g, ax);
                break;
        }
    }


    private void showText(Graphics g, Axes ax) throws Exception {
        g.setColor(color);
        Matrix at = transform3(1, ax);
        g.drawString(theString, at.geti(1), at.geti(2));
    }
    
    
    private void draw2(Graphics g, Axes ax) throws Exception {
        int chBk = 0;
        int chDn = 0;
        if(doSymb) {
            g.setFont(Axes.normalFont);
            FontMetrics fm = g.getFontMetrics();
            chBk = fm.charWidth(symbol.charAt(0))/2;
            chDn = fm.getHeight()/2;
        }
        g.setColor(color);
        Matrix from = transform(1, ax);
        Matrix to;
        if(doSymb) g.drawString(symbol, (int) from.get(1)-chBk,
                                        (int) from.get(2)+chDn - 5);
        for(int i = 2; i <= x.n; i++) {
            to = transform(i, ax);
            if(doLine) g.drawLine((int) from.get(1), (int) from.get(2),
                                  (int) to.get(1),   (int) to.get(2));
            if(doSymb) g.drawString(symbol, (int) to.get(1) - chBk,
                                            (int) to.get(2) + chDn - 5);
            from = to;
        }
    }
    private void draw3(Graphics g, Axes ax) throws Exception {
        int chBk = 0;
        int chDn = 0;
        if(doSymb) {
            g.setFont(Axes.normalFont);
            FontMetrics fm = g.getFontMetrics();
            chBk = fm.charWidth(symbol.charAt(0))/2;
            chDn = fm.getHeight()/2;
        }
        g.setColor(color);
        Matrix from = transform3(1, ax);
        Matrix to;
        if(doSymb) g.drawString(symbol, (int) from.get(1)-chBk,
                                        (int) from.get(2)+chDn);
        for(int i = 2; i <= x.n; i++) {
            to = transform3(i, ax);
            if(doLine) g.drawLine((int) from.get(1), (int) from.get(2),
                                  (int) to.get(1),   (int) to.get(2));
            if(doSymb) g.drawString(symbol, (int) to.get(1) - chBk,
                                            (int) to.get(2) + chDn);
            from = to;
        }
    }
    
    public String toString() {
        return "Plot type " + name[type];
    }
}

/*
 * Container for one plot / plot3 / surf data
 */

package plotting;

import jmatrix.*;
import main.*;

/**
 *
 * @author dsmith
 */
public class Plots {

    public static void axis(boolean on) {
         Figure.setAxes(on);
    }

    public static void hold(boolean on) {
         Figure.setHold(on);
    }

    public static void grid(boolean on) {
         Figure.setGrid(on);
    }

    public static void plot(int type, Matrix x, Matrix y, String str) {
        Figure myFig = Figure.getCurrent();
        Figure.setAngles(0, 90);
        myFig.add(new Plot(type, x, y, str));
    }
    
    
    public static void text(Matrix x, Matrix y, Matrix z, String str) {
        Figure myFig = Figure.getCurrent();
        myFig.add(new Plot(Plot.TEXT, x, y, z, str));
    }
    
    
    public static void plot3(Matrix x, Matrix y, Matrix z, String str) {
        Figure myFig = Figure.getCurrent();
        Figure.setAngles(45, 30);
        myFig.add(new Plot(Plot.PLOT_3, x, y, z, str));
    }
 /* 
     * size the plot to fit the image
     * and no axes
*/
   
    public static MatObject image(Uint8 img) {
        Uint8 it = img.sizeTo(Figure.PLOT_WIDTH, Figure.PLOT_HEIGHT);
        Figure myFig = Figure.getCurrent();
        Figure.setAngles(0, 90);
        myFig.add(new ImagePlot(Plot.IMSHOW, it));
        return new Matrix(1);
    }
    
 /*
     * stretch the image to standard
     * plot and added axes
*/
    public static MatObject imshow(Uint8 img) {
        Uint8 it = img;
        int mw = img.getWidth();
        int mh = img.getHeight();
        int scl;
        double factw, facth;
        if(mw > Figure.PLOT_WIDTH || mh > Figure.PLOT_HEIGHT) {
            factw = (double) mw / Figure.PLOT_WIDTH;
            facth = (double) mh / Figure.PLOT_HEIGHT;
            if(facth > factw) factw = facth;
            scl = (int) (factw+1);
            mw = mw/scl;
            mh = mh/scl;
            it = img.sizeTo(mw, mh);
        }
        Figure myFig = Figure.getCurrent();
        Figure.setAngles(0, 90);
        myFig.add(new ImagePlot(Plot.IMAGE, it));
        return new Matrix(1);
    }
    
/*
     * put a vertical skirt all around the plot
     *  - make each xx, yy, zz two rows and cols bigger
     *  - make the first xx, yy rows and cols equal the second
     *  - make the last xx, yy rows and cols equal end-1
     *  - make the zz frame = 0;
     */
    public static void meshz(Matrix xx, Matrix yy, Matrix zz) {
        int rows = xx.rows();
        int cols = xx.cols();
        Matrix nxx = Matrix.zeros(rows+2, cols+2);
        Matrix nyy = Matrix.zeros(rows+2, cols+2);
        Matrix nzz = Matrix.zeros(rows+2, cols+2);
        for(int r = 1; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                Matrix.set(nxx, r+1, c+1, Matrix.get(xx, r, c));
                Matrix.set(nyy, r+1, c+1, Matrix.get(yy, r, c));
                Matrix.set(nzz, r+1, c+1, Matrix.get(zz, r, c));
            }
            Matrix.set(nxx, r+1, 1, Matrix.get(nxx, r+1, 2));
            Matrix.set(nxx, r+1, cols+2, Matrix.get(nxx, r+1, cols+1));
            Matrix.set(nyy, r+1, 1, Matrix.get(nyy, r+1, 2));
            Matrix.set(nyy, r+1, cols+2, Matrix.get(nyy, r+1, cols+1));
        }
        for(int c = 1; c <= (cols+2); c++) {
            Matrix.set(nxx, 1, c, Matrix.get(nxx, 2, c));
            Matrix.set(nxx, rows+2, c, Matrix.get(nxx, rows+1, c));
            Matrix.set(nyy, 1, c, Matrix.get(nyy, 2, c));
            Matrix.set(nyy, rows+2, c, Matrix.get(nyy, rows+1, c));
        }
        mesh(nxx, nyy, nzz);
    }


    public static void mesh(Matrix xx, Matrix yy, Matrix zz) {
        Figure myFig = Figure.getCurrent();
        myFig.add(new MeshPlot(Plot.MESH, xx, yy, zz, null, myFig.currentSubplot));
        Figure.setAngles(45, 20);
    }

    public static void surf(Matrix xx, Matrix yy, Matrix zz, Matrix clr) {
        Figure myFig = Figure.getCurrent();
        myFig.add(new MeshPlot(Plot.SURF, xx, yy, zz, clr, myFig.currentSubplot));
        Figure.setAngles(45, 20);
    }

    public static void view(Matrix az, Matrix el) {
        Figure.setAngles(az.get(1), el.get(1));
    }
    
    public static void view(double az, double el) {
        Figure.setAngles(az, el);
    }

    public static void legend(String str[]) {
        Figure.setLegends(str);
    }
    
    public static void setColorMap(String name) {
        Figure myFig = Figure.getCurrent();
        myFig.currentSubplot.curr_colormap = ColorMap.getMap(name);
//        Main.debug.println("Color map is " +  myFig.currentSubplot.curr_colormap);
    }
}

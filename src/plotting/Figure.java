/*
 * 
 */
package plotting;

import jmatrix.*;
import main.Main;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import java.awt.image.BufferedImage;

/**
 *
 * @author dsmith
 */
public class Figure {
    /*
     * static containers for all figures
     */

    public static final int PLOT_WIDTH = 800;
    public static final int PLOT_HEIGHT = 600;
    private static ArrayList<Figure> figures = new ArrayList();
    public static Figure currentFig = null;
    public static SubPlot currentSubplot = null;
    public static SubPlot mousedSubplot = null;
    private static Point lastLocation = null;
    public ArrayList<SubPlot> subplots = null;
    public boolean showing;
    public int figNum;
    public GT_Frame frame;
    public int subPlotRows;
    public int subPlotCols;
    private int subPlotNdx;
    public Graphics graphics;

    public Figure() {
        frame = null;
        showing = false;
        subPlotRows = 1;
        subPlotCols = 1;
        subPlotNdx = 1;
        showing = false;
        subplots = new ArrayList();
        subplots.add(new SubPlot(0, 0, 1, 1));
        currentSubplot = subplots.get(0);
        currentSubplot.curr_colormap = currentSubplot.base_colormap;
        mousedSubplot = currentSubplot;
    }

    public static void figure() {
        figures.add(new Figure());
        currentFig = figures.get(figures.size() - 1);
        currentSubplot = currentFig.subplots.get(0);
        mousedSubplot = currentSubplot;
        currentSubplot.base_colormap = ColorMap.getMap("jet");
    }

    public static void close(int n) {
        figures = new ArrayList();
        currentFig = null;
        currentSubplot = null;
        mousedSubplot = null;
        lastLocation = null;
    }
    
    public static void setFigure(Figure fig) {
        currentFig = fig;
    }

    public static void setHidden(boolean state) {
        currentSubplot.hidden = state;
    }

    public static void setColorbar(boolean on) {
        currentSubplot.colorbar = on;
    }

    public static boolean getColorbar() {
        return currentSubplot.colorbar;
    }

    public static void setColorRange(double mn, double mx) {
        currentSubplot.minColor = mn;
        currentSubplot.maxColor = mx;
    }

    public static void setShading(int value) {
        currentSubplot.shading = value;
    }

    public static int getShading() {
        return currentSubplot.shading;
    }

    public static void setAxes(boolean on) {
        currentSubplot.axes.drawAxes = on;
    }

    public static void setHold(boolean on) {
        currentSubplot.hold = on;
    }

    public static void setGrid(boolean on) {
        currentSubplot.grid = on;
    }

    public static void setAngles(double a, double e) {
        currentSubplot.axes.setAngles(a, e);
    }

    public static void setLegends(String stra[]) {
        currentSubplot.legends = stra;
    }

    public static Matrix title(MatString mst) {
        currentSubplot.axes.title = mst.toString();
        return new Matrix(1);
    }

    public static Matrix xlabel(MatString mst) {
        currentSubplot.axes.xlabel = mst.toString();
        return new Matrix(1);
    }

    public static Matrix ylabel(MatString mst) {
        currentSubplot.axes.ylabel = mst.toString();
        return new Matrix(1);
    }

    public static Matrix zlabel(MatString mst) {
        currentSubplot.axes.zlabel = mst.toString();
        return new Matrix(1);
    }

    public static Figure get(int n) {
        if (n < 1 || n > figures.size()) {
            throw new RuntimeException("Figure.get index out of bounds");
        }
        return figures.get(n - 1);
    }

    public static Figure getCurrent() {
        if (currentFig == null) {
            if (figures.isEmpty()) {
                figure();
            } else {
                currentFig = figures.get(figures.size() - 1);
            }
        }
        return currentFig;
    }

    public void resetAxes() {
        for (int i = 0; i < subplots.size(); i++) {
            SubPlot sp = subplots.get(i);
//            sp.axes.mode = Axes.NONE;
            sp.axes.reset();
        }
    }

    public void setAxisDraw(boolean on) {
        currentSubplot.axes.drawAxes = on;
    }

    public void setAxisMode(int mode) {
        currentSubplot.axes.mode = mode;
    }

    public boolean isHidden() {
        return currentSubplot.hidden;
    }

    public void add(Plot p) {
        if (!currentSubplot.hold && p.type != Plot.TEXT) {
            currentSubplot.plots = new ArrayList();
        }
        currentSubplot.plots.add(p);
        makePlot(PLOT_WIDTH, PLOT_HEIGHT);
    }

    public void makePlot(int w, int h) {
        if (!showing) {
            figNum = figures.size();  // we are guaranteed that a figure exists
            frame = new GT_Frame(this, "Figure " + figNum);
            frame.setSize(w, h);
            if (lastLocation == null) {
                frame.setLocationRelativeTo(null);
            } else {
                frame.setLocation(lastLocation.x + 25, lastLocation.y + 25);
            }
            lastLocation = frame.getLocation();
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.addWin(new PlotWindow(this));
            frame.setVisible(true);
            showing = true;
        }
    }

    public static Matrix subplot(Matrix rm, Matrix cm, Matrix nm) {
        if (currentFig == null) {
            if (figures.isEmpty()) {
                figure();
            } else {
                currentFig = figures.get(figures.size() - 1);
            }
        }
        Figure fig = currentFig;
        int sr = (int) rm.get(1);
        int sc = (int) cm.get(1);
        fig.subPlotNdx = (int) nm.get(1);
        double rf = 1 / rm.get(1);
        double cf = 1 / cm.get(1);
        double or = 1 - rf;
        double oc = 0;
        if (sr != fig.subPlotRows || sc != fig.subPlotCols) {
            int n = fig.subPlotRows * fig.subPlotCols;
            for (int i = 0; i < n; i++) {
                SubPlot sp = fig.subplots.get(i);
                sp.setBounds(or, oc, rf, cf);
                oc += cf;
                if (oc > 1 - cf) {
                    oc = 0;
                    or -= rf;
                }
            }
            fig.subPlotRows = sr;
            fig.subPlotCols = sc;
            int newn = sr * sc;
            for (int i = n; i < newn; i++) {
                fig.subplots.add(new SubPlot(or, oc, rf, cf));
                oc += cf;
                if (oc > 1 - cf) {
                    oc = 0;
                    or -= rf;
                }
            }
        }
        currentSubplot = fig.subplots.get(fig.subPlotNdx - 1);
        mousedSubplot = currentSubplot;
        return new Matrix(1);
    }

    public void grid(boolean state) {
        currentSubplot.grid = state;
    }

    public void hold(boolean state) {
        currentSubplot.hold = state;
    }

    public static void main(String[] args) {
        Matrix result = subplot(new Matrix(1), new Matrix(1), new Matrix(1));
    }
}

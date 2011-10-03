/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plotting;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import main.Main;
/**
 *
 * @author dsmith
 */
public class SubPlot extends JPanel {

    public Axes axes;
    public boolean grid;
    public boolean hold;
    public boolean hidden;
    public String legends[] = null;
    public ColorMap base_colormap;
    public ColorMap curr_colormap;
    public int shading;
    public boolean colorbar;
    public ArrayList<Plot> plots = new ArrayList();
    private static final Font normalFont = new Font("Monospaced", Font.PLAIN, 12);
    private boolean initialized = false;
    public double minColor, maxColor;

    public SubPlot(double orow, double ocol, double rfract, double cfract) {
        axes = new Axes(this);
        hold = false;
        grid = false;
        colorbar = false;
        hidden = true;
        shading = 0;
        base_colormap = ColorMap.getMap("jet");
        curr_colormap = base_colormap;
        setBounds(orow, ocol, rfract, cfract);
    }

    public void setBounds(double orow, double ocol, double rfract, double cfract) {
        axes.origRow = orow;
        axes.origCol = ocol;
        axes.rowFract = rfract;
        axes.colFract = cfract;
        initialized = false;
//        Main.debug.println("origin = [ " + orow + ", " + ocol + " ]; " +
//                "fractions are [" + rfract + ", " + cfract + "]");
    }

    public void setInitialized(boolean st) {
        initialized = st;
    }

    public void draw(Graphics g, Dimension d) {
        axes.screen = d;
        if (!initialized) {
            axes.setLimits(plots);
            initialized = true;
        }
//        curr_colormap = base_colormap;
        axes.makeRotationMatrix();
        // Do all drawing
        // establish the axis locations but don't draw anything
        axes.draw(g, false, false);
        g.setColor(Color.black);
        g.setFont(normalFont);
        if (axes.drawAxes) {
            axes.draw(g, true, grid);
        }
        for (int i = 0; i < plots.size(); i++) {
            Plot pl = plots.get(i);
            pl.draw(g, axes);
//            Main.debug.println("draw plot " + pl);
        }
        if(colorbar) {
            ColorMap cm = curr_colormap;
            cm.drawBar((Graphics2D) g, axes);
        }
    }
    
    public void drawText(BufferedImage bi, Dimension d) {
        try {
            axes.drawTitle(bi, d);
            axes.drawXLabel(bi);
            axes.drawYLabel(bi);
            axes.drawZLabel(bi);
        } catch(Exception e) {}
    }
    
}

/*
 * One segment of a mesh or surf plot
 */
package plotting;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Paint;
import jmatrix.*;
import main.*;

/**
 *
 * @author dsmith
 */
public class Patch {

    public static final int ALL = 0;
    public static final int NOT_TOP = 1;
    public static final int NOT_LEFT = 2;
    public static final int NOT_TOP_LEFT = 3;
    public static int o0[] = {0, 1, 2, 3};
    public static int o1[] = {1, 2, 3, 0};
    public static int outs = 0;
    private boolean doLine[];
    private double x[];
    private double y[];
    private double z[];
    public Matrix coords[];
    public Color clrs[];
    private int type;  // MESH or SURF
    private boolean do_lines;
    public int numCoords;
    private static int ID = 0;
    private int myID = 0;
    private boolean showIt;

    // sequence is top, right, bottom, left
    public Patch(int stype, int ptype, boolean lines_on,
            double ix[], double iy[], double iz[],
            Color clrs[]) {
        do_lines = lines_on;
        myID = ID++;
        showIt= false;
        if(showIt) {
            Main.debug.println("made patch " + myID);
        }
        this.clrs = new Color[clrs.length];
        for (int i = 0; i < clrs.length; i++) {
            this.clrs[i] = clrs[i];
        }
        numCoords = ix.length;
        x = new double[numCoords];
        y = new double[numCoords];
        z = new double[numCoords];
        type = stype;
        for (int i = 0; i < numCoords; i++) {
            x[i] = ix[i];
            y[i] = iy[i];
            z[i] = iz[i];
        }
        doLine = new boolean[4];
        doLine[0] = false;
        doLine[3] = false;
        doLine[1] = true;
        doLine[2] = true;
        switch (ptype) {
            case ALL:
                doLine[0] = true;
            case NOT_TOP:
                doLine[3] = true;
            case NOT_TOP_LEFT:
                break;
            case NOT_LEFT:
                doLine[0] = true;
                break;
        }

    }

    public void setCoords(Matrix ma[]) {
        coords = new Matrix[numCoords];
        for (int i = 0; i < numCoords; i++) {
            coords[i] = new Matrix(ma[i]);
        }
    }

    public Matrix fetch(int i) {
        return new Matrix(x[i], y[i], z[i]);
    }

    public void draw(Graphics2D g2) {
        draw(g2, coords, true);
    }

    public void draw(Graphics2D g2, Matrix m[], boolean hide) {
        // m contains x,y,z coords of tl, tr, br, bl

        Paint was = g2.getPaint();
        if (hide) {
            int xp[] = {m[0].geti(1), m[1].geti(1), m[2].geti(1), m[3].geti(1)};
            int yp[] = {m[0].geti(2), m[1].geti(2), m[2].geti(2), m[3].geti(2)};
            switch (type) {
                case Plot.MESH:
                    g2.setPaint(Color.white);
                    break;
                case Plot.SURF:
                    GradientPaint gp =
                            new GradientPaint(m[4].geti(1), m[4].geti(2), clrs[0],
                            m[5].geti(1), m[5].geti(2), clrs[1]);
                    g2.setPaint(gp);
                    break;
            }
            g2.fillPolygon(xp, yp, 4);
            if(showIt) {
                g2.setColor(Color.BLACK);
                g2.drawString("" + myID, xp[0], yp[0]);
            }
        }
        for (int i = 0; do_lines && i < 4; i++) {
            if (doLine[i]) {
                int x0 = m[o0[i]].geti(1);
                int y0 = m[o0[i]].geti(2);
                int x1 = m[o1[i]].geti(1);
                int y1 = m[o1[i]].geti(2);
                switch (type) {
                    case Plot.MESH:
                        g2.setPaint(clrs[i]);
                        break;
                    case Plot.SURF:
                        g2.setPaint(Color.black);
                        break;
                }
                g2.drawLine(x0, y0, x1, y1);
            }
        }
        g2.setPaint(was);
    }
}

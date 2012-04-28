/*
 * Storage for a set of axes
 */
package plotting;

import java.awt.Color;
import main.Main;
import jmatrix.*;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.Dimension;
import java.lang.RuntimeException;
import java.lang.reflect.InvocationTargetException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.FontMetrics;
import java.awt.image.BufferedImage;

import functions.*;

/**
 *
 * @author dsmith
 */
public class Axes {

    public Matrix scale;  //  scale of the [x y z] axes
    public Matrix offset; // offset of the [x y z] axes
    public Matrix center; // center of the [x y z] axes
    private Matrix Pmin;
    private Matrix Pmax;
    private double macroScale;
    private boolean is2D;
    private static final int TEXT_MARGIN = 25;
    public Dimension screen;
    // Transformations
    private Matrix rotMat; // rotation matrix
    private Matrix points[];
    // mouse modes
    public static final int NONE = -1;
    public static final int PAN = 2;
    public static final int ZOOM = 3;
    public static final int ROTATE = 4;
    public int mode = ROTATE;
    // mouse control variables
    private int baseX;
    private int baseY;
    private Matrix baseOffset;
    private double baseMacroScale;
    private double baseAz;
    private double baseEl;
    private double azr, elr;
//    private double origazr, origelr;
    public String toolString = "";
    public boolean zoomed = false;
    public double origRow, origCol;  // origin as fractions of height, width
    public double rowFract, colFract; // scale as fractions of height, width
    public String title;
    public String xlabel;
    public String ylabel;
    public String zlabel;
    public BufferedImage titleBuff;
    public BufferedImage xlabelBuff;
    public BufferedImage ylabelBuff;
    public BufferedImage zlabelBuff;
    public boolean drawAxes;
    private static final int IX = 1;
    private static final int IY = 2;
    private static final int IZ = 3;
    private int tw, th;
    private int xw, xh, yw, yh, zw, zh;
    private int nxTicks, nyTicks, nzTicks;
    private int px[], py[];
    private Matrix mi[];
    private BasicStroke dashes;
    private final static float dash1[] = {10.0f};;
//    double minx, miny, maxx, maxy;
    public static final Font normalFont = new Font("Monospaced", Font.PLAIN, 11);
    public static Dimension axisPts[] = new Dimension[6];
    /* these are the locations on the screen of the ends of the axes as drawn */
    public int width, height;
    public SubPlot mySubplot;
    
    public Axes(SubPlot sp) {
        reset();
        mySubplot = sp;
        title = null;
        titleBuff = null;
        xlabel = null;
        xlabelBuff = null;
        ylabel = null;
        ylabelBuff = null;
        zlabel = null;
        zlabelBuff = null;
    }

    public Axes(Matrix m, SubPlot sp) {
        this(sp);
        if (m.size[MatObject.ROW] != 1 || m.size[MatObject.COL] != 6) {
            throw new RuntimeException("Axes.Axes must have vector of size 6");
        }
        Pmin = Set.set(Pmin, 1, m.get(1));
        Pmax = Set.set(Pmax, 1, m.get(2));
        Pmin = Set.set(Pmin, 2, m.get(3));
        Pmax = Set.set(Pmax, 2, m.get(4));
        Pmin = Set.set(Pmin, 3, m.get(5));
        Pmax = Set.set(Pmax, 3, m.get(6));
        try {
			center = (Matrix) Divide.divide(Subtract.subtract(Pmax, Pmin), new Matrix(2));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }

    /*
     * set scale and offset for a given figure
     * scale and offset should be such that in each dimension,
     *     screen_pos = scale[] * [x y] + offset[]
     * this will change radically when we include rotation
     */
    public void setScale(double minx, double maxx,
                         double miny, double maxy) throws Exception {
        int left_margin = 0;
        int right_margin = TEXT_MARGIN;
        int top_margin = 0;
        int bot_margin = 0;
        if (title != null) {
            top_margin += TEXT_MARGIN;
        }
        if (xlabel != null || ylabel != null | zlabel != null) {
            left_margin += TEXT_MARGIN;
            bot_margin += TEXT_MARGIN;
        }
        if(mySubplot.colorbar) right_margin += 50;
        width = (int) (screen.width * colFract) - left_margin - right_margin;
        height = (int) (screen.height * rowFract) - top_margin - bot_margin;
        scale = Set.set(scale, 1, 1, width / (maxx - minx));
        scale = Set.set(scale, 1, 2, -height / (maxy - miny));
        scale = Set.set(scale, 1, 3, 1);
        offset = Set.set(offset, 1, 1, left_margin + origCol * screen.width - scale.get(1, 1) * minx);
        offset = Set.set(offset, 1, 2, screen.height * (1 - origRow) - bot_margin - scale.get(1, 2) * miny);
        offset = Set.set(offset, 1, 3, 0);
    }

    public void reset() {
        Pmin = new Matrix(1, 3);
        Pmax = new Matrix(1, 3);
        scale = new Matrix(1, 3);
        offset = new Matrix(1, 3);
        rotMat = new Matrix(3, 3);
        points = new Matrix[8];
        is2D = false;
        azr = 0;
        elr = 0;
        macroScale = 1;
        zoomed = false;
        try {
			center = (Matrix) Divide.divide(Subtract.subtract(Pmax, Pmin), new Matrix(2));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        drawAxes = true;
        px = new int[4];
        py = new int[4];
        mi = new Matrix[4];
        dashes = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, 
                                       BasicStroke.JOIN_MITER, 
                                       10.0f, dash1, 0.0f);
        screen = new Dimension(100, 100);
    }

    public void setLimits(ArrayList<Plot> plots) {
        if (plots.isEmpty()) {
            throw new RuntimeException("Axes.setLimits no plots");
        }
        Plot pl = plots.get(0);
        Pmin = Set.set(Pmin, 1, pl.x.get(1));
        Pmax = Set.set(Pmax, 1, pl.x.get(1));
        Pmin = Set.set(Pmin, 2, pl.y.get(1));
        Pmax = Set.set(Pmax, 2, pl.y.get(1));
        if (pl.is_2D()) {
            Pmin.set(3, -1);
            Pmax.set(3, 1);
            is2D = true;
        } else {
            Pmin = Set.set(Pmin, 3, pl.z.get(1));
            Pmax = Set.set(Pmax, 3, pl.z.get(1));
        }
        for (int plno = 0; plno < plots.size(); plno++) {
            pl = plots.get(plno);
            Pmin.setLower(1, pl.x);
            Pmax.setUpper(1, pl.x);
            Pmin.setLower(2, pl.y);
            Pmax.setUpper(2, pl.y);
            if (!pl.is_2D()) {
                Pmin.setLower(3, pl.z);
                Pmax.setUpper(3, pl.z);
            }
        }
        try {
			center = (Matrix) Divide.divide(Subtract.subtract(Pmax, Pmin), new Matrix(2));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }

    public void setAngles(double azd, double eld) {
        azr = azd * Math.PI / 180;
        elr = eld * Math.PI / 180;
//        origazr = azr;
//        origelr = elr;
    }

    public void makeRotationMatrix() throws Exception {

        /* new rotation approach thanks to a paper by
         * Diana Gruber at the Xtreme Game Developers Conference
         * entitled "The mathematics of the #D rotation matrix
         *
         * Given an axis system X - Y - Z, we choose 2 vectors:
         *    UpW - the always up vector.  For us, this is [0 0 1]
         *    Out - the view vector which with angle az and el is
         *             [ce*ca, ce*sa, se]
         * We need to check that ce is not zero.  If it is,  the
         * matrix degenerates to [  ca -sa 0
         *                          sa  ca 0
         *                           0   0 1]
         * otherwise, the 3rd row is Out: [ce*ca, ce*sa, se]
         *   the 2nd row is UpW - (UpW.Out) * Out normalized.
         *   the values are:  [-se*ce*ca -se*ce*sa (1-se^2)] / mag
         *       where mag is ce^2*(1+se^2)
         *   the first  row, the vector to the right, is normal to the top
         *   two rows:  Up ^ Out = [Upy*Outz - Upz*Outy
         *                          Upz*Outx - Upx*Outz
         *                          Upx*Outy - Upy*Outx ]
         */
        double sa = Math.sin(azr);
        double ca = Math.cos(azr);
        double se = Math.sin(elr);
        double ce = Math.cos(elr);

        if (Math.abs(ce) < 0.0001) {
            rotMat = Set.set(rotMat, 1, 1, ca);
            rotMat = Set.set(rotMat, 1, 2, -sa);
            rotMat = Set.set(rotMat, 1, 3, 0);
            rotMat = Set.set(rotMat, 2, 1, sa);
            rotMat = Set.set(rotMat, 2, 2, ca);
            rotMat = Set.set(rotMat, 2, 3, 0);
            rotMat = Set.set(rotMat, 3, 1, 0);
            rotMat = Set.set(rotMat, 3, 2, 0);
            rotMat = Set.set(rotMat, 3, 3, 1);
        } else {
            double Outx = ce * ca;
            double Outy = ce * sa;
            double Outz = se;
            double mag = ce * ce * (1 + se * se);
            double Upx = -se * ce * ca / mag;
            double Upy = -se * ce * sa / mag;;
            double Upz = ce * ce / mag;
            rotMat = Set.set(rotMat, 1, 2, -Upy * Outz + Upz * Outy);
            rotMat = Set.set(rotMat, 1, 1, Upz * Outx - Upx * Outz);
            rotMat = Set.set(rotMat, 1, 3, Upx * Outy - Upy * Outx);
            rotMat = Set.set(rotMat, 2, 2, -Upx);
            rotMat = Set.set(rotMat, 2, 1, Upy);
            rotMat = Set.set(rotMat, 2, 3, Upz);
            rotMat = Set.set(rotMat, 3, 2, -Outx);
            rotMat = Set.set(rotMat, 3, 1, Outy);
            rotMat = Set.set(rotMat, 3, 3, Outz);
        }
    }

    public Matrix transform(double x, double y) throws Exception {
        return transform(new Matrix(x, y, 0));
    }

    public Matrix transform(double x, double y, double z) throws Exception {
        return transform(new Matrix(x, y, z));
    }
    double out = 0;
    private static boolean showit = false;

    public Matrix transform(Matrix a) throws Exception {
        Matrix it = Subtract.subtract(a, center);
        Matrix rot = MatMult.matMult(rotMat, Transpose.transpose(it));
        rot = Add.add(rot, center);
        rot.multIP(scale);
        rot.multIP(macroScale);
        rot = Add.add(rot, offset);
        if (showit && out++ < 300) {
            Main.debug.println("Original matrix " + a);
            Main.debug.println("                   center: " + center
                    + "; scale: " + scale + "; offset: " + offset);
            Main.debug.println("Result: " + Transpose.transpose(rot));
        }
        return rot;
    }
    
    
    private int axndx[] = {4, 2, 1};

    public void drawAxis(Graphics g, Matrix vl, int ndx) {
        int n = vl.length();
        double x0 = points[0].get(IX);
        double y0 = points[0].get(IY);
        double x1 = points[axndx[ndx]].get(IX);
        double y1 = points[axndx[ndx]].get(IY);
        double dx = x1 - x0;
        double dy = y1 - y0;
        if ((Math.abs(dx) + Math.abs(dy)) > 20) {
            double dlx = dx / (n - 1);
            double dly = dy / (n - 1);
            double x = x0;
            double y = y0;
            if ((Math.abs(dx) > Math.abs(dy))) {
                if (dx < 0) {
                    axisPts[ndx * 2] = new Dimension((int) x1, (int) y1);
                    axisPts[ndx * 2 + 1] = new Dimension((int) x0, (int) y0);
                } else {
                    axisPts[ndx * 2 + 1] = new Dimension((int) x1, (int) y1);
                    axisPts[ndx * 2] = new Dimension((int) x0, (int) y0);
                }
            } else {
                if (dy > 0) {
                    axisPts[ndx * 2] = new Dimension((int) x1, (int) y1);
                    axisPts[ndx * 2 + 1] = new Dimension((int) x0, (int) y0);
                } else {
                    axisPts[ndx * 2 + 1] = new Dimension((int) x1, (int) y1);
                    axisPts[ndx * 2] = new Dimension((int) x0, (int) y0);
                }
            }
            g.drawLine((int) x0, (int) y0, (int) x1, (int) y1);
            if (false) { // !written) {
                Main.debug.println("Axis from [ " + x0 + ", " + y0
                        + "] to [ " + x1 + ", " + y1 + " ]");
            }
        /* Calculate best tick mark direction */
            int nxt1 = (ndx + 1) % 3;
            double dxp1 = points[axndx[nxt1]].get(IX) - x0;
            double dyp1 = points[axndx[nxt1]].get(IY) - y0;
            nxt1 = (nxt1 + 1) % 3;
            double dxp2 = points[axndx[nxt1]].get(IX) - x0;
            double dyp2 = points[axndx[nxt1]].get(IY) - y0;
            if ((Math.abs(dxp1) + Math.abs(dyp1)) < (Math.abs(dxp2) + Math.abs(dyp2))) {
                dxp1 = dxp2;
                dyp1 = dyp2;
            }
            int dxt = (int) (dxp1 / 40);
            int dyt = (int) (dyp1 / 40);
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    g.drawLine((int) x, (int) y, (int) x + dxt, (int) y + dyt);
                }
                double it = vl.get(i + 1);
                double v = Format.format(it, 2);
                String str = "" + v;
                int dot = str.indexOf('.');
                if (str.charAt(dot + 1) == '0') {
                    str = str.substring(0, dot);
                }
                g.drawString(str, (int) x + dxt, (int) y + dyt);
                x += dlx;
                y += dly;
            }
        } else {
            axisPts[ndx * 2] = null;
            axisPts[ndx * 2 + 1] = null;
        }
    }
    
    int sent = 0;
    /* compute the vector cross product of points 
     *   b - a and c - b
     */
    public void drawRect(Graphics2D g2, int a, int b, int c, int d, int nhTicks, int nvTicks) {
       Stroke orig = g2.getStroke();
       mi[0] = points[a]; 
       mi[1] = points[b]; 
       mi[2] = points[c]; 
       mi[3] = points[d]; 
       g2.setColor(Color.white);
       for(int i = 0; i < 4; i++) {
           px[i] = mi[i].geti(1);
           py[i] = mi[i].geti(2);
       }
       g2.fillPolygon(px, py, 4); 
       g2.setColor(Color.gray);
       g2.setStroke(dashes);
       /* Now, we draw the grid lines */
       int n = nhTicks-1;
       for(int dir = 0; dir < 2; dir++) {
           float x0 = px[dir];
           float y0 = py[dir];
           float x1 = px[dir+1];
           float y1 = py[dir+1];
           float dx = ((float)(px[dir+2] - px[dir+1]))/n;
           float dy = ((float)(py[dir+2] - py[dir+1]))/n;
           for(int ln = 0; ln <= n; ln++) {
                g2.drawLine((int) x0, (int) y0, (int) x1, (int) y1);
                x0 += dx; x1 += dx;
                y0 += dy; y1 += dy;
           }
           n = nvTicks-1;
       }
       g2.setStroke(orig);
       g2.setColor(Color.black);
    }

    /* compute the vector cross product of points 
     *   b - a and c - b
     */
    public double cross(int a, int b, int c) {
        double res = 0;
        Matrix ma = points[a]; 
        Matrix mb = points[b]; 
        Matrix mc = points[c]; 
        double dx0 = mb.get(1) - ma.get(1);
        double dy0 = mb.get(2) - ma.get(2);
        double dx1 = mc.get(1) - mb.get(1);
        double dy1 = mc.get(2) - mb.get(2);
        res = dx0*dy1 - dx1*dy0;
        return res;
    }

    /*
     * We have three distorted rectangles to draw:  those defined by
     * XY - the plane of the X and Y axes with sides equal to the lengths
     *      of those axes
     * YZ - ditto the Y and Z axes
     * ZX - ditto the Z and X axes
     * For each reactangle, we will draw either the plane containing the
     * origin or the opposite plane - here's the geometry in question
     *          (3)        There are 8 points involved:
     *         /|\         0 - the origin
     *        / | \        1 - the end of the Z axis
     *     Z(1) |  \       2 - the end of the Y axis
     *      |   |   \ (7)  3 - the opposite corner of the Y-Z plane
     *      |   |    |     4 - the end of the X axis
     *      |   /\ Y(2)    5 - the opposite corner of the Z-X plane (not shown)
     *      |  /  \  |     6 - the opposite corner of the X-Y plane
     *      | /    \ |     7 - the opposite corner of the X-Y-Z cube
     *      |/      /(6)
     *     0 \     /
     *        \   /
     *         \ / X(4)
     * 
     * We have to draw either 0-2-6-4 or 1-5-7-3 for the X-Y plane
     *             and either 0-1-3-2 or 4-6-7-5 for the Y-Z plane
     *             and either 0-4-5-1 or 2-3-7-6 for the Z-X plane
     * The choice is driven by which path is clockwise is determined
     * by the vector cross product of the first 3 points of the first
     * choice.  As shown above, 0-2^2-6 is neg - draw it
     *                          0-1^1-3 is neg - draw it
     *                          0-4^4-5 is +ve - draw 2-3-7-6
     */
    public void drawGrid(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if(cross(0, 2, 6) > 0) drawRect(g2, 0, 2, 6, 4, nxTicks, nyTicks);
                          else drawRect(g2, 1, 5, 7, 3, nyTicks, nxTicks);
        if(cross(0, 1, 3) > 0) drawRect(g2, 0, 1, 3, 2, nyTicks, nzTicks);
                          else drawRect(g2, 4, 6, 7, 5, nzTicks, nyTicks);
        if(cross(0, 4, 5) > 0) drawRect(g2, 0, 4, 5, 1, nxTicks, nzTicks);
                          else drawRect(g2, 2, 3, 7, 6, nxTicks, nzTicks);
    }
    
    
    public void draw(Graphics g, boolean reallyDraw, boolean drawTheGrid) throws Exception {
        if (!zoomed && !reallyDraw) {
            scale.set(1, 1);
            scale.set(2, 1);
            scale.set(3, 1);
            offset.set(1, 0);
            offset.set(2, 0);
            offset.set(3, 0);
        }
        Matrix xl = TickMarks.getMarks(Pmin.get(1), Pmax.get(1));
        nxTicks = xl.n;
        Matrix yl = TickMarks.getMarks(Pmin.get(2), Pmax.get(2));
        nyTicks = yl.n;
        Matrix zl = TickMarks.getMarks(Pmin.get(3), Pmax.get(3));
        nzTicks = zl.n;
        points[0] = transform(xl.get(1), yl.get(1), zl.get(1));  // Origin
        points[1] = transform(xl.get(1), yl.get(1), zl.getEnd());  // Z axis
        points[2] = transform(xl.get(1), yl.getEnd(), zl.get(1));  // Y axis
        points[3] = transform(xl.get(1), yl.getEnd(), zl.getEnd());
        points[4] = transform(xl.getEnd(), yl.get(1), zl.get(1)); // X axis
        points[5] = transform(xl.getEnd(), yl.get(1), zl.getEnd());
        points[6] = transform(xl.getEnd(), yl.getEnd(), zl.get(1));
        points[7] = transform(xl.getEnd(), yl.getEnd(), zl.getEnd());
        if(drawTheGrid) {
            drawGrid(g);
        }
        if (reallyDraw) {
            drawAxis(g, xl, 0);
            drawAxis(g, yl, 1);
            drawAxis(g, zl, 2);
        } else if (!zoomed) {
            // compute proper plot scale
            // find max and min x and y
            double maxx = Matrix.max(points, 0);
            double minx = Matrix.min(points, 0);
            double maxy = Matrix.max(points, 1);
            double miny = Matrix.min(points, 1);
            // force these points to the top, bottom, left and right edges
            setScale(minx, maxx, miny, maxy);
        }
    }
    public static boolean written = false;

    public void drawTitle(BufferedImage bi, Dimension d)
            throws Exception {
        int pixel;
        if (title != null) {
            if (titleBuff == null) {
                titleBuff = makeBufferedImage(bi.getGraphics(), title);
                tw = titleBuff.getWidth();
                th = titleBuff.getHeight();
            }
            int w = d.width;
            int h = d.height;
            int sx = (int) ((w * origCol) + (colFract * w - tw) / 2);
            int sy = h -20 - (int) ((origRow + rowFract) * h - TEXT_MARGIN + (TEXT_MARGIN - th) / 2);
            if (false) { //!written) {
                Main.debug.println("w/h = [" + w + ", " + h + "]; "
                        + "orig x/y = [" + origCol + ", " + origRow + "]; "
                        + "scale x/y = [" + colFract + ", " + rowFract + "]; "
                        + "sx/sy = [" + sx + ", " + sy + "]; ");
            }
            for (int x = 0; x < tw; x++) {
                for (int y = 0; y < th; y++) {
                    pixel = titleBuff.getRGB(x, y);
                    if (pixel != -1) {
                        bi.setRGB(x + sx, y + sy, pixel);
                    }
                }
            }
        }
    }

    public void drawXLabel(BufferedImage bi)
            throws Exception {
        if (xlabel != null) {
            if (xlabelBuff == null) {
                xlabelBuff = makeBufferedImage(bi.getGraphics(), xlabel);
                xw = xlabelBuff.getWidth();
                xh = xlabelBuff.getHeight();
            }
            Dimension from = axisPts[0];
            Dimension to = axisPts[1];
            drawLabel(bi, xlabelBuff, from, to, xw, xh);
        }
    }

    public void drawYLabel(BufferedImage bi)
            throws Exception {
        if (ylabel != null) {
            if (ylabelBuff == null) {
                ylabelBuff = makeBufferedImage(bi.getGraphics(), ylabel);
                yw = ylabelBuff.getWidth();
                yh = ylabelBuff.getHeight();
            }
            Dimension from = axisPts[2];
            Dimension to = axisPts[3];
            drawLabel(bi, ylabelBuff, from, to, yw, yh);
        }
    }

    public void drawZLabel(BufferedImage bi)
            throws Exception {
        if (zlabel != null) {
            if (zlabelBuff == null) {
                zlabelBuff = makeBufferedImage(bi.getGraphics(), zlabel);
                zw = zlabelBuff.getWidth();
                zh = zlabelBuff.getHeight();
            }
            Dimension from = axisPts[4];
            Dimension to = axisPts[5];
            drawLabel(bi, zlabelBuff, from, to, zw, zh);
        }
    }

    private void drawLabel(BufferedImage bi, BufferedImage lb, 
            Dimension from, Dimension to, int iw, int ih) {
        int tx0, ty0;
        int pixel;
        int dw = to.width - from.width;
        int dh = from.height - to.height;
        if (Math.abs(dw) > Math.abs(dh)) {
            if (dw >= iw) {
                tx0 = from.width + (dw - iw) / 2;
                double slope = (double) (to.height - from.height) / dw;
                ty0 = 5 + (int) ((to.height + from.height - slope * iw) / 2);
                if (false) { //!written) {
                    Main.debug.println("from = [" + from + "]; "
                            + "to = [" + to + "]; "
                            + "start = [" + tx0 + ", " + ty0 + "]; "
                            + "slope = " + slope);
                }
                for (int x = 0; x < iw; x++) {
                    for (int y = 0; y < ih; y++) {
                        pixel = lb.getRGB(x, y);
                        if (pixel != -1) {
                            bi.setRGB(x + tx0, 
                                      ty0 + y + (int) (x * slope), 
                                      pixel);
                        }
                    }
                }
            }
        } else {
            if (dh >= iw) {
                ty0 = from.height - (dh + iw) / 2;
                double slope = (double) (to.width - from.width) / dh;
                if (dw < 0) {
                    tx0 = -5 + (int) ((to.width + from.width + slope * iw) / 2);
                    if (false) { //!written) {
                        Main.debug.println("from = [" + from + "]; "
                                + "to = [" + to + "]; "
                                + "start = [" + tx0 + ", " + ty0 + "]; "
                                + "slope = " + slope);
                    }
                    for (int x = 0; x < iw; x++) {
                        for (int y = 0; y < ih; y++) {
                            pixel = lb.getRGB(x, y);
                            if (pixel != -1) {
                                bi.setRGB(tx0 - y - (int) (x * slope), 
                                          ty0 + x, 
                                          pixel);
                            }
                        }
                    }
                } else {
                    tx0 = 5 + (int) ((to.width + from.width + slope * iw) / 2);
                    if (false) { //!written) {
                        Main.debug.println("from = [" + from + "]; "
                                + "to = [" + to + "]; "
                                + "start = [" + tx0 + ", " + ty0 + "]; "
                                + "slope = " + slope);
                    }
                    for (int x = 0; x < iw; x++) {
                        for (int y = 0; y < ih; y++) {
                            pixel = lb.getRGB(x, y);
                            if (pixel != -1) {
                                bi.setRGB(tx0 - (ih - y) - (int) ((iw - x) * slope),
                                          ty0 + (iw - x), 
                                          pixel);
                            }
                        }
                    }
                }
            }
        }
    }

    private static BufferedImage makeBufferedImage(Graphics g, String str) {
        g.setFont(normalFont);
        FontMetrics metrics = g.getFontMetrics();
        // get the height of a line of text in this font and render context
        int height = metrics.getHeight() + 10;
        // get the advance of my text in this font and render context
        int width = metrics.stringWidth(str) + 10;
        BufferedImage res = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        Graphics gi = res.getGraphics();
        gi.setColor(Color.white);
        gi.fillRect(0, 0, width, height);
        gi.setColor(Color.black);
        gi.setFont(normalFont);
        gi.drawString(str, 10, 10);
        return res;
    }

    /**
     * Mouse clicked
     * @param e
     */
    public void clicked(MouseEvent e) {
//        System.out.println("Mouse Clicked");
    }

    ;

    /**
     * Mouse entered
     * @param e
     */
    public void entered(MouseEvent e) {
    }

    ;

    /**
     * Mouse exited
     * @param e
     */
    public void exited(MouseEvent e) {
    }

    ;

    /**
     * Mouse released
     * @param e
     */
    public void released(MouseEvent e) {
//        System.out.println("Mouse Released; offset: " + offset);
    }

    ;

    /**
     * Mouse pressed
     * @param e
     */
    public void pressed(MouseEvent e) {
        baseX = e.getX();
        baseY = e.getY();
//        Main.debug.println("Mouse pressed at [ " + baseX + ", " + baseY + " ]");
//        String str = "";
        switch (mode) {
            case NONE:
                break;
            case PAN:
//                str = "Initial pan: " + offset;
                baseOffset = new Matrix(offset);
                break;
            case ZOOM:
//                str = "Initial zoom: " + scale;
                baseMacroScale = macroScale;
                break;
            case ROTATE:
                baseAz = azr;
                baseEl = elr;
//                str = "base angles: theta = " + theta
//                               + "; phi = " + phi;
                break;
        }
//        System.out.println("Mouse Pressed: " + str);
    }

    ;

    /**
     * Mouse dragged
     * @param e
     */
    public void dragged(MouseEvent e) {
        int xv = e.getX();
        int yv = e.getY();
//        String str = "";
        double dx = ((double) xv - baseX) / screen.width;
        double dy = ((double) yv - baseY) / screen.height;
        switch (mode) {
            case NONE:
                break;
            case PAN:
                Matrix diff = new Matrix((double) (xv - baseX),
                        (double) (yv - baseY), 0.0);
                offset = Add.add(baseOffset, diff);
                toolString = "Pan: " + offset;
                break;
            case ZOOM:
                double val = ((0.25 * dy - 0.75) * dy + 1);
                macroScale = baseMacroScale * val * val;
                toolString = "Zoom: " + Format.format(macroScale, 1);
                zoomed = true;
                break;
            case ROTATE:
                azr = baseAz - dx * Math.PI / 2;
                int az = (int) (azr * 180.0 / Math.PI);
                elr = baseEl + dy * Math.PI * 2;
                if (elr > Math.PI / 2) {
                    elr = Math.PI / 2;
                }
                if (elr < -Math.PI / 2) {
                    elr = -Math.PI / 2;
                }
                int el = (int) (elr * 180.0 / Math.PI);
                toolString = "Rotate: az = " + az + ", el = " + el;
                if (false) { //out++ < 10) {
                    Main.debug.println(toolString);
                }
                break;
        }
//        System.out.println("Dragged: " + str);
    }

    ;

    /**
     * Mouse moved
     * @param e
     */
    public void moved(MouseEvent e) {
//        System.out.println("Mouse Moved");
    }

    ;

    public String toString() {
        return "Axes [ " + Pmin + " - " + Pmax + " ]";
    }

    public static void test() throws Exception {
        Axes ax = new Axes(new Matrix("[0 20 0 20 0 20]"), null);
        // test the matrix transformations
        Dimension d = new Dimension(600, 800);
        ax.azr = Math.PI / 4;
        ax.elr = Math.PI / 4;
        ax.makeRotationMatrix();
        Main.debug.println("mat is: " + ax.rotMat);
        Matrix a = new Matrix(5, 15, 10);
        Main.debug.println("first point is " + a);
        Matrix p = ax.transform(a);
        Main.debug.println("display coord is " + Transpose.transpose(p));
    }
}

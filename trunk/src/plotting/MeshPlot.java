/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plotting;

import java.util.ArrayList;
import jmatrix.*;
import main.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author dsmith
 */
public class MeshPlot extends Plot {

    ArrayList<Patch> patches = new ArrayList();
    boolean showIt;
    private double px[];
    private double py[];
    private double pz[];
    private double pc[];

    public MeshPlot(int type, Matrix xx, Matrix yy, Matrix zz, Matrix clr, SubPlot sp) {
        this.type = type;
        Color tclr[] = null;
        showIt = false;
        hostSubplot = sp;
        double minc = 0;
        double maxc = 0;
        boolean lines = type == Plot.MESH || myFig.currentSubplot.shading == 0;
        int npts = 6;
        x = xx;
        y = yy;
        z = zz;
        if (type == Plot.MESH) {
            clr = zz;
            npts = 4;
        }
        if (showIt) {
            Main.debug.println("clr = \n" + clr);
        }
        minc = clr.getMin();
        maxc = clr.getMax();
        Figure.setColorRange(minc, maxc);
        double dc = maxc - minc;
        px = new double[npts];
        py = new double[npts];
        pz = new double[npts];
        pc = new double[npts];
        int rows = xx.rows();
        int cols = xx.cols();
        double topx[] = new double[cols];
        double topy[] = new double[cols];
        double topz[] = new double[cols];
        double topc[] = new double[cols];
        int ptype;
        for (int r = 1; r <= rows; r++) {
            double botx[] = new double[cols];
            double boty[] = new double[cols];
            double botz[] = new double[cols];
            double botc[] = new double[cols];
            for (int c = 1; c <= cols; c++) {
                if (r == 1) {
                    topx[c - 1] = xx.get(r, c);
                    topy[c - 1] = yy.get(r, c);
                    topz[c - 1] = zz.get(r, c);
                    topc[c - 1] = clr.get(r, c);
                } else {
//                    diagnose("bottom", r, c);
                    botx[c - 1] = xx.get(r, c);
                    boty[c - 1] = yy.get(r, c);
                    botz[c - 1] = zz.get(r, c);
                    botc[c - 1] = clr.get(r, c);
                    if (c > 1) {
                        if (r == 2) {
                            if (c == 2) {
                                ptype = Patch.ALL;
                            } else {
                                ptype = Patch.NOT_LEFT;
                            }
                        } else {
                            if (c == 2) {
                                ptype = Patch.NOT_TOP;
                            } else {
                                ptype = Patch.NOT_TOP_LEFT;
                            }
                        }
                        // sequence is top, right, bottom, left
                        px[0] = topx[c - 2];
                        py[0] = topy[c - 2];
                        pz[0] = topz[c - 2];
                        pc[0] = topc[c - 2];
                        px[1] = topx[c - 1];
                        py[1] = topy[c - 1];
                        pz[1] = topz[c - 1];
                        pc[1] = topc[c - 1];
                        px[2] = botx[c - 1];
                        py[2] = boty[c - 1];
                        pz[2] = botz[c - 1];
                        pc[2] = botc[c - 1];
                        px[3] = botx[c - 2];
                        py[3] = boty[c - 2];
                        pz[3] = botz[c - 2];
                        pc[3] = botc[c - 2];
                        if(dc > 0) {
                            if (type == Plot.SURF) {
                                /*
                                 * we are going to pass to the patch its 4 corners
                                 * plus the min color, the max color and the two 
                                 * points on the patch where the min color (pt 4)
                                 * and the max color (pt 5) occur
                                 */
                                int nm = 0;
                                int nx = 0;
                                double vm = (pc[0] - minc) / dc;
                                double vx = vm;
                                for (int i = 1; i < 4; i++) {
                                    double ti = (pc[i] - minc) / dc;
                                    if (ti < vm) {
                                        vm = ti;
                                        nm = i;
                                    }
                                    if (ti > vx) {
                                        vx = ti;
                                        nx = i;
                                    }
                                }
                                tclr = new Color[2];
                                tclr[0] = hostSubplot.curr_colormap.getColor(vm);
                                tclr[1] = hostSubplot.curr_colormap.getColor(vx);
                                /* calculate the cos and sin values */
                                double cth = -pc[0] + pc[1] + pc[2] - pc[3];
                                double sth =  pc[0] + pc[1] - pc[2] - pc[3];
                                double t0 = 0;
                                double t1 = 0;
                                int itsCase = 0;
                                if(Math.abs(sth) < 0.000000001) {
                                    if(cth > 0) {  // half way on right wall
                                        doMagic(4, 5, 3, 0.5);
                                        itsCase = 1;
                                    } else {      // half way on left wall
                                        doMagic(5, 4, 3, 0.5);
                                        itsCase = 2;
                                    }
                                } else {
                                    t0 = (cth + sth) / (2*sth);
                                    t1 = (cth - sth) / (2*cth);
                                    if(t0 > 1) {  // go down the right wall
                                        if( sth > 0) {
                                            doMagic(4, 5, 3, t1);
                                            itsCase = 3;
                                        } else {
                                            doMagic(5, 4, 3, t1);
                                            itsCase = 13;
                                        }
                                    } else if(t0 < 0) { // come up the left wall
                                        if(sth > 0) {
                                            doMagic(5, 4, 3, t1);
                                            itsCase = 4;
                                        } else {
                                            doMagic(4, 5, 3, t1);
                                            itsCase = 14;
                                        }
                                    } else if (sth < 0) { // left along the bottom wall
                                        doMagic(4, 5, 0, t0);
                                        itsCase = 5;
                                     } else {  // finally, right along the top wall
                                        doMagic(5, 4, 0, t0);
                                        itsCase = 6;
                                    }
                                }
                                if(showIt) {
                                    Main.debug.println("case = " + itsCase 
                                                   + "; cth = " + cth 
                                                   + "; sth = " + sth
                                                   + "; t0 = " + t0
                                                   + "; t1 = " + t1);
                                }
                            } else {
                                tclr = new Color[4];
                                for (int i = 0; i < 4; i++) {
                                    double v = (pc[i] + pc[(i + 1) % 4]) / 2;
                                    v = (v - minc) / dc;
                                    tclr[i] = hostSubplot.curr_colormap.getColor(v);
                                }
                            }
                            if (showIt) {
                                Main.debug.print("tclr[" + r + "," + c + "] = {");
                                for (int kk = 0; kk < tclr.length; kk++) {
                                    Main.debug.print("" + tclr[kk] + " ");
                                }
                                Main.debug.println("}");
                                Main.debug.print("pxyz[" + r + "," + c + "] = {");
                                for (int kk = 0; kk < px.length; kk++) {
                                    Main.debug.print("[" + Format.format(px[kk],3) + "," 
                                                         + Format.format(py[kk],3) + "," 
                                                         + Format.format(pz[kk],3) + "]");
                                }
                                Main.debug.println("}");
                            }
                        } else {
                            type = Plot.MESH;
                            tclr = new Color[4];
                            for(int i = 0; i < 4; i++) {
                                tclr[i] = hostSubplot.curr_colormap.getColor(0);
                            }
                        }
                        Patch p = new Patch(type, ptype, lines, px, py, pz, tclr);
                        patches.add(p);
                    }
                }
            }
            if (r > 1) {
                topx = botx;
                topy = boty;
                topz = botz;
                topc = botc;
            }
        }
    }
    
    private void doMagic(int i, int j, int k, double t) {
        /*
            doMagic(5, 4, 0, t0);
            px[5] = px[0] + t0*(px[1] - px[0]);
            py[5] = py[0] + t0*(py[1] - py[0]);
            pz[5] = pz[0] + t0*(pz[1] - pz[0]);
            px[4] = px[2] + t0*(px[3] - px[2]);
            py[4] = py[2] + t0*(py[3] - py[2]);
            pz[4] = pz[2] + t0*(pz[3] - pz[2]);
         */
        int k3 = (k+3) % 4;
        int k2 = (k+2) % 4;
        int k1 = (k+1) % 4;
        px[i] = px[k] +  t*(px[k1] - px[k]);
        py[i] = py[k] +  t*(py[k1] - py[k]);
        pz[i] = pz[k] +  t*(pz[k1] - pz[k]);
        px[j] = px[k2] + t*(px[k3] - px[k2]);
        py[j] = py[k2] + t*(py[k3] - py[k2]);
        pz[j] = pz[k2] + t*(pz[k3] - pz[k2]);
    }
    
    
    
    int order[] = null;
    double zv[] = null;
    int N;

    private void insertInOrder(int at) {
        int i = 0;
        boolean found = false;
        while (!found && i < at) {
            double zvi = zv[order[i]];
            double zva = zv[at];
            if (zvi > zva) {
                // make space from i+1 to at
                for (int k = at; k > i; k--) {
                    order[k] = order[k - 1];
                }
                order[i] = at;
                found = true;
            } else {
                i++;
            }
        }
        if (!found) {
            order[at] = at;
        }
    }

    public void draw(Graphics g, Axes ax) throws Exception {
        Matrix screenCoords[] = new Matrix[6];
        Patch p;
        N = patches.size();
        if (myFig.isHidden()) {
            order = new int[N];
            zv = new double[N];
        }
        for (int i = 0; i < N; i++) {
            p = patches.get(i);
            double zsum = 0;
            for (int j = 0; j < p.numCoords; j++) {
                Matrix m = p.fetch(j);  // fetch coords of i'th point
                // i = 0: top left
                // i = 1: top right
                // i = 2: bot right
                // i = 3: bot left
                // i = 4: min color
                // i = 5: max color
                screenCoords[j] = ax.transform(m);
                if(j < 4) {
                    zsum = zsum + screenCoords[j].get(3);
                }
            }
            if (myFig.isHidden()) {
                zv[i] = zsum / 4;
                order[i] = i;
                p.setCoords(screenCoords);
                insertInOrder(i);
            } else {
                p.draw((Graphics2D) g, screenCoords, false);
            }
        }
        if (myFig.isHidden()) {
            for (int i = 0; i < N; i++) {
                p = patches.get(order[i]);
                p.draw((Graphics2D) g);
            }
        }
    }
}

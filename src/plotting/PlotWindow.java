package plotting;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import main.Main;

public class PlotWindow extends JPanel
        implements MouseListener, MouseMotionListener {

    private Color backColor = new Color(255, 255, 210);
    public Figure figure;
    private BufferedImage myBI = null;
    private int myW = -1;
    private int myH = -1;
    private Graphics2D imageG2 = null;
    private Dimension screenSize = null;

    public PlotWindow(Figure f) {
        super();
        figure = f;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    /**
     *   repaint the display
     * blank fill the screen then paint it
     * @param g the graphic environment
     */
    @Override
    public void paintComponent(Graphics g) {
        screenSize = getSize();
        if(myBI == null | screenSize.width != myW | screenSize.height != myH) {
            myW = screenSize.width;
            myH = screenSize.height;
            myBI = (BufferedImage)(this.createImage(myW, myH));
            imageG2 = myBI.createGraphics();
//            Main.debug.println("screen size (w/h) is [ " + myW + ", " + myH + "]");
        }
        imageG2.setColor(backColor);
        imageG2.setFont(Axes.normalFont);
        imageG2.fillRect(0, 0, screenSize.width, screenSize.height);
        for (int spn = 0; spn < figure.subplots.size(); spn++) {
            SubPlot sp = figure.subplots.get(spn);
            sp.draw(imageG2, screenSize);
        }
        for (int spn = 0; spn < figure.subplots.size(); spn++) {
            SubPlot sp = figure.subplots.get(spn);
            sp.drawText(myBI, screenSize);
        }
        Axes.written = true;
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(myBI, null, 0, 0);
//        System.out.println("Drawn");
    }

    public void setInitialized(boolean state) {
        for (int spn = 0; spn < figure.subplots.size(); spn++) {
            SubPlot sp = figure.subplots.get(spn);
            sp.setInitialized(state);
        }
    }
    
    private SubPlot findSubplot(MouseEvent e) {
        SubPlot res = null;
        Figure fig = Figure.currentFig;
        int spr = fig.subPlotRows;
        int spc = fig.subPlotCols;
        int sw = screenSize.width;
        int sh = screenSize.height;
        int hitX = e.getX();
        int hitY = e.getY();
        int rn = hitY * spr / sh;
        int cn = hitX * spc / sw;
        int spndx = rn * spc + cn;
        res = fig.subplots.get(spndx);
        return res;
    }

    public void mouseClicked(MouseEvent e) {
        Figure.currentFig = figure;
        
        figure.mousedSubplot.axes.clicked(e);
        repaint();
    }

    ;
    public void mouseEntered(MouseEvent e) {
        Figure.currentFig = figure;
        figure.mousedSubplot = findSubplot(e);
        figure.mousedSubplot.axes.entered(e);
        repaint();
    }

    ;
    public void mouseExited(MouseEvent e) {
        figure.mousedSubplot.axes.exited(e);
        repaint();
    }

    ;
    public void mouseReleased(MouseEvent e) {
        figure.mousedSubplot.axes.released(e);
        repaint();
    }

    ;
    public void mousePressed(MouseEvent e) {
        figure.mousedSubplot.axes.pressed(e);
        repaint();
    }

    ;
    public void mouseDragged(MouseEvent e) {
        figure.mousedSubplot.axes.dragged(e);
        repaint();
    }

    ;
    public void mouseMoved(MouseEvent e) {
        figure.mousedSubplot.axes.moved(e);
        repaint();
    }
}

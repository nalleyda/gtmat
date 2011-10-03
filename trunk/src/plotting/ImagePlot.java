/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plotting;

import java.util.ArrayList;
import jmatrix.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author dsmith
 */
public class ImagePlot extends Plot {
    
    BufferedImage img = null;
    
    public ImagePlot(int type, Uint8 data) {
        x = Matrix.linspace(0,data.getWidth()-1);
        y = Matrix.linspace(0,data.getHeight()-1);
        z = null;
        img = data.getData();
        this.type = type;
    }

    @Override
    public void draw(Graphics g, Axes ax) {
        g.drawImage(img, 0, 0, null);
    }
}

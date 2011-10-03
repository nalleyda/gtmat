/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import main.*;
import plotting.*;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dsmith
 */
public class PlotTools {

    public static void reset(PlotWindow w) {
        System.out.println("Reset the Plot");
        w.figure.resetAxes();
        w.setInitialized(false);
    }

    public static void pan(PlotWindow w) {
        System.out.println("Pan the Plot");
        w.figure.setAxisMode(Axes.PAN);
    }

    public static void zoom(PlotWindow w) {
        System.out.println("Zoom the Plot");
        w.figure.setAxisMode(Axes.ZOOM);
    }

    public static void rotate(PlotWindow w) {
        System.out.println("Rotate the Plot");
        w.figure.setAxisMode(Axes.ROTATE);
    }

    public static void close(JFrame fr, PlotWindow w) {
        fr.remove(w);
    }

    private static BufferedImage getScreenShot(
            Component component) {

        BufferedImage image = new BufferedImage(
                component.getWidth(),
                component.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        // call the Component's paint method, using
        // the Graphics object of the image.
        component.paint(image.getGraphics());
        return image;
    }

    public static void save(JFrame f) {
        String fileName = null;
        System.out.println("Save the Plot");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "PNG Images", "png");
        Main.fileChooser.setFileFilter(filter);
        int returnVal = Main.fileChooser.showOpenDialog(f);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
            if(!fileName.endsWith(".png")) {
                fileName += ".png";
            }
            BufferedImage img = getScreenShot(
                    f.getContentPane());
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel(
                    new ImageIcon(
                    img.getScaledInstance(
                    img.getWidth(null) / 2,
                    img.getHeight(null) / 2,
                    Image.SCALE_SMOOTH))));
            try {
                // write the image as a PNG
                ImageIO.write(
                        img,
                        "png",
                        new File(fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void print(JFrame f) {
        System.out.println("Print Plot");
        PrintUtilities.printComponent(f);
    }
}

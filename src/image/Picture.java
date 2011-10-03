package image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import jmatrix.*;

/**
 * A class that represents a simple picture.  A simple picture may have
 * an associated file name and a title.  A simple picture has pixels, 
 * width, and height.  A simple picture uses a BufferedImage to 
 * hold the pixels.  You can show a simple picture in a 
 * PictureFrame (a JFrame).
 * 
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Picture {

    ////////////////////////// Methods //////////////////////////////////

    public static Uint8 imread(MatString mstr) {
        return load(mstr.toString());
    }
    /**
     * Method to load the picture from the passed file name
     * @param fileName the file name to use to load the picture from
     * @return true if success else false
     */
    public static Uint8 load(String fileName) {
        BufferedImage bufferedImage = null;
        Uint8 res = null;
        // try to get the buffered image from the file
        try {
            bufferedImage = ImageIO.read(new File(fileName));
            /* if anything goes wrong tell the user on the console, set the
             * image to a black image with a message on it, and return false */
        } catch (Exception ex) {
            System.out.println("Couldn't load the file " + fileName);
        }
        res = new Uint8(bufferedImage);
        return res;
    }

    /**
     * Method to write the contents of the picture to a file with 
     * the passed name
     * @param fileName the name of the file to write the picture to
     */
    public void write(  Uint8 u, String fileName) {
        String extension = "jpg";
        try {
            // create the file object
            File file = new File(fileName);

            // get the extension
            int posDot = fileName.indexOf('.');
            if (posDot >= 0) {
                extension = fileName.substring(posDot + 1);
            }

            // write the contents of the buffered image to the file as jpeg
            ImageIO.write(u.getData(), extension, file);

        } catch (Exception ex) {
            System.out.println("Couldn't write out the picture to the file " + fileName);
        }

    }

} // end of SimplePicture class
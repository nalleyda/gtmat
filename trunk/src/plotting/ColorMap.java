/*
 * Class for describing color maps
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
 public class ColorMap {
     String name;
     Color clrs[];
     
     public ColorMap(String nm, Color c[]) {
         name = nm;
         clrs = c;
     }
     
     public static ColorMap getMap(String nm) {
         ColorMap res = maps[0];
         for(int i = 0; i < maps.length; i++) {
             if(nm.equalsIgnoreCase(maps[i].name)) {
                 res = maps[i];
                 break;
             }
         }
//         Main.debug.println("set map to " + res);
         return res;
     }
     
     public Color getColor(double here) {
         Color res = clrs[0];
         if(here > 0) {
             double dn = 1.00001 / (clrs.length - 1);
             int n = (int) (here/dn);
             double dh = (here - n * dn) * (clrs.length - 1);
             int r0 = clrs[n].getRed();
             int g0 = clrs[n].getGreen();
             int b0 = clrs[n].getBlue();
             if(n > (clrs.length - 2)) {
                 n = clrs.length - 2;
             }
             int r1 = clrs[n+1].getRed();
             int g1 = clrs[n+1].getGreen();
             int b1 = clrs[n+1].getBlue();
             double r = r0 + dh * (r1-r0);
             r = check(r);
             double g = g0 + dh * (g1-g0);
             g = check(g);
             double b = b0 + dh * (b1-b0);
             b = check(b);
             res = new Color((int)r, (int)g, (int)b);
         }
         return res;
     }
     
     private double check(double c) {
         if(c < 0) {
             c = 0;
         }
         if(c > 255) {
             c = 255;
         }
         return c;
     }
     
     public void drawBar(Graphics2D g2, Axes ax) {
         int w = ax.width;
         int h = ax.height;
         int xp[] = {w+10, w+40, w+40, w+10};
         int yp[] = {20, 20, 20, 20};
         float topX = (xp[0] + xp[1])/2;
         float topY = yp[0];
         int n = clrs.length-1;
         int dy = (h-40)/n;
         Paint was = g2.getPaint();
         for(int i = n-1; i >= 0; i--) {
             float botY = topY + dy;
             yp[2] = yp[0] + dy;
             yp[3] = yp[1] + dy;
             GradientPaint gp =
                 new GradientPaint(topX, topY, clrs[i+1],
                                   topX, botY, clrs[i]);
             g2.setPaint(gp);
             g2.fillPolygon(xp, yp, 4);
             yp[0] = yp[2];
             yp[1] = yp[3];
             topY = botY;
         }
         g2.setColor(Color.black);
         double val = Format.format(ax.mySubplot.maxColor, 3);
         g2.drawString(""+val, w+10, 15);
         val = Format.format(ax.mySubplot.minColor, 3);
         g2.drawString(""+val, w+10, yp[3] + 15);
         g2.setPaint(was);
     }
     
     public String toString() {
         String res = "Colormap " + name + " with " + clrs.length + " colors: { ";
         for(int i = 0; i < clrs.length; i++) {
             res += clrs[i] + " ";
         }
         return res + "}";
     }
// colorcube contains as many regularly spaced colors in RGB color space as  
//      possible, while attempting to provide more steps of gray, pure red,  
//      pure green, and pure blue.
// flag consists of the colors red, white, blue, and black. This colormap  
//      completely changes color with each index increment.
// lines produces a colormap of colors specified by the axes ColorOrder  
//      property and a shade of gray.
// pink contains pastel shades of pink. The pink colormap provides sepia tone  
//      colorization of grayscale photographs.
// prism repeats the six colors red, orange, yellow, green, blue, and violet.
// white is an all white monochrome colormap.
// jet ranges from blue to red, and passes through the colors cyan, yellow, and 
//      orange. It is a variation of the hsv colormap. 
//      The jet colormap is associated with an astrophysical fluid jet simulation  
//      from the National Center for Supercomputer Applications.
     public static final Color jet[] = {
                                Color.blue,
                                Color.red,
                                Color.cyan,
                                Color.yellow,
                                new Color(255, 128, 0)};
// hsv varies the hue component of the hue-saturation-value color model.  
//      The colors begin with red, pass through yellow, green, cyan, blue,  
//      magenta, and return to red. The colormap is particularly appropriate  
//      for displaying periodic functions. hsv(m) is the same as  
//      hsv2rgb([h ones(m,2)]) where h is the linear ramp, h = (0:m–1)'/m.
     public static final Color HSV[] = {
                                Color.red,
                                Color.yellow,
                                Color.green,
                                Color.cyan,
                                Color.blue,
                                Color.magenta,
                                Color.red};
// hot varies smoothly from black through shades of red, orange, and yellow,   
//      to white.
     public static final Color hot[] = {
                                Color.black,
                                Color.red,
                                new Color(255, 128, 0),
                                Color.yellow,
                                Color.white};
// cool consists of colors that are shades of cyan and magenta.    
//      It varies smoothly from cyan to magenta.
     public static final Color cool[] = {
                                Color.cyan,
                                Color.magenta};
// spring consists of colors that are shades of magenta and yellow.
     public static final Color spring[] = {
                                Color.magenta,
                                Color.yellow};
// summer consists of colors that are shades of green and yellow.
     public static final Color summer[] = {
                                Color.green,
                                Color.yellow};
// autumn varies smoothly from red, through orange, to yellow.
     public static final Color autumn[] = {
                                Color.red,
                                new Color(255, 128, 0),
                                Color.yellow};
// winter consists of colors that are shades of blue and green.
     public static final Color winter[] = {
                                Color.blue,
                                Color.green};
// gray returns a linear grayscale colormap.
     public static final Color gray[] = {
                                Color.black,
                                Color.white};
// bone is a grayscale colormap with a higher value for the blue component.    
//      This colormap is useful for adding an "electronic" look to grayscale    
//      images.
     public static final Color bone[] = {
                                new Color(0, 0, 50),
                                Color.white};
// copper varies smoothly from black to bright copper.
     public static final Color copper[] = {
                                Color.black,
                                new Color(220, 120, 80)};
// pink contains pastel shades of pink. The pink colormap provides sepia     
//      tone colorization of grayscale photographs.
// prism repeats the six colors red, orange, yellow, green, blue, and violet.
// white is an all white monochrome colormap.
     public static final Color pink[] = {
                                new Color(255, 128, 128),
                                Color.white};
// prism repeats the six colors red, orange, yellow, green, blue, and violet.
// white is an all white monochrome colormap.
     public static final Color prism[] = {
                                Color.red,
                                new Color(255, 128, 0),
                                Color.yellow,
                                Color.green,
                                Color.cyan,
                                Color.blue,
                                new Color(64, 0, 75)};
// white is an all white monochrome colormap.
     public static final Color white[] = {
                                Color.white,
                                Color.white};
     
     public static ColorMap maps[] = {
        new ColorMap("jet", jet),
        new ColorMap("HSV", HSV),
        new ColorMap("hot", hot),
        new ColorMap("cool", cool),
        new ColorMap("spring", spring),
        new ColorMap("summer", summer),
        new ColorMap("autumn", autumn),
        new ColorMap("winter", winter),
        new ColorMap("gray", gray),
        new ColorMap("bone", bone),
        new ColorMap("copper", copper),
        new ColorMap("pink", pink), 
        new ColorMap("prism", prism), 
        new ColorMap("white", white) 
     };
}
package plotting;

import java.util.ArrayList;

import functions.Set;
import jmatrix.*;

public class TickMarks {

    public static Matrix getMarks(double x1, double x2) throws Exception {
        if(x1 > x2) {
            double temp = x2;
            x2 = x1;
            x1 = temp;
        }
        final int numTick = 7;
        final double xRange = niceNum(x2 - x1, false);
        final double xSpacing = niceNum(xRange / (numTick - 1), true);
        final double graphMin = Math.floor(x1 / xSpacing) * xSpacing;
        final double graphMax = Math.ceil(x2 / xSpacing) * xSpacing;
        Matrix res = new Matrix(1,1);
        int i = 1;
        for (double d = graphMin; d <= graphMax + .5 * xSpacing; d += xSpacing) {
            //TODO: Draw tick marks at each position (with dracDigitToShow digits)

            //For testing purposes store the values
            res = Set.set(res, 1, i++, d);
        }
        return res;
    }


    private static double niceNum(double num, boolean round) {
        double exp = Math.floor(Math.log10(num));
        double frac = num / Math.pow(10, exp);
        double niceFrac = 0;
        if (round) {
            if (frac < 1.5) {
                niceFrac = 1d;
            } else if (frac < 3) {
                niceFrac = 2d;
            } else if (frac < 7) {
                niceFrac = 5d;
            } else {
                niceFrac = 10d;
            }
        } else {
            if (frac <= 1) {
                niceFrac = 1d;
            } else if (frac <= 2) {
                niceFrac = 2d;
            } else if (frac <= 5) {
                niceFrac = 5d;
            } else {
                niceFrac = 10d;
            }
        }
        return niceFrac * Math.pow(10d, exp);
    }

    public static void main(String[] args) throws Exception {
        Matrix xl = getMarks(-100.0, 10.0);
        Matrix yl = getMarks(-1.0, 140.0);
        Matrix zl = getMarks(5.1, -8.7);
        System.out.println("X labels : " + xl);
        System.out.println("Y labels : " + yl);
        System.out.println("Z labels : " + zl);
    }
}

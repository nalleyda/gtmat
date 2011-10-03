/*
 * Class to provide static formatting
 */

package jmatrix;

/**
 *
 * @author dsmith
 */
public class Format {
    public static double format(double x, int n) {
        double pw = Math.pow(10, n);
        return Math.round(x * pw) / pw;
    }
    
    public static double sigFigs(double v, int n) {
        if(Math.abs(v) < 0.00001) return 0;
        boolean neg = v < 0;
        if(neg) {
            v = -v;
        }
        double l10v = Math.log10(v);
        int il10v = (int) l10v;
        double fact = Math.pow(10, il10v - 1);
        int iv = (int) (v/fact);
        double res = iv * fact;
        if(neg) res = -res;
        return res;
    }
}

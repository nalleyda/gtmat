/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;
import main.*;
import java.io.*;

/**
 *
 * @author dsmith
 */
public class MatComplex extends MatObject {
    Complex data[];
    private static MatComplex X, Y;  // make it globally accessible
    private static final double loge2 = Math.log(2);
    private static double blackAlpha = 0.16;

    public MatComplex() {
        type = COMPLEX;
        data = new Complex[0];
    }
    
    public MatComplex(Matrix m) {
        super(m);
        type = COMPLEX;
        data = new Complex[length()];
        for(int i = 0; i < length(); i++) {
            data[i] = new Complex(m.data[i], 0);
        }
    }

    public MatComplex(Matrix rl, Matrix im) {
        super(rl);
        type = COMPLEX;
        data = new Complex[length()];
        for(int i = 0; i < length(); i++) {
            data[i] = new Complex(rl.data[i], im.data[i]);
        }
    }

    public MatComplex(MatComplex mc) {
        super(mc);
        type = COMPLEX;
        data = new Complex[length()];
        for(int i = 0; i < length(); i++) {
            data[i] = mc.data[i].copy();
        }
    }

    public MatComplex(int n) {
        super(n);
        type = COMPLEX;
        data = new Complex[n];
        for(int i = 0; i < length(); i++) {
            data[i] = new Complex(0, 0);
        }
    }
    
    public MatComplex copy() {
        return new MatComplex(this);
    }

    public MatComplex zeroed() {
        return new MatComplex(this);
    }

    public MatComplex empty() {
        return new MatComplex();
    }
    
    public Complex get(int i) {
        return data[i];
    }
    
    public void set(int r, int c, Complex val) {
        data[(c - 1) * size[ROW] + (r - 1)] = val;    
    }
    
    public static Matrix real(MatComplex it) {
        Matrix res = new Matrix(1, it.n);
        for(int i = 0; i < it.n; i++) {
            res.data[i] = it.data[i].real;
        }
        return res;
    }
    
    public static Matrix imag(MatComplex it) {
        Matrix res = new Matrix(1, it.n);
        for(int i = 0; i < it.n; i++) {
            res.data[i] = it.data[i].imag;
        }
        return res;
    }
    
    public MatComplex add(MatComplex a) {
        MatComplex res = new MatComplex(this);
        if (n != a.n) {
            if (n == 1) {
                res = new MatComplex(a);
                for (int i = 0; i < a.n; i++) {
                    res.data[i] = Complex.add(data[0],res.data[i]);
                }
            } else if (a.n == 1) {
                for (int i = 0; i < n; i++) {
                    res.data[i] = Complex.add(a.data[0], data[i]);
                }
            } else {
                throw new RuntimeException("Complex.add unequal sizes");
            }
        } else {
            for (int i = 0; i < n; i++) {
                res.data[i] = Complex.add(data[i], a.data[i]);
            }
        }
        return res;
    }

    public MatComplex sub(MatComplex a) {
         MatComplex res = new MatComplex(this);
        if (n != a.n) {
            if (n == 1) {
                res = new MatComplex(a);
                for (int i = 0; i < a.n; i++) {
                    res.data[i] = Complex.sub(data[0],res.data[i]);
                }
            } else if (a.n == 1) {
                for (int i = 0; i < n; i++) {
                    res.data[i] = Complex.sub(a.data[0], data[i]);
                }
            } else {
                throw new RuntimeException("Complex.sub unequal sizes");
            }
        } else {
            for (int i = 0; i < n; i++) {
                res.data[i] = Complex.sub(data[i], a.data[i]);
            }
        }
        return res;
    }

    public MatComplex mult(MatComplex a) {
        MatComplex res = new MatComplex(this);
        if (n != a.n) {
            if (n == 1) {
                res = new MatComplex(a);
                for (int i = 0; i < a.n; i++) {
                    res.data[i] = Complex.mult(data[0],res.data[i]);
                }
            } else if (a.n == 1) {
                for (int i = 0; i < n; i++) {
                    res.data[i] = Complex.mult(a.data[0], data[i]);
                }
            } else {
                throw new RuntimeException("Complex.mult unequal sizes");
            }
        } else {
            for (int i = 0; i < n; i++) {
                res.data[i] = Complex.mult(data[i], a.data[i]);
            }
        }
        return res;
    }

    public MatComplex div(MatComplex a) {
        MatComplex res = new MatComplex(this);
        if (n != a.n) {
            if (n == 1) {
                res = new MatComplex(a);
                for (int i = 0; i < a.n; i++) {
                    res.data[i] = Complex.div(data[0],res.data[i]);
                }
            } else if (a.n == 1) {
                for (int i = 0; i < n; i++) {
                    res.data[i] = Complex.div(a.data[0], data[i]);
                }
            } else {
                throw new RuntimeException("Complex.div unequal sizes");
            }
        } else {
            for (int i = 0; i < n; i++) {
                res.data[i] = Complex.div(data[i], a.data[i]);
            }
        }
        return res;
    }

    public void copyValues(Matrix ndx, MatObject src) {
        int in = ndx.length();
        int sn = src.length();
        MatComplex it = (MatComplex) src;
        if(sn == 1) {
            Complex val = it.get(1);
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, val);
            }
        } else {
            for(int i = 1; i <= in; i++) {
                int loc = (int) ndx.get(i);
                set(1, loc, it.get(i));
            }
        }
    }

    public static void divIP(MatComplex m, double b) {
        for(int i = 0; i < m.length(); i++) {
            Complex.divIP(m.data[i], b);
        }
    }

    private static int force2Pow2(int N) {
        /* log base a x is log base b x / log base b a*/
        double base2 = Math.log(N)/loge2;
        if(base2 % 1 > 0) {
            N = (int) Math.pow(2, Math.floor(base2));
        }
        return N;
    }

    private static void applyBlackman(MatComplex X, int N) {
        double a0 = (1-blackAlpha) / 2;
        double a1 = 0.5;
        double a2 = blackAlpha / 2;
        double term;
        double angle2;
        double angle4;
        for(int i = 0; i < N; i++) {
            angle2 = 2*Math.PI*i/(N-1);
            angle4 = 2*angle2;
            term = a0 - a1 * Math.cos(angle2) + a2 * Math.cos(angle4);
            Complex.scaleIP(X.data[i], term);
        }
    }

    public static MatComplex fft(Matrix x) {
        X = new MatComplex(x);
        int N = force2Pow2(x.length());
        applyBlackman(X, N);
        Y = new MatComplex(N);
        ditfft2( 0, 0, N, 1);
        return Y;
    }
    public static MatComplex ifft(MatComplex x) {
        X = x;
        int N = force2Pow2(x.length());
        Y = new MatComplex(N);
        //      X range  Y range
        ditifft2( 0, 0, N, 1);
        MatComplex.divIP(Y, N);
        return Y;
    }
/* Y0,...,N-1 <- ditfft2(X, N, s):
    if N = 1 then
        Y0 <- X0     trivial size-1 DFT base case
    else
        Y0,...,N/2-1 <- ditfft2(X, N/2, 2s)    DFT of (X0, X2s, X4s, ...)
        YN/2,...,N-1 <- ditfft2(X+s, N/2, 2s)  DFT of (Xs, Xs+2s, Xs+4s, ...)
        for k = 0 to N/2-1     combine DFTs of two halves into full DFT:
            t <- Yk
            Yk <- t + exp(-2PIi k/N) Yk+N/2
            Yk+N/2 <- t - exp(-2PIi k/N) Yk+N/2
        endfor
    endif
*/
    private static void ditfft2(int xf, int yf, int N, int s) {
        if(N == 1) {
            Y.data[yf] = X.data[xf];
//            debug.println("set Y[" + yf + "] to X[" + xf + "] ("
//                    + X.data[xf] + ")");
        } else {
            ditfft2(xf, yf, N/2, 2*s);
            ditfft2(xf + s, yf + N/2, N/2, 2*s);
            for(int k = 0; k < N/2; k++) {
                Complex t = Y.data[k + yf];
                double dk = (double) k;
                Complex sc = Complex.exp(-dk/N);
                Complex term = Complex.mult(sc, Y.data[k + yf + N/2]);
                Y.data[k + yf] = Complex.add(t, term);
//                debug.println("set Y["+(k + yf) +"] to " + Y.data[k + yf]);
                Y.data[k + yf + N/2] = Complex.sub(t, term);
//               debug.println("set Y["+(k + yf + N/2) + "] to "
//                       + Y.data[k + yf + N/2]);
            }
        }
    }

    private static void ditifft2(int xf, int yf, int N, int s) {
        if(N == 1) {
            Y.data[yf] = X.data[xf];
//            debug.println("set Y[" + yf + "] to X[" + xf + "] ("
//                    + X.data[xf] + ")");
        } else {
            ditfft2(xf, yf, N/2, 2*s);
            ditfft2(xf + s, yf + N/2, N/2, 2*s);
            for(int k = 0; k < N/2; k++) {
                Complex t = Y.data[k + yf];
                double dk = (double) k;
                Complex sc = Complex.exp(dk/N);
                Complex term = Complex.mult(sc, Y.data[k + yf + N/2]);
                Y.data[k + yf] = Complex.add(t, term);
//                debug.println("set Y["+(k + yf) +"] to " + Y.data[k + yf]);
                Y.data[k + yf + N/2] = Complex.sub(t, term);
//               debug.println("set Y["+(k + yf + N/2) + "] to "
//                       + Y.data[k + yf + N/2]);
            }
        }
    }

    public String toString() {
        String res = "[";
        for(int i = 0; i < length(); i++) {
            res += data[i] + "\n";
        }
        return res + "]";
    }
    
    public static void test() {
        int n = 4;
        Matrix th = Matrix.linspace(0, 4*n*Math.PI, 8*n+1);
        Matrix x = Matrix.sin(th);
        MatComplex y = MatComplex.fft(x);
        Main.debug.println("The fft of " + x + "\n  is " + y);
        MatComplex iy = MatComplex.ifft(y);
        Main.debug.println("The inverse fft of " + y + "\n  is " + iy);
    }
}

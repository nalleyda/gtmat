/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmatrix;

/**
 *
 * @author dsmith
 */
public class Complex {
    public double real;
    public double imag;

    public Complex(double rl, double im) {
        real = rl;
        imag = im;
    }

    public Complex copy() {
        return new Complex(real, imag);
    }
    
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static void addIP(Complex a, Complex b) {
        a.real = a.real + b.real;
        a.imag = a.imag + b.imag;
    }

    public static void scaleIP(Complex a, double b) {
        a.real = a.real * b;
        a.imag = a.imag * b;
    }

    public static void divIP(Complex a, double b) {
        a.real = a.real / b;
        a.imag = a.imag / b;
    }

    public static Complex mult(Complex A, Complex B) {
        double Amag = Math.sqrt(A.real*A.real + A.imag*A.imag);
        double Aphs = Math.atan2(A.imag, A.real);
        double Bmag = Math.sqrt(B.real*B.real + B.imag*B.imag);
        double Bphs = Math.atan2(B.imag, B.real);
        double mag = Amag * Bmag;
        double phs = Aphs + Bphs;
        return new Complex(mag*Math.cos(phs), mag*Math.sin(phs));
    }

    public static Complex div(Complex A, Complex B) {
        double Amag = Math.sqrt(A.real*A.real + A.imag*A.imag);
        double Aphs = Math.atan2(A.imag, A.real);
        double Bmag = Math.sqrt(B.real*B.real + B.imag*B.imag);
        double Bphs = Math.atan2(B.imag, B.real);
        double mag = Amag / Bmag;
        double phs = Aphs - Bphs;
        return new Complex(mag*Math.cos(phs), mag*Math.sin(phs));
    }

    public static Complex exp(double f) {
        double rad = 2 * Math.PI * f;
        Complex res = new Complex(Math.cos(rad), Math.sin(rad));
//        MatComplex.debug.println("exp( " + Format.format(f,2)
//                + ") is " + res);
        return res;
    }

    public String toString() {
        return "[" + Format.format(real, 3) + ", "
                   + Format.format(imag, 3) + "]";
    }
}

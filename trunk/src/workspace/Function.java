package workspace;

import java.lang.reflect.Method;
import jmatrix.*;

import java.util.HashMap;
import java.util.Hashtable;
import interpreter.*;
import java.util.ArrayList;
import fileIO.*;
import main.*;
import plotting.*;
import sound.*;

/**
 * This represents a function, and includes the ability to apply
 * any method to a function. This assumes that anything returned 
 * from a function is a MatObject.
 * 
 * The applyFunction method requires knowledge of the function
 * signature and the full package extension, which will be stored
 * in a hash table to functions with hard-coded data.
 * 
 * @author Zach Wilt
 *
 */
public class Function {

    private String name;
    private int numArgs;
    private String fullPackage; //i.e. java.lang.Math for sin
    private Class[] paramTypes; //i.e.Class.forName("jmatrix.Matrix")
    private static HashMap<String, Function> ht;// </editor-fold>

    public Function(String name, String fullPackage, int numArgs, Class... paramTypes) {
        this.name = name;
        this.fullPackage = fullPackage;
        this.numArgs = numArgs;
        this.paramTypes = paramTypes;
    }

    public static MatObject[] applyFunction(Function f, CellArray ca) {
        MatObject[] res = null;
        MatObject arguments[] = new MatObject[ca.length()];
        for(int i = 0; i < ca.length(); i++) {
            arguments[i] = ca.get(i+1);
        }
        try {
            Class myClass = Class.forName(f.getFullPackage());
            Method myMethod = myClass.getMethod(f.getName(), f.getParamTypes());

            // Check if we're using a built-in Java math method
            if (myClass.equals(Math.class)) {
                res = new MatObject[]{Matrix.applyMathMethodToMatrix(f.getName(), arguments)};
            } else {//We're using one our our methods
            	try{
            		res = (MatObject[]) myMethod.invoke(null, (Object[]) arguments);
            
            	}
            	catch(Exception e){
            		res = new MatObject[] {(MatObject)myMethod.invoke(null, (Object[]) arguments)};
            	}
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return res;

    }

    public static MatObject[] checkSpecialCases(String fname, CellArray args) throws Exception{
        CellArray ca = null;
        Matrix xv = null;
        if (fname.equals("meshgrid")) {
            // meshgrid called
            ca = Matrix.meshgrid((Matrix) args.get(1), (Matrix) args.get(2));
        } else if( fname.equals("size") ) {
    /* D = SIZE(X), for M-by-N matrix X, returns the two-element row vector
    D = [M,N] containing the number of rows and columns in the matrix.
    For N-D arrays, SIZE(X) returns a 1-by-N vector of dimension lengths.
    Trailing singleton dimensions are ignored.*/
            MatObject o = args.get(1);
            int nd = o.size.length;
            xv = new Matrix(1, nd);
            for(int ndx = 1; ndx <= nd; ndx++) {
                xv.set(ndx, o.size[ndx-1]);
            }
            ca = new CellArray(xv);
        } else if (fname.equals("fopen")){
            if (args.length() == 1){
                ca = FileIO.fopen((MatString) args.get(1));
            }
            else if (args.length() == 2){
                ca = FileIO.fopen((MatString)args.get(1), (MatString)args.get(2));
            }
        } else if (fname.equals("fprintf")){
            //@TODO: bounds checking
            if (args.get(1) instanceof Matrix){//check if we were given a file handle
                MatObject[] them = new MatObject[args.length()-2];
                for (int i = 1; i <= them.length; i++){
                    them[i] = args.get(i+2);
                }
                ca = FileIO.fprintf((Matrix)args.get(1), (MatString)args.get(2), them);
            }
            else if (args.get(1) instanceof MatString){
                MatObject[] them = new MatObject[args.length()-1];
                for (int i = 1; i <= them.length; i++){
                    them[i] = args.get(i+1);
                }
                ca = FileIO.fprintf((MatString)args.get(1), them);
            }
        } else if (fname.equals("sort")) {
            // sort called
            ca = Matrix.sort((Matrix) args.get(1));
        } else if (fname.equals("min")) {
            // min called
            ca = Matrix.min((Matrix) args.get(1));
        } else if (fname.equals("max")) {
            // max called
            ca = Matrix.max((Matrix) args.get(1));
        } else if (fname.equals("colon")) {
            switch (args.length()) {
                case 2:
                    ca = new CellArray(Matrix.colon((Matrix) args.get(1),
                            new Matrix(1), (Matrix) args.get(2)));
                    break;
                case 3:
                    ca = new CellArray(Matrix.colon((Matrix) args.get(1),
                            (Matrix) args.get(2), (Matrix) args.get(3)));
                    break;
            }
        } else if (fname.equals("linspace")) {
            switch (args.length()) {
                case 2:
                    ca = new CellArray(Matrix.linspace((Matrix) args.get(1),
                            (Matrix) args.get(2), new Matrix(100)));
                    break;
                case 3:
                    ca = new CellArray(Matrix.linspace((Matrix) args.get(1),
                            (Matrix) args.get(2), (Matrix) args.get(3)));
                    break;
            }
        } else if (fname.equals("zeros")) {
            switch (args.length()) {
                case 1:
                    xv = (Matrix) args.get(1);
                    if(xv.n > 1) {
                        ca = new CellArray(Matrix.zeros((int) xv.get(1), 
                                (int) xv.get(2)));
                    } else {
                        ca = new CellArray(Matrix.zeros(new Matrix(1), 
                            (Matrix) args.get(1)));
                    }
                    break;
                case 2:
                    ca = new CellArray(Matrix.zeros( 
                            (Matrix) args.get(1), (Matrix) args.get(2)));
                    break;
            }
        } else if (fname.equals("ones")) {
            switch (args.length()) {
                case 1:
                    xv = (Matrix) args.get(1);
                    if(xv.n > 1) {
                        ca = new CellArray(Matrix.ones((int) xv.get(1), 
                                (int) xv.get(2)));
                    } else {
                        ca = new CellArray(Matrix.ones(new Matrix(1), 
                            (Matrix) args.get(1)));
                    }
                    break;
                case 2:
                    ca = new CellArray(Matrix.ones( 
                            (Matrix) args.get(1), (Matrix) args.get(2)));
                    break;
            }
        } else if (fname.equals("rand")) {
            switch (args.length()) {
                case 1:
                    xv = (Matrix) args.get(1);
                    if(xv.n > 1) {
                        ca = new CellArray(Matrix.rand((int) xv.get(1), 
                                (int) xv.get(2)));
                    } else {
                        ca = new CellArray(Matrix.rand(new Matrix(1), 
                            (Matrix) args.get(1)));
                    }
                    break;
                case 2:
                    ca = new CellArray(Matrix.rand( 
                            (Matrix) args.get(1), (Matrix) args.get(2)));
                    break;
            }
        } else if (fname.equals("plot")) {
            switch (args.length()) {
                case 1:
                    xv = Matrix.colon(1, args.get(1).n);
                    Plots.plot(Plot.PLOT_2, xv, (Matrix) args.get(1), "b");
                    break;
                case 2:
                    if (args.get(2) instanceof MatString) {
                        xv = Matrix.colon(1, args.get(1).n);
                        Plots.plot(Plot.PLOT_2, xv, (Matrix) args.get(1),
                                args.get(2).toString());
                    } else {
                        Plots.plot(Plot.PLOT_2, (Matrix) args.get(1),
                                (Matrix) args.get(2), "b");
                    }
                    break;
                case 3:
                    Plots.plot(Plot.PLOT_2, (Matrix) args.get(1),
                            (Matrix) args.get(2), args.get(3).toString());
                    break;
            }
            ca = new CellArray(new Matrix(1));
        } else if (fname.equals("text")) {
            switch (args.length()) {
                case 3:
                    Plots.text((Matrix) args.get(1), (Matrix) args.get(2), 
                            new Matrix(0), args.get(3).toString());
                    break;
                case 4:
                    Plots.text((Matrix) args.get(1), (Matrix) args.get(2), 
                            (Matrix) args.get(3), args.get(4).toString());
                    break;
            }
            ca = new CellArray(new Matrix(1));        
        } else if (fname.equals("plot3")) {
            switch (args.length()) {
                case 3:
                    Plots.plot3((Matrix) args.get(1), (Matrix) args.get(2),
                                (Matrix) args.get(3), "b-");
                    break;
                case 4:
                    Plots.plot3((Matrix) args.get(1), (Matrix) args.get(2),
                             (Matrix) args.get(3), args.get(4).toString());
                    break;
            }
            ca = new CellArray(new Matrix(-1));
        } else if (fname.equals("mesh")) {
            switch (args.length()) {
                case 3:
                    Plots.mesh((Matrix) args.get(1), (Matrix) args.get(2),
                               (Matrix) args.get(3));
                    break;
            }
            ca = new CellArray(new Matrix(-1));
        } else if (fname.equals("meshz")) {
            switch (args.length()) {
                case 3:
                    Plots.meshz((Matrix) args.get(1), (Matrix) args.get(2),
                               (Matrix) args.get(3));
                    break;
            }
            ca = new CellArray(new Matrix(-1));
        } else if (fname.equals("surf")) {
            switch (args.length()) {
                case 3:
                    Plots.surf((Matrix) args.get(1), (Matrix) args.get(2),
                               (Matrix) args.get(3), (Matrix) args.get(3));
                    break;
                case 4:
                    Plots.surf((Matrix) args.get(1), (Matrix) args.get(2),
                               (Matrix) args.get(3), (Matrix) args.get(4));
                    break;
            }
            ca = new CellArray(new Matrix(-1));
        } else if (fname.equals("view")) {
            // real part of a complex number
            Plots.view((Matrix) args.get(1), (Matrix) args.get(2));
            ca = new CellArray(new Matrix(-1));
        } else if (fname.equals("real")) {
            // real part of a complex number
            ca = new CellArray(MatComplex.real((MatComplex) args.get(1)));
        } else if (fname.equals("imag")) {
            // imaginary part of a complex number
            ca = new CellArray(MatComplex.imag((MatComplex) args.get(1)));
        } else if (fname.equals("wavread")) {
            // wavread called with one answer
            ca = Sound.wavread(args.get(1).toString());
        } else if (fname.equals("csvread")) {
            // csvread called with one answer
            ca = FileIO.csvread(args.get(1).toString());
        } /*else if (fname.equals("save")) {
            ca = MatObject.save(new MatString(args.get(1)));
            ca = new CellArray(new Matrix(1));
        } else if (fname.equals("load")) {
            ca = MatObject.load(new MatString(args.get(1)));
            ca = new CellArray(new Matrix(1));
        }*/
        
        if (ca == null) {
            return null;
        } else {
            return ca.getData();//ca.get(1);
        }
    }

    public String getName() {
        return name;
    }

    public String getFullPackage() {
        return fullPackage;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public static Function getFunction(String name) {

        if (ht.containsKey(name)) {
            return ht.get(name);
        } else {
            return null;
        }
    }

    /**
     * This method will be called exactly once at startup. The idea is to
     * store every function, hard-coded once.
     */
    public static void createFunctionTable() {
        ht = new HashMap<String, Function>();

        /*
         * Math Library
         */
        ht.put("abs", new Function("abs", "java.lang.Math", 1, double.class));
        ht.put("acos", new Function("acos", "java.lang.Math", 1, double.class));
        ht.put("asin", new Function("asin", "java.lang.Math", 1, double.class));
        ht.put("atan", new Function("atan", "java.lang.Math", 1, double.class));
        ht.put("atan2", new Function("atan2", "java.lang.Math", 2, double.class));
        ht.put("cbrt", new Function("cbrt", "java.lang.Math", 1, double.class));
        ht.put("ceil", new Function("ceil", "java.lang.Math", 1, double.class));
        ht.put("copySign", new Function("copySign", "java.lang.Math", 1, double.class));
        ht.put("cos", new Function("cos", "java.lang.Math", 1, double.class));
        ht.put("cosh", new Function("cosh", "java.lang.Math", 1, double.class));
        ht.put("exp", new Function("exp", "java.lang.Math", 1, double.class));
        ht.put("expm1", new Function("expm1", "java.lang.Math", 1, double.class));
        ht.put("floor", new Function("floor", "java.lang.Math", 1, double.class));
        ht.put("getExponent", new Function("getExponent", "java.lang.Math", 1, double.class));
        ht.put("hypot", new Function("hypot", "java.lang.Math", 1, double.class));
        ht.put("log", new Function("log", "java.lang.Math", 1, double.class));
        ht.put("log10", new Function("log10", "java.lang.Math", 1, double.class));
        ht.put("log1p", new Function("log1p", "java.lang.Math", 1, double.class));
        ht.put("max", new Function("max", "java.lang.Math", 1, double.class));
        ht.put("min", new Function("min", "java.lang.Math", 1, double.class));
        ht.put("nextAfter", new Function("nextAfter", "java.lang.Math", 1, double.class));
        ht.put("nextUp", new Function("nextUp", "java.lang.Math", 1, double.class));
        ht.put("pow", new Function("pow", "java.lang.Math", 1, double.class));
        ht.put("random", new Function("random", "java.lang.Math", 1, double.class));
        ht.put("rint", new Function("rint", "java.lang.Math", 1, double.class));
        ht.put("round", new Function("round", "java.lang.Math", 1, double.class));
        ht.put("scalb", new Function("scalb", "java.lang.Math", 1, double.class));
        ht.put("signum", new Function("signum", "java.lang.Math", 1, double.class));
        ht.put("sin", new Function("sin", "java.lang.Math", 1, double.class));
        ht.put("sqrt", new Function("sqrt", "java.lang.Math", 1, double.class));
        ht.put("tan", new Function("tan", "java.lang.Math", 1, double.class));
        ht.put("tanh", new Function("tanh", "java.lang.Math", 1, double.class));
        ht.put("toDegrees", new Function("toDegrees", "java.lang.Math", 1, double.class));
        ht.put("toRadians", new Function("toRadians", "java.lang.Math", 1, double.class));
        ht.put("ulp", new Function("ulp", "java.lang.Math", 1, double.class));
        /*
         * matrix Library
         */
        ht.put("add", new Function("add", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("addIP", new Function("add", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("char", new Function("charCast", "jmatrix.MatObject", 1, MatObject.class));
        ht.put("camax", new Function("max", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("camin", new Function("min", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("ceil", new Function("ceil", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("colon", new Function("colon", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("clear", new Function("clear", "functions.Clear", 0));
        ht.put("clc", new Function("clc", "functions.CLC", 0));
        ht.put("complex", new Function("complex", "jmatrix.MatObject", 2,
                Matrix.class, Matrix.class));
        ht.put("cross", new Function("cross", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("csvwrite", new Function("csvwrite", "fileIO.FileIO", 2,
                CellArray.class, MatString.class));
        ht.put("cumprod", new Function("cumprod", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("cumsum", new Function("cumsum", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("disp", new Function("disp", "main.Main", 1, MatString.class));
        ht.put("divd", new Function("div", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("div", new Function("div", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("divIP", new Function("div", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("divIPm", new Function("div", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("eq", new Function("eq", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("find", new Function("find", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("fix", new Function("fix", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("floor", new Function("floor", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("expd", new Function("exp", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("ge", new Function("ge", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("get1", new Function("get", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("get2", new Function("sindex", "jmatrix.Matrix", 3,
                Matrix.class, double.class, double.class));
        ht.put("gplot", new Function("sindex", "plotting.Plots", 3,
                Matrix.class, Matrix.class, MatString.class));
        ht.put("gt", new Function("gt", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("hcat", new Function("hcat", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("identity", new Function("identity", "jmatrix.Matrix", 1, double.class));
        ht.put("imag", new Function("imag", "jmatrix.MatComplex", 1,
                MatComplex.class));
        ht.put("image", new Function("image", "plotting.Plots", 1, Uint8.class));
        ht.put("imread", new Function("imread", "image.Picture", 1, MatString.class));
        ht.put("imshow", new Function("imshow", "plotting.Plots", 1, Uint8.class));
        ht.put("index", new Function("index", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("input", new Function("input", "interpreter.Interpreter", 1,
                MatString.class));
        ht.put("interp1d", new Function("interp1", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, double.class));
        ht.put("interp1", new Function("interp1", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("inv", new Function("inv", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("isprime", new Function("isprime", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("le", new Function("le", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("length", new Function("length", "jmatrix.MatObject", 1, MatObject.class));
        ht.put("lt", new Function("lt", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("magic", new Function("magic", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("matMult", new Function("matMult", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("max", new Function("max", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("meshgrid", new Function("meshgrid", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("min", new Function("min", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("multd", new Function("mult", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("mult", new Function("mult", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("multIP", new Function("mult", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("multIPm", new Function("mult", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("ne", new Function("ne", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("ones", new Function("ones", "jmatrix.Matrix", 3,
                Matrix.class, double.class, double.class));
        ht.put("polyfit", new Function("polyfit", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, double.class));
        ht.put("polyval", new Function("polyval", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("polyvalm", new Function("polyval", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("pow", new Function("pow", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("primes", new Function("primes", "jmatrix.Matrix", 1, 
        		Matrix.class));
        ht.put("rand", new Function("rand", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("real", new Function("real", "jmatrix.MatComplex", 1,
                MatComplex.class));
        ht.put("reshape", new Function("reshape", "jmatrix.Matrix", 3,
                Matrix.class, Integer.class, Integer.class));
        //ht.put("round", new Function("round","jmatrix.Matrix", 1, Matrix.class));
        ht.put("set2d", new Function("set", "jmatrix.Matrix", 4,
                Matrix.class, Integer.class, Integer.class, double.class));
        ht.put("set1d", new Function("set", "jmatrix.Matrix", 3,
                Matrix.class, Integer.class, double.class));
        ht.put("set1", new Function("set", "jmatrix.Matrix", 4,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("set2", new Function("set", "jmatrix.Matrix", 4,
                Matrix.class, Matrix.class, Matrix.class, Matrix.class));
        ht.put("sindex1", new Function("sindex", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("sindex2", new Function("sindex", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("sort", new Function("sort", "jmatrix.Matrix", 1,
                Matrix.class));
        ht.put("sparse", new Function("sparse", "jmatrix.Sparse", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("sound", new Function("sound", "sound.Sound", 2,
                SignedByte.class, Matrix.class));
        ht.put("splined", new Function("spline", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, double.class));
        ht.put("spline", new Function("spline", "jmatrix.Matrix", 3,
                Matrix.class, Matrix.class, Matrix.class));
        ht.put("subd", new Function("sub", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("sub", new Function("sub", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("subIPd", new Function("sub", "jmatrix.Matrix", 2,
                Matrix.class, double.class));
        ht.put("subIP", new Function("sub", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        ht.put("subplot", new Function("subplot", "plotting.Figure", 3,
                 Matrix.class, Matrix.class, Matrix.class));
        ht.put("sum", new Function("sum", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("title", new Function("title", "plotting.Figure", 1, MatString.class));
        ht.put("transpose", new Function("transpose", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("vcat", new Function("vcat", "jmatrix.Matrix", 1, Matrix.class));
        ht.put("view", new Function("view", "plotting.Plots", 2, 
                Matrix.class, Matrix.class));
        ht.put("xlabel", new Function("xlabel", "plotting.Figure", 1, MatString.class));
        ht.put("ylabel", new Function("ylabel", "plotting.Figure", 1, MatString.class));
        ht.put("zlabel", new Function("zlabel", "plotting.Figure", 1, MatString.class));
        ht.put("zeros", new Function("zeros", "jmatrix.Matrix", 2,
                Matrix.class, Matrix.class));
        
        //Other functions
        ht.put("cd", new Function("cd", "main.Main", 1, MatString.class));
        //ht.put("fopen", new Function("fopen", "fileIO.FileIO", 2, String.class, String.class));
        ht.put("load", new Function("load", "jmatrix.MatObject", 1, MatString.class));
        ht.put("save", new Function("save", "jmatrix.MatObject", 1, MatString.class));
        ht.put("eval", new Function("eval", "interpreter.Interpreter", 1, MatString.class));



    }

    public static boolean isFunction(String name) {
        return ht.containsKey(name);
    }

    public String toString() {
        return "Function " + name + " with " + numArgs + " arguments";
    }

    public static void main(String[] args) {
        createFunctionTable();
        System.out.println(ht.containsKey("matMult"));
        try {
            /* Function myFunc = new Function("matMult", "jmatrix.Matrix", 2, Matrix.class, Matrix.class);
            Class myClass = Class.forName(myFunc.getFullPackage());
            Method myMethod = myClass.getMethod(myFunc.getName(), myFunc.getParamTypes());
            
            MatObject test = applyFunction(myFunc, new Matrix(5), new Matrix(3));
            System.out.println(test);
            
            System.out.println((Math.class).equals(Class.forName("java.lang.Math")));
             */
            /* Function f = getFunction("cos");
            Class myClass = Class.forName(f.getFullPackage());
            Method myMethod = myClass.getMethod(f.getName(), f.getParamTypes());
            Object[] params = {(double)3};
            double x = (Double)myMethod.invoke(null, (double)2);
             */
            double[] vec = {1, 2, 3, 4};
            String methodName = "sqrt";
            double[] vec2 = vec2 = Matrix.applyMathMethodToVector(vec, methodName);
            for (int i = 0; i < vec2.length; i++) {
                System.out.println(vec2[i]);
            }

            //Matrix x = Matrix.applyMathMethodToMatrix(new Matrix(2,2, 1,3,2,4), "cos");
            //System.out.println(x);

            Function sqrt = getFunction("round");
            CellArray ca = new CellArray( new Matrix(2, 2, 1.11, 3.93, 2.5, 4.001) );
            Matrix y = (Matrix) applyFunction(sqrt, ca)[0];
            System.out.println(y);

            Function linspace = getFunction("linspace2");
            ca.set(1, 1, new Matrix(1));
            ca.hcat(new Matrix(2));
            Matrix z = (Matrix) Interpreter.call("zeros", ca)[0];
            //(Matrix)applyFunction(linspace, new Matrix(1), new Matrix(2));
            System.out.println(z);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        int[] arr = new int[10000];
        String s = "";
        for (int i = 0; i < 10000; i++) {
            arr[i] = i + 1;
            s = s + i + " ";
        }
        System.out.println(s);


    }
}

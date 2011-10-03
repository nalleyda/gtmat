package main;

import java.io.*;
import jmatrix.*;
import plotting.*;
import workspace.*;
import properties.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import interpreter.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import parser.TreeWalker;
import java.util.Stack;
import java.awt.Color;

/**
 *
 * @author dsmith
 */
public class Main {

    public static PrintStream debug;
    public static GT_Mat frame;
    public static InteractionWindow interactions;
    public static String[] filePaths; //{"."};
    private static String currentDirectory;
    public static JFileChooser fileChooser;
    public static String fileName = null;
    public static WorkspaceStack wstack = new WorkspaceStack();
    public static Stack<String> helperStack = new Stack<String>();
    public static final String version = "1.11";
    
    public static HashMap<String, ArrayList<Boolean>> bpsMap;
    
    public static GT_Mat getGT_Mat() {
        return frame;
    }
    
    public static void putBreakpoints(String name, ArrayList<Boolean> bps) {
        bpsMap.put(name,bps);
    }
    
    public static ArrayList<Boolean> getBreakpoints(String name) {
        return bpsMap.get(name);
    }
    
    public static MatObject disp(MatString mstr) {
        interactions.appendString(mstr.toString() + "\n", 0);
        return new Matrix(mstr.n);
    }

    public static void init(){
        try{
            Runtime.getRuntime().exec("java -Xms128m -Xmx256m Main.java");
            System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            debug = new PrintStream(new FileOutputStream("debug.log"));
        } catch (IOException e) {
            System.out.print("Error " + e + " opening debug.log");
        }
        PropertyHandler.initProperties();
        PropertiesWindow.openFirstTime();
        debug.println("debug log opened");
        currentDirectory = PropertyHandler.getDefaultWorkingDirectory();
        fileChooser =
                new JFileChooser(new File(currentDirectory));
        Function.createFunctionTable();
        Interpreter.makeConstants();
        if(!TreeWalker.validateTokens()){
            throw new RuntimeException("tokens out of order");
        }
        bpsMap = new HashMap<String, ArrayList<Boolean>>();
        bpsMap.put("Base", new ArrayList<Boolean>());
    }

    public static MatString cd(MatString dirIn){

        if (dirIn == null){
            throw new RuntimeException("Invalid directory");
        }
        String dir = dirIn.toString();
        return cd(dir);
    }
    
    public static MatString cd(String dir) {
        System.out.println("\n\n\n\nDirectory: " + dir + "\n\n\n\n");

        //Check the special cases
        if (dir.equals(".")){
            //do nothing
            System.out.println(currentDirectory);
        }
        else if(dir.equals("..")){
            int i;
            for (i = currentDirectory.length()-2; i >= 0; i--){
                if (currentDirectory.charAt(i) == File.separatorChar){
                    break;
                }
            }
            setCurrentDirectory(currentDirectory.substring(0, i));
        }
        else{

            String newDir = currentDirectory;
            if (!newDir.substring(newDir.length()-1, newDir.length()).equals(File.separator)){
                newDir += File.separator;
            }
            newDir += dir;
            if (!newDir.substring(newDir.length()-1, newDir.length()).equals(File.separator)){
                newDir += File.separator;
            }
            System.out.println("\n\n\nThis is what I think you wanted: " + newDir + "\n\n\n");

            //Try checking if this is a relative path
            if ((new File(newDir)).isDirectory()){
                setCurrentDirectory(newDir);
            }
            //Check if this is an absolute path
            else if ((new File(dir)).isDirectory()){
                setCurrentDirectory(dir);
            }
            else{
                throw new RuntimeException("Invalid directory");
            }
        }
        return new MatString(currentDirectory);
    }

    /**
     * Sets the current working directory.
     * @param s the new directory as an absolute file path.
     */
    public static void setCurrentDirectory(String dir) {
        currentDirectory = dir;
        PropertyHandler.addRecentDirectory(dir);
        frame.getPatternList().setModel(new DefaultComboBoxModel(PropertyHandler.getRecentDirectories()));
        if(!dir.endsWith(File.separator))
            dir+= File.separator;
       TabbedPane.fileTree.updateTree(dir);
    }

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                try{
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch(Exception e) {}
                createAndShowGUI();
                interactions.getTextPane().requestFocusInWindow();
            }
        });

        /*   System.out.println("Interpreter Tests");
        System.out.println(new Matrix(1,2,3,4));
        Matrix x = (Matrix)Interpreter.call("add", new Matrix(2,2,1,2,3,4), new Matrix(2,2,5,6,7,8));

        Interpreter.assign("x", x);
        Interpreter.assign("y", (Matrix)Interpreter.call("x", new Matrix(1), new Matrix(1,2,1,2)));
        System.out.println(wstack.peek());

        Interpreter.assign("x", (Matrix)Interpreter.call("x", new Matrix(2,2, 4,3,2,1)));

        Interpreter.assign("z", (Matrix)Interpreter.call("x", new Matrix(2,1,1,3)));
        System.out.println(wstack.peek());*/
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        frame = new GT_Mat("Georgia Tech Mini-Matlab");
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * METHOD UNDER CONSTRUCTION
     *
     * This method will figure out what the parser really needs
     * when it sees something like "assign(name, data, input1, ..., inputN)".
     * (i.e. whether it should index an existing variable, call a
     * function, or create a new variable).
     *
     * inputs is an optional argument, and is used for any arguments in
     * parentheses (e.g. "arr(5, 7) = {[3, 2, 7]};" would have
     * name: arr         <-- a String
     * data: new CellArray([3, 2, 7]) <-- a MatObject
     * inputs: [5, 7]    <-- 2 separate inputs
     *
     * and the method call would appear as:
     * assignFromPaser(arr, evaluateRHS({[3, 2, 7]}), 5, 7)
     *
     * Here, we assume that the parser is able to determine that {[3, 2, 7]} is
     * asking for a new, 1x1 CellArray which has as its only element the
     * 1x3 Matrix [3, 2, 7]
     *
     */
    public static void assignFromParser(String name, MatObject data, int... inputs) {
    }

    /**
     * METHOD UNDER CONSTRUCTION
     *
     * This method should be used when the right-hand side of the equals sign
     * in a line of code involves either a variable name or a function name
     * (i.e. it is not entirely hardcoded, like x = [1,2,3];).
     */
    public static MatObject evaluateRHS(String name, MatObject... inputs) throws Exception{
        Workspace curW = wstack.peek();
        DefaultListModel varList = curW.getVarList();

        //First, we check to see if the variable already exists
        for (int i = 0; i < varList.size(); i++) {
            //If the variable does exist, inputs are indices
            if (((Variable) varList.get(i)).getVarName().equals(name)) {
                MatObject data = ((Variable) varList.get(i)).getData();
                int type = data.type;

                if (inputs.length == 0) {
                    MatObject it = ((Variable) varList.get(i)).getData();
                    return (MatObject) it.copy();
                }

                switch (type) {
                    case MatObject.DOUBLE:
                        //(row, col) indexing method
                        if (inputs.length == 2) {
                            return Matrix.get((Matrix) data, (Matrix) inputs[0], (Matrix) inputs[1]);
                        } //linear indexing method
                        else if (inputs.length == 1) {
                            return Matrix.get((Matrix) data, (Matrix) inputs[0]);
                        } //3 or more comma-separated inputs
                        else {
                            //@todo: fix me
                        }

                        break;
                }


            }
        }

        //If the variable doesn't exist, see if it is a function call
        Function f = Function.getFunction(name);
        if (f != null) {
//            return Function.applyFunction(f, inputs);
        }

        //If we get to this point, then the RHS is invalid
        throw new RuntimeException("Invalid variable name or function call.");

    }
    public static void WS_test() {
/*

        System.out.println("Interpreter Tests");
        System.out.println(new Matrix(1, 2, 3, 4));
        Matrix x = (Matrix) Interpreter.call("add", new Matrix(2, 2, 1, 2, 3, 4), new Matrix(2, 2, 5, 6, 7, 8));

        Interpreter.assign("x", x, true);
        Interpreter.assign("y", (Matrix) Interpreter.call("x", new Matrix(1), new Matrix(1, 2, 1, 2)), true);
        System.out.println(wstack.peek());

        Interpreter.assign("x", (Matrix) Interpreter.call("x", new Matrix(2, 2, 4, 3, 2, 1)), true);

        Interpreter.assign("z", (Matrix) Interpreter.call("x", new Matrix(2, 1, 1, 3)), true);
        System.out.println(wstack.peek());
*/
    }

    public static void Plot_Test() {
        Matrix param[];

        Color clr = Color.cyan;
        int rgb = clr.getRGB();
        String str = Integer.toHexString(rgb);
        int red = clr.getRed();
        int green = clr.getGreen();
        int blue = clr.getBlue();
        int alpha = clr.getAlpha();
        
        System.out.println("Started test");
        double nan = Math.exp(1000);
        double pinf = 1.0/0;
        double minf = -1.0/0;
        double valpi = 4.0 * Math.atan(1.0);
        double ev = Math.exp(1.0);
        Matrix x = new Matrix(-42);
        debug.println("x is " + x + ":: " + x.info());
        Matrix v0 = Matrix.zeros(2, 3);
        debug.println("v0 is " + v0);
        Matrix v1 = Matrix.ones(1, 6);
        v1 = Matrix.mult(v1, 42);
        debug.println("v1 is " + v1);
        Matrix v2 = new Matrix(v1);
        debug.println("v2 is " + v2);
        Matrix.set(v1, 1, 127);
        debug.println("v1 is now " + v1);
        param = new Matrix[3];
        param[0] = v1;
        param[1] = x;
        param[2] = v2;
        Matrix hc = Matrix.hcat(param);
        debug.println("[v1 x v2] is " + hc);
        Matrix c = Matrix.gt(v1, v2);
        debug.println("v1 > v2 is " + c);
        Matrix v3A = Matrix.mult(v1, 5);
        debug.println("v1 * 5 is " + v3A);
        Matrix v3 = Matrix.add(v3A, v2);
        debug.println("v3 = v1 * 5 + v2 is " + v3);
        Matrix v4 = Matrix.div(v1, 3.7);
        debug.println("v4 = v1 / 3.7 is " + v4);
        Matrix v5 = Matrix.floor(v4);
        debug.println("v5 = floor(v4) is " + v5);
        Matrix th = Matrix.linspace(0, 2 * Math.PI, 8);
        debug.println("th is " + th);
        Matrix sinth = Matrix.applyFunction(th, "sin");
        debug.println("sin(theta) is " + sinth);
        Matrix fineth = Matrix.linspace(0, 2 * Math.PI, 32);
        debug.println(" fineth is " + fineth);
        Matrix int1 = Matrix.interp1(th, sinth, fineth);
        debug.println("interp1(th, sinth, fineth) is " + int1);
        Matrix cf = Matrix.polyfit(th, sinth, 3);
        debug.println("polyfit(th, sinth, 3) is " + cf);
        Matrix y1 = Matrix.polyval(cf, fineth);
        debug.println("polyval(cf, fineth) is " + y1);
        Matrix ndx = Matrix.colon(3, 6);
        Matrix sth = Matrix.sindex(th, ndx);
        Matrix ssinth = Matrix.sindex(sinth, ndx);
        Matrix spl = Matrix.spline(sth, ssinth, fineth);
        debug.println("spline(th(3:6), sinth(3:6), fineth) is " + spl);
        /*
         * test plotting
         */
        Figure.close(-1);
        Plots.plot(Plot.PLOT_2, th, sinth,"b");
        Plots.hold(true);
        Plots.plot(Plot.PLOT_2, fineth, int1, "g");
        Plots.plot(Plot.PLOT_2, fineth, y1, "m");
//        Plots.hold(false);
        Plots.plot(Plot.PLOT_2, fineth, spl, "c");
//        Plots.hold(true);
        Plots.plot(Plot.PLOT_2, sth, ssinth, "r*");
        Matrix cth = Matrix.applyFunction(sth, "cos");
        Plots.plot(Plot.PLOT_2, sth, cth,"b");
        Matrix rad = Matrix.applyFunction("atan2", ssinth, cth).mult(0.333);
        debug.println("sin(th) is " + ssinth);
        debug.println("cos(th) is " + cth);
        debug.println("atan2(cth, ssinth)/3 is " + rad);
        Plots.plot(Plot.PLOT_2, sth, rad, "k*-");
        String lgnd[] = {"sin(th)", "interp1",
            "polyfit", "spline",
            "spline pts", "cos", "atan2(c,s)"};
        Plots.legend(lgnd);
        Matrix eye = Matrix.identity(7);

        debug.println("eye(6) is "
                + eye);
        Matrix m = Matrix.magic(new Matrix(7));

        debug.println("magic(7) is "
                + m);
        param = new Matrix[2];
        param[0] = Matrix.colon(
                1, 2);
        debug.println(
                "row 1 is " + param[0]);
        param[1] = Matrix.colon(
                3, 4);
        debug.println(
                "row 2 is " + param[1]);
        Matrix a12_34 = Matrix.vcat(param);
        debug.println(
                "[1 2;3 4] is " + a12_34);
        param = new Matrix[6];
        param[0] = new Matrix(
                "[35 1 6 26 19 24]");
        debug.println(
                "param[0] is " + param[0]);
        param[1] = new Matrix(
                "[3 32,7,21,23, 25]");
        debug.println(
                "param[1] is " + param[1]);
        param[2] = new Matrix(
                "[31, 9, 2, 22, 27, 20]");
        debug.println(
                "param[2] is " + param[2]);
        param[3] = new Matrix(
                "[8.0, 28.0, 33.0, 17.0, 10.0, 15.0]");
        debug.println(
                "param[3] is " + param[3]);
        param[4] = new Matrix(
                "[30.0, 5.0, 34.0, 12.0, 14.0, 16.0]");
        debug.println(
                "param[4] is " + param[4]);
        param[5] = new Matrix(
                "[4.0, 36.0, 29.0, 13.0, 18.0, 11.0]");
        debug.println(
                "param[5] is " + param[5]);
        Matrix vc = Matrix.vcat(param);
        debug.println(
                "vc (vertical stack) is " + vc);
        CellArray ca = Matrix.max(vc);
        debug.println(
                "vc.max is " + ca);
        Matrix vecr = Matrix.colon(1, 3, 6);
        Matrix vecc = Matrix.colon(4, 6);
        ndx = Matrix.sindex(vc, vecr, vecc);

        debug.println("ndx = vc(1:3:6, 4:6) is "
                + ndx);
        Matrix tsp = Matrix.transpose(ndx);
        debug.println(
                "tsp = ndx' is " + tsp + ":: " + tsp.info());
        double[] sz = tsp.size();
        str = "size of tsp is [";
        for (int i = 0;
                i < sz.length;
                i++) {
            str += " " + sz[i];
            if (i < (sz.length - 1)) {
                str += ",";
            }
        }
        str += " ]";

        debug.println(str);
        // mess up vc for inversion

        Matrix.set(vc, 1, 0);
        Matrix minv = Matrix.inv(vc);
        debug.println(
                "minv = vc.inv() is " + minv);
        Matrix check = Matrix.matMult(minv, vc);
        debug.println(
                "minv*vc is " + check);
        Matrix setin = Matrix.sindex(vc, Matrix.colon(1, 3), Matrix.colon(2, 5));

        debug.println("put this "
                + setin + " into " + a12_34);
        Matrix.set(a12_34, Matrix.colon(3, 5), Matrix.colon(4, 7), setin);
        debug.println(
                "a12_34(3:5, 4:7) = vc(1:3, 2:5) is " + a12_34);
        Matrix.set(a12_34, 12, 10, 99);
        debug.println(
                "a12_34 with 99 at [12 10] is " + a12_34);
        try {
            Matrix.set(a12_34, 150, -99);  // Throws an exception
            debug.println(
                    "a12_34 with -99 at [150] is " + a12_34);
        } catch (Exception e) {
            debug.println(
                    "a12_34.set(150, -99) throws " + e);
        }
        Matrix rnd = Matrix.rand(new Matrix(5), new Matrix(3)).mult(100);

        debug.println("rand(5,3) is " + rnd);
        ca = Matrix.sort(Matrix.reshape(rnd, 1, 15));
        Matrix srtrnd = (Matrix) ca.get(1);
        debug.println("rnd.reshape(1, 15).sort() is "
                + srtrnd);

        Matrix xp = Matrix.colon(1, 4);
        Matrix yp = Matrix.colon(1, 6);
        debug.println("xp is " + xp);
        debug.println("yp is " + yp);
        CellArray xxyy = Matrix.meshgrid(xp, yp);
        Matrix xx = (Matrix) CellArray.get(xxyy, 1, 1);
        Matrix yy = (Matrix) CellArray.get(xxyy, 1, 2);
        debug.println("xx is " + xx);
        debug.println("yy is " + yy);
        Matrix sxx, syy, szz;
        CellArray cc = Matrix.peaks(100);
//        debug.println("peaks(49) returns: ");
        sxx = (Matrix) cc.get(1, 1);
//        debug.println("xx is " + sxx);
        syy = (Matrix) cc.get(1, 2);
//        debug.println("yy is " + syy);
        szz = (Matrix) cc.get(1, 3);
//        debug.println("zz is " + szz);
        Figure it;
        Figure.figure();
        Figure.setHidden(true);
        Plots.setColorMap("autumn");
        Figure.setColorbar(true);
        Plots.mesh(sxx, syy, szz);
        it = Figure.currentFig;
        it.title(new MatString("Mesh Plot with Autumn color"));
        Figure.figure();
        Plots.setColorMap("prism");
        Figure.setShading(Plot.INTERP);
//        Figure.setColorbar(true);
        Plots.surf(sxx, syy, szz, szz);
        it= Figure.currentFig;
        Interpreter.grid(new MatString("ON"));
        it.title(new MatString("Surf Plot with prism color"));
//        Figure.figure();
//        Matrix dl = szz.del2();
//        Plots.setColorMap("prism");
//        Figure.setShading(Plot.INTERP);
//        Figure.setColorbar(true);
//        Plots.surf(sxx, syy, szz, dl);
//        it = Figure.currentFig;
//        it.title(new MatString("Surf gradient Plot with prism color"));
//
//        Figure.figure();
//        Matrix par[] = new Matrix[5];
//        par[0] = Matrix.zeros(1, 5);
//        par[1] = new Matrix(
//                "[-1, -1,  1, 1, -1]");
//        par[2] = new Matrix(
//                "[-1.3, -1.3,  1.3, 1.3, -1.3]");
//        par[3] = new Matrix(
//                "[-1, -1,  1,  1, -1]");
//        par[4] = Matrix.zeros(1, 5);;
//        xx = Matrix.vcat(par);
//        par[0] = Matrix.zeros(1, 5);
//        par[1] = new Matrix(
//                "[1, -1, -1,  1,  1]");
//        par[2] = new Matrix(
//                "[1.3, -1.3, -1.3,  1.3,  1.3]");
//        par[3] = new Matrix(
//                "[1, -1, -1,  1,  1]");
//        par[4] = Matrix.zeros(1, 5);
//        yy = Matrix.vcat(par);
//        par[0] = Matrix.ones(1, 5);
//        par[1] = new Matrix(
//                "[1,  1,  1,  1,  1]");
//        par[2] = Matrix.zeros(1, 5);
//        par[3] = new Matrix(
//                "[-1, -1, -1, -1, -1]");
//        par[4] = new Matrix(
//                "[-1, -1, -1, -1, -1]");
//        Matrix zz = Matrix.vcat(par);
//        Plots.setColorMap("prism");
//        Figure.setShading(Plot.INTERP);
//        Figure.setColorbar(true);
//        Plots.surf(xx, yy, zz, zz);
//        Figure dat = Figure.currentFig;
//        dat.title(new MatString("Cube Plot with prism color"));
//        int n = 2;
//        x = Matrix.colon(-n, n);
//        xxyy = Matrix.meshgrid(x, x);
//        xx = (Matrix) CellArray.get(xxyy, 1, 1);
//        yy = (Matrix) CellArray.get(xxyy, 1, 2);
//        sxx = Matrix.mult(xx, xx);
//        syy = Matrix.mult(yy, yy);
//        szz = Matrix.add(sxx, syy);
//        szz = Matrix.sub(new Matrix(n*n*2), szz);
//        Figure.figure();
//        Figure.setHidden(true);
//        Figure.setShading(Plot.INTERP);
//        Plots.setColorMap("summer");
//        Figure.setColorbar(true);
//        Plots.surf(xx, yy, szz, szz);
//        it = Figure.currentFig;
//        it.title(new MatString("Surf Plot with Summer color"));
//        it.xlabel(new MatString("X direction"));
//        it.ylabel(new MatString("Y direction"));
//        it.zlabel(new MatString("Z direction"));
        System.out.println("Ended tests");
    }
}

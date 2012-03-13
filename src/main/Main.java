package main;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

import jmatrix.*;
import plotting.*;
import workspace.*;
import properties.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

import functions.*;
import gui.InteractionWindow;
import gui.TabbedPane;
import interpreter.*;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;

import Test_Suite.GTMatTesting;

import java.util.Stack;
import java.awt.Color;
import jmatrix.MatObject.Type;
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
    public static final String version = "1.15";
    
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
        GTMatTesting.initTesting(2,2);
        //GTMatTesting.testGTMat(3, 3);
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
                Type type = data.type;

                if (inputs.length == 0) {
                    MatObject it = ((Variable) varList.get(i)).getData();
                    return (MatObject) it.copy();
                }
                switch (type) {
                    case DOUBLE:
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


    
}

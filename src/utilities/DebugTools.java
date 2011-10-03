/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import main.*;
import parser.*;
import plotting.*;
import interpreter.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import java.io.*;

/**
 *
 * @author dsmith
 */
public class DebugTools {

    public static boolean wedoit = true;
    private static GTStringStream ss = null;

    public static void openWhenDebugging(boolean doit) {
        wedoit = doit;
    }

    public static void debugStep(AbstractDocument doc) {
        System.out.println("debug Step");
    }

    public static void debugStepIn(AbstractDocument doc) {
        System.out.println("debug Step In");
    }

    public static void debugStepOut(AbstractDocument doc) {
        System.out.println("debug Step Out");
    }

    public static void debugRun(EditWindow ew) throws Exception {
        System.out.println("Run"/* + (fileName == null?"":(" " + fileName))*/);
        File source = ew.save(ew.name);
        String t_name = ew.name.substring(0, ew.name.length() - 1) + "t";
        File t_file = new File(t_name);
        if (t_file == null 
                || source.lastModified() > t_file.lastModified()
                || Interpreter.fileVersionWrong(t_name)) {
            ew.saveTFile(t_name);
            t_file = new File(t_name);
        }
        File_I_O.readandRunTFile(t_name);
    }

    public static void runCommand(String str) {
        try {
            GTStringStream ss = new GTStringStream(str + "\n");
            GTParser.process(ss);
        } catch (Exception ev) {//Catch exception if any
            System.err.println("Error: " + ev.getMessage());
        }
    }

    public static void debugClear(AbstractDocument doc) {
        System.out.println("debug Clear");
    }

    public static void debugExit(AbstractDocument doc) {
        System.out.println("debug Exit");
    }
}

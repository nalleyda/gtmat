/*
 * Tools to coordinate I/O actions among menus, toolbars and
 * keyboard actions.
 */
package utilities;

import main.*;
import properties.*;
import gui.EditWindow;

import javax.swing.*;
import java.awt.Component;
/**
 *
 * @author dsmith
 */
public class IOTools {

    private static String fileName = null;

    public static void newFile() /*throws Exception*/{
        System.out.println("New File");
        try {
        EditWindow.open(null);
        } catch(Exception ex) {};
        fileName = null;
    }

    public static void closeFile() {
        System.out.println("Close File");
        fileName = null;
    }

    public static void doNothing() {
        System.out.println("do nothing");
    }

    public static void setPath() {
        doNothing();
    }

    public static void editPreferences() {
        PropertiesWindow.open();
    }

    public static void pageSetup() {
        doNothing();
    }

    /*
     * print the interactions window (somehow!)
     */
    public static void print() {
        doNothing();
    }

    public static void print(EditWindow ew) {
        doNothing();
    }

    public static void printSelection() {
        doNothing();
    }

    public static void saveFile(EditWindow ew) {
        System.out.println("Save");
        ew.save(ew.name);
    }

    public static void saveFile() {
        System.out.println("Save Interactions Window");
        // ew.save(ew.name); Save the Interactions Window
    }

    public static void saveFileAs(EditWindow ew) {
        System.out.println("Save as ...");
        if (Main.fileChooser.showSaveDialog(Main.frame)
                == JFileChooser.APPROVE_OPTION) {
            fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
            int ln = fileName.length();
            if(fileName.indexOf('.') < 0) {
                fileName += ".m";
            }
            ew.save(fileName);
        }
    }

    public static void saveTFileAs(EditWindow ew) {
        System.out.println("Save t file as ...");
        if (Main.fileChooser.showSaveDialog(Main.frame)
                == JFileChooser.APPROVE_OPTION) {
            fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
            int ln = fileName.length();
            if(!fileName.endsWith(".t")) {
                fileName += ".t";
            }
            ew.saveTFile(fileName);
        }
    }

    public static void saveImage(EditWindow ew) {
        PlotTools.save(ew.holder);
    }


    public static void saveWSAs() {
        System.out.println("Save Workspace as ...");
        if (Main.fileChooser.showSaveDialog(Main.frame)
                == JFileChooser.APPROVE_OPTION) {
            fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
            doNothing();  // eventually, save the workspace
        }
    }

    public static String openFile() /*throws Exception*/{
        System.out.println("Open a file");
        if (Main.fileChooser.showOpenDialog(Main.frame)
                == JFileChooser.APPROVE_OPTION) {
            fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
            try {
            EditWindow.open(fileName);
            } catch(Exception ex){};
        }
        return fileName;
    }

    public static void checkAllSaved() {
        System.out.println("Check all files saved");
    }
}

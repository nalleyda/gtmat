/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;

/**
 *
 * @author dsmith
 */
public class TextTools {

    public static void evalSelection(AbstractDocument doc) {
        System.out.println("Evaluate Selection");
    }


    public static void wrapComments(AbstractDocument doc) {
        System.out.println("wrap Comments");
    }


    public static void comment(AbstractDocument doc) {
        System.out.println("comment");
    }


    public static void unComment(AbstractDocument doc) {
        System.out.println("unComment");
    }


    public static void decIndent(AbstractDocument doc) {
        System.out.println("decIndent");
    }


    public static void incIndent(AbstractDocument doc) {
        System.out.println("incIndent");
    }


    public static void smartIndent(AbstractDocument doc) {
        System.out.println("smart Indent");
    }


    public static void toLowerCase(AbstractDocument doc) {
        System.out.println("to Lower Case");
    }


    public static void toUpperCase(AbstractDocument doc) {
        System.out.println("to Upper Case");
    }


    public static void doNothing(AbstractDocument doc) {
        System.out.println("do Nothing");
    }
}

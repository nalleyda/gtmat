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
public class GoTools {

    public static void goBack(AbstractDocument doc) {
        System.out.println("Go Back");
    }


    public static void goForward(AbstractDocument doc) {
        System.out.println("go Forward");
    }


    public static void go(AbstractDocument doc) {
        System.out.println("Go");
    }


    public static void goTo(AbstractDocument doc) {
        System.out.println("Go To");
    }


    public static void goBookMark(AbstractDocument doc) {
        System.out.println("Go BookMark");
    }


    public static void goNextBookmark(AbstractDocument doc) {
        System.out.println("Go Next Bookmark");
    }


    public static void goPrevBookmark(AbstractDocument doc) {
        System.out.println("Go Prev Bookmark");
    }


}

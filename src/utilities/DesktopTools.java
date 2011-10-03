/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

/**
 *
 * @author dsmith
 */
public class DesktopTools {

    public static void minInter() {
        System.out.println("minimize interactions window");
    }


    public static void maxInter() {
        System.out.println("maximize interactions window");
    }


    public static void undockInter() {
        System.out.println("undock interactions window");
    }


    public static void moveInter() {
        System.out.println("move interactions window");
    }


    public static void resizeInter() {
        System.out.println("resize interactions window");
    }


    public static void layoutDefault() {
        System.out.println("layout Default");
    }


    public static void layoutInterOnly() {
        System.out.println("layout Interactions Only");
    }


    public static void layoutHistAndInter() {
        System.out.println("layout History and interactions window");
    }


    public static void layoutAllTabbed() {
        System.out.println("layout All Tabbed");
    }


    public static void layoutAllButInterMin() {
        System.out.println("layout All But interactions minimized");
    }


    public static void saveLayout() {
        System.out.println("save Layout");
    }


    public static void interactions() {
        System.out.println("interactions window");
    }


    public static void history() {
        System.out.println("history window");
    }


    public static void files() {
        System.out.println("files window");
    }


    public static void variables() {
        System.out.println("variables window");
    }


    public static void help() {
        System.out.println("help window");
    }


    public static void doNothing() {
        System.out.println("do Nothing");
    }


    public static void fileExchange() {
        System.out.println("file Exchange");
    }


    public static void editor() /*throws Exception */{
        System.out.println("editor window");
        IOTools.newFile();
    }


    public static void figures() {
        System.out.println("figures windows");
    }


    public static void variableEditor() {
        System.out.println("variable Editor window");
    }
}

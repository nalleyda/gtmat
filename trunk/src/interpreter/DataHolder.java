/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import javax.swing.UIManager;
import main.*;
import parser.*;

/**
 *
 * @author dsmith
 */
public class DataHolder implements Runnable {

    String value;
    boolean dataEntered;
    public CommonTree theTree;
    
    public DataHolder() {
        value = "";
        dataEntered = false;
        theTree = null;
    }

    public DataHolder(CommonTree tr) {
        value = "";
        dataEntered = false;
        theTree = tr;
    }

    public String getData()
            throws InterruptedException {
        while (!dataEntered) {
            Thread.sleep(10);
        }
        dataEntered = false;
        return value;
    }

    public void setData(String str) {
        value = str;
        dataEntered = true;
        System.out.println("set data to " + str);
    }

    public void run(){
        /*try{
            TreeWalker.process(theTree);
        }
        catch (Exception e){
            Interpreter.displayError(e.getMessage());
            e.printStackTrace();
        }
        finally{
            Main.interactions.appendString(">> ", 0);
        }*/
        TreeWalker.process(theTree);
        Main.interactions.appendString(">> ", 0);
    }
    
    public void setTree(CommonTree tr) {
        theTree = tr;
    }
}

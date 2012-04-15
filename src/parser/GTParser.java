/**
 *  Antlr test system
 * @author dsmith
 */
package parser;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import main.*;
import interpreter.*;

import java.io.*;
import java.util.Stack;

import javax.swing.text.*;
import jmatrix.*;
import workspace.*;

public class GTParser {
    private static PrintStream debug = null;
//    private static Grammar_Name_Lexer lex;
    private static ExprLexer lex;
//    public static String assignmentTarget = null;
    public static Stack<String> filenameStack = new Stack<String>();

    public static void main(String[] args) throws Exception {

        try {
            debug = new PrintStream(new FileOutputStream("debug.log"));
        } catch (IOException e) {
            System.out.print("Error " + e + " opening debug.log");
        }
        debug.println("debug log opened");

        test();
    }

    public static void test() {
        GTStringStream s = null;
        try {
            s = new GTStringStream("x = 4\n");
            s.append("y = 12\n");
            s.append("y/x\n");
            System.out.println(s);
        } catch(IOException e){};
        process(s);

//        process("src/parser/__Test___input.txt");
    }

    public static void process(String name) {
        // Create an input character stream
        try {
//        	filenameStack.push(name);
            lex = new ExprLexer(new ANTLRFileStream(name));
        } catch (IOException e) {
//            debug.println("didn't open " + name);
        }
        doit(lex);
      //  filenameStack.pop();
    }

    
    public static MatObject processChild(GTStringStream sstr) throws Exception {
        // Create an input character stream
        MatObject res = null;
        ExprLexer lx = new ExprLexer(sstr);
        CommonTokenStream tokens = new CommonTokenStream(lx);
        ExprParser g = new ExprParser(tokens);
        try {
            ExprParser.prog_return r = g.prog();
            CommonTree tr = (CommonTree) r.getTree(); 
            tr = (CommonTree) tr.getChild(0);
            tr = (CommonTree) tr.getChild(1);
            //TODO death?
           // res = TreeWalker.process("", tr);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void process(GTStringStream sstr) {
        // Create an input character stream
        sstr.append("\n");
        doit(new ExprLexer(sstr));
    }

    public static void process(GTStringStream sstr, Interpreter inter) throws Exception{
        sstr.append("\n");
        CommonTokenStream tokens = new CommonTokenStream(new ExprLexer(sstr));
        ExprParser g = new ExprParser(tokens);
        try{
            ExprParser.prog_return r = g.prog();
            CommonTree tr = (CommonTree) r.getTree();
            TreeWalker.process(tr);
            Main.interactions.appendString(">> ", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("process() threw an exception and likely did not complete running the ch script");
            Thread.currentThread().interrupt();
			throw e;
        }
        
        //process(sstr);
        //inter.done = true;
    }


    private static void doit(ExprLexer lx) {
        CommonTokenStream tokens = new CommonTokenStream(lx);

//        Grammar_Name_Parser g = new Grammar_Name_Parser(tokens, null);
        ExprParser g = new ExprParser(tokens);
        try {
            ExprParser.prog_return r = g.prog();

            // WALK RESULTING TREE
            CommonTree tr = (CommonTree) r.getTree(); // get tree from parser
            System.out.println("tree.toStringTree(): "+tr.toStringTree());
//            Main.debug.println("Tree is " + tr.toStringTree());
//            Main.debug.flush();
            DataHolder dh  = new DataHolder(tr);
            Main.wstack.peek().setDataHolder(dh);
            Thread it = new Thread(dh);
            System.out.println("Created the tree, now walk it:");
            it.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
            System.out.println("exception at doIt");
            return;
        }
    }
    public static CommonTree makeTree(String str) {
        GTStringStream sstr = null;
        CommonTree tr = null;
        try {
            sstr = new GTStringStream(str);
        } catch(Exception e) {};
        ExprLexer lx = new ExprLexer(sstr);
        CommonTokenStream tokens = new CommonTokenStream(lx);

//        Grammar_Name_Parser g = new Grammar_Name_Parser(tokens, null);
        ExprParser g = new ExprParser(tokens);
        try {
            ExprParser.prog_return r = g.prog();
            // WALK RESULTING TREE
            tr = (CommonTree) r.getTree(); // get tree from parser
//            Main.debug.println("Tree is " + tr.toStringTree());
//            Main.debug.flush();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        return tr;
    }
}

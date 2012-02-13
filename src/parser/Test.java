package parser;

/***
 * Excerpted from "The Definitive ANTLR Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr for more book information.
***/
import interpreter.TreeWalker;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import workspace.Function;

public class Test {
    public static void main(String[] args) throws Exception {
        Function.createFunctionTable();
        // Create an input character stream from standard in
        ANTLRFileStream input = new ANTLRFileStream("Test.m");
        // Create an ExprLexer that feeds from that stream
        ExprLexer lexer = new ExprLexer(input);
        // Create a stream of tokens fed by the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser that feeds off the token stream
        ExprParser parser = new ExprParser(tokens);
        // Begin parsing at rule prog, get return value structure
        ExprParser.prog_return r = parser.prog();

        // WALK RESULTING TREE
        CommonTree t = (CommonTree)r.getTree(); // get tree from parser
        System.out.println("Created the tree, now walk it:");
        TreeWalker.process(t);
    }
}

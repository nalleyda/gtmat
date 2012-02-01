package parser;

import org.antlr.runtime.tree.*;
import java.lang.RuntimeException;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import jmatrix.*;
import interpreter.*;
import workspace.*;
import java.util.Stack;
import main.*;
import plotting.*;
import jmatrix.MatObject.Type;
import functions.*;
/**
 *
 * @author dsmith
 * A novel idea: documentation.  Well OK, at least design thoughts.
 * Here's the problem:  A = X(floor(end/2)) which could in a nightmare 
 * scenario be extended to A(ceil([B(max(floor(end))) end]))
 * How do you find the value of the first end - should be the 
 *     length? rows? cols? of B?  
 * What about the second one?  Should be the length? rows? cols? of A?
 * In the second case, we need to "blast through" the concatenation
 * 1. You have to have A, ceil, B, max, and floor on a stack.  
 *   a. They are pushed onto the stack just before you start 
 *      processing the parameters and 
 *   b. popped off when you finish all the parameters.
 * 2. When you parse an END, you dig back up the stack looking for 
 * the first containing "function" name that is actually a variable.
 * 3. The 'static' variable soFar should take care of finding which dimension
 * of the array is being accessed by END, but I think it needs to be on the
 * stack with the variable name ... (sigh!)
 * We probably need to generate a nasty test case similar to the one above 
 * to check out the behavior for multi-dimensioned arrays while we can still
 * remember what we're up to.
 * 
 * Having studied this for all of three minutes, I reach the following 
 * conclusion with the following guidance:
 * m = magic(6)
 * m(1, floor(end/2)) = 42 % puts 42 at (1, 3) as you would expect
m(ceil(end/2)) = 99     % puts 99 at (6, 3) = 36/2 linearized 
m(ceil(end/2), end) = -42 % puts -42 at (3, 6)
it = m(end, end, end, end) % returns m(6,6)
 *   If you index A(end) regardless of the dimensionality of A, end means
 *   the last value of the linearized array.
 *   If you index A(end, end, end, end, ....) you will get the real dimensions
 *   as long as they exist and 1's after that.
 */
public class TreeWalker {

	public enum TYPE {
		/*
		 * CAUTION: IF YOU EDIT THIS LIST, YOU _MUST_ change the
		 *          Main.version
		 */

		ZERO, REFERENCE, TWO, THREE, ALL, AND, AXIS, BACK, BLOCK_END, BODY,
		CALL, CARET, CASE, CATCH, CD, CELL, CELLFIELD, CELLFIELDV, CHCAT,
		CLC, CLEAR, CLF, CLOSE, CLOSEB, CLOSEC, CLOSEP, COLON, COLORBAR, COLORMAP,
		COMMA, COMMENT, CVCAT, DIGIT, DIV, DOT, DOTBACK, DOTCARET,
		DOTDIV, DOTMULT, DOTTICK, DOUBLE, ELLIPSES, ELSE, ELSEIF, EMPTY_VECTOR,
		END, EQ, EQUAL, Exponent, FIGURE, FLAT, FOR, FUNCTION, GE, GETS, GRID, GT, HCAT,
		HOLD, ID, IF, INDEX, INTERP, LE, LETTER, LINE, LT, MINUS,
		MULT, MULTI_RETURN, NE, NEGATE, NEWLINE, NOT, OFF, ON,
		OPENB, OPENC, OPENP, OR, OTHERWISE, PLUS, SCAND, SCOR, SEMI,
		SHADING, STRING_LITERAL, STRUCT, STRUCTA, STRUCTAV, STRUCTV,
		SWITCH, TICK, TRANSPOSE, TRY, VCAT, VECFIELD, VECFIELDV, VECTOR,
		WHILE, WS
	}

	//TODO re-generate code, add tokens TRUE and FALSE
	public enum NEW_TYPE{
		ZERO, REFERENCE, TWO, THREE,
		AT,
		BACKSLASH,
		BLOCK,
		BLOCK_END,
		BREAK,
		CARET,
		CASE,
		CATCH,
		CLASSDEF,
		CLOSEB,
		CLOSEC,
		CLOSEP,
		CLOSE_BLOCK,
		COLON,
		COLON_ARGS,
		COMMA,
		COMMENT,
		CONTINUE,
		DIGIT,
		DOT,
		DOT_BACKSLASH,
		DOT_CARET,
		DOT_SLASH,
		DOT_STAR,
		DOT_TRANSPOSE,
		DOUBLE,
		DOUBLE_QUOTE,
		ELE_AND,
		ELE_OR,
		ELLIPSIS,
		ELSE,
		ELSEIF,
		/*ELSEIF_ROOT,
    	ELSE_ROOT,*/
    	EMPTY_CELL,
    	EMPTY_VEC,
    	END,
    	EQUALS,
    	EXCLAMATION,
    	EXPONENT,
    	FOR,
    	FOR_LOOP,
    	FUNCTION,
    	FUNC_ARGS,
    	FUNC_CALL,
    	GLOBAL,
    	GREATER_EQUAL,
    	GREATER_THAN,
    	HCAT_CELL,
    	HCAT_VEC,
    	ID,
    	IF,
    	IF_STAT,
    	ISEQUAL,
    	LESS_EQUAL,
    	LESS_THAN,
    	LETTER,
    	MINUS,
    	NEWLINE,
    	NOT,
    	NOT_EQUAL,
    	OPENB,
    	OPENC,
    	OPENP,
    	OPEN_BLOCK,
    	OTHERWISE,
    	PARFOR,
    	PERCENT,
    	PERSISTENT,
    	PLUS,
    	RETURN,
    	SC_AND,
    	SC_OR,
    	SEMI,
    	SINGLE_QUOTE,
    	SLASH,
    	SPMD,
    	STAR,
    	STRING_LITERAL,
    	SWITCH,
    	SWITCH_STAT,
    	TRY,
    	UNARY_OP,
    	UNDERSCORE,
    	VCAT_CELL,
    	VCAT_VEC,
    	WHILE,
    	WHILE_LOOP,
    	WS
	}
	/*public enum NEW_TYPE{
    	FUNC_ARGS, ID, DOT, DOT_CARET, CARET, SINGLE_QUOTE, DOT_TRANSPOSE, 
    	MINUS, NOT, DOT_STAR, DOT_SLASH, DOT_BACKSLASH, STAR, SLASH, 
    	BACKSLASH, PLUS, COLON_ARGS, LESS_THAN, GREATER_THAN, LESS_EQUAL, 
    	GREATER_EQUAL, ISEQUAL, NOT_EQUAL, ELE_AND, ELE_OR, SC_AND, SC_OR, 
    	HCAT_VEC, VCAT_VEC, HCAT_CELL, VCAT_CELL, EQUALS, IF, ELSEIF, 
    	ELSE, IF_STAT, SWITCH, CASE, OTHERWISE, SWITCH_STAT, FOR, FOR_LOOP, 
    	WHILE, WHILE_LOOP, BLOCK
    }*/
	private static String arrayName = null;
	private static int soFar = 0;
	public static MatObject staticExpr = null;
	public static ArrayList<WhoKnowsWhat> wnwStack = new ArrayList<WhoKnowsWhat>();
	private static Stack<DataHolder> dhStack = new Stack<DataHolder>();
	private static int debugLine = 0;

	private static final boolean DEBUGGING = true;

	public static void dprint(String s){
		if (DEBUGGING){
			System.out.println(s);
		}
	}


	public static MatObject eval(Tree tree) throws Exception{
		MatObject res = null;
		NEW_TYPE nodeType = new_convert(tree.getType());
		String str = tree.getText();

		switch(nodeType){
		case BLOCK:	//Just evaluate everything - no need to store results
		for (int i = 0; i < tree.getChildCount(); i++){
			eval(tree.getChild(i));
		}
		break; 
		case CARET:
			return MatPower.matPower(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case COLON_ARGS:
			//BE CAREFUL - the rightmost (i.e., last) child is actually the one that belongs first - see ANTLR debugger
			switch(tree.getChildCount()){
			case 2:
				//TODO generalize - just matrix now
				Matrix.colon((Matrix)eval(tree.getChild(1)), (Matrix)eval(tree.getChild(0)));
			case 3:
				Matrix.colon((Matrix)eval(tree.getChild(2)), (Matrix)eval(tree.getChild(0)), (Matrix)eval(tree.getChild(1)));
			}
		case DOUBLE:
			return new Matrix(Double.parseDouble(tree.getText()));
		case DOT_CARET:
			return Power.power(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case DOT_SLASH:
			return Divide.divide(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case DOT_STAR:
			return Mult.mult(eval(tree.getChild(0)), eval(tree.getChild(0)));
		case DOT_TRANSPOSE:
			return Transpose.transpose(eval(tree.getChild(0)));
			
		case ELE_AND:
			return ElementAnd.elementAnd(eval(tree.getChild(0)), eval(tree.getChild(0)));
		case ELE_OR:
			return ElementOr.elementOr(eval(tree.getChild(0)), eval(tree.getChild(0)));

		//TODO: [x,y] = foo();
		case EQUALS://assign rhs to lhs, possibly multiple on lhs
			NEW_TYPE lhsType = new_convert(tree.getChild(0).getType());
			if (lhsType == NEW_TYPE.ID){//single output
				Interpreter.assign(tree.getChild(0).getText(), eval(tree.getChild(1)), true);
			}
			else if (lhsType == NEW_TYPE.VCAT_VEC){//multiple assignments
				CellArray rhs = (CellArray)eval(tree.getChild(1));
				//MatObject lhs = evaluate(tree.getChild(0));
				Tree lhsTree = tree.getChild(0).getChild(0);//should be VCAT_VEC -> HCAT_VEC
				if (tree.getChild(0).getChildCount()!=1 || new_convert(lhsTree.getType()) != NEW_TYPE.HCAT_VEC){
					throw new Exception("Bad LHS assignment.");
				}
				for (int i = 1; i <= lhsTree.getChildCount(); i++){
					Interpreter.assign(lhsTree.getChild(i).getText(), rhs.get(i), true);
				}
			}
			else{
				throw new Exception("Something is wrong with your assignment...");
			}
			break;
			
		//TODO put this back
		/*case FALSE:
			return new Logical(0);*/
			
		case FOR_LOOP:
			MatObject loopOver = eval(tree.getChild(0).getChild(2));
			String loopVar = tree.getChild(0).getChild(0).getText();
			for (int i = 0; i < loopOver.n; i++){
				Interpreter.assign(loopVar, Matrix.get(loopOver, new Matrix(i)), true);
				eval(tree.getChild(1));
			}
			
		case FUNC_CALL:
			throw new Exception("Fix FUNC_CALL in TreeWalker.");

		case GREATER_EQUAL:
			return GreaterEqual.greaterEqual(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case GREATER_THAN:
			return GreaterThan.greaterThan(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case HCAT_CELL:
			ArrayList<MatObject> arrc = new ArrayList<MatObject>();
			for (int i = 0; i < tree.getChildCount(); i++){
				arrc.add(eval(tree.getChild(i)));
			}
			return HorizontalConcatenate.horizontalConcatenateCell(arrc.toArray(new MatObject[0]));
		case HCAT_VEC:
			ArrayList<MatObject> arr = new ArrayList<MatObject>();
			for (int i = 0; i < tree.getChildCount(); i++){
				arr.add(eval(tree.getChild(i)));
			}
			return HorizontalConcatenate.horizontalConcatenate(arr.toArray(new MatObject[0]));

		case ID: //Need to get the value stored in the associated variable, or call the function
			if (tree.getChildCount() > 0 && new_convert(tree.getChild(0).getType()) == NEW_TYPE.FUNC_CALL){//function call or indexing
				eval(tree.getChild(0));
			}
			else{
				return Interpreter.getValue(str);
				//dprint("In ID: " + res);
			} 
			break; 
		
		case IF_STAT:
			if (eval(tree.getChild(0).getChild(0)).conditionalIsTrue()){//
				eval(tree.getChild(0).getChild(1));
			}
			else{
				for (int i = 1; i < tree.getChildCount() && new_convert(tree.getChild(i).getType()) == NEW_TYPE.ELSEIF; i++){
					if (eval(tree.getChild(i).getChild(0)).conditionalIsTrue()){
						eval(tree.getChild(i).getChild(1));
						break;
					}
				}
				if (new_convert(tree.getChild(tree.getChildCount()-1).getType()) == NEW_TYPE.ELSE){
					eval(tree.getChild(tree.getChildCount()-1).getChild(0));
				}
			}

		case ISEQUAL:
			return IsEqual.isEqual(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case LESS_EQUAL:
			return LessEqual.lessEqual(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case LESS_THAN:
			return LessThan.lessThan(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case MINUS:
			if (tree.getChildCount() == 1){
				return Negate.negate(eval(tree.getChild(0)));
			}
			else if (tree.getChildCount() == 2){
				return Subtract.subtract((Matrix)eval(tree.getChild(0)), (Matrix)eval(tree.getChild(1)));
			}
		case NOT:
			return BoolNegate.boolNegate(eval(tree.getChild(0)));
		case NOT_EQUAL:
			return NotEqual.notEqual(eval(tree.getChild(0)), eval(tree.getChild(1)));
		case PLUS:
			return Add.add((Matrix)eval(tree.getChild(0)), (Matrix)eval(tree.getChild(1)));
		case SC_AND:
			return ShortCircuitAnd.shortCircuitAnd(eval(tree.getChild(0)), eval(tree.getChild(0)));
		case SC_OR:
			return ShortCircuitOr.shortCircuitOr(eval(tree.getChild(0)), eval(tree.getChild(0)));
		case SINGLE_QUOTE:
			return ConjugateTranspose.conjugateTranspose(eval(tree.getChild(0)));
		case SLASH:
			return MatDivide.matDivide((Matrix)eval(tree.getChild(0)), Matrix.inv((Matrix)eval(tree.getChild(1))));
		case STAR:
			return MatMult.matMult((Matrix)eval(tree.getChild(0)), (Matrix)eval(tree.getChild(1)));
		case STRING_LITERAL:
			return new MatString(tree.getText());
			
		case SWITCH_STAT:
			//An evaluated switch_expression is a scalar or string
			MatObject se = eval(tree.getChild(0));
			
			int lastCaseInd;
			if (new_convert(tree.getChild(tree.getChildCount()-1).getType()) == NEW_TYPE.OTHERWISE){
				lastCaseInd = tree.getChildCount()-2;
			}
			else{
				lastCaseInd = tree.getChildCount()-1;
			}
			
			MatObject ce;
			boolean didOne = false;
			out:
			for (int i = 1; i <= lastCaseInd; i++){
				ce = eval(tree.getChild(i).getChild(0));

				//An evaluated case_expression is a scalar, string, or ca of scalars or strings
				if (ce instanceof CellArray){
					for (int j = 0; j < ce.n; j++){
						if (MatObject.get(ce, new Matrix(j)).equals(se)){
							eval(tree.getChild(i).getChild(1));
							didOne = true;
							break out;
						}
					}
				}
			}
			if (!didOne && lastCaseInd == tree.getChildCount()-2){
				eval(tree.getChild(tree.getChildCount()-1));
			}
			break;
			
		//TODO put this back
		/*case TRUE:
			return new Logical(1);*/
			
		case VCAT_CELL:
			ArrayList<MatObject> arrcv = new ArrayList<MatObject>();
			for (int i = 0; i < tree.getChildCount(); i++){
				arrcv.add(eval(tree.getChild(i)));
			}
			return VerticalConcatenate.verticalConcatenateCell(arrcv.toArray(new MatObject[0]));
		case VCAT_VEC:
			ArrayList<MatObject> arrv = new ArrayList<MatObject>();
			for (int i = 0; i < tree.getChildCount(); i++){
				arrv.add(eval(tree.getChild(i)));
			}
			return VerticalConcatenate.verticalConcatenate(arrv.toArray(new MatObject[0]));
		case WHILE_LOOP:
			while (eval(tree.getChild(0)).conditionalIsTrue()){
				eval(tree.getChild(1));
			}
		default:
			throw new Exception(nodeType + " is not handled in TreeWalker.");

		}
		return res;
	}


	

	public static boolean validateTokens() {
		boolean res = true;
		BufferedReader in = null;
		String name = /*"src" + File.separator +*/ "parser" + File.separator + "Expr.tokens";
		try {
			in = new BufferedReader(new FileReader(name));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Tokens file did not open");
			System.exit(1);
		}
		int nt = 0;
		try {
			String line = in.readLine();
			while (line != null) {
				StringTokenizer tkn = new StringTokenizer(line, "=");
				String it = tkn.nextToken();
				int ndx = Integer.parseInt(tkn.nextToken());
				NEW_TYPE nodeNdx = new_convert(ndx);
				String itsName = nodeNdx.name();
				if (!it.equals(itsName)) {
					res = false;
					System.err.println("Token " + it + " is not at index " + ndx);
				}
				line = in.readLine();
			}
		} catch (Exception e) {
		}
		if (!res) {

			//LinkedList<>
			System.err.println("\n IF YOU SEE THIS MESSAGE, YOU MUST DO THE FOLLOWING:");
			System.err.println(" You have changed the grammar in a way that has changed");
			System.err.println("the list of tokens - an unfortunate consequence of this");
			System.err.println("grammar processor.  ");
			System.err.println("Usually, they are out of order that means two things");
			System.err.println("have happened: a token has been added, and/or one has ");
			System.err.println("been deleted.  If one has been added, say <IT> at position 12,");
			System.err.println("the message will be: ");
			System.err.println(" --- Token at 12 is not <IT> ---");
			System.err.println("with a bunch of subsequent token wrong messages.  Edit the");
			System.err.println("TYPE list above to add <IT> at the right place.");
			System.err.println("   If one has been deleted, you will get a similar set");
			System.err.println("of messages citing one of the original types like:");
			System.err.println(" --- Token at 54 is not <CLOSEC> ---");
			System.err.println("   Find that type on the list and look at the previous");
			System.err.println("type - it was probably deleted by the grammar, so delete it");
			System.err.println("from the TYPE list.  This should fix the problems, but also");
			System.err.println("do the following:");
			System.err.println("Change the version number at the top of main.Main.");
			System.err.println("This is important, because we might soon be saving ");
			System.err.println("parse trees, and the saved trees will misbehave if the ");
			System.err.println("token list is changed. ");
		}
		return res;
	}

	public static void process(CommonTree tree) {
		//        Main.debug.println(tree.toStringTree());
		try {
			eval(tree);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			// System.out.println("Result = " + process("", tree));
		} catch (Exception e) {
			Interpreter.displayError(e.getMessage());
			e.printStackTrace();
		}
	}

	public static NEW_TYPE new_convert(int value){
		NEW_TYPE ret = null;
		NEW_TYPE values[] = NEW_TYPE.values();
		for (int i = 0; i < values.length && ret == null; i++){
			if (values[i].ordinal() == value){
				ret = values[i];
			}
		}
		return ret;
	}

	public static TYPE convert(int value) {
		TYPE result = null; // or: = ReturnValue.UNDEFINED
		TYPE values[] = TYPE.values();
		int i = 0;
		while (i < values.length && result == null) {
			if (values[i].ordinal() == value) {
				result = values[i];
			} else {
				i++;
			}
		}
		return result;
	}

	private static boolean matches(MatObject a, MatObject b) {
		/*
		 * a can be either a 1*1 Matrix or a MatString
		 * b can be either a 1*1 Matrix or a MatString or a cell array
		 *      containing all of Matrix or MatString
		 */
		boolean res = false;
		Type aType = a.type;
		Type bType = b.type;
		Matrix m = null;
		if (bType == Type.CELL) {
			CellArray ca = (CellArray) b;
			for (int i = 1; i <= b.n; i++) {
				MatObject it = ca.get(i);
				res = matches(a, it);
				if (res) {
					break;
				}
			}
		} else {
			if (aType != bType) {
				throw new RuntimeException("bad types in switch case");
			} else if (aType == Type.DOUBLE && (a.length() > 1 || b.length() > 1)) {
				throw new RuntimeException("vector in switch case");
			} else {
				switch (aType) {
				case DOUBLE:
					m = a.eq(b);
					break;
				case INTEGER:
					m = a.eq(b);
					break;
				case CHAR:
					m = a.eq(b);
				}
				res = m.get(1) > 0;
			}
		}
		return res;
	}

	private static boolean isTest(int typ) {
		return (typ == TYPE.LT.ordinal()
				|| typ == TYPE.GT.ordinal()
				|| typ == TYPE.LE.ordinal()
				|| typ == TYPE.GE.ordinal()
				|| typ == TYPE.EQ.ordinal()
				|| typ == TYPE.NE.ordinal());
	}

	public static void popDataHolder() {
		DataHolder dh = dhStack.pop();
		synchronized(dh) {
			dh.notify();
		}
	}
}

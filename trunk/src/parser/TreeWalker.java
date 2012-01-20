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
    private static String arrayName = null;
    private static int soFar = 0;
    public static MatObject staticExpr = null;
    public static ArrayList<WhoKnowsWhat> wnwStack = new ArrayList<WhoKnowsWhat>();
    private static Stack<DataHolder> dhStack = new Stack<DataHolder>();
    private static int debugLine = 0;
    
    
    public static MatObject process(String space, Tree tree) throws Exception {
        MatObject res = null;
        MatObject it = null;
        Matrix m = null;
        Matrix m1 = null;
        Matrix m2 = null;
        Matrix mnx = null;
        MatObject a = null;
        MatObject b = null;
        String str = null;
        String fld = null;
        String var = null;
        Tree next = null;
        Tree node = null;
        Tree body = null;
        CellArray ca = null;
        int ndx = 0;
        boolean showIt = false;
        int n = tree.getChildCount();
        /* push soFar and arrayName onto the "stack" - the aqctivation stack frame */
        int local_soFar = soFar;
        String local_arrayName = arrayName;
        TYPE nodeType = convert(tree.getType());
        Main.debug.println(space + "Tree is " + tree
                + " with " + n + " children"
                + " type: " + nodeType);
        int lineNumber = tree.getLine();
        System.out.println("At line " + lineNumber);
        //Check for break points on this line.
        if (Main.wstack.peek().getDataHolder() != null && lineNumber != debugLine) {
            synchronized (Main.wstack.peek().getDataHolder()) {
                if (Main.bpsMap.get(Main.wstack.peek().getFunctionName()) != null
                        && Main.bpsMap.get(Main.wstack.peek().getFunctionName()).size() >= lineNumber
                        && Main.bpsMap.get(Main.wstack.peek().getFunctionName()).get(lineNumber)) {
                    System.out.println("Waiting");
                    DataHolder dh = Main.wstack.peek().getDataHolder();
                    Main.wstack.peek().setDataHolder(new DataHolder());
                    dhStack.push(dh);
                    Main.interactions.nextLine();
                    TabbedPane.updateList();
                    dh.wait();
                    debugLine = lineNumber;
                    Main.wstack.peek().setDataHolder(dh);
                    System.out.println("Finished waiting");
                }
            }
        }
        
        Main.debug.flush();
        switch (nodeType) {
            // Let's keep these in alphabetical order ...
            case BODY:
                for (int i = 0; i < n; i++) {
                    Tree child = tree.getChild(i);
                    process(space + "   ", child);
                }
                break;
            case AXIS:  /* needs implementation */
                a = process(space + "   ", tree.getChild(0));
                Interpreter.axis(a);
                break;
            case BACK:  /* back divide */
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = Interpreter.back(a, b);
                break;
            case CALL:
                str = tree.getChild(0).getText();
//                Main.debug.println(space + "call function " + str);
                soFar = 1;
                wnwStack.add(new WhoKnowsWhat(str, n-1));
                arrayName = str;
                while (soFar < n) {
                    it = process(space + "   ", tree.getChild(soFar));
                    it = checkForEnd(it);
                    if (soFar++ == 1) {
                        ca = new CellArray(it);
                    } else {
                        ca = ca.hcat(it);
                    }
                }
                arrayName = null;
                soFar = 0;
                res = Interpreter.call(str, ca);
                wnwStack.remove(wnwStack.size() - 1);
                break;
            case CARET:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.caret(b);
                break;
            case CD:
            	//@TODO - we get "<missing id>" here from string literals
                if (n > 0) {
                    fld = ((CommonTree) tree.getChild(0)).getText();
                    Main.cd(fld);//@TODO: this assumes cd takes in a hard-coded string - BAD
                }
                break;
            case CELLFIELD:
                // (CELLFIELD a first)
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getAllCellFields(str, fld);
                break;
            case CELLFIELDV:
                // (CELLFIELDV a age)
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getAllCellFieldsV(str, fld);
                break;
            case CHCAT:
                ca = new CellArray(process(space + "   ", tree.getChild(0)));
                for (int i = 1; i < n; i++) {
                    ca = ca.hcat(new CellArray(process(space + "   ", tree.getChild(i))));
                }
                res = ca;
                break;
            case CLC:
                Interpreter.clc();
                break;
            case CLF:
                Figure.close(-1);
                break;
            case CLEAR:
                Interpreter.clear();
                break;
            case CLOSE:
                Figure.close(-1);
                break;
            case COLON:
                MatObject c0 = null;
                MatObject c1 = null;
                MatObject c2 = null;
                switch (n) {
                    case 0:
                        m = new Matrix(1);
                        m1 = getEndFromVar();
                        res = Matrix.colon(m, m1);
                        break;
                    case 2:
                        c0 = process(space + "   ", tree.getChild(0));
                        c1 = process(space + "   ", tree.getChild(1));
                        m = (Matrix) checkForEnd(c0);
                        m1 = (Matrix) checkForEnd(c1);
                        res = Matrix.colon(m, m1);
                        break;
                    case 3:
                        c0 = process(space + "   ", tree.getChild(0));
                        c1 = process(space + "   ", tree.getChild(1));
                        c2 = process(space + "   ", tree.getChild(2));
                        m = (Matrix) checkForEnd(c0);
                        m1 = (Matrix) checkForEnd(c1);
                        m2 = (Matrix) checkForEnd(c2);
                        res = Matrix.colon(m, m1, m2);
                        break;
                    default:
                        Interpreter.displayError("Colon must have 0, 2 or 3 params");
                }
                break;
            case COLORBAR:
                Figure.setColorbar(true);
                break;
            case COLORMAP:
                next = tree.getChild(0);
                str = next.getText();
                Plots.setColorMap(str);
                break;
            case CVCAT:
                // (= ca (CVCAT (CHCAT 1 abc (VCAT (HCAT 2 3)))))
//                ca = new CellArray(process(space + "   ", tree.getChild(0)));
                ca = (CellArray) process(space + "   ", tree.getChild(0));
                for (int i = 1; i < n; i++) {
                    ca = ca.vcat((CellArray) process(space + "   ", tree.getChild(i)));
                }
                res = ca;
                break;
            case DIV:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.div(b);
                break;
            // (.^ x 2)
            case DOTCARET:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.dotcaret(b);
                break;
            case DOTDIV:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.dotdiv(b);
                break;
            case DOTMULT:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.dotmult(b);
                break;
            case DOUBLE:
                str = tree.getText();
                res = new Matrix(Double.parseDouble(str));
                break;
            case EMPTY_VECTOR:
                res = new Matrix();
                break;
            case END:
                res = new Matrix(soFar);
                res.type = Type.END;
                break;
            case EQ:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.eq(b);
                break;
            case EQUAL:
                res = new Matrix(2);
                break;
            case FOR:
                str = tree.getChild(0).getText();
                m = (Matrix) process(space + "   ", tree.getChild(1));
                body = tree.getChild(2);
                ndx = 1;
                while (ndx <= m.length()) {
                    Interpreter.assign(str, new Matrix(m.get(ndx)), false);
                    process(space + "   ", body);
                    ndx = ndx + 1;
                }
                break;
            case FIGURE:
                Interpreter.figure();
                break;
            case FUNCTION:
                Interpreter.displayString("Running a function file");
                break;
            case GE:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.ge(b);
                break;
            case GETS:
                next = tree.getChild(n - 1);
                showIt = true;
                if (next.getText().equals(";")) {
                    showIt = false;
                    n--;
                }
                next = tree.getChild(0);
                if (n == 1) {
                    str = "ans";
                    next = tree.getChild(0);
                    it = process(space + "   ", next);
                    Interpreter.assign(str, it, showIt);
                } else {
                    if (next.getType() == TYPE.STRUCT.ordinal()) {
                        str = ((CommonTree) next.getChild(0)).getText();
                        String fn = ((CommonTree) next.getChild(1)).getText();
                        next = tree.getChild(1);
                        it = process(space + "   ", next);
                        Interpreter.assignStr(str, fn, it, showIt);
                    } else if (next.getType() == TYPE.STRUCTV.ordinal()) {
                        str = ((CommonTree) next.getChild(0)).getText();
                        var = ((CommonTree) next.getChild(1)).getText();
                        next = tree.getChild(1);
                        it = process(space + "   ", next);
                        Interpreter.assignStrV(str, var, it, showIt);
                    } else if (next.getType() == TYPE.STRUCTAV.ordinal()) {
                        // (= (STRUCTAV a v 2) Smith)
                        str = ((CommonTree) next.getChild(0)).getText();
                        var = ((CommonTree) next.getChild(1)).getText();
                        m = (Matrix) process(space + "   ", next.getChild(2));
                        node = tree.getChild(1);
                        it = process(space + "   ", node);
                        ndx = next.getChildCount();
                        soFar = 3;
                        while (soFar < ndx) {
                            mnx = (Matrix) process(space + "   ", next.getChild(soFar++));
                            m = m.hcat(mnx);
                        }
                        Interpreter.assignStrAV(str, var, m, it, showIt);
                    } else if (next.getType() == TYPE.STRUCTA.ordinal()) {
                        // (= (STRUCTA a first 1) Sally Ann)
                        str = ((CommonTree) next.getChild(0)).getText();
                        fld = ((CommonTree) next.getChild(1)).getText();
                        m = (Matrix) process(space + "   ", next.getChild(2));
                        node = tree.getChild(1);
                        it = process(space + "   ", node);
                        ndx = next.getChildCount();
                        soFar = 3;
                        while (soFar < ndx) {
                            mnx = (Matrix) process(space + "   ", next.getChild(soFar++));
                            m = m.hcat(mnx);
                        }
                        Interpreter.assignStrA(str, fld, m, it, showIt);
                    } else {
                        str = next.getText();
                        next = tree.getChild(1);
                        it = process(space + "   ", next);
                        Interpreter.assign(str, it, showIt);
                    }
                }
                res = it;
                break;
            case GRID:  /* needs implementation */
                a = process(space + "   ", tree.getChild(0));
                Interpreter.grid(a);
                break;
            case GT:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.gt(b);
                break;
            case HCAT:
                a = process(space + "   ", tree.getChild(0));
                m = new Matrix(checkForEnd(a));
                for (int i = 1; i < n; i++) {
                    a = process(space + "   ", tree.getChild(i));
                    m = m.hcat(new Matrix(checkForEnd(a)));
                }
                res = m;
                break;
            case HOLD:
                next = tree.getChild(0);
                str = next.getText();
                boolean on = str.equals("on");
                Interpreter.hold(on);
                break;
            case ID:
                str = tree.getText();
                res = Interpreter.getValue(str);
                System.out.println("In ID: " + res);
                if (res == null) {
                    Interpreter.displayError("Undefined Variable " + str);
                    throw new RuntimeException("Undefined Variable " + str);
                }
                break;
            case IF:
                m = (Matrix) process(space + "   ", tree.getChild(0));
                if (Matrix.all(m).get(1) > 0) {
                    // passed the first test
                    res = process(space + "   ", tree.getChild(1));
                } else { // failed the first test
                    // try all the elseifs
                    soFar = 2;
                    while (soFar < n) {
                        next = tree.getChild(soFar++);
                        if (isTest(next.getType())) {  // is this an elseif?
                            // yes = check its result
                            m = Matrix.all((Matrix) process(space + "   ", next));
                            if (m.get(1) > 0) {
                                res = process(space + "   ", tree.getChild(soFar));
                                break;
                            } else {
                                soFar++;
                            }
                        } else {  // not looking at an elseif and not off the end
                            // must be the else clause
                            res = process(space + "   ", next);
                            soFar = n;
                        }
                    }

                }
                break;
            case INDEX:
                // (INDEX ID 2 [=] expr SEMI?)
                next = tree.getChild(n - 1);
                showIt = true;
                if (next.getText().equals(";")) {
                    showIt = false;
                    n--;
                }
                next = tree.getChild(0); // the variable ID
                str = next.getText();
                wnwStack.add(new WhoKnowsWhat(str, n-2));
                arrayName = str;
                staticExpr = process(space + "   ", tree.getChild(n - 1)); // the expr
                soFar = 1;
                a = process(space + "   ", tree.getChild(1));
                a = checkForEnd(a);
                ca = new CellArray(a); // the first param
                for (ndx = 2; ndx < n - 1; ndx++) {
                    soFar++;
                    a = process(space + "   ", tree.getChild(ndx));
                    a = checkForEnd(a);
                    ca = ca.hcat(a);
                }
                MatObject.index(str, ca, staticExpr, showIt);
                res = staticExpr;
                staticExpr = null;
                wnwStack.remove(wnwStack.size() - 1);
                break;
            case LE:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.le(b);
                break;
            case LINE:
                a = process(space + "   ", tree.getChild(0));
//                Main.debug.println("Processing line " + a);
                break;
            case LT:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.lt(b);
                break;
            case MINUS:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.sub(b);
                break;
            case MULT:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.mult(b);
                break;
            case MULTI_RETURN:
                // (MULTI_RETURN (CHCAT rows cols junk) size v))
                next = tree.getChild(n - 1);
                showIt = true;
                if (next.getText().equals(";")) {
                    showIt = false;
                    n--;
                }
                next = tree.getChild(0);
                ca = new CellArray(new MatString(next.getChild(0).getText()));
                int nn = next.getChildCount();
                for (int i = 1; i < nn; i++) {
                    ca = ca.hcat(new CellArray(new MatString(next.getChild(i).getText())));
                }
                next = tree.getChild(1); // the variable ID
                str = next.getText();
                CellArray cb = new CellArray(process(space + "   ", tree.getChild(2)));
                for (int i = 3; i < n; i++) {
                    cb = cb.hcat(new CellArray(process(space + "   ", tree.getChild(i))));
                }
                Interpreter.multi_return(ca, str, cb, showIt);
                break;
            case NE:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.ne(b);
                break;
            case NEGATE:
                a = process(space + "   ", tree.getChild(0));
                res = a.negate();
                break;
            case OFF:
                res = new MatString("OFF");
                break;
            case ON:
                res = new MatString("ON");
                break;
            case PLUS:
                a = process(space + "   ", tree.getChild(0));
                a = checkForEnd(a);
                b = process(space + "   ", tree.getChild(1));
                b = checkForEnd(b);
                res = a.add(b);
                break;
            case SCAND:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.and(b);
                break;
            case SCOR:
                a = process(space + "   ", tree.getChild(0));
                b = process(space + "   ", tree.getChild(1));
                res = a.or(b);
                break;
            case SHADING:
                next = tree.getChild(0);
                str = next.getText();
                Interpreter.shading(str);
                break;
            case STRING_LITERAL:
                str = tree.getText();
                res = new MatString(str);
                break;
            case STRUCT:
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getField(str, fld);
                break;
            case STRUCTA:
                // (STRUCTA a first 2)
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                m = (Matrix) process(space + "   ", tree.getChild(2));
                ndx = (int) m.get(1);
                res = Interpreter.getFieldA(str, fld, ndx);
                break;
            case STRUCTAV:
                // (STRUCTAV a v 1)
                str = ((CommonTree) tree.getChild(0)).getText();
                var = ((CommonTree) tree.getChild(1)).getText();
                m = (Matrix) process(space + "   ", tree.getChild(2));
                ndx = (int) m.get(1);
                res = Interpreter.getFieldAV(str, var, ndx);
                break;
            case STRUCTV:
                str = ((CommonTree) tree.getChild(0)).getText();
                var = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getFieldV(str, var);
                break;
            case SWITCH:
                /*
                 * (switch x 
                 *     (case 1 (BODY (= y 1))) 
                 *     (case 2 (BODY (= y 2))) 
                 *     (case (CVCAT (CHCAT 3 4 5)) (BODY (= y found one of the cell answers))) 
                 *     (otherwise (BODY (= y 3))))
                 */
                str = tree.getChild(0).getText();
                a = Interpreter.getValue(str);
                for (int i = 1; i < n; i++) {
                    node = tree.getChild(i);
                    if (convert(node.getType()) == TYPE.CASE) {
                        // check the value of a against the first child
                        b = process(space + "   ", node.getChild(0));
                        if (matches(a, b)) {
                            process(space + "   ", node.getChild(1));
                            break;  // exit the loop
                        }
                    } else {    // hit the default case
                        process(space + "   ", node.getChild(0));
                    }
                }
                break;
            case TRY:
                try {
                    m = (Matrix) process(space + "   ", tree.getChild(0));
                } catch (Exception e) {
                    m = (Matrix) process(space + "   ", tree.getChild(1));
                }
                break;
            case VCAT:
                a = process(space + "   ", tree.getChild(0));
                m = new Matrix(checkForEnd(a));
                for (int i = 1; i < n; i++) {
                    a = process(space + "   ", tree.getChild(i));
                    m = m.vcat(new Matrix(checkForEnd(a)) );
                }
                res = m;
                break;
            case VECFIELD:
                // (VECFIELD a age)
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getAllVecFields(str, fld);
                break;
            case VECFIELDV:
                // (VECFIELDV a age)
                str = ((CommonTree) tree.getChild(0)).getText();
                fld = ((CommonTree) tree.getChild(1)).getText();
                res = Interpreter.getAllVecFieldsV(str, fld);
                break;
            case WHILE:
                body = tree.getChild(1);
                m = (Matrix) process(space + "   ", tree.getChild(0));
                while (m.get(1) > 0) {
                    process(space + "   ", body);
                    m = (Matrix) process(space + "   ", tree.getChild(0));
                }

                break;
            case ZERO:
                Interpreter.displayError("Parse error at line " + lineNumber);
                File_I_O.deleteCurrent();
                throw new RuntimeException("Parse error at line " + lineNumber);
            // break; unreachable because of the throw
            default:
                System.out.flush();
                Interpreter.displayError("Case not covered: " + nodeType.ordinal()
                        + ": " + nodeType);
        }
        /* pop soFar and arrayName "off the stack" */
        soFar = local_soFar;
        arrayName = local_arrayName;
        return res;
    }

    public static boolean validateTokens() {
        boolean res = true;
        BufferedReader in = null;
        String name = "src" + File.separator + "parser" + File.separator + "Expr.tokens";
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
                TYPE nodeNdx = convert(ndx);
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

    private static Matrix getEndFromVar() throws Exception {
        Matrix res = null;
        if (arrayName == null) {
            throw new RuntimeException("colon outside the context of indexing");
        } else {
            MatObject o = Interpreter.getValue(arrayName);
            if (o == null) {
                o = staticExpr;
            }
            if (soFar > o.dimensions) {
                throw new RuntimeException("colon beyond index size range");
            } else {
                double sz[] = o.size();
                res = new Matrix(sz[soFar - 1]);
            }
        }
        return res;
    }
    
    /* This function requires three pieces of data:
     * 1. the number of parameters in the "function call"
     *    - found in the wnw reference off the wnw stack
     * 2. which of these parameters we are dealing with
     *    - loaded in the end statement
     * 3. the number of dimensions in the data
     *    - found by looking up the stored data
     */

    public static MatObject checkForEnd(MatObject o) throws Exception {
        MatObject res = o;
        Matrix m;
        if (o instanceof Matrix) {
            m = (Matrix) o;
            if (m.type == Type.END) {
                int ndx = m.geti(1);
                boolean found = false;
                Workspace curW = Interpreter.getWorkspace();
                DefaultListModel varList = curW.getVarList();
                int lookAt = wnwStack.size() - 1;
                while (!found && lookAt >= 0) {
                    WhoKnowsWhat wnw = wnwStack.get(lookAt);
                    for (int i = varList.size() - 1; !found && i >= 0; i--) {
                        //If the variable does exist, inputs are indices
                        String vn = ((Variable) varList.get(i)).getVarName();
                        if (vn.equals(wnw.str)) {
                            MatObject data = ((Variable) varList.get(i)).getData();
                            found = true;
                            if (wnw.size == 1) {
                                m = new Matrix(data.n);
                            } else {
                                int dims = data.dimensions;
                                if (ndx > dims) {
                                    m = new Matrix(1);
                                } else {
                                    m = new Matrix(data.size[ndx-1]);
                                }
                            }
//                            Main.debug.println("Found " + wnw.str 
//                                             + "; dimensions " + data.dimensions
//                                             + "; call size " + wnw.size
//                                             + "; position " + ndx
//                                             + " -> " + m);
//                            Main.debug.flush();
                        }
                    }
                    if (!found) {
                        lookAt--;
                    }
                }
                if (!found) {
                    throw new RuntimeException("End outside the scope of any variable index");
                }
            }
            res = m;
        }
        return res;
    }

    public static void process(CommonTree tree) {
//        Main.debug.println(tree.toStringTree());
        try {
            System.out.println("Result = " + process("", tree));
        } catch (Exception e) {
            Interpreter.displayError(e.getMessage());
            e.printStackTrace();
        }
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

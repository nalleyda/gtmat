/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import javax.swing.text.*;
import functions.*;
import workspace.*;
import fileIO.*;
import gui.TabbedPane;
import jmatrix.*;
import jmatrix.MatObject.Type;
import main.*;
import parser.*;
import plotting.*;
import sound.*;
import java.lang.RuntimeException;
import java.lang.InterruptedException;
import javax.swing.DefaultListModel;
import java.io.*;
import java.util.regex.*;
import java.util.*;
import gtmatException.*;

/**
 *
 * @author dsmith
 */
public class Interpreter extends Thread {

	public static DataHolder dataHolder;
	public static Matrix pi;
	public static Matrix nan;
	public static Matrix eps;
	public static Matrix inf;
	public static Matrix mtrue;
	public static Matrix mfalse;
	public static Matrix e;
	public static Matrix i;
	public static boolean waitForInput = false;
	private static BufferedReader br = null;
	public boolean done;
	private static boolean firstHelperCall = true;

	public Interpreter() {
		done = false;
	}

	public static void makeConstants() {
		pi = new Matrix(4.0 * Math.atan(1.0));
		eps = new Matrix(Math.pow(2, -53));
		nan = new Matrix(Double.NaN);
		inf = new Matrix(Double.POSITIVE_INFINITY);
		mtrue = new Matrix(1);
		mtrue.type = Type.LOGICAL;
		mfalse = new Matrix(0);
		mfalse.type = Type.LOGICAL;
		e = new Matrix(Math.E);
		i = new Matrix(Math.pow((-1),.5));
	}
	/*
	 * this is a tacky way for a rule to distinguish
	 * between a single expression e, and e1:e2
	 * and e1:e2:e3
	 * m must have one, two or three columns and
	 * one row
	 */

	public static Matrix colon(CellArray ca) {
		Matrix res = null;
		int cols = ca.size[Matrix.COL];
		if (ca.size[Matrix.ROW] != 1
				|| cols > 3) {
			throw new RuntimeException("Interpreter.colon bad row or col size");
		}
		switch (cols) {
		case 1:
			res = (Matrix) ca.get(1);
			break;
		case 2:
			res = Matrix.colon((Matrix) ca.get(1),
					(Matrix) ca.get(2));
			break;
		case 3:
			res = Matrix.colon((Matrix) ca.get(1),
					(Matrix) ca.get(2),
					(Matrix) ca.get(3));
			break;
		}
		return res;
	}

	public static MatObject input(MatString mstr) {
		waitForInput = true;
		MatObject res = null;
		Main.interactions.appendString(mstr.toString(), 0);
		try {
			String str = Main.wstack.peek().getDataHolder().getData();
			GTStringStream ss = new GTStringStream(str + "\n");
			res = GTParser.processChild(ss);
		} catch (Exception e) {
		}
		return res;
	}
	/*
	 * These two functions need to change to access the system
	 * workspace and doc window respectively - hopefully, the
	 * only changes required to integrate back into the real
	 * system
	 */

	public static Workspace getWorkspace() {
		return Main.wstack.peek();
	}

	public static void axis(MatObject mon) {
		System.out.println("axis " + mon.toString());
		if(mon instanceof MatString) {
			MatString ms = (MatString) mon;
			if (ms.toString().equals("ON")) {
				Figure.getCurrent().setAxisDraw(true);
			} else if (ms.toString().equals("OFF")) {
				Figure.getCurrent().setAxisDraw(false);
			}
		}
	}

	public static void shading(String str) {
		System.out.println("shading " + str);
		if(str.equals("interp")) {
			Figure.getCurrent().currentSubplot.shading = 1;
		} else if(str.equals("flat")) {
			Figure.getCurrent().currentSubplot.shading = 2;
		} else {
			Figure.getCurrent().currentSubplot.shading = 0;
		}

	}

	public static void grid(MatObject mon) {
		if(mon instanceof MatString) {
			MatString ms = (MatString) mon;
			if (ms.toString().equals("ON")) {
				Figure.getCurrent().grid(true);
			} else if (ms.toString().equals("OFF")) {
				Figure.getCurrent().grid(false);
			}
		}
	}

	public static MatObject back(MatObject a, MatObject b) {
		MatObject res = null;
		if(!(a instanceof Matrix) || !(b instanceof Matrix)) {
			throw new RuntimeException("Back divide a or b not arrays");
		}
		Matrix ma = (Matrix) a;
		Matrix mb = (Matrix) b;
		Matrix mc = MatInverse.matInverse(ma);
		res = MatMult.matMult(mc, mb);
		return res;
	}

	public static void hold(boolean on) {
		Figure.getCurrent().hold(on);
	}

	public static void displayString(String str) {
		Main.interactions.appendString(str, 0);
	}

	public static void displayError(String str) {
		Main.interactions.appendString(str + "\n", 1);
	}

	public static void displayHelp(MatString helpArg) throws Exception {

		String filename = "src" + File.separator + "help" + File.separator + helpArg.toString() + ".txt";

		StringBuilder sb = new StringBuilder();
		String curline;
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			curline = br.readLine();
			while (curline != null){
				sb.append(curline + "\n");
				curline = br.readLine();
			}
			//System.out.println(sb.toString());
			Main.interactions.appendString(sb.toString() + "\n", 0);
		}
		catch (Exception e){
			e.printStackTrace();
			throw new Exception("Invalid target for help.");
		}

	}


	public static void multi_return(CellArray rtv, String name,
			CellArray params, boolean showIt) throws Exception {
		int i;
		String nm;
		if (name.equals("size")) {
			/*  SIZE   Size of array.  
    [M,N] = SIZE(X) for matrix X, returns the number of rows and columns in
    X as separate output variables. 

    [M1,M2,M3,...,MN] = SIZE(X) for N>1 returns the sizes of the first N 
    dimensions of the array X.  If the number of output arguments N does
    not equal NDIMS(X), then for:

    N > NDIMS(X), SIZE returns ones in the "extra" variables, i.e., outputs
                  NDIMS(X)+1 through N.
    N < NDIMS(X), MN contains the product of the sizes of dimensions N
                  through NDIMS(X).

    M = SIZE(X,DIM) returns the length of the dimension specified
    by the scalar DIM.  For example, SIZE(X,1) returns the number
    of rows. If DIM > NDIMS(X), M will be 1.

    When SIZE is applied to a Java array, the number of rows
    returned is the length of the Java array and the number of columns
    is always 1.  When SIZE is applied to a Java array of arrays, the
    result describes only the top level array in the array of arrays.

    Example:
    If
       X = rand(2,3,4);
    then
       d = size(X)              returns  d = [2 3 4]
       [m1,m2,m3,m4] = size(X)  returns  m1 = 2, m2 = 3, m3 = 4, m4 = 1
       [m,n] = size(X)          returns  m = 2, n = 12
       m2 = size(X,2)           returns  m2 = 3
			 */
			MatObject o = params.get(1);
			double sz[] = o.size();
			if (rtv.n == 1) {
				nm = ((MatString) rtv.get(1)).toString();
				assign(nm, new Matrix(sz), showIt);
			} else {
				i = 0;
				while (i < sz.length && i < rtv.n) {
					nm = ((MatString) rtv.get(i + 1)).toString();
					assign(nm, new Matrix(sz[i++]), showIt);
				}
			}
		} else if (name.equals("meshgrid")) {
			CellArray ca = Matrix.meshgrid((Matrix) params.get(1),
					(Matrix) params.get(2));
			for (i = 0; i < rtv.n && i < 2; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("peaks")) {
			CellArray ca = Matrix.peaks((int)((Matrix) params.get(1)).get(1));
			for (i = 0; i < rtv.n && i < 3; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("wavread")) {
			CellArray ca = Sound.wavread(params.get(1).toString());
			for (i = 0; i < rtv.n && i < 2; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("sort")) {
			CellArray ca = Matrix.sort((Matrix) params.get(1));
			for (i = 0; i < rtv.n && i < 2; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("min")) {
			CellArray ca = Matrix.min((Matrix) params.get(1));
			for (i = 0; i < rtv.n && i < 2; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("max")) {
			CellArray ca = Matrix.max((Matrix) params.get(1));
			for (i = 0; i < rtv.n && i < 2; i++) {
				nm = ((MatString) rtv.get(i + 1)).toString();
				assign(nm, ca.get(i + 1), showIt);
			}
		} else if (name.equals("csvread")) {
			CellArray ca = FileIO.csvread(params.get(1).toString());
			if (ca != null) {
				for (i = 0; i < rtv.n && i < 3; i++) {
					nm = ((MatString) rtv.get(i + 1)).toString();
					assign(nm, ca.get(i + 1), showIt);
				}
			}
		} else {

			//If we're not trying to index, see if it is a helper function
			String tname = Main.wstack.peek().getFunctionName();

			if (firstHelperCall){
				tname += "_" + name;
			}
			firstHelperCall = false;

			MatObject[] helperRes = checkHelperFunctions(tname, params);
			if (helperRes != null){
				System.out.println("\n\n\n\n\n\n\nFOUND A HELPER\n\n\n\n\n");
				for (i = 0; i < rtv.n && i < helperRes.length; i++){
					nm = ((MatString) rtv.get(i+1)).toString();
					assign(nm, helperRes[i], showIt);
				}
			}

			firstHelperCall = true;

			if (helperRes == null){
				MatObject[] results = checkLocalFunctions(name, params);
				//System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nRESULTS: " + results);
				if (results == null) {
					throw new RuntimeException("unknown multi-return function call");
				}
				else {
					for (i = 0; i < rtv.n && i < results.length; i++) {
						nm = ((MatString) rtv.get(i + 1)).toString();
						assign(nm, results[i], showIt);
					}
				}
			}
		}
	}

	public static void assignStr(String name, String fld, MatObject data, boolean showIt) throws Exception {
		setStruct(name, fld, data, showIt);
	}

	public static void setStruct(String name, String fld, MatObject data, boolean showIt) throws Exception {
		Workspace curW = getWorkspace();
		MatObject val = getValue(name)[0];
		StructArray strcta = null;
		if (val == null || !(val instanceof StructArray)) {
			strcta = new StructArray(new Structure(fld, data));
		} else {
			strcta = (StructArray) val;
			strcta.setField(fld, data);
		}
		curW.add(new Variable(name, strcta));
		if (showIt) {
			displayString(name + " =\n" + strcta + "\n");
		}
		TabbedPane.list.setModel(Main.wstack.peek().getVarList());
	}

	public static void assignStrV(String name, String var, MatObject data, boolean showIt) throws Exception {
		MatObject val = getValue(name)[0];
		MatString fldv = (MatString) getValue(var)[0];
		String fld = fldv.toString();
		setStruct(name, fld, data, showIt);
	}

	public static void assignStrA(String name, String fld, Matrix mndx, MatObject data, boolean showIt) throws Exception {
		setStructA(name, fld, mndx, data, showIt);
	}

	public static void assignStrAV(String name, String var, Matrix mndx, MatObject data, boolean showIt) throws Exception {
		String fld = ((MatString) getValue(var)[0]).toString();
		setStructA(name, fld, mndx, data, showIt);
	}

	public static void clear() {
		Workspace curW = getWorkspace();
		curW.clear();
		TabbedPane.list.setModel(Main.wstack.peek().getVarList());
	}

	public static void clc() {
		Main.interactions.clc();
	}

	public static void figure() {
		Figure.figure();
	}

	public static Matrix getAllVecFieldsV(String str, String var) throws Exception {
		String fld = ((MatString) getValue(var)[0]).toString();
		return getAllVecFields(str, fld);
	}

	public static Matrix getAllVecFields(String str, String fld) throws Exception {
		StructArray strca = (StructArray) getValue(str)[0];
		int num = strca.n;
		double value;
		Matrix res = new Matrix(1, num);
		for (int i = 1; i <= num; i++) {
			Structure strc = strca.get(i);
			Matrix m = (Matrix) strc.getField(fld);
			if (m.n == 0) {
				value = Double.NaN;
			} else {
				value = m.get(1);
			}
			res.set(1, i, value);
		}
		return res;
	}

	public static CellArray getAllCellFieldsV(String str, String var) throws Exception {
		String fld = ((MatString) getValue(var)[0]).toString();
		return getAllCellFields(str, fld);
	}

	public static CellArray getAllCellFields(String str, String fld) throws Exception {
		StructArray strca = (StructArray) getValue(str)[0];
		int num = strca.n;
		CellArray res = new CellArray(1, num);
		for (int i = 1; i <= num; i++) {
			Structure strc = strca.get(i);
			MatObject m = strc.getField(fld);
			res.set(1, i, m);
		}
		return res;
	}

	private static void setStructA(String name, String fld, Matrix mndx, MatObject data, boolean showIt) throws Exception {
		Workspace curW = getWorkspace();
		StructArray stra = (StructArray) getValue(name)[0];
		String fnames[] = stra.fieldNames();
		String newfnames[] = null;
		if (mndx.n > 1) {
			throw new RuntimeException("only use singly dimensioned structure arrays");
		}
		int ndx = (int) mndx.get(1);
		/*
		 * cases to consider:
		 *     extend case:  ndx >= stra.n
		 *              make a structure with the same fields all empty
		 *              and hcat it to the existing struct array
		 */
		if (ndx > stra.n) {
			// get the existing fields
			newfnames = new String[fnames.length];
			Matrix empties[] = new Matrix[fnames.length];
			for (int i = 0; i < fnames.length; i++) {
				newfnames[i] = fnames[i];
				empties[i] = new Matrix();
			}
			Structure newstr = new Structure(newfnames, empties);
			for (int i = stra.n; i < ndx; i++) {
				stra = stra.hcat(newstr.clone());
			}
		}
		/*
		 *     add field case:  ndx < stra.n
		 *              if the field is not in the existing elements,
		 *                    first set that field in all of them to empty vector
		 */
		if (!stra.isField(fld)) {
			stra.setField(fld, new Matrix());
		}
		/*     normal case:
		 *              just set the right field in the selected struct
		 */
		stra.setField(ndx, fld, data);
		curW.add(new Variable(name, stra));
		if (showIt) {
			displayString(name + " =\n" + stra + "\n");
		}
		TabbedPane.list.setModel(Main.wstack.peek().getVarList());
	}

	public static void assign(String name, MatObject data, boolean showIt) {
		if (data == null){
			return;
		}
		Workspace curW = getWorkspace();
		curW.add(new Variable(name, data));
		if (showIt) {
			displayString(name + " = " + data + "\n");
		}
		TabbedPane.list.setModel(Main.wstack.peek().getVarList());
		//System.out.println("\nASSIGNING + " + name + ":\n" + Main.wstack.peek());

	}

	//    public static void index(String name, MatObject index, MatObject expr, boolean showIt) {
	//        Workspace curW = getWorkspace();
	//        int n = index.length();
	//        if (index instanceof Matrix) {
	//            Matrix mndx = (Matrix) index;
	//            if (expr.length() > 1 && expr.length() != n) {
	//                throw new RuntimeException("can only assign scalars when indexing");
	//            }
	//            MatObject val = getValue(name);
	//            MatObject newres = expr;
	//            if (val == null) {
	//                // variable didn't exist = make a new one typed from the expr
	//            } else if (val instanceof Matrix) {
	//                // put the expr at the appropriate index pos
	//                if (!(expr instanceof Matrix)) {
	//                    throw new RuntimeException("must put a Matrix in a Matrix");
	//                }
	//                Matrix it = (Matrix) val;
	//                Matrix mexpr = (Matrix) expr;
	//                switch (n) {
	//                    case 1:
	//                        it.set((int) mndx.get(1), mexpr.get(1));
	//                        break;
	//                    case 2:
	//                        it.set((int) mndx.get(1), (int) mndx.get(2), mexpr.get(1));
	//                        break;
	//                    default:
	//                        throw new RuntimeException("can only index 1 or 2 dimensions");
	//                }
	//                newres = it;
	//
	//            } else if (val instanceof UnsignedByte) {
	//                // put the expr at the appropriate index pos
	//            } else if (val instanceof CellArray) {
	//                // put the expr at the appropriate index pos
	//            } else if (val instanceof StructArray) {
	//                // put the expr at the appropriate index pos
	//                if (!(expr instanceof StructArray)) {
	//                    throw new RuntimeException("must put a Matrix in a Matrix");
	//                }
	//                StructArray it = (StructArray) val;
	//                StructArray sexpr = (StructArray) expr;
	//                switch (n) {
	//                    case 1:
	//                        it.set(1, (int) mndx.get(1), sexpr.get(1));
	//                        break;
	//                    case 2:
	//                        it.set((int) mndx.get(1), (int) mndx.get(2), sexpr.get(1));
	//                        break;
	//                    default:
	//                        throw new RuntimeException("can only index 1 or 2 dimensions");
	//                }
	//                newres = it;
	//
	//            }
	//            curW.add(new Variable(name, newres));
	//            if (showIt) {
	//                displayString(name + " = " + newres + "\n");
	//            }
	//            TabbedPane.list.setModel(Main.wstack.peek().getVarList());
	//        } else {
	//            throw new RuntimeException("indexing with non-numeric object");
	//        }
	//    }
	public static MatObject getField(String str, String fld) throws Exception {
		MatObject res = null;
		MatObject val = getValue(str)[0];
		if (val != null && (val instanceof StructArray)) {
			StructArray strct = (StructArray) val;
			res = strct.getField(fld);
		}
		return res;
	}

	public static MatObject getFieldA(String str, String fld, int ndx) throws Exception {
		MatObject res = null;
		MatObject val = getValue(str)[0];
		if (val != null && (val instanceof StructArray)) {
			StructArray strct = (StructArray) val;
			Structure it = strct.get(ndx);
			res = it.getField(fld);
		}
		return res;
	}

	public static MatObject getFieldAV(String str, String var, int ndx) throws Exception {
		MatObject res = null;
		MatObject val = getValue(str)[0];
		String fld = ((MatString) getValue(var)[0]).toString();
		if (val != null && (val instanceof StructArray)) {
			StructArray strct = (StructArray) val;
			Structure it = strct.get(ndx);
			res = it.getField(fld);
		}
		return res;
	}

	public static MatObject getFieldV(String str, String var) throws Exception {
		MatObject res = null;
		MatObject val = getValue(str)[0];
		String fld = ((MatString) getValue(var)[0]).toString();
		if (val != null && (val instanceof StructArray)) {
			StructArray strct = (StructArray) val;
			res = strct.getField(fld);
		}
		return res;
	}
	/*
    public static void assign(String name, MatObject rhs, Matrix... indices){
    Workspace curWorkspace = Main.wstack.peek();
    DefaultListModel varList = curWorkspace.getVarList();
    Variable rhsvar = new Variable(name, rhs);
    int type = rhs.type;

    int i = 0;
    MatObject lhs = null;

    // Check to see if the variable exists
    while (i < varList.size() && rhsvar.compareTo(((Variable)varList.get(i))) != 0)
    i++;

    // If the variable already exists
    if (i < varList.size()){
    lhs = ((Variable)varList.get(i)).getData();
    }
    // Figure out what the initialized MatObject should look like
    else{
    switch (type){
    case MatObject.DOUBLE:
    lhs = Matrix.zeros(rhs.size[Matrix.ROW], rhs.size[Matrix.COL]);
    break;
    case MatObject.CELL:
    break;
    }
    }



    if (indices.length == 1){
    MatObject.set(lhs, indices[0], rhs);
    }
    else if (indices.length == 2){
    MatObject.set(lhs, indices[0], indices[1], rhs);
    }

    assign(name, lhs);
    }

    public static void clear() {
    Workspace curW = Main.wstack.peek();
    curW.clear();
    TabbedPane.list.setModel(Main.wstack.peek().getVarList());
    }
	 */

	public static MatObject[] getValue(String name) throws Exception {
		if (name.equals("pi")) {
			return new MatObject[]{pi};
		}
		if (name.equals("NaN")) {
			return new MatObject[]{nan};
		}
		if (name.equals("eps")) {
			return new MatObject[]{eps};
		}
		if (name.equals("inf")) {
			return new MatObject[]{inf};
		}
		if (name.equals("true")) {
			return new MatObject[]{mtrue};
		}
		if (name.equals("false")) {
			return new MatObject[]{mfalse};
		}
		if (name.equals("e")) {
			return new MatObject[]{e};
		}
		if (name.equals("i")) {
			return new MatObject[]{i};
		}

		Workspace curW = getWorkspace();
		DefaultListModel varList = curW.getVarList();
		MatObject[] ret = null;

		//First, we check to see if the variable already exists
		for (int i = 0; i < varList.size(); i++) {
			//If the variable does exist, inputs are indices
			if (((Variable) varList.get(i)).getVarName().equals(name)) {
				ret = new MatObject[]{((Variable) varList.get(i)).getData()};
				break;
			}
		}

		System.out.println("\n\n\n\nAbout to check for script.\n\n\n\n");

		//Now, check to see if it was a parameter-less function call or script
		if (ret == null) {
			CellArray params = new CellArray();
			params.setData(new MatObject[0]);
			MatObject[] localres = checkLocalFunctions(name, params);

			if (localres != null){
				/*CellArray dummy = new CellArray();
                MatObject[] dummyData = {null};
                dummy.setData(dummyData);*/

				if (localres == null){//We ran a script
					ret = null;
				}
				else{
					ret = localres;
				}
			}

			/*//Check if it was a script
            if (ret == null){

            }*/
		}
		if (ret == null){
			return new MatObject[]{null};
		}
		else{
			return ret;
		}
	}

	public static Matrix vector(Matrix m) {
		displayString("made vector out of " + m);
		return m;
	}

	private static boolean[] charsBeforeString;
	static {
		charsBeforeString = new boolean[127];
		charsBeforeString[','] = true;
		charsBeforeString[' '] = true;
		charsBeforeString['\n'] = true;
		charsBeforeString['.'] = true;
		charsBeforeString[';'] = true;
		charsBeforeString['['] = true;
		charsBeforeString['('] = true;
		charsBeforeString['{'] = true;
		charsBeforeString['='] = true;
		charsBeforeString['+'] = true;
		charsBeforeString['-'] = true;
		charsBeforeString['*'] = true;
		charsBeforeString['/'] = true;
		charsBeforeString['\\'] = true;
		charsBeforeString['~'] = true;
		charsBeforeString['.'] = true;
	}

	//@TODO: this kills block comments, and block comments aren't cooperating...
	public static String removeComments(String s){
		s = s.replaceAll("[%][{][\\n][^n]*[%][}]", "\n");//block comments
		s = s.replaceAll("[%][^(\\n|')]*[\\n]", "\n");//normal comments
		return s.replaceAll("[\\n][\\n]+", "\n");
	}

	public static String preprocessTranspose(String s) throws Exception{
		if (s == null || s.length() == 0) return s;

		char[] arr = removeComments(s).toCharArray();
		int i = 0;

		out:
			while (i < arr.length){
				if (arr[i] == '$'){
					throw new Exception("Invalid character \"$\" in file.");
				}
				else if (arr[i] == '\''){
					if (i > 0 && !charsBeforeString[arr[i-1]]){//we have a transpose
						while (i < arr.length && arr[i] == '\''){
							arr[i++] = '$';
						}
						if (i == arr.length) break;
					}
					else{//we're starting a string
						i++;
						while (true){//hacky goto - curse you, Java!
							while (i < arr.length && arr[i] != '\'' && arr[i] != '\n'){//go until we hit a close quote
								i++;
							}
							if (i == arr.length) break out;
							else if(arr[i] == '\n') throw new Exception("Unbalanced string! Someone should probably put a line number here...");
							if (i < arr.length-1 && arr[i+1] == '\''){//escape character for ', still in string
								i++;
								continue;//goto while(true)
							}
							else{
								break;//we finished the string
							}
						}
					}
				}
				i++;
			}
		
		
		String ret =  new String(arr);
		ret = ret.replaceAll("\\[(\\s*)\\]", "[]");
		ret = ret.replaceAll("\\{(\\s*)\\}", "{}");
		return ret;
	}

	/*public static String fixTranspose(String s) throws Exception{
    	char[] arr = s.toCharArray();

    	//If it occurs in location 0, it is a real string
    	for (int i = 1; i < arr.length; i++){
    		if (arr[i] == '\'' && !charsBeforeString[arr[i-1]]){
    			while (i < arr.length && arr[i] == '\''){
    				arr[i++] = '$';
    			}
    		}
    		else if (arr[i] == '$'){
    			throw new Exception("Invalid character \"$\" in file.");
    		}
    	}
    	return new String(arr);
    }*/

	/*
	 * whole new approach to function calling
	 * if all params are Matrix, check for indexing
	 * otherwise, pass the cell array of args (can be mixed types)
	 */
	private static String myFileName = "";
	public static MatObject[] call(String name, CellArray ca) throws Exception{
		MatObject[] res = null;
		Exception ex = null;
		//System.out.println(name);
//		System.out.println("\n\nName: " + name + "\nArguments: " + ((MatObject)(ca.getData()[0])).toString() + "\n\n");
		myFileName = name;
		boolean allMat = true;
		for (int i = 0; i < ca.length(); i++) {
			MatObject o = ca.get(i + 1);
			if (!(o instanceof Matrix)) {
				allMat = false;
				break;
			}
		}
		if (allMat) {
			Matrix[] params = new Matrix[ca.n];
			for (int i = 0; i < ca.n; i++) {
				params[i] = (Matrix) ca.get(i + 1);
			}
			res = new MatObject[] {checkForVariable(name, params)};
			if (res[0] == null) res = null;
		}
		if (res == null){

			//If we're not trying to index, see if it is a helper function
			if (!Main.helperStack.isEmpty()){
				String tname = Main.helperStack.peek() + "_" + name;
				MatObject[] helperRes = checkHelperFunctions(tname, ca);
				if (helperRes != null){
					res = helperRes;
				}
			}

		}

		if (res == null) {

			//If it's not a helper function, see if it is a user-defined function
			try{
				MatObject[] localres = checkLocalFunctions(name, ca);
				System.out.println("\nResults: " + localres);
				if (localres != null) {
					res = localres;
	
				}
			}catch(Exception e){
				//e.printStackTrace();
				ex = e;
			}

		}
		if (res == null) {
			//If it wasn't a local function call, try system functions
			res = Function.checkSpecialCases(name, ca);
			if (res != null) {
				return res;
			}

			Function f = Function.getFunction(name);

			if (f != null) {
				res = Function.applyFunction(f, ca);
			}
		}

		//If we get to this point, then the RHS is invalid
		if (res == null) {
			//System.out.println("exception thrown in Interpreter at: "+System.currentTimeMillis());
			if (ex!=null) throw ex;
			else{
				//throw new UndefinedVariableException();
				throw new RuntimeException("Invalid variable name or function call - " + name);
			}
		}
		return res;
	}

	public static boolean fileVersionWrong(String name) {
		BufferedReader in = null;
		boolean res = false;
		try {
			in = new BufferedReader(new FileReader(name));
			String str = in.readLine();
			if(str == null) return true;
			str = in.readLine();
			if(str == null) return true;
			// check version number
			StringTokenizer tk = new StringTokenizer(str, ":");
			String token = tk.nextToken();   // GTMat etc.
			token = tk.nextToken();   // Version number
			res = !(token.equals(Main.version));
		} catch (IOException e) {
			System.err.println("fileVersionWrong: File " + name + " did not open");
			System.exit(1);
		}
		return res;
	}


	public static MatObject[] checkHelperFunctions(String tname, CellArray ca) throws Exception {

		MatObject[] res = null;
		File dir = new File(Main.getCurrentDirectory());
		//GTStringStream ss = null;

		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File dir, String tname) {
				return tname.endsWith(".t");
			}
		};

		String[] tfiles = dir.list(filter);
		if (tfiles != null) {
			for (int i = 0; i < tfiles.length; i++) {
				//Look for a file with the same name
				if (tfiles[i].substring(0, tfiles[i].length() - 2).equals(tname)) {


					//Get the formal parameters
					String fileName = Main.getCurrentDirectory() + File.separator
					+ tname + ".t";
					String[][] paramNames = getParams(fileName);
					Workspace ws = new Workspace(fileName);


					String[] formalParamNames = paramNames[0];
					String[] formalOutputNames = paramNames[1];


					//Copy formal params to actual params
					MatObject[] actualParams = ca.getData();

					//Make sure we called the function correctly
					if (formalParamNames.length != actualParams.length) {
						//@TODO: varargin
						System.out.println("Wrong number of arguments.");
						break;
					}

					//Deep copy everything to the new workspace
					for (int ind = 0; ind < actualParams.length; ind++) {
						ws.add(new Variable(formalParamNames[ind], actualParams[ind].copy())); //!!!!copy or clone? @TODO
					}


					//Put the new ws on the stack
					Main.wstack.add(ws);
					File source = new File(fileName);
					String tName = fileName.substring(0, fileName.length()-1)+"t";
					File tFile = new File(tName);
					if(tFile == null 
							|| source.lastModified() > tFile.lastModified()
							|| Interpreter.fileVersionWrong(tName)) {
						tFile = File_I_O.saveFunctionTFile(tname);
					}
					//Run the file on the new workspace
					System.out.println(Main.wstack.peek());
					File_I_O.readandRunTFile(tName);

					Variable toAdd;
					MatObject[] resData = new MatObject[formalOutputNames.length];
					/* for (int j = 0; j < formalOutputNames.length; j++){
                    System.out.println(formalOutputNames[j]);
                    }*/
					for (int ind = 0; ind < formalOutputNames.length; ind++) {
						toAdd = ws.getVariable(formalOutputNames[ind]);
						if (toAdd == null) {
							//@TODO: add this line back when code actually runs
							//throw new RuntimeException("Didn't set output variables");
							resData[ind] = new Matrix(-1); //dummy
						} else {
							resData[ind] = toAdd.getData();
						}

					}

					//res = new CellArray(resData);
					res = resData;
					//System.out.println(res);

					Main.wstack.remove();
					break;
				}

			}
		}
		System.out.println(Main.wstack.peek());
		return res;
	}
	public static Matrix eval(MatString s){
		GTStringStream ss = null;
		try {
			ss = new GTStringStream();
			ss.append(s.toString());
			GTParser.process(ss, new Interpreter());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception @ Interpreter.eval()");
			e.printStackTrace();
		}
		//GTParser.process(ss, new Interpreter());
		return new Matrix(1);
	}

	public static MatObject[] checkLocalFunctions(String name, CellArray ca) throws Exception {
		MatObject[] res = null;
		File dir = new File(Main.getCurrentDirectory());
		GTStringStream ss = null;

		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return name.endsWith(".m");
			}
		};

		String[] mfiles = dir.list(filter);
		if (mfiles != null) {
			for (int i = 0; i < mfiles.length; i++) {
				//Look for a file with the same name
				if (mfiles[i].substring(0, mfiles[i].length() - 2).equals(name)) {


					//Get the formal parameters
					String fileName = Main.getCurrentDirectory() + File.separator
					+ name + ".m";
					String[][] paramNames = getParams(fileName);
					Workspace ws = new Workspace(fileName);
					//Check for scripts
					System.out.println("\n\n\n\nNow to check for script.\n\n\n\n");
					if (paramNames == null) {
						try {
							br = new BufferedReader(new FileReader(fileName));
							ss = new GTStringStream("");
							String str = br.readLine();
							while (str != null) {
								ss.append(str + '\n');/*itshere*/
								str = br.readLine();
							}
							System.out.println("ss, the contents of the file:"+ss.toString());
							GTParser.process(ss, new Interpreter());
						}
						catch (Exception e1) {
							throw new RuntimeException("function stream " + e1);
						}
						/*res = new CellArray();
						MatObject[] data = {null};
						res.setData(data);*/
						return new MatObject[] {null};
					}

					String[] formalParamNames = paramNames[0];
					String[] formalOutputNames = paramNames[1];



					//Copy formal params to actual params
					MatObject[] actualParams = ca.getData();
					/*                   System.out.println("\n\n\n\n\n\n\n\n");
                    for (int ind = 0; ind < formalParamNames.length; ind++){
                        System.out.println("DEBUGGING STUFF");
                        System.out.println(formalParamNames[ind]);
                    }
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
					 */
					//Make sure we called the function correctly
					if (formalParamNames.length != actualParams.length) {
						//@TODO: varargin
						System.out.println("Wrong number of arguments.");
						break;
					}


					//Deep copy everything to the new workspace
					for (int ind = 0; ind < actualParams.length; ind++) {
						//System.out.println(actualParams[ind]);
						ws.add(new Variable(formalParamNames[ind], actualParams[ind].copy())); //!!!!copy or clone? @TODO
					}


					//Put the new ws on the stack
					Main.wstack.add(ws);
					Main.helperStack.push(name);
					File source = new File(fileName);
					String tName = fileName.substring(0, fileName.length()-1)+"t";
					File tFile = new File(tName);
					if(tFile == null 
							|| source.lastModified() > tFile.lastModified()
							|| Interpreter.fileVersionWrong(tName)) {
						tFile = File_I_O.saveFunctionTFile(name);
					}
					//Run the file on the new workspace
					System.out.println(Main.wstack.peek());
					File_I_O.readandRunTFile(tName);



					Variable toAdd;
					MatObject[] resData = new MatObject[formalOutputNames.length];
					/* for (int j = 0; j < formalOutputNames.length; j++){
                    System.out.println(formalOutputNames[j]);
                    }*/
					for (int ind = 0; ind < formalOutputNames.length; ind++) {
						toAdd = ws.getVariable(formalOutputNames[ind]);
						if (toAdd == null) {
							//@TODO: add this line back when code actually runs
							//throw new RuntimeException("Didn't set output variables");
							resData[ind] = new Matrix(-1); //dummy
						} else {
							resData[ind] = toAdd.getData();
						}

					}

					res = resData;//new CellArray(resData);

					Main.wstack.remove();
					Main.helperStack.pop();
					break;
				}

			}
		}
		System.out.println(Main.wstack.peek());
		return res;
	}

	public static String[][] getParams(String filename) {

		String[][] ret = {null, null};
		boolean foundHeader = false;
		//Open the file
		try {
			br = new BufferedReader(new FileReader(filename));
			String curline = br.readLine();
			ArrayList<String> params = new ArrayList<String>();
			ArrayList<String> outputs = null;
			while (curline != null) {
				StringTokenizer stk = new StringTokenizer(curline, " ");
				while (curline != null && !stk.hasMoreTokens()){
					curline = br.readLine();
					if (curline != null){
						stk = new StringTokenizer(curline, " ");
					}
				}
				String token = stk.nextToken();

				if (token != null && token.equals("function")) {
					foundHeader = true;
					System.out.println("Function header: " + curline);
					curline = stk.nextToken("\n");
					int len = curline.length();
					int i = 0; //Start parsing after keyword

					while (i < len && curline.charAt(i) == ' ') {
						i++; //ignore leading white space
					}
					for (; i < len; i++) {
						if (curline.charAt(i) == '[' && outputs == null) {//outputs in brackets
							outputs = new ArrayList<String>();
							String outName = "";
							while (curline.charAt(i) != ']') {
								i++;
								if (i >= len) {
									throw new Exception("Not a valid function call");
								}

								while (curline.charAt(i) == ',' || curline.charAt(i) == ' '){
									i++;
								}
								if (i >= len) {
									throw new Exception("Not a valid function call");
								}

								while (curline.charAt(i) != ',' && curline.charAt(i) != ' ' && curline.charAt(i) != ']') {
									outName += curline.charAt(i);
									i++;

									if (i >= len) {
										throw new Exception("Not a valid function call");
									}
								}
								outputs.add(outName);
								outName = "";
							}
						} else if (curline.charAt(i) != '=' && outputs == null) { //single output, not in brackets
							outputs = new ArrayList<String>();
							String outName = "";
							while (curline.charAt(i) != ' ') {
								outName += curline.charAt(i);
								i++;
							}
							outputs.add(outName);
						}


						//Look for the start of the params
						if (curline.charAt(i) == '(') {
							String param = "";

							//Go until the end of params
							while (curline.charAt(i) != ')') {
								i++;
								if (i >= len) {
									throw new Exception("not a valid function call");
								}

								//Read in the full variable name
								while (curline.charAt(i) != ',' && curline.charAt(i) != ')') {
									if (curline.charAt(i) != ' ') {
										param += curline.charAt(i);
									}
									i++;
									if (i >= len) {
										throw new Exception("not a valid function call");
									}
								}
								params.add(param);
								param = "";
							}

						}
					}
					ret[0] = params.toArray(new String[0]);
					ret[1] = outputs.toArray(new String[0]);
					break;
				}
				curline = br.readLine();

			}
			System.out.println(curline);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!foundHeader) {
			ret = null;
		}
		else{
			System.err.println("Params:");
			for (int i = 0; i < ret[0].length; i++){
				System.err.println(ret[0][i]);
			}
			System.err.println("Outputs:");
			for (int i = 0; i < ret[1].length; i++){
				System.err.println(ret[1][i]);
			}
		}
		return ret;
	}

	/**
	 * Used to evaluate things like min([1,3,5]) - tries to index if "min" is a
	 * variable in the current workspace, tries to call the function otherwise.
	 * Examples of calls from the parser:
	 *      min([1,3,5]) => call("min", new Matrix(1,3,1,3,5))
	 *      isequal([1,2;3,4], [1]) => call("isequal", new Matrix(2,2,1,3,2,4), new Matrix(1))
	 *      x(17) => call("x", new Matrix(17))
	 *      y => call("y")
	 *      linspace(1,2,50) => call("linspace", new Matrix(1), new matrix(2), new Matrix(50))
	 *
	 * @param name whatever the parentheses are next to
	 * @param inputs whatever is contained in parentheses, one input for each
	 *               comma-separated value
	 * @return the result of the call
	 */
	public static MatObject checkForVariable(String name, Matrix... inputs) throws Exception{
		Workspace curW = getWorkspace();
		DefaultListModel varList = curW.getVarList();
		MatObject ret = null;

		//First, we check to see if the variable already exists
		for (int i = 0; i < varList.size(); i++) {
			//If the variable does exist, inputs are indices
			if (((Variable) varList.get(i)).getVarName().equals(name)) {
				MatObject data = ((Variable) varList.get(i)).getData();
				int nv = inputs.length;
				int nd = data.size.length;
				if(nv > nd) {
					for(int k = nv-1; k >= nd; k--) {
						inputs[nd-1] = (Matrix) inputs[nd-1].dotmult(inputs[k]);
					}
					nv = nd;
				}
				switch (nv) {
				case 0:
					ret = ((Variable) varList.get(i)).getData();
					break;
				case 1:
					ret = MatObject.get(data, (Matrix) inputs[0]);
					break;
				case 2:
					ret = MatObject.get(data, (Matrix) inputs[0],
							(Matrix) inputs[1]);
					break;
				case 3:
					ret = MatObject.get(data, (Matrix) inputs[0],
							(Matrix) inputs[1],
							(Matrix) inputs[2]);
					break;
				}
				if (inputs.length == 0) {
					//new MatObject(varList.get(i).getData());
				} //(row, col) indexing method
				else if (inputs.length == 2) {
				} //linear indexing method
				else if (inputs.length == 1) {
					ret = MatObject.get(data, (Matrix) inputs[0]);
				} //3 or more comma-separated inputs
				else {
					//TODO: fix me
				}
				break;
			}
		}
		
		if (name.equals("pi")){
			return new Matrix(Math.PI);
		}
		if (name.equals("eps")){
			return eps;
		}
		if (name.equals("NaN")) {
			return new Matrix(Double.NaN);
		}
		if (name.equals("inf")) {
			return inf;
		}
		if (name.equals("true")) {
			return mtrue;
		}
		if (name.equals("false")) {
			return mfalse;
		}
		if (name.equals("e")) {
			return e;
		}
		if (name.equals("i")) {
			return i;
		}
		return ret;
	}

	/*
    public static MatObject calln(String name, Matrix nm) {
    MatObject res = null;
    switch (nm.size[MatObject.COL]) {
    case 1:
    res = call(name, nm);
    break;
    case 2:
    res = call(name, new Matrix(nm.get(1)), new Matrix(nm.get(2)));
    break;
    case 3:
    res = call(name, new Matrix(nm.get(1)),
    new Matrix(nm.get(2)),
    new Matrix(nm.get(3)));
    break;
    }
    return res;
    }
    public static MatObject call(String name, CellArray ca) {
    int n = ca.length();
    MatObject it = ca.get(1);
    MatObject res = null;
    if (it instanceof Matrix) {
    Matrix[] params = new Matrix[ca.n];
    for (int i = 0; i < ca.n; i++) {
    params[i] = (Matrix) ca.get(i + 1);
    }
    res = call(name, params);
    //res = call(name, (Matrix) it);
    } else if (it instanceof MatString) {
    res = call(name, (MatString) it);
    } else if (it instanceof StructArray) {
    res = call(name, (StructArray) it);
    } else if (it instanceof CellArray) {
    res = call(name, (CellArray) it);
    }
    return res;
    }

    /**
	 * Used to evaluate things like min([1,3,5]) - tries to index if "min" is a
	 * variable in the current workspace, tries to call the function otherwise.
	 * Examples of calls from the parser:
	 *      min([1,3,5]) => call("min", new Matrix(1,3,1,3,5))
	 *      isequal([1,2;3,4], [1]) => call("isequal", new Matrix(2,2,1,3,2,4), new Matrix(1))
	 *      x(17) => call("x", new Matrix(17))
	 *      y => call("y")
	 *      linspace(1,2,50) => call("linspace", new Matrix(1), new matrix(2), new Matrix(50))
	 *
	 * @param name whatever the parentheses are next to
	 * @param inputs whatever is contained in parentheses, one input for each
	 *               comma-separated value
	 * @return the result of the call
	 * /
    public static MatObject call(String name, Matrix... inputs) {
    Workspace curW = getWorkspace();
    DefaultListModel varList = curW.getVarList();
    MatObject ret = null;

    //First, we check to see if the variable already exists
    for (int i = 0; i < varList.size(); i++) {
    //If the variable does exist, inputs are indices
    if (((Variable) varList.get(i)).getVarName().equals(name)) {
    MatObject data = ((Variable) varList.get(i)).getData();
    if (inputs.length == 0) {
    ret = ((Variable) varList.get(i)).getData();//new MatObject(varList.get(i).getData());
    } //(row, col) indexing method
    else if (inputs.length == 2) {
    ret = MatObject.get(data, (Matrix) inputs[0], (Matrix) inputs[1]);
    } //linear indexing method
    else if (inputs.length == 1) {
    ret = MatObject.get(data, (Matrix) inputs[0]);
    } //3 or more comma-separated inputs
    else {
    //@todo: fix me
    }

    break;
    }
    }
    //If the variable doesn't exist, see if it is a function call
    Function f = Function.getFunction(name);
    if (f != null) {
    ret = Function.applyFunction(f, inputs);
    }

    //If we get to this point, then the RHS is invalid
    if (ret == null) {
    throw new RuntimeException("Invalid variable name or function call.");
    } else {
    return ret;
    }
    }

    public static MatObject call(String name, MatString... inputs) {
    Workspace curW = getWorkspace();
    DefaultListModel varList = curW.getVarList();
    MatObject ret = null;

    Function f = Function.getFunction(name);
    if (f != null) {
    ret = Function.applyFunction(f, inputs);
    }

    //If we get to this point, then the RHS is invalid
    if (ret == null) {
    throw new RuntimeException("Invalid variable name or function call.");
    } else {
    return ret;
    }
    }

    public static MatObject call(String name, MatObject... inputs) {
    MatObject res = null;
    if (name.equals("length")) {
    MatObject it = inputs[0];
    res = new Matrix(MatObject.length(it));
    } else {
    System.out.println("call " + name + " on MatObject Not implemented.");
    }
    return res;
    }

	 */
	//public static void main(String[] args) throws Exception {
		/*File dir = new File(".");

        FilenameFilter filter = new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return name.endsWith(".m");
            }
        };

        String[] mfiles = dir.list(filter);
        for (int i = 0; i < mfiles.length; i++) {
            // Get filename of file or directory
            System.out.println(mfiles[i]);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("Test.m"));
            String curline = br.readLine();
            int i = 0;
            boolean foundFunc = false;
            while (curline != null && !foundFunc) {
                foundFunc = Pattern.matches("elseif.*", curline);
                if (foundFunc) {
                    System.out.println(curline);
                }
                curline = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("DIED");
        }*/

		// displayHelp(new MatString("max"));
		/*System.out.println(preprocessTranspose("[(a)'']\n" + 
    			"\n" + 
    			"x = [a '']"));*/
		/*String s = "This %commented!''oihwefoihewf\nshould result in %asdfsdfs\n%oihwefohwef\na coherent%\nsentence.";
		System.out.println(removeComments(s));
		//s.repl
		s = s.replaceAll("[%]", "&&&");
		System.out.println(s);*/
		/*Scanner scan = new Scanner(new File("Test_Suite/SyntaxStressTest.m"));
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()){
			sb.append(scan.nextLine() + "\n");
		}
		System.out.println(preprocessTranspose(sb.toString()));
		//System.out.println(preprocessTranspose("'Strings should be removed with second highest priority) (. See?'\n" + ""));
	}*/

}

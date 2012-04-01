package Test_Suite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;

import jmatrix.CellArray;
import jmatrix.MatObject;
import jmatrix.Matrix;
import jmatrix.Structure;
import main.Main;
import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
import parser.GTParser;
import workspace.Variable;


public class GTMatTesting {
	public static String[] chs = {"", "", "ch2", "ch3", "ch4", "ch5", "ch6", "ch7", "ch8", "ch9", "ch10", "ch11", "ch12", "ch13", "ch14", "ch15", "ch16", "ch17"};
	public static String[] chapters = {"", "", "Ch 02", "Ch 03", "Ch 04", "Ch 05", "Ch 06", "Ch 07", "Ch 08", "Ch 09", "Ch 10", "Ch 11", "Ch 12", "Ch 13", "Ch 14", "Ch 15", "Ch 16", "Ch 17"};
	public static String dirA = "listings/";
	public static String dirB = "Validation/chapterScripts/";
	public static int endCh;
	public static int beginCh;
	public static DefaultListModel gtMatVars;
	public static ArrayList<DefaultListModel> chVars = new ArrayList<DefaultListModel>(chs.length);;
	public static ArrayList<ArrayList<String>> allListings;
	
	public static void initTesting(int startCh, int stopCh){
		//run matlab first, then gtmat
		for (int s = 0; s<stopCh+1;s++){
			chVars.add(s, new DefaultListModel());
		}
		System.out.println("chVars is of size: "+chVars.size());
		endCh = stopCh;
		beginCh = startCh;
		//parseScriptNames();
		//if(allListings!=null)System.out.println(allListings);
		
		//execMatlab() working
		execMatlab();
		
		//Not running listings very well for weird reasons 
		execGTMat();
		//Compare each resulting matlab ch.txt files with the values in the corresponding column/ch of chVars
		checkResults();
		//compareResults(startCh);
		
		//Can't test any cell array code in gtMat because horizontalConcatenate isn't implemented
		//Other than that, the only other data type to test more and improve is structs.
		//Lots of functions and other features in gtmat are not implemented, making running the scripts all the way through quite difficult.
		
		
	}
	
	public static void execMatlab(){
		try{
			MatlabProxyFactory factory = new MatlabProxyFactory();
			MatlabProxy proxy = factory.getProxy();
			
			
				for (int i = beginCh; i <= endCh; i++){
					String path = dirB + chs[i]+".m";
					String fname = chs[i] + ".txt";
					try{
						//exec. the script, retrieve workspace var names, then write to .txt w/ outputWsVars(w, fname)
//						proxy.eval("clear");
						proxy.eval(chs[i]);
						proxy.eval("w=who;");
						proxy.eval("outputWsVars(w, '"+fname+"')");
						if (i!=endCh) proxy.eval("clear");
						
					}catch(MatlabInvocationException mie){
						System.err.println("Matlab invocation exception.");
//						System.out.println("Exception msg:"+mie.getMessage());
//						System.out.println("StackTrace:"+mie.getStackTrace());
						mie.printStackTrace();
					}
					//proxy.eval("")
				}
				
				proxy.disconnect();
		}catch(MatlabConnectionException mce){
			System.out.println("Could not connect to Matlab instance.");
		}
	}
	
	public static void execGTMat(){
		
		long start;
		for (int i = beginCh; i<= endCh; i++){
			start = System.currentTimeMillis();
			String path = dirB + chs[i]	+ ".m";
			//System.out.println("path being passed to gtmat:"+path);
			//GTParser.process(path);
			
			while(System.currentTimeMillis()-start<2000){
						
			}
			
			try{
				GTParser.process(path);
					
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Halting execution in execGTMat() at GTParser.process(path)");
				//System.out.println(e.toString());
				//System.out.println(path+" threw an exception while being processed");
				//System.out.println(e.getMessage());
				System.exit(-1);
			}
			start = System.currentTimeMillis();
			while(System.currentTimeMillis()-start<3000){
				
			}
			gtMatVars = Main.wstack.peek().getVarList();
			chVars.add(i, gtMatVars);
			System.out.println(gtMatVars.size()+" vars from "+chs[i]+"s workspace varList appended to chVars");
			if(i!=endCh){
				try{
					if(i!=endCh){
						//System.out.println("")
						Main.wstack.clear();
						//System.out.println("clearing stack in gtmat");
					}
					
				} catch(Exception e){
//						System.out.println(e.getMessage());
//						System.out.println("execGTMat threw an exception on wstack.clear() at i="+i);
						e.printStackTrace();
				}
			}
		}
//		long s = System.currentTimeMillis();
//		while(System.currentTimeMillis()-s<2000){
			
//		}
		//gtMatVars = Main.wstack.peek().getVarList();
	}
	
	public static void checkResults(){
		ArrayList<HashMap<String, String>> allRes = new ArrayList<HashMap<String, String>>(chs.length);
		for (int i = beginCh;i<=endCh;i++){
			System.out.println("Chapter "+i+" results: \n");
			HashMap<String, String> chOut = compareResults(i);
			allRes.add(chOut);
			if (chOut.size()>0) System.out.println("chOut.toString(): "+chOut.toString());
			else System.out.println("empty");
			
		}
	}
	
	public static HashMap<String, String> compareResults(int i) {
		
			String fname = chs[i]+".txt";
			HashMap<String, String> out = new HashMap<String, String>();
			try{
				FileInputStream fin = new FileInputStream(fname);
				BufferedReader matlabTxt = new BufferedReader(new InputStreamReader(fin));
				StringBuilder sb = new StringBuilder();
				String thisLine;
				HashMap<String, String> results = new HashMap<String, String>();
				ArrayList<Variable> resAl = new ArrayList<Variable>();
				while((thisLine=matlabTxt.readLine()) != null){
					
					String name ="";
					String val = "";
					
					//variable assignment
					//String[] str = thisLine.split(" ");
					StringTokenizer st = new StringTokenizer(thisLine);
//					name = st.nextToken();
//					if (st.nextToken().equals("=")) st.nextToken();
					while(st.hasMoreTokens()){
						String temp = "";
						try{
							temp = st.nextToken();
							
						}catch(NoSuchElementException e){
							System.out.println(e.getMessage());
							System.out.println(e.getStackTrace());
							System.out.println("error in st.nextToken()");
						}
						if (temp!=null){
						if (name.equals("")){
							name = temp;
							//System.out.println("name: "+name);
						}
						else if(temp.equals("=")){
							
						}
						else{
							String tkn = temp;
							if (st.hasMoreTokens()) val+=tkn + " ";
							else val+=tkn;
						}
//						System.out.println(val);
//						if (tkn.charAt(tkn.length()-1)==';'){
//							val += tkn+"; ";
//						}
						} 
						else{
							System.out.println("temp is null");
							temp = "null";
							if ((!name.equals("")) && (name!=null)){
								System.out.println("temp is null");
							}
						}
					}
					//if(System.out.println("val: "+val);
					if ((name!=null)&&(val!=null)){
						if (!st.hasMoreTokens()){
							//int l = val.lastIndexOf(';', val.length()-5);
							
							String temp = val.replace("; }", " }");
							val = temp;
							System.out.println(val);
						}
						System.out.println(name+ ": "+ val);
						results.put(name, val);
						
					}
					
					
					//sb.append(thisLine);
				}
				System.out.println("hashmap:"+results.toString());
				//get gtMat WS list<variable> gtmVs 
				DefaultListModel gtmVs = (DefaultListModel)chVars.get(i);
				//Iterator it = parsed vars from txt file
				
				//out==final results
				//HashMap<String, String> out = new HashMap<String, String>();
				Iterator it = results.keySet().iterator();
				while(it.hasNext()){
					String key = (String) it.next();
					out.put(key, "Variable from Matlab workspace not found in GTMat workspace. Incomplete execution of ch"+i+".m");
				}
				
				for (int j = 0; j<gtmVs.size();j++){
					Variable v = (Variable)gtmVs.getElementAt(j);
					//System.out.println(v.toString()+"<< from GTMat");
					System.out.println(v.getVarName()+"'s type: "+MatObject.getClass(v.getData()));
					if (results.containsKey(v.getVarName()) && (v.getVarName()!=null)){
						//the results map contains a key == to the variable's name
						//System.out.println("results contains the key/var "+v.getVarName());
						String vStr = v.toString();
						///varStr.replaceFirst("  ", "");
						
						String parseStr = v.getVarName() +" = "+results.get(v.getVarName());
						//System.out.println(varStr.toString()+"<< from GTMat");
//						System.out.println(varStr+"<< from GTMat");
//						System.out.println(parseStr.toString()+"<< from MatLab \n");
						String varStr = v.getVarName()+" = "+toFormatted(v.getData());
						//implement format() to standardize toString() output of gtMat arrays to the form used in the matlab data
//						if (MatObject.getClass(v.getData()).equals(MatObject.Type.LOGICAL)){
//							varStr.replace('t', '1');
//							varStr.replace('f', '0');
//						}
						
						System.out.println(varStr+"<< toFormatted(), from GTMat");
						
						//System.out.println(vStr+"<< toString(), from GTMat");
						//System.out.println(v.workspaceString())
						System.out.println(parseStr+"<< from MatLab");
						if (varStr.equals(parseStr)){
							out.put(v.getVarName(), "Name and value equal");
							//System.out.println(v.getVarName()+"== in matlab and gtmat");
						}
						else{
							//System.out.println("both workspaces contain vars with equal names, but different values");
							
							
							out.put(v.getVarName(), "name equal but values not");
						}
					}
					else{// (!results.containsKey(v.getVarName())){
						out.put(v.getVarName(), "Parsed result does not contain Variable v, or the names are formatted incorrectly");
						//System.out.println("var names not equal");
					}
					System.out.println(out.get(v.getVarName())+"\n");		
				}
				//System.out.println("Final output for the ch: "+out.toString());		
				
				
			}catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println("error in compareResults");
			}
		return out;
		
		
	}
	
	public static String toFormatted(MatObject mo){
		String newStr = "";
		if ((mo instanceof Matrix)&&(mo.rows())>1){
			if(mo.rows()>1){
				newStr = mo.workspaceString();
			}
			else{
				//newStr = mo.toString();
			}
		} 
		else if (mo instanceof CellArray){
			newStr = ((CellArray)mo).toFormat();
		}
		else if (mo instanceof Structure){
			newStr = ((Structure)mo).toFormat();
		}
		else
			newStr = mo.toString();
		
		//MatObject.getClass(v.getData())
		if ((mo.type).equals(MatObject.Type.LOGICAL) || (mo.type==MatObject.Type.LOGICAL)){
			System.out.println("replacing t and f w/ 1 and 0");
			
			newStr = newStr.replace('t', '1');
			newStr = newStr.replace('f', '0');
		}
		
		return newStr.trim();
	}
	
	public static void testGTMat(int startCh, int stopCh){
		long start;
		endCh = stopCh;
		beginCh = startCh;
		for (int i = beginCh; i <= endCh; i++){
			start = System.currentTimeMillis();
			//proxy.eval(chs[i]);
			
			
			String path =  dirB + chs[i]+".m";
			System.out.println("path being passed to gtmat:"+path);
			
			
			while(System.currentTimeMillis()-start<4000){
				
			}
			//System.out.println((System.currentTimeMillis()-start) +"should be >4000");
			//System.out.println(path);
			System.out.println("========="+path+"============");
			
			GTParser.process(path);
			//gtMatVars = Main.wstack.peek().getVarList();
		}
		//gtMatVars is a deep list of all vars in a list of Variables
		long s = System.currentTimeMillis();
		while(System.currentTimeMillis()-s<2000){
			
		}
		//-----Uncomment after testing
//		gtMatVars = Main.wstack.peek().getVarList();
//		testMatlab(beginCh, endCh);
        
		
	}
	public static void testCh(int chNum){
		long start = System.currentTimeMillis();
		String path = dirB + chs[chNum]+".m";
		while(System.currentTimeMillis()-start<4000){
			
		}
		GTParser.process(path);
		
	}
	
	public static void testMatlab(int beginCh, int endCh){
		//Issues: dealing with structs, cells, graphing audio
		//Determining whether they are equal in a nice manner
		try{
			MatlabProxyFactory factory = new MatlabProxyFactory();
			MatlabProxy proxy = factory.getProxy();
			
			
				for (int i = beginCh; i <= endCh; i++){
					String path = dirB + chs[i]+".m";
					try{
						proxy.eval(chs[i]);
						
					}catch(MatlabInvocationException mie){
						System.out.println("Matlab invocation exception.");
					}
					//proxy.eval("")
				}
				
				if (gtMatVars!=null){
					System.out.println("gtMatVars!=null, entering if block to write vars to matlab");
								//option 1. write workspace var values to .txt w/ save, and 
								//write their names to another txt file with dlmwrite and who/s
								//option 2. try to bring the variables of gtmat workspace into matlab workspace
								// using proxy.setVariable(var + "_", var.getValue()) or something
	//					proxy.eval("a = whos");
	//					proxy.eval("dlmwrite('matlabTest.txt', a)");
						HashMap<String, Boolean> results = new HashMap<String, Boolean>(gtMatVars.size());
						for (int i = 0; i<gtMatVars.size(); i++){
							Variable v = (Variable)gtMatVars.get(i);
							//String s = (String)v.getData().toString();
							System.out.println(v.getVarName()+" is of type "+MatObject.getClass(v.getData()));
							System.out.println(v.getVarName()+".toString() => /"+v.getData().toString()+"/");
							try{
								// works for int, double, and 1d arrays:proxy.setVariable(v.getVarName()+"_", Double.parseDouble(v.getData().toString()));
								MatObject d = v.getData();
								if (d instanceof Matrix){
									Matrix dm = (Matrix)d;
									proxy.setVariable(v.getVarName()+"_", dm.data);
									//proxy.eval("disp("+v.getVarName()+"-"+v.getVarName()+"_");
//									proxy.setVariable("diff", 0);
//									
//									proxy.eval("diff = check("+v.getVarName()+", "+v.getVarName()+"_)");
//									Object r = proxy.getVariable("diff");
//									double firstArg = ((double[])r)[0];
//									if (firstArg > 0){
//										results.put(v.getVarName(), true);
//									}
//									else{
//										results.put(v.getVarName(), false);
//									}
//									proxy.eval("r = check("+v.getVarName()+", "+v.getVarName()+"_");
//									Object[] o = proxy.returningEval("check", 1);
								}
								else if (d instanceof Structure){
									
								}
								//proxy.setVariable(v.getVarName()+"_", 
							}catch(MatlabInvocationException mie){
								System.out.println("Matlab invocation exception. Setting variable"+ v.getVarName()+"failed");
								System.out.println("Exception msg:"+mie.getMessage());
								System.out.println("StackTrace:"+mie.getStackTrace());
								//results.put(v.getVarName(), false);
							}
						}
						System.out.println(results.toString());
				}
			proxy.disconnect();
		} catch(MatlabConnectionException mce){
			System.out.println("Could not connect to Matlab instance.");
		}
	}
	
	public static void parseScriptNames() {
		boolean res=false;
		FileInputStream fin;
		ArrayList<ArrayList<String>> listings = new ArrayList<ArrayList<String>>(chs.length);
		//for (int i = beginCh; i <= endCh; i++){
			String fname = "allChs"+".m";	
			try{
			fin = new FileInputStream(fname);
			BufferedReader matlabTxt = new BufferedReader(new InputStreamReader(fin));
			
			//BufferedReader matlabTxt = new BufferedReader(new InputStreamReader(fin));
			StringBuilder sb = new StringBuilder();
			String thisLine;
			int i = 0;
			while((thisLine=matlabTxt.readLine()) != null){
				StringTokenizer st = new StringTokenizer(thisLine);
//				name = st.nextToken();
//				if (st.nextToken().equals("=")) st.nextToken();
				ArrayList<String> sub = new ArrayList<String>();
				int j = 0;
				while(st.hasMoreTokens()){
					String temp = "";
					try{
						temp = st.nextToken();
						sub.add(j, temp);
					}catch(NoSuchElementException nsee){
						throw nsee;
					}
					j++;
				}
				listings.add(i, sub);
				i++;
			}
		//} 
			
			allListings = listings;
			}catch(Exception ioe){
				ioe.printStackTrace();
			}
	}
	
	public static boolean dataContentCheck(MatObject mo1, MatObject mo2, int option){
		
		
		return false;
	}
	
	public static void main(String[] args){
		
		initTesting(2,2);
	}
	
//	public static void main(String[] args){
//		int[] arr = {1, 2, 3};
//		double[] dArr = {1.0, 2.0, 3.0};
//        String[] fn = {"first", "second"};
//        MatObject[] data = {new Matrix(1), new Matrix(2)};
//        Structure xy = new Structure(fn, data);
//        String str = xy.toString();
//        char[] ca = str.toCharArray();
//        System.out.println(xy.toString());
//		
//		try{
//			MatlabProxyFactory factory = new MatlabProxyFactory();
//			MatlabProxy proxy = factory.getProxy();
//			try{
//				proxy.setVariable("intArray", arr);
//				proxy.setVariable("doubleArray", dArr);
//				
//				try{
//					//proxy.setVariable("objArr", xy);
//					proxy.setVariable("structr", str); //test
//					
//					proxy.setVariable("map", new HashMap<String, Integer>());
//					//proxy.setVariable("objArr", xy);
//				}catch(Exception e){
//					System.out.println("setVar(Structure) failed");
//					System.out.println(e.getMessage());
//					System.out.println(e.getStackTrace());
//				}
//				try{
//					//proxy.eval("x1 = struct(x)");
//				}catch(Exception e){
//					System.out.println("eval(structr = char(str) failed");
//					System.out.println(e.getMessage());
//					System.out.println(e.getStackTrace());
//				}
//			}catch(MatlabInvocationException mie){
//				//System.out.println("Matlab invocation exception. Setting variable"+ v.getVarName()+"failed");
//				System.out.println("Exception msg:"+mie.getMessage());
//				System.out.println("StackTrace:"+mie.getStackTrace());
//			}
//			proxy.disconnect();
//		} catch(MatlabConnectionException mce){
//			System.out.println("Could not connect to Matlab instance.");
//		}
//			
//	}
}

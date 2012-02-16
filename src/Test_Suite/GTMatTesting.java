package Test_Suite;

import parser.*;
import main.Main;
import workspace.Variable;
import jmatrix.*;
import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
import javax.swing.DefaultListModel;
import java.util.HashMap;

public class GTMatTesting {
	public static String[] chs = {"", "", "ch2", "ch3", "ch4", "ch5", "ch6", "ch7", "ch8", "ch9", "ch10", "ch11", "ch12", "ch13", "ch14", "ch15", "ch16", "ch17"};
	public static String[] chapters = {"", "", "Ch 02", "Ch 03", "Ch 04", "Ch 05", "Ch 06", "Ch 07", "Ch 08", "Ch 09", "Ch 10", "Ch 11", "Ch 12", "Ch 13", "Ch 14", "Ch 15", "Ch 16", "Ch 17"};
	public static String dirA = "listings/";
	public static String dirB = "Validation/chapterScripts/";
	public static int endCh;
	public static int beginCh;
	public static DefaultListModel gtMatVars;
	
	public static void testGTMat(int startCh, int stopCh){
		long start;
		endCh = stopCh;
		beginCh = startCh;
		for (int i = beginCh; i <= endCh; i++){
			start = System.currentTimeMillis();
			//proxy.eval(chs[i]);
			
			String path =  dirB + chs[i]+".m";
			
			//Main.setCurrentDirectory(dir);
			while(System.currentTimeMillis()-start<4000){
				
			}
			//System.out.println((System.currentTimeMillis()-start) +"should be >4000");
			//System.out.println(path);
			System.out.println("========="+path+"============");
			
			GTParser.process(path);
		}
		//gtMatVars is a deep list of all vars in a list of Variables
		long s = System.currentTimeMillis();
		while(System.currentTimeMillis()-s<2000){
			
		}
		gtMatVars = Main.wstack.peek().getVarList();
		testMatlab(beginCh, endCh);
		
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
	
	public static void main(String[] args){
		int[] arr = {1, 2, 3};
		double[] dArr = {1.0, 2.0, 3.0};
		
		try{
			MatlabProxyFactory factory = new MatlabProxyFactory();
			MatlabProxy proxy = factory.getProxy();
			try{
				proxy.setVariable("intArray", arr);
				proxy.setVariable("doubleArray", dArr);
		
			}catch(MatlabInvocationException mie){
				//System.out.println("Matlab invocation exception. Setting variable"+ v.getVarName()+"failed");
				System.out.println("Exception msg:"+mie.getMessage());
				System.out.println("StackTrace:"+mie.getStackTrace());
			}
			proxy.disconnect();
		} catch(MatlabConnectionException mce){
			System.out.println("Could not connect to Matlab instance.");
		}
			
	}
}

package Test_Suite;

import parser.*;
import main.Main;
import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
import javax.swing.DefaultListModel;

public class GTMatTesting {
	public static String[] chs = {"", "", "ch2", "ch3", "ch4", "ch5", "ch6", "ch7", "ch8", "ch9", "ch10", "ch11", "ch12", "ch13", "ch14", "ch15", "ch16", "ch17"};
	public static String[] chapters = {"", "", "Ch 02", "Ch 03", "Ch 04", "Ch 05", "Ch 06", "Ch 07", "Ch 08", "Ch 09", "Ch 10", "Ch 11", "Ch 12", "Ch 13", "Ch 14", "Ch 15", "Ch 16", "Ch 17"};
	public static String dirA = "listings/";
	public static String dirB = "Validation/chapterScripts/";
	public static int endCh;
	public static DefaultListModel gtMatVars;
	
	public static void testGTMat(int stopCh){
		long start;
		endCh = stopCh;
		for (int i = 2; i <= endCh; i++){
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
		
		gtMatVars = Main.wstack.peek().getVarList();
		
		
		
	}
	public static void testCh(int chNum){
		long start = System.currentTimeMillis();
		String path = dirB + chs[chNum]+".m";
		while(System.currentTimeMillis()-start<4000){
			
		}
		GTParser.process(path);
		
	}
	
	public static void testMatlab(int endCh){
		//int endCh = 2;
		try{
			MatlabProxyFactory factory = new MatlabProxyFactory();
			MatlabProxy proxy = factory.getProxy();
			
			
				for (int i = 2; i <= endCh; i++){
					String path = dirB + chs[i]+".m";
					try{
						proxy.eval(chs[i]);
					
					}catch(MatlabInvocationException mie){
						System.out.println("Matlab invocation exception.");
					}
				}
				
			proxy.disconnect();
		} catch(MatlabConnectionException mce){
			System.out.println("Could not connect to Matlab instance.");
		}
	}
}

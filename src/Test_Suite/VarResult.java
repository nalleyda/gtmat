package Test_Suite;

public class VarResult{
	private String gtmatRes;
	private String matlabRes;
	private String state;
	private String name;
	private String chNum;
	
	public VarResult(String name){
		gtmatRes = "default";
		matlabRes = "default";
		state = "default";
		this.name = name;
	}
	
	public void setGtmatRes(String res){
		this.gtmatRes = res;
	}
	public void setMatlabRes(String res){
		this.matlabRes = res;
	}
	public void setState(String s){
		this.state = s;
	}
	public String getGtmatRes(){
		return this.gtmatRes;
	}
	public String getMatlabRes(){
		return this.matlabRes;
	}
	public String getState(){
		return this.state;
	}
	public String getName(){
		return this.name;
	}
	public String getChNum(){
		return this.chNum;
	}
	public void setChNum(int i){
		this.chNum = Integer.toString(i);
	}
	public boolean getOutcome(){
		if (this.state.equals("MatlabVar == GTMatVar")) return true;
		else return false;
	}
	public String toString(){
		String str = "Name: "+this.name+", Ch#: "+this.chNum+", Validation result: "+state;
		str+= ", Matlab Result: "+this.matlabRes; 
		str+= ", GTMat Result: "+this.gtmatRes+"\n";
		return str;
	}
}

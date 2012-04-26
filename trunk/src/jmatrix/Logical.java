package jmatrix;

public class Logical extends MatObject{
	
	public boolean[] data;

	public Logical(MatObject o1) {
		data = new boolean[o1.n];
		size = o1.size;
		if(o1 instanceof Matrix) {
			for(int i = 1; i <= o1.n; i++) {
				data[i-1] = ((Matrix)o1).get(i) != 0;
			}
		} else if(o1 instanceof MatString) {
			for(int i = 1; i <= o1.n; i++) {
				data[i-1] = ((MatString)o1).get(i) != 0;
			}
		} else if(o1 instanceof Logical) {
			for(int i = 1; i <= o1.n; i++) {
				data[i-1] = ((Logical)o1).data[i];
			}
		}
		
	}
	
	public boolean get(int i) {
		return data[i-1];
	}
	
	public void set(boolean val, int i) {
		if(data.length >= i)
			data[i-1] = val;
		else {
			boolean[] newd = new boolean[i];
			for(int k = 0; k < data.length; k++) {
				newd[k] = data[k];
			}
			data = newd;
			data[i-1] = val;
		}
	}

	public void set(boolean val, int... ind) {
		throw new RuntimeException("dummy method");
	}
	
	@Override
	public MatObject copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatObject empty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatObject zeroed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void copyValues(Matrix ndx, MatObject src) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public String toString(){
		String ret = "";
		if(data.length>1){
			ret += "[";
			for (int i = 0; i < data.length; i++){
				ret += " " + data[i];
			}
			ret += " ]";
		}
		if (data.length==1) ret += " " + data[0];
		return ret;
	}

	@Override
	public void set(MatObject m, int... indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MatObject get(int... indices) {
		// TODO Auto-generated method stub
		return null;
	}

}

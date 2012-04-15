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

}

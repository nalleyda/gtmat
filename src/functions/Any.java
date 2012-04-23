package functions;

import jmatrix.*;

import java.lang.reflect.*;

import gtmatException.*;

public class Any {
	public static MatObject[] any(MatObject... args) throws Exception{
		if(args.length==1)
			return new MatObject[]{any((Matrix)args[0])};
		else if (args.length==2)
			return new MatObject[]{any((Matrix)args[0],(Matrix)args[1])};
		else throw new TooManyInputsException();
	}
	
	public static Matrix any(Matrix m) {
		Matrix out = new Matrix(m);
		if(out.size[MatObject.ROW]==1)
			return any(out,new Matrix(2));
		else return any(out,new Matrix(1));
	}
	
	public static Matrix any(Matrix m, Matrix dim) {
		Matrix out;
		if(m.n==0){
			out = new Matrix(0);
			out.type=MatObject.Type.LOGICAL;
			return out;
		}
		if(Math.floor(dim.get(1))!=dim.get(1)) {
			throw new CustomException("Dimension must be a positive integer");
		}
		if(dim.get(1)>2)
			throw new CustomException("Any not yet implemented for Matrices of more than two dimensions");
		else if(m.size.length==2) {
			try {
				int s = m.size[(int)dim.geti(1)-1];
			} catch(Exception e) {
				throw new IndexOutOfBoundsException();
			}
			if(dim.get(1)==1) {
				out = new Matrix(1,m.size[MatObject.COL]);
				for(int i=1; i<=m.size[MatObject.COL]; i++)
					for(int j=1; j<=m.size[MatObject.ROW]; j++)
						out.data[i-1] = (int)out.get(i)|(int)m.get(j,i);
				out.type=MatObject.Type.LOGICAL;
				return out;
			}
			if(dim.get(1)==2) {
				out = new Matrix(m.size[MatObject.ROW],1);
				for(int i=1; i<=m.size[MatObject.ROW]; i++)
					for(int j=1; j<=m.size[MatObject.COL]; j++)
						out.data[i-1] = (int)out.get(i,1)|(int)m.get(i,j);
				out.type=MatObject.Type.LOGICAL;
				return out;
			}
		}
		else {
			throw new CustomException("Any not yet implemented for Matrices of more than two dimensions");
		}
		return null;
	}
}

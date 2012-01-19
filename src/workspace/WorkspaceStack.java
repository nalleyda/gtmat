package workspace;

import jmatrix.*;
import jmatrix.MatObject.Type;

import java.util.Stack;
import java.util.ArrayList;
import interpreter.DataHolder;
import javax.swing.DefaultListModel;
import main.TabbedPane;
import main.Main;
/**
 * A simple system stack to hold Workspaces.
 * Each time GTMat is booted up, we create a new Workspace stack
 * which should never be emptied.
 * 
 * Use peek() to get the top Workspace, use pop() if and only if a function is done running.
 * Furthermore, it is necessary to push() a new Workspace for each new function.
 * @author zach
 *
 */
public class WorkspaceStack{
	
	private Stack<Workspace> wstack;
	
	public WorkspaceStack(){
		this.wstack = new Stack<Workspace>();
		wstack.push(new Workspace());
	}

        public void clear(){
            wstack.peek().clear();
            TabbedPane.list.setModel(Main.wstack.peek().getVarList());
        }
	
	/**
	 * This allows for changing the workspace that sits at the 
	 * top of the stack.
	 * @param var
	 */
	public void assign(Variable var){
		Workspace curWorkspace = wstack.peek();
		curWorkspace.add(var);
	}

        public void assign(String name, MatObject data){
            Workspace curWorkspace = wstack.peek();
            curWorkspace.add(new Variable(name, data));
        }

        public void assign(String name, MatObject rhs, MatObject... indices){
            Workspace curWorkspace = wstack.peek();
            DefaultListModel varList = curWorkspace.getVarList();
            Variable rhsvar = new Variable(name, rhs);
            Type type = rhs.type;

            int i = 0;
            MatObject lhs = null;

            // Check to see if the variable exists
            while (i < varList.size() && rhsvar.compareTo(((Variable)varList.get(i))) != 0)
                i++;

            // If the variable already exists
            if (i < varList.size()){
                lhs = ((Variable)varList.get(i)).getData();
            }
            else{
                switch (type){
                    case DOUBLE:
                        lhs = Matrix.zeros(rhs.size[Matrix.ROW], rhs.size[Matrix.COL]);
                        
                        break;
                }
            }

            
            switch (type){
                case DOUBLE:
                    if (indices.length == 1){
                        Matrix.set((Matrix)lhs, (Matrix)indices[0], (Matrix)rhs);
                    }
                    else if (indices.length == 2){
                        Matrix.set((Matrix)lhs, (Matrix)indices[0], (Matrix)indices[1], (Matrix)rhs);
                    }

            }
            assign(name, lhs);

        }
	
	public void delete(Variable var){
		Workspace curWorkspace = wstack.peek();
		curWorkspace.delete(var);
	}
	
	public void add(Workspace w){
            wstack.push(w);
	}
	
	public void remove(){
		Workspace w = wstack.pop();
		
		//Makes it impossible to remove the base Workspace
		if (wstack.isEmpty()){
			wstack.push(w);
		}

	}
	
	public Workspace peek(){
		return wstack.peek();
	}
	
	public Stack<Workspace> deepCloneStack(){
		//Instantiate a copy and create a shallow clone
		//We want to avoid being able to alter a workspace unintentionally
		Stack<Workspace> copy = new Stack<Workspace>();
		Stack<Workspace> clone = (Stack<Workspace>)wstack.clone();
		
		//Copy over all of the Workspaces
		while (!clone.isEmpty())
			copy.push(clone.pop());
		return copy;
	}
	
	
	public ArrayList<Workspace> getStackAsArray(){
		ArrayList<Workspace> wlist = new ArrayList<Workspace>();
		Stack<Workspace> stack = deepCloneStack();
		
		while (!stack.isEmpty()){
			wlist.add(stack.pop());
		}
		
		return wlist;
		
	}
	

}

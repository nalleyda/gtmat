package workspace;

import interpreter.DataHolder;
import java.util.ArrayList;
import jmatrix.*;
import javax.swing.DefaultListModel;

/**
 * This class will represent a single workspace on the system workspace stack.
 *
 * Needs a way to keep variable listed lexicographically (insertInOrder?)
 * Possibly use a hash table to actually store things
 *
 * @author Zach Wilt
 *
 */
//[2 -3]
public class Workspace {

    private String fName;
    private DefaultListModel varList;
    //private LinkedList<Variable> varList;
    private DataHolder dataHolder;

    public Workspace() {
        this("Console", new DefaultListModel());
    }

    //Creates an empty workspace which will know the name of the function it works for
    public Workspace(String fName) {
        this(fName, new DefaultListModel());
    }

    //Creates a workspace which know about the variables given to it, and assumes variables will be sorted
    public Workspace(String fName, DefaultListModel varList) {
        this.fName = fName;
        this.varList = varList;
        dataHolder = new DataHolder();
    }

    public void setDataHolder(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    public DataHolder getDataHolder() {
        return dataHolder;
    }

    public void clear() {
        varList = new DefaultListModel();
    }

    public String getFunctionName() {
        return fName;
    }

    public void add(Variable var) {
        this.varList = insertInOrder(var);
    }

    public Variable getVariable(String varname) {
        for (int i = 0; i < varList.getSize(); i++) {
            //System.out.println(((Variable)varList.get(i)).getVarName());
            //System.out.println("Target: " + varname + " Actual: " + ((Variable)varList.get(i)).getVarName());
            if (((Variable) varList.get(i)).getVarName().equals(varname)) {
                return (Variable) varList.get(i);
            }
        }
        return null;
    }

    private DefaultListModel insertInOrder(Variable var) {
        int i = 0;

        while (i < varList.size() && var.compareTo((Variable) varList.get(i)) > 0) {
            i++;
        }

        if (i == varList.size()) {
            varList.addElement(var);
        } else if (var.compareTo((Variable) varList.get(i)) < 0) {
            varList.add(i, var);
        } else {
            varList.set(i, var);
        }

        return varList;
    }

    public void delete(Variable var) {
        varList.removeElement(var);
    }

    public String toString() {
        String str = "\nFunction Name: " + fName + "\n";
        for (int i = 0; i < varList.size(); i++) {
            str += varList.get(i).toString() + "\n";
        }
        return str;
    }

    /**
     * Returns a deep copy of all of the variables in the
     * workspace as a LinkedList
     * @return
     */
    public DefaultListModel getVarList() {
        DefaultListModel copy = new DefaultListModel();
        for (int i = 0; i < varList.size(); i++) {
            copy.addElement(new Variable(((Variable) varList.get(i)).getVarName(), ((Variable) varList.get(i)).getData()));
        }
        return copy;
    }

   /* public static void main(String[] args) {
        Variable x = new Variable("x", new Matrix(3));
        Variable y = new Variable("y", new Matrix(7));
        Variable xx = new Variable("xx", new Matrix(4));

        Variable abc = new Variable("abc", new Matrix(99));
        WorkspaceStack stack = new WorkspaceStack();
        stack.assign(y);
        stack.assign(x);
        x.setData(new Matrix(5));
        stack.assign(x);
        stack.assign(xx);

        Workspace w = new Workspace("Test", stack.peek().getVarList());
        stack.add(w);
        stack.assign(abc);
        System.out.println(stack.peek());



        stack.assign("blargh", new Matrix(2, 2, 1, 3, 2, 4));
        stack.assign("blargh", new Matrix(1, 2, 5, 6), new Matrix(1, 2, 1, 3));
        stack.assign("blargh", new Matrix(1, 2, 7, 8), new Matrix(2), new Matrix(1, 2, 1, 2));

        stack.assign("hello", new Matrix(2, 2, 1, 3, 2, 4), new Matrix(1, 2, 1, 3), new Matrix(1, 2, 1, 3));

        ArrayList<Workspace> wlist = stack.getStackAsArray();
        System.out.println(wlist);


        System.out.println("\n\n\n");
        stack.clear();
        ArrayList<Workspace> wlist2 = stack.getStackAsArray();
        System.out.println(wlist2);

        //stack.assign(abc)

        //Matrix hi = new Matrix("[1,1,2; 3,4,2]");
        //System.out.println(hi);


    }*/
}

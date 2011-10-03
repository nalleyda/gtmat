package jmatrix;

import main.*;

/**
 * 
 * @author Zach Wilt (zwilt3@gatech.edu)
 *
 */
//Find a way to cast from primitives to Matrix, to save typing
//Check whether it is actually faster to use arrays instead of ArrayLists
public class Structure extends MatObject {

    private String[] fieldNames;
    private MatObject[] Data;

    public Structure(String fieldname, MatObject data) {
        fieldNames = new String[1];
        fieldNames[0] = fieldname;
        Data = new MatObject[1];
        Data[0] = data;
    }

    public Structure(String[] fieldNames, MatObject[] data) {
        this.fieldNames = new String[fieldNames.length];
        this.Data = new MatObject[fieldNames.length];
        for (int i = 0; i < fieldNames.length; i++) {
            this.fieldNames[i] = fieldNames[i];
            this.Data[i] = (MatObject) data[i].copy();
        }
    }

    public Structure() {
        this.fieldNames = null;
        this.Data = new MatObject[0];
    }

    /** Just makes a deep copy*/
    public Structure(Structure s) {
        fieldNames = new String[s.fieldNames.length];
        Data = new MatObject[s.Data.length];
        for (int i = 0; i < s.Data.length; i++) {
            fieldNames[i] = s.fieldNames[i];
            Data[i] = s.Data[i];
        }
    }
    
    public Structure empty() {
        return new Structure();
    }

    @Override
    public Structure clone() {
        return new Structure(this);
    }

    public Structure copy() {
        return new Structure(this);
    }

    public Structure zeroed() {
        return new Structure(this);
    }

    public boolean isField(String fld) {
        return findFieldInd(fld) >= 0;
    }

    public Structure addField(String fieldname, MatObject data) {

        Structure s = null;
        int ind = findFieldInd(fieldname);
        //if the field is already there, simply replace the data in the field
        if (ind != -1) {
            s = setField(fieldname, data);
        } else {
            //Make a deep copy to get the new one
            String[] newfn = new String[fieldNames.length + 1];
            MatObject[] newData = new MatObject[newfn.length];
            for (int i = 0; i < fieldNames.length; i++) {
                newfn[i] = fieldNames[i];
                newData[i] = Data[i];
            }
            newfn[fieldNames.length] = fieldname;
            newData[fieldNames.length] = data;
            s = new Structure(newfn, newData);
        }

        return s;


    }

    public Structure setField(String fieldname, MatObject data) {

        //Figure out where the field is, if we have it
        int ind = findFieldInd(fieldname);
        Structure s = new Structure(this);

        //if the field doesn't exist, add it
        if (ind == -1) {

            s = addField(fieldname, data);
        } //if it does exist, replace the current data
        else {
            s.Data[ind] = data;
        }

        return s;

    }

    public String[] fieldNames() {
        /*CellArray fns = new CellArray(fieldNames.length, 1);
        for (int i = 0; i < fieldNames.length; i++)
        fns.cell[i] = new Char(fieldNames[i]);*/ /** Need a Char class, and possibly more CellArray functionality*/
        return fieldNames;
    }
    
    public void copyValues(Matrix ndx, MatObject src) {
        throw new RuntimeException("can't index a structure");
    }



    public MatObject getField(String fieldname) {
        int ind = findFieldInd(fieldname);
        if (ind == -1) {
            return null;
        } else {
            return Data[ind];
        }
    }

    private int findFieldInd(String fieldname) {
        int ind = -1;
        for (int i = 0; i < fieldNames.length; i++) {
            if (fieldNames[i].equals(fieldname)) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < Data.length; i++) {
            ret = ret + fieldNames[i] + ": " + Data[i].toString() + "\n";
        }
        return ret;
    }

    /**
     * add rmfield
     * return a new structure array
     * @param args
     */
    public static void main(String[] args) {
        String[] fn = {"first", "second"};
        MatObject[] data = {new Matrix(1), new Matrix(2)};

        Structure x = new Structure(fn, data);
        Structure y = new Structure();
        x = x.setField("third", new Matrix(3));
        x = x.setField("second", new Matrix(120));
        y = x.addField("fourth", new Matrix(4));
        x = x.addField("third", new Matrix(17));
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < y.fieldNames.length; i++) {
            System.out.println(y.fieldNames[i]);
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileIO;

/**
 *
 * @author dsmith
 */
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import jmatrix.*;
import main.*;

public class FileIO {

    private static ArrayList handles = new ArrayList();
    private static BufferedReader br = null;
    private static FileOutputStream out = null; // declare a file output object
    private static PrintStream p = null;        // declare a print stream object
    private static PrintfFormat pf = null;
    private static char marker = (char) 0XFF;
    private static char emptyToken = (char) 0XFE;
    private static double value = Double.NaN;

    public static CellArray csvread(String name) {
        CellArray res = null;
        BufferedReader in = null;
        boolean seenNum = false;
        int brow = 10000;
        int erow = 0;
        int bcol = 10000;
        int ecol = 0;
        int col = 0;
        int row = 0;
        MatString emptymat = new MatString("");
        Matrix nums = null;
        CellArray txt = null;
        CellArray raw = new CellArray();
        MatString noText = new MatString("");
        if (name != null) {
            try {
                in = new BufferedReader(new FileReader(name));
            } catch (IOException e) {
                if (Main.fileChooser.showOpenDialog(Main.frame)
                        == JFileChooser.APPROVE_OPTION) {
                    name = Main.fileChooser.getSelectedFile().getAbsolutePath();
                    try {
                        in = new BufferedReader(new FileReader(name));
                        System.err.println("File is actually " + name);
                    } catch (IOException e2) {
                        System.err.println("Wave file not found: " + name);
                        return null;
                    }
                }
            }
            try {
                row = 1;
                String it = in.readLine();
                while (it != null) {
                    col = 1;
                    it = fixCommas(it);
                    StringTokenizer st = new StringTokenizer(it, ",");
                    while (st.hasMoreTokens()) {
                        String token = st.nextToken();
                        String found = convertToken(token);
                        if (isnumeric(found)) {
                            // check the bounds of the num array
                            if (row < brow) {
                                brow = row;
                            }
                            if (row > erow) {
                                erow = row;
                            }
                            if (col < bcol) {
                                bcol = col;
                            }
                            if (col > ecol) {
                                ecol = col;
                            }
                        }
                        raw.set(row, col, new MatString(found));
                        col++;
                    }
                    row++;
                    it = in.readLine();
                }
                // build the nums array
                txt = raw.copy();
                int numrows = erow - brow + 1;
                int numcols = ecol - bcol + 1;
                nums = Matrix.zeros(numrows, numcols);
                for (row = 1; row <= numrows; row++) {
                    for (col = 1; col <= numcols; col++) {
                        it = raw.get(row + brow - 1, col + bcol - 1).toString();
                        if (isnumeric(it)) {
                            value = Double.parseDouble(it);
                            txt.set(row + brow - 1, col + bcol - 1, emptymat);
                        } else {
                            value = Double.NaN;
                        }
                        nums.set(row, col, value);
                    }
                }
            } catch (IOException e) {
                System.err.println("File " + name + " did not open");
                System.exit(1);
            }
        }
        res = new CellArray(nums);
        res = res.hcat(new CellArray(txt));
        res = res.hcat(new CellArray(raw));
        return res;
    }

    private static String convertToken(String it) {
        String res = it;
        if (it.length() == 0 || it.charAt(0) == emptyToken) {
            res = "";
        } else {
            res = it.replace(marker, ',');
            if (res.charAt(0) == '"') {
                res = res.substring(1, it.length() - 1);
            }
        }
        return res;
    }

    private static boolean isnumeric(String str) {
        boolean res = false;
        if (str.length() > 0) {
            char ch = str.charAt(0);
            res = ch >= '0' && ch <= '9';
        }
        return res;
    }

    private static String fixCommas(String str) {
        String res = "";
        int quoteCount = 0;
        for (int ndx = 0; ndx < str.length(); ndx++) {
            char ch = str.charAt(ndx);
            switch (ch) {
                case '"':
                    quoteCount++;
                    break;
                case ',':
                    if (quoteCount % 2 > 0) {
                        ch = marker;
                    } else if ((ndx + 1) < str.length()
                            && str.charAt(ndx + 1) == ',') {
                        res += ',';
                        ch = emptyToken;
                    } else if ((ndx + 1) == str.length()) {
                        res += ',';
                        ch = emptyToken;
                    }
                    break;
            }
            res += ch;
        }
        return res;
    }

    private static void writeToFile(PrintStream ps, MatObject it) {
        String str = null;
        if (it instanceof MatString) {
            str = it.toString();
            if (str.indexOf(",") >= 0) {
                str = "\"" + str + "\"";
            }
        } else {
            double d = ((Matrix) it).get(1);
            if (d % 1 == 0) {
                str = "" + (int) d;
            } else {
                str = "" + Format.format(d, 4);
            }
        }
        ps.print(str);
    }
    /*
    function writeToFile(fh, item)
    if ischar(item)
    if any(item == ',')
    item = ['"' item '"'];
    end
    else
    item = num2str(item);
    end
    fprintf(fh,'%s', item);
    end     
     */

    public static MatObject csvwrite(CellArray ca, MatString mname) {
        String name = mname.toString();
        PrintStream output = null;
        try {
            output = new PrintStream(new File(name));
        } catch (FileNotFoundException e) {
        };
        for (int row = 1; row <= ca.rows(); row++) {
            for (int col = 1; col <= ca.cols(); col++) {
                MatObject it = ca.get(row, col);
                writeToFile(output, it);
                if(col < ca.cols()) output.print(",");
                else output.print("\n");
            }
        }
        output.close();
        return new Matrix(1);
    }
    /*
    function realCSVwrite(ca, name)
    
    fh = fopen(name, 'w');
    [rows cols] = size(ca);
    for r = 1:rows
    for c = 1:cols
    item = ca{r, c};
    if ~isempty(item)
    writeToFile(fh, item);
    end
    if c < cols
    fprintf(fh, ',');
    else
    fprintf(fh, '\n');
    end
    end
    end
    
    fclose(fh);
    end
     */

    public static CellArray fopen(MatString name){
        return new CellArray(new Matrix(fopen(name.toString(), "r")));
    }
    public static CellArray fopen(MatString name, MatString purpose){
        return new CellArray(new Matrix(fopen(name.toString(), purpose.toString())));
    }
    public static int fopen(String name, String purpose){
        try{
            if (purpose.equals("r")) {
                br = new BufferedReader(new FileReader(name));
                handles.add(br);
            } else if (purpose.equals("w")) {
                out = new FileOutputStream(name);
                p = new PrintStream(out);
                handles.add(p);
            } else {
                throw new RuntimeException("fopen must say r or w");
            }
            return handles.size();
        }
        catch(Exception e){
            return -1;
        }
    }

    //@TODO: do all of the normal bounds checking
    public static CellArray fprintf(Matrix handle, MatString format, MatObject... them){
        return new CellArray(new Matrix(fprintf((int)handle.data[0], format.toString(), them)));
    }

    public static int fprintf(int handle, String format, MatObject... them) {
        String toWrite = sprintf(format, them);
        Object o = handles.get(handle - 1);
        if (o instanceof java.io.PrintStream) {
            p = (PrintStream) o;
            p.print(toWrite);
        } else {
            throw new RuntimeException("not writing to an output handle");
        }
        return 0;
    }

    public static CellArray fprintf(MatString format, MatObject... them){
        return new CellArray(new Matrix(fprintf(format.toString(), them)));
    }
    public static int fprintf(String format, MatObject... them) {
        return 0;
    }

    public static String sprintf(String format, MatObject... them) {
        pf = new PrintfFormat(format);
        return pf.sprintf(them);
    }

    public static MatObject fgets(int handle) {
        return ifgets(handle, true);
    }

    public static MatObject fgetl(int handle) {
        return ifgets(handle, false);
    }

    public static MatObject ifgets(int handle, boolean addIt) {
        Object o = handles.get(handle - 1);
        MatObject res = null;
        String s = null;
        if (o instanceof java.io.BufferedReader) {
            br = (BufferedReader) o;
            try {
                s = br.readLine();
            } catch (IOException e) {
            };
            if (s == null) {
                res = new Matrix(-1);
            } else {
                if (addIt) {
                    s += "\n";
                }
                res = new MatString(s);
            }
        } else {
            throw new RuntimeException("not reading from an input handle");
        }
        return res;
    }

    public static int fclose(int handle) {
        Object o = handles.get(handle - 1);
        if (o instanceof java.io.BufferedReader) {
            try {
                ((BufferedReader) o).close();
            } catch (IOException e) {
            };
        } else {
            ((PrintStream) o).close();
        }
        return 0;
    }

    public static void test() throws FileNotFoundException {
        Matrix a = new Matrix(4);
        Matrix b = new Matrix(3);
        a = Matrix.mult(a, b);
        String it = sprintf("result is [%f %f]\n", a, b);
        Main.debug.println(it);
        int out = FileIO.fopen("outputTrash.txt", "w");
        int in = FileIO.fopen("config.ini", "r");
        fprintf(out, "The coords are [%f %f]\n", a, b);
        a = Matrix.mult(a, b);
        fprintf(out, "The coords are now [%f %f]\n", a, b);
        MatObject line = new MatString("");
        while (MatObject.isChar(line)) {
            line = fgets(in);
            if (MatObject.isChar(line)) {
                fprintf(out, "%s", line);
            }
        }
        fclose(out);
        fclose(in);
    }

    public static void main(String[] args) {
        Main.init();
        try {
            test();
        } catch (FileNotFoundException e) {
        };
    }
}

package main;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to handle I/O with the config.ini preferences file.
 *
 * @author Taylor Hope
 * @version 1.0
 * @date 4/8/2011
 */
public class INIHandler {
        File f;
	private ArrayList<String> paths;
	private static String newline = System.getProperty("line.separator");  //System independent newline character
        private Font preferredFont;


        /**
         * Constructor for INIHandler.
         * Will initialize config.ini if it does not already exist, then read in
         * the contents of the file to paths.
         */
	public INIHandler() {
		paths = new ArrayList<String>();
                preferredFont = new Font("Monospaced",Font.PLAIN, 10);
		f = new File("config.ini");
		if(!f.exists()) {
			try {
                            f.createNewFile();
                            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                            bw.write("[paths]");
                            bw.write(newline);
                            bw.write((new File("")).getAbsolutePath()); //Set the current path as the default path.
                            bw.write(newline);
                            bw.close();
			} catch (IOException e) {
                            e.printStackTrace();
			}
                }
                read();
	}

        /**
         * Write a string to the ini file.  Will only write the string if it
         * doesn't already exist in the file.
         * @param s the string to write.
         */
	public void write(String s) {
            if(paths.contains(s))
                return;
            BufferedWriter bw;
            try {
		bw = new BufferedWriter(new FileWriter(f, true));
		bw.write(s);
		bw.write(newline);
		bw.close();
            } catch (IOException e) {
		e.printStackTrace();
            }
            read();
	}

        /**
         * Read in the data from the ini file to paths.
         */
	public void read() {
		paths = new ArrayList<String>();
		try {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line = br.readLine();
                        while(line != null) {
                            parseLine(line);
                            line = br.readLine();
			}
		} catch (Exception e) {
                    e.printStackTrace();
		}
	}

        /**
         * Get the paths specified in the ini file as a String[].
         * @return the paths from the ini file
         */
        public String[] getPaths() {
            return paths.toArray(new String[1]);
        }
        
	/**
	 * Parser for each line.  Right now, only appends a valid file path to our paths ArrayList
	 * @param s the string to parse
	 */
	public void parseLine(String s) {
		File file = new File(s);
		if(file.isDirectory()) //If the string is a directory, just return the string.
                    paths.add(s);

		//All this is for possible future implementation; unused as of now.
		Scanner scan = new Scanner(s);
                scan.useDelimiter("=");
		String next;
		while(scan.hasNext()) {
			next = scan.next();

		}
	}

	public static void main(String[] args) {
		INIHandler ini = new INIHandler();
		ini.write("C:/");
		ini.write("F:/Java");
		System.out.println(ini.paths);

	}

}


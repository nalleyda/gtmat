package properties;

import main.*;
import java.awt.Font;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Class to handle the .properties file.  Most methods are static, an instance of PropertyHandler will be unnecessary.
 * @author Taylor Hope
 * @version 1.0 5/19/2011
 * 
 * Note that all features relating to UNIX OS need to be tested.
 */
public class PropertyHandler {

    private static Properties p;
    private static File propertiesFile;
    //Font related properties
    public static final String FONT_NAME = "Font Name";
    public static final String FONT_STYLE = "Font Style";
    public static final String FONT_SIZE = "Font Size";
    //Recent Directory related properties
    public static final String RECENT_DIRECTORIES = "Recent Directories";
    public static final String NUM_RECENT_DIRECTORIES = "Number of Recent Directories";
    public static final String DEFAULT_WORKING_DIRECTORY = "Default Working Directory";

    /**
     * Set up the properties file.  Either open up the file and store its contents, or create a new file
     * and give it the default values.  File location will be in the appdata folder on a Windows PC, and in the Application Support
     * folder on a Mac/Unix OS (hopefully).
     */
    public static void initProperties() {

        p = new Properties();
        propertiesFile = new File(determinePath());
        if (propertiesFile.exists()) {
            //Load properties from the file
            try {
                FileInputStream fis = new FileInputStream(propertiesFile);
                p.load(fis);
                fis.close();
            } catch (IOException e) {
                System.out.println("Problem opening properties file.");
            }
        } else {
            //Create new properties file
            try {
                propertiesFile.getParentFile().mkdirs();  //Make sure we have the proper folders to put it in
                propertiesFile.createNewFile();
                setDefaultProperties();
            } catch (IOException e) {
                System.out.println("Problem creating properties file.");
            }
        }
        addRecentDirectory(getDefaultWorkingDirectory());
    }

    /**
     * Use when creating a new file, or when resetting to default settings.
     */
    public static void setDefaultProperties() {
        p.setProperty(FONT_NAME, "Monospaced");
        p.setProperty(FONT_SIZE, "12");
        p.setProperty(FONT_STYLE, "Plain");
        p.setProperty(RECENT_DIRECTORIES, new File("").getAbsolutePath());
        p.setProperty(NUM_RECENT_DIRECTORIES, "20");
        p.setProperty(DEFAULT_WORKING_DIRECTORY, new File("").getAbsolutePath());
        store();
    }

    /**
     * Get the preferred user font.
     * @return the preferred font.
     */
    public static Font getFont() {
        String name = getProperty("Font Name", "Monospaced");
        int size = Integer.parseInt(getProperty("Font Size", "12"));
        String styleName = getProperty("Font Style", "Plain");
        int style = Font.PLAIN;
        if (styleName.equals("Bold")) {
            style = Font.BOLD;
        } else if (styleName.equals("Italic")) {
            style = Font.ITALIC;
        } else if (styleName.equals("Bold Italic")) {
            style = Font.BOLD + Font.ITALIC;
        }
        return new Font(name, style, size);

    }

    /**
     * Given a key, get the property associated with the key.
     * @param key the key associated with the property
     * @return the property
     */
    public static String getProperty(String key) {
        return p.getProperty(key);
    }

    /**
     * Given a key and default value, get the property, or if the property is undefined, the default value.
     * @param key The key
     * @param defaultVal default value
     * @return the property
     */
    public static String getProperty(String key, String defaultVal) {
        return p.getProperty(key, defaultVal);
    }

    /**
     * Given a key and value, set them both in the property object.
     * Changes made here will NOT be committed to the .properties file
     * until a call to store() is made.
     * @param key the key
     * @param value the value
     */
    public static void setProperty(String key, String value) {
        p.setProperty(key, value);
    }

    /**
     * Store the changes to the properties in the .properties file.
     */
    public static void store() {
        try {
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            p.store(fos, null);
        } catch (Exception e) {
            System.out.println("Problem setting properties.");
        }
    }

    /**
     * Grab the path to the user's application settings folder.
     * @return the String representing the filepath.
     */
    public static String determinePath() {
        String path;
        if (System.getProperty("file.separator").equals("/")) //UNIX
        {
            path = System.getProperty("user.home") + "/Library/Application Support/GTMat/.properties"; // /Applications/GTMat/.properties
        } else //DOS
        {
            path = System.getProperty("user.home") + "\\Local Settings\\Application Data\\GTMat\\.properties";
        }
        return path;
    }

    /**
     * Get rid of any changes made to the properties by reinitializing the property object.
     */
    public static void disposeOfChanges() {
        p = new Properties();
        propertiesFile = new File(determinePath());
        try {
            FileInputStream fis = new FileInputStream(propertiesFile);
            p.load(fis);
            fis.close();
        } catch (IOException e) {
            System.out.println("Problem opening properties file.");
        }
    }

    /**
     * Get the user's recent directories
     * @return A String[] of the recent directories.
     */
    public static String[] getRecentDirectories() {
        String direc = p.getProperty(RECENT_DIRECTORIES, "");
        Scanner s = new Scanner(direc);
        s.useDelimiter("\n");
        ArrayList<String> out = new ArrayList<String>();
        while (s.hasNext()) {
            out.add(s.next());
        }
        return out.toArray(new String[1]);
    }

    /**
     * Add a recent directory to the properties file.
     * @param s The directory to add
     */
    public static void addRecentDirectory(String s) {
        if (!s.endsWith(File.separator)) {
            s += File.separator;
        }
        String direc = p.getProperty(RECENT_DIRECTORIES, "");
        Scanner scan1 = new Scanner(direc);
        scan1.useDelimiter("\n");
        ArrayList<String> array = new ArrayList<String>();
        while (scan1.hasNext()) {
            array.add(scan1.next());
        }
        if (array.size() >= Integer.parseInt(p.getProperty(NUM_RECENT_DIRECTORIES, "20"))) {
            array = new ArrayList<String>(array.subList(0, Integer.parseInt(p.getProperty(NUM_RECENT_DIRECTORIES, "20")) - 1));
        }
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add(s);
        set.addAll(array);
        String newDirec = "";
        for (String element : set) {
            newDirec += element + "\n";
        }
        p.setProperty(RECENT_DIRECTORIES, newDirec);
        store();
    }

    public static String getDefaultWorkingDirectory() {
        return p.getProperty(DEFAULT_WORKING_DIRECTORY, new File("").getAbsolutePath());
    }

    public static void setDefaultWorkingDirectory(String s) {
        p.setProperty(DEFAULT_WORKING_DIRECTORY, s);
    }

    public static void clearRecentDirectories() {
        p.setProperty(RECENT_DIRECTORIES, getDefaultWorkingDirectory());
        store();
    }
}

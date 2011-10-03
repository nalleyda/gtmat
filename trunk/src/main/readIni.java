/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/*
You can use an INI file with the help of Properties class in java.util package. Since the .ini files have the same format of .properties files, you can reach .ini files just like reaching .properties files.
[INI file : user.ini]

DBuser=anonymous
DBpassword=&8djsx
DBlocation=bigone
*/

import java.util.*;
import java.io.*;

class readIni {
  public static void main(String args[]) {
    readIni ini = new readIni();
    ini.doit();
    }

  public void doit() {
    try{
      Properties p = new Properties();
      p.load(new FileInputStream("user.ini"));
      System.out.println("user = " + p.getProperty("DBuser"));
      System.out.println("password = " + p.getProperty("DBpassword"));
      System.out.println("location = " + p.getProperty("DBlocation"));
      p.list(System.out);
      }
    catch (Exception e) {
      System.out.println(e);
      }
    }
}
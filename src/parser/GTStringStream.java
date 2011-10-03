/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;
/**
 *
 * @author dsmith
 */
public class GTStringStream extends ANTLRFileStream {
    public GTStringStream() throws IOException {
        super(null);
    }
    public GTStringStream(String str) throws IOException {
        super(null);
        append(str);
    }

    public void append(String str) {
        int nn = n + str.length();
        char nd[] = new char[nn];
        int out = 0;
        if(n > 0) {
            for(int in = 0; in < n; in++ ) {
                nd[out++] = data[in];
            }
        }
        for(int in = 0; in < str.length(); in++) {
            nd[out++] = str.charAt(in);
        }
        n = nn;
        data = nd;
    }

    public String toString() {
        return new String(data);
    }
}

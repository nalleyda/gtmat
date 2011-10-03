/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package main;

/*
 * TabbedPane.java requires one additional file:
 *   images/middle.gif.
 */

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class TabbedPane extends JPanel {
    public static FileTree fileTree = null;
    public static JTabbedPane tabbedPane;
    public static JList list;
    public TabbedPane() {
        super(new GridLayout(1, 1));
        
        tabbedPane = new JTabbedPane();
        JComponent panel1 = makeVariablesPanel();//makeTextPanel("Variables");
        tabbedPane.addTab("Variables", null, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        fileTree = new FileTree(new File(Main.getCurrentDirectory()));
        tabbedPane.addTab("Files", null, fileTree,
                "Show files");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    protected JComponent makeVariablesPanel(){
        JPanel panel = new JPanel(false);
        JLabel title = new JLabel(Main.wstack.peek().getFunctionName());
        list = new JList();//JList(Main.wstack.peek().getVarList());//.toArray());
        list.setModel(Main.wstack.peek().getVarList());
        JScrollPane listpane = new JScrollPane(list);
        //list.setHorizontalAlignment(JLabel.NORTH);
        panel.setLayout(new BorderLayout());
        panel.add(title, BorderLayout.NORTH);
        panel.add(listpane, BorderLayout.CENTER);
        return panel;
    }
    
    public static void updateList() {
        list.setModel(Main.wstack.peek().getVarList());
    }

    /*public void paintComponent(Graphics g){
        tabbedPane.getTabComponentAt(0).
    }*/
}

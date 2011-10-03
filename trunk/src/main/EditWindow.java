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
 * InteractionWindow.java requires one additional file:
 *   DocumentSizeFilter.java
 */

import interpreter.File_I_O;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import fileIO.*;
import parser.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class EditWindow extends JPanel {

    private static ArrayList<EditWindow> windows = new ArrayList();
    private static EditWindow current = null;
    private static EditWindow theWindow = null;
    public static EditFrame holder = null;
    public JTextPane textPane;
    public AbstractDocument doc;
    public TextLineNumber tln;
    public static final int MAX_CHARACTERS = 1000;
    public JTextArea changeLog;
    public String newline = "\n";
    public SimpleAttributeSet[] attrs = null;
    private int myIndex = 0;
    private boolean changed = false;
    public String name = null;
    //undo helpers
    protected UndoManager undo = new UndoManager();
    HashMap<Object, Action> actions;

    public static void open(String name) throws Exception {
        System.out.println("Open " + name);
        if (name.endsWith(".t")) {
            File_I_O.readandRunTFile(name);
        } else {
            if (windows.isEmpty() || holder == null) {
                holder = new EditFrame(strip(name));
                holder.setSize(800, 600);
                holder.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                holder.addWindowListener(new MyWindowListener());
 
                //Display the window.
                holder.setVisible(true);
                System.out.println("Created Holder");
            }
            holder.setVisible(true);
            theWindow = new EditWindow(name);
            windows.add(theWindow);
            theWindow.myIndex = holder.addWin(theWindow, strip(name));
            current = theWindow;
        }
    }

    public static EditWindow getCurrent() {
        return current;
    }

    public AbstractDocument getDoc() {
        return doc;
    }

    public static String strip(String name) {
        /* return only the file name, not its qualifiers */
        if (name == null) {
            return null;
        }
        int n = name.length() - 1;
        while (n >= 0 && name.charAt(n) != '/' && name.charAt(n) != '\\') {
            n--;
        }
        if (n > 0) {
            n++;  // skip the '\\' we found
        }
        return name.substring(n);
    }

    public static UndoManager getUndo() {
        return current.undo;
    }

    public EditWindow(String name) {
        this.name = name;
        JScrollPane scrollPane = makeScrollPane();
        actions = createActionTable(textPane);
        attrs = initAttributes(6);
        
        //Create the text area for the status log and configure it.
        changeLog = new JTextArea(5, 30);
        changeLog.setEditable(false);
        JScrollPane scrollPaneForLog = new JScrollPane(changeLog);

        //Create a split pane for the change log and the text area.
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                scrollPane, scrollPaneForLog);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(400);

        //Create the status area.
        JPanel statusPane = new JPanel(new GridLayout(1, 1));
        CaretListenerLabel caretListenerLabel =
                new CaretListenerLabel("Caret Status");
        statusPane.add(caretListenerLabel);

        //Add the components.
        setLayout(new BorderLayout());
        add(splitPane, BorderLayout.CENTER);
        add(statusPane, BorderLayout.PAGE_END);

        //Put the initial text into the text pane.
        initDocument(name);
        textPane.setCaretPosition(0);

        //Start watching for undoable edits and caret changes.
        doc.addUndoableEditListener(new MyUndoableEditListener());
        textPane.addCaretListener(caretListenerLabel);
        doc.addDocumentListener(new MyDocumentListener());
    }

    public File save(String name) {
        File theFile = new File(name);
        if(changed) {
            PrintStream output = null;
            try {
                output = new PrintStream(theFile);
            } catch (FileNotFoundException e) {
            };
            try {
                output.print(doc.getText(0, doc.getLength()));
            } catch (BadLocationException e) {
            };
            this.name = name;
            holder.editWin.setTitleAt(myIndex, strip(name));
            changed = false;
        }
        return theFile;
    }

    public File saveTFile(String name) {
        String str = null;
        try {
            str = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
        };
        return File_I_O.saveTFile(name, str, "Script");
    }

    private JScrollPane makeScrollPane() {
        //Create the text pane and configure it.
        textPane = new JTextPane();
        textPane.setCaretPosition(0);
        textPane.setMargin(new Insets(5, 5, 5, 5));
        StyledDocument styledDoc = textPane.getStyledDocument();
        if (styledDoc instanceof AbstractDocument) {
            doc = (AbstractDocument) styledDoc;
            doc.setDocumentFilter(new ColorFilter());
        } else {
            System.err.println("Text pane's document isn't an AbstractDocument!");
            System.exit(-1);
        }
        JScrollPane jsp = new JScrollPane(textPane);
        tln = new TextLineNumber(textPane, name);
        jsp.setRowHeaderView(tln);
        return jsp;
    }
    


    //This listens for and reports caret movements.
    protected class CaretListenerLabel extends JLabel
            implements CaretListener {

        public CaretListenerLabel(String label) {
            super(label);
        }

        //Might not be invoked from the event dispatch thread.
        public void caretUpdate(CaretEvent e) {
            displaySelectionInfo(e.getDot(), e.getMark());
        }

        //This method can be invoked from any thread.  It 
        //invokes the setText and modelToView methods, which 
        //must run on the event dispatch thread. We use
        //invokeLater to schedule the code for execution
        //on the event dispatch thread.
        protected void displaySelectionInfo(final int dot,
                final int mark) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    if (dot == mark) {  // no selection
                        try {
                            Rectangle caretCoords = textPane.modelToView(dot);
                            //Convert it to view coordinates.
                            setText("caret: text position: " + dot
                                    + ", view location = ["
                                    + caretCoords.x + ", "
                                    + caretCoords.y + "]"
                                    + newline);
                        } catch (BadLocationException ble) {
                            setText("caret: text position: " + dot + newline);
                        }
                    } else if (dot < mark) {
                        setText("selection from: " + dot
                                + " to " + mark + newline);
                    } else {
                        setText("selection from: " + mark
                                + " to " + dot + newline);
                    }
                }
            });
        }
    }

    //This one listens for edits that can be undone.
    protected class MyUndoableEditListener
            implements UndoableEditListener {

        public void undoableEditHappened(UndoableEditEvent e) {
            //Remember the edit and update the menus.
            current.undo.addEdit(e.getEdit());
            holder.undoAction.updateUndoState();
            holder.redoAction.updateRedoState();
        }
    }

    //And this one listens for any changes to the document.
    protected class MyDocumentListener
            implements DocumentListener {

        public void insertUpdate(DocumentEvent e) {
            displayEditInfo(e);
            SwingUtilities.invokeLater(new ColorFilter(current));
        }

        public void removeUpdate(DocumentEvent e) {
            displayEditInfo(e);
            SwingUtilities.invokeLater(new ColorFilter(current));
        }

        public void changedUpdate(DocumentEvent e) {
            displayEditInfo(e);
        }

        private void displayEditInfo(DocumentEvent e) {
            Document document = e.getDocument();
            int changeLength = e.getLength();
            changeLog.append(e.getType().toString() + ": "
                    + changeLength + " character"
                    + ((changeLength == 1) ? ". " : "s. ")
                    + " Text length = " + document.getLength()
                    + "." + newline);
            if (!changed) {
                changed = true;
                holder.editWin.setTitleAt(myIndex, strip(name) + "(*)");
            }
        }
    }

    protected void initDocument(String name) {
        BufferedReader in = null;
        if (name != null) {
            try {
                in = new BufferedReader(new FileReader(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("File " + name + " did not open");
                System.exit(1);
            }
            try {
                String it = in.readLine();
                while (it != null) {
                    try {
                        doc.insertString(doc.getLength(), it + newline,
                                attrs[0]);
                    } catch (BadLocationException ble) {
                        System.err.println("Couldn't insert " + it);
                    }
                    it = in.readLine();
                }
            } catch (IOException e) {
                System.err.println("File " + name + " did not open");
                System.exit(1);
            }
        }
    }

    protected SimpleAttributeSet[] initAttributes(int length) {
        //Hard-code some attributes.
        SimpleAttributeSet[] attrs = new SimpleAttributeSet[length];

        attrs[0] = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attrs[0], "Serif");
        StyleConstants.setFontSize(attrs[0], 16);

        attrs[1] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setBold(attrs[1], true);

        attrs[2] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setItalic(attrs[2], true);

        attrs[3] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setFontSize(attrs[3], 20);

        attrs[4] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setFontSize(attrs[4], 12);

        attrs[5] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setForeground(attrs[5], Color.red);

        return attrs;
    }
    
    public ArrayList<Boolean> getBreakpoints() {
        return tln.getBreakpoints();
    }

    //The following two methods allow us to find an
    //action provided by the editor kit by its name.
    private HashMap<Object, Action> createActionTable(JTextComponent textComponent) {
        HashMap<Object, Action> actions = new HashMap<Object, Action>();
        Action[] actionsArray = textComponent.getActions();
        for (int i = 0; i < actionsArray.length; i++) {
            Action a = actionsArray[i];
            actions.put(a.getValue(Action.NAME), a);
        }
        return actions;
    }

    private void displayMessage(String msg) {
        System.out.println(msg);
    }
    
    /**
     * Alert a window that it is closing, and if any saves need to be made, make them!
     * @return 1 if no saves need be made, 0 if a save needs to be made, and 2 or -1 if we should cancel closing the frame.
     */
    public int windowClosing() {
        if(changed) {
            current = this;
            return JOptionPane.showConfirmDialog(null, "Do you want to save changes to " + name + "?"); 
        }
        return 1;
    }
    
    
    /**
     * Class to check for window closing events, and make sure all windows are saved or prompt the user otherwise
     * @author Taylor Hope
     */
    private static class MyWindowListener extends WindowAdapter {

        /**
         * Iterate through each document, check if it has unsaved changes and if so, prompt the user
         * to either save or discard the changes.
         * @param e the Window event sent.
         */
        @Override
        public void windowClosing(WindowEvent e) {
            EditFrame ew = (EditFrame) e.getWindow();
            int j;
            for(int i = 0; i < windows.size(); i++) {
                j = windows.get(i).windowClosing();
                if(j == 0)
                    windows.get(i).save(windows.get(i).name);
                if(j == 2 || j == -1)
                    return;
            }
            windows = new ArrayList();
            e.getWindow().dispose();          
        }
    }
}
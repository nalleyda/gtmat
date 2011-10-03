package main;
/*
 * Copyright (c) Ian F. Darwin, http://www.darwinsys.com/, 1996-2002.
 * All rights reserved. Software written by Ian F. Darwin and others.
 * $Id: LICENSE,v 1.8 2004/02/09 03:33:38 ian Exp $
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS''
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * Java, the Duke mascot, and all variants of Sun's Java "steaming coffee
 * cup" logo are trademarks of Sun Microsystems. Sun's, and James Gosling's,
 * pioneering role in inventing and promulgating (and standardizing) the Java
 * language and environment is gratefully acknowledged.
 *
 * The pioneering role of Dennis Ritchie and Bjarne Stroustrup, of AT&T, for
 * inventing predecessor languages C and C++ is also gratefully acknowledged.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.TreePath;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.*;

/**
 * Display a file system in a JTree view
 *
 * @version $Id: FileTree.java,v 1.9 2004/02/23 03:39:22 ian Exp $
 * @author Ian Darwin
 */
public class FileTree extends JPanel {

    /** Construct a FileTree */
    private JTree tree;
    private File selected;

    public FileTree(File dir) {
        setLayout(new BorderLayout());

        // Make a tree list with all the nodes, and make it a JTree
        tree = new JTree(addNodes(null, dir));
        TreeModel t = new DefaultTreeModel(addNodes(null, dir), false);

        //Make the root invisible; the user will hit the up button to go up.
        tree.setRootVisible(false);

        //Give the tree a tree model, so we can change nodes later.
        tree.setModel(t);
        DefaultTreeCellRenderer r = new DefaultTreeCellRenderer();
        tree.setCellRenderer(r);
        // Add a listener
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                if(new File(Main.getCurrentDirectory() + File.separator + e.getPath().getLastPathComponent().toString()).equals(selected) && selected.isFile()){
                    try{
                        EditWindow.open(selected.getAbsolutePath());
                    }
                    catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
                selected = new File(Main.getCurrentDirectory() + File.separator + e.getPath().getLastPathComponent().toString());
            }
        });
        tree.addTreeWillExpandListener(new ExpandListener());
        tree.addMouseListener(new RatEars());
        tree.getModel().addTreeModelListener(new ModelListener());

        
        // Lastly, put the JTree into a JScrollPane.
        JScrollPane scrollpane = new JScrollPane();
        tree.setEditable(true);
        scrollpane.getViewport().add(tree);
        add(BorderLayout.CENTER, scrollpane);
    }

    public void updateTree(File dir) {
        TreeModel t = new DefaultTreeModel(addNodes(null, dir), false);
        tree.setModel(t);
        tree.getModel().addTreeModelListener(new ModelListener());
    }

    public void updateTree(String dir) {
        updateTree(new File(dir));
    }

    public String getFullPath(TreePath path) {
        String s = "";
        for (int i = 0; i < path.getPathCount(); i++) {
            s += path.getPathComponent(i).toString() + (path.getPathComponent(i).toString().endsWith(File.separator) ? "" : File.separator);
        }
        return s;
    }

    /** Add nodes from under "dir" into curTop. 
     *  Only adding first level nodes, no need for more.
     */
    public DefaultMutableTreeNode addNodes(DefaultMutableTreeNode curTop, File dir) {
        String curPath = dir.getPath();
        DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
        if (curTop != null) { // should only be null at root
            curTop.add(curDir);
        }
        Vector ol = new Vector();
        
        String[] tmp = dir.list();
        for (int i = 0; i < tmp.length; i++) {
            ol.addElement(tmp[i]);
        }
        Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);
        File f;
        Vector files = new Vector();
        // Make two passes, one for Dirs and one for Files. This is #1.
        for (int i = 0; i < ol.size(); i++) {
            String thisObject = (String) ol.elementAt(i);
            String newPath = curPath + File.separator + thisObject;
            if ((f = new File(newPath)).isDirectory()) {
                DefaultMutableTreeNode d = new DefaultMutableTreeNode(thisObject);
                d.add(new DefaultMutableTreeNode());
                curDir.add(d);
            } else {
                files.addElement(thisObject);
            }

        }
        // Pass two: for files.
        for (int fnum = 0; fnum < files.size(); fnum++) {
            curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
        }
        return curDir;
    }

    public Dimension getMinimumSize() {
        return new Dimension(200, 400);
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 400);
    }


    /**
     * Listener to make sure that when the user double-clicks a file folder, we move into that folder,
     * instead of an in-place expansion.
     */
    private class ExpandListener implements TreeWillExpandListener {
        public void treeWillExpand(TreeExpansionEvent event) throws ExpandVetoException {
            String it = "" + event.getPath().getLastPathComponent();
            it = getFullPath(event.getPath());
            if (!(new File(it)).isDirectory()) {
                if (it.charAt(it.length() - 1) == File.separatorChar) {
                    it = it.substring(0, it.length() - 1);
                }
                try{
                    EditWindow.open(it);
                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            } else {
                Main.setCurrentDirectory(it);
            }
            throw new ExpandVetoException(event);

        }
        public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {}
    }

    private class ModelListener implements TreeModelListener {

        public void treeNodesChanged(TreeModelEvent e) {
            Object[] o = e.getChildren();
            String s = o[0].toString();
            File path = new File(Main.getCurrentDirectory() + File.separator + s);
            try{
                selected.renameTo(path);
            } catch(Exception except) {}

        }

        public void treeNodesInserted(TreeModelEvent e) {}

        public void treeNodesRemoved(TreeModelEvent e) {}

        public void treeStructureChanged(TreeModelEvent e) {}
    }

    private class RatEars implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            if(selected != null && e.getClickCount() == 2 && !selected.isDirectory() && selected.exists()){
                try{
                    EditWindow.open(selected.getAbsolutePath());
                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            }
        }

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}

    }
}

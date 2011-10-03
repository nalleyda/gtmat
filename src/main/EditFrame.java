/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import parser.*;
import plotting.*;
import utilities.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.System;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;

/**
 *
 * @author dsmith
 */
public class EditFrame extends JFrame implements WindowListener {

    public JTabbedPane editWin = null;
    protected UndoAction undoAction;
    protected RedoAction redoAction;
    protected CopyAction copyAction;
    protected CutAction cutAction;
    protected PasteAction pasteAction;
    protected AllAction allAction;
    private String fileName = null;
    private GTStringStream ss = null;

    /* Text		Go	Cell	Tools	Debug	Desktop	Window	Help
     */

    public EditFrame(String s) throws Exception {
        super(s);
        fileName = s;
        JMenuBar menuBar = new JMenuBar();
        JToolBar myToolBar = makeToolBar();
        setJMenuBar(menuBar);
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createTextMenu());
        menuBar.add(createGoMenu());
        menuBar.add(createCellMenu());
        menuBar.add(createToolsMenu());
        menuBar.add(createDebugMenu());
        menuBar.add(createDesktopMenu());
        menuBar.add(createWindowMenu());
        menuBar.add(createHelpMenu());
        add(myToolBar, BorderLayout.NORTH);
        editWin = new JTabbedPane();
        add(editWin, BorderLayout.CENTER);
        String imgname = "../resources/images/GT.png";
        setIconImage(
                new ImageIcon(getClass().getResource(imgname)).getImage());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                IOTools.checkAllSaved();
            }
        });
    }

    public int addWin(EditWindow ew, String name) {
        if (name == null) {
            name = "untitled";
        }
        editWin.addTab(name, ew);
        int res = editWin.getTabCount() - 1;
        initTabComponent(res);
        editWin.setSelectedComponent(ew);
        return res;
    }

    private void initTabComponent(int i) {
        editWin.setTabComponentAt(i,
                new ButtonTabComponent(editWin));
    }

    //Create the edit menu.
    protected JMenu createEditMenu() {
        JMenu menu = new JMenu("Edit");
        //Undo and redo are actions of our own creation.
        undoAction = new UndoAction();
        menu.add(undoAction);
        redoAction = new RedoAction();
        menu.add(redoAction);
        menu.addSeparator();
        //These actions come from the default editor kit.
        //Get the ones we want and stick them in the menu.
        copyAction = new CopyAction();
        menu.add(copyAction);
        cutAction = new CutAction();
        menu.add(cutAction);
        pasteAction = new PasteAction();
        menu.add(pasteAction);
        menu.addSeparator();
        allAction = new AllAction();
        menu.add(allAction);
        return menu;
    }

    /*
     * create the File Menu
     */
    private JMenu createFileMenu() {
        JMenu menu = new JMenu("File");
        menu.add(createFileNewItem());
        menu.add(createFileOpenItem());
        menu.add(createFileOpenAsTextItem());
        menu.add(createFileOpenFunctionItem());
        menu.add(createFileCloseItem());
        menu.add(createFileSaveItem());
        menu.add(createFileSaveAsItem());
        menu.add(createFileSaveTFileItem());
        menu.add(createFileSaveImageItem());
        menu.add(createFilePublishItem());
        menu.add(createFilePublishConfigItem());
        menu.add(createFileSourceControlItem());
        menu.add(createFileImportDataItem());
        menu.add(createFileSaveWSasItem());
        menu.add(createFileSetPathItem());
        menu.add(createFilePreferencesItem());
        menu.add(createFilePageSetupItem());
        menu.add(createFilePrintItem());
        menu.add(createFilePrintSelectionItem());
        return menu;
    }

    private JMenuItem createFileOpenItem() {
        JMenuItem item = new JMenuItem("Open ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try{
                    fileName = IOTools.openFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileOpenAsTextItem() {
        JMenuItem item = new JMenuItem("Open as text ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                try{
                    fileName = IOTools.openFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileOpenFunctionItem() {
        JMenuItem item = new JMenuItem("Open function ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                try{
                    fileName = IOTools.openFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileCloseItem() {
        JMenuItem item = new JMenuItem("Close [file]");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.closeFile();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSaveItem() {
        JMenuItem item = new JMenuItem("Save");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.saveFile((EditWindow) editWin.getSelectedComponent());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSaveAsItem() {
        JMenuItem item = new JMenuItem("Save as ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                IOTools.saveFileAs((EditWindow) editWin.getSelectedComponent());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSaveTFileItem() {
        JMenuItem item = new JMenuItem("Save t File as ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                IOTools.saveTFileAs((EditWindow) editWin.getSelectedComponent());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSaveImageItem() {
        JMenuItem item = new JMenuItem("Save imge");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.saveImage(((EditWindow) editWin.getSelectedComponent()));
           }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePublishItem() {
        JMenuItem item = new JMenuItem("Publish ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePublishConfigItem() {
        JMenuItem item = new JMenuItem("Publish configuration ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSourceControlItem() {
        JMenuItem item = new JMenuItem("Source Control ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileImportDataItem() {
        JMenuItem item = new JMenuItem("Import Data ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSaveWSasItem() {
        JMenuItem item = new JMenuItem("Save Workspace As ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.saveWSAs();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileSetPathItem() {
        JMenuItem item = new JMenuItem("Set Path ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.setPath();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePreferencesItem() {
        JMenuItem item = new JMenuItem("Preferences ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.editPreferences();
           }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePageSetupItem() {
        JMenuItem item = new JMenuItem("Page Setup ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.pageSetup();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePrintSelectionItem() {
        JMenuItem item = new JMenuItem("Print Selection");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.printSelection();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileNewItem() {
        JMenuItem item = new JMenuItem("New");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try{
                    IOTools.newFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePrintItem() {
        JMenuItem item = new JMenuItem("Print ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                IOTools.print((EditWindow) editWin.getSelectedComponent());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Text menu
     */

    private JMenu createTextMenu() {
        JMenu menu = new JMenu("View");
        menu.add(createTextEvalSelectionItem());
        menu.add(createTextWrapCommentsItem());
        menu.add(createTextCommentItem());
        menu.add(createTextUncommentItem());
        menu.add(createTextDecIndentItem());
        menu.add(createTextIncIndentItem());
        menu.add(createTextSmartIndentItem());
        menu.add(createTextToLowerCaseItem());
        menu.add(createTextToUpperCaseItem());
        menu.add(createTextFoldingMenu());
        return menu;
    }

    private JMenu createTextFoldingMenu() {
        JMenu menu = new JMenu("Folding");
        menu.add(createFoldingExpandItem());
        menu.add(createFoldingFoldItem());
        menu.add(createFoldingExpandAllItem());
        menu.add(createFoldingFoldAllItem());
        return menu;
    }

    private JMenuItem createTextEvalSelectionItem() {
        JMenuItem item = new JMenuItem("Eval Selection");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.evalSelection(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextWrapCommentsItem() {
        JMenuItem item = new JMenuItem("Wrap Comments");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.wrapComments(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextCommentItem() {
        JMenuItem item = new JMenuItem("Comment");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.comment(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextUncommentItem() {
        JMenuItem item = new JMenuItem("Uncomment");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.unComment(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextDecIndentItem() {
        JMenuItem item = new JMenuItem("Decrease Indent");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.decIndent(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextIncIndentItem() {
        JMenuItem item = new JMenuItem("Increase Indent");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.incIndent(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextSmartIndentItem() {
        JMenuItem item = new JMenuItem("Smart Indent");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.smartIndent(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextToLowerCaseItem() {
        JMenuItem item = new JMenuItem("To Lower Case");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.toLowerCase(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createTextToUpperCaseItem() {
        JMenuItem item = new JMenuItem("To Upper Case");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.toUpperCase(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFoldingExpandItem() {
        JMenuItem item = new JMenuItem("Expand Item");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.doNothing(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFoldingFoldItem() {
        JMenuItem item = new JMenuItem("Fold Item");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.doNothing(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFoldingExpandAllItem() {
        JMenuItem item = new JMenuItem("Expand All Items");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.doNothing(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFoldingFoldAllItem() {
        JMenuItem item = new JMenuItem("Fold All Items");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TextTools.doNothing(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Go menu
     *

    set/Clear BookMark
    next Bookmark
    previous bookmark
    Go to …

     */
    private JMenu createGoMenu() {
        JMenu menu = new JMenu("Go");
        menu.add(createGoBackItem());
        menu.add(createGoForwardItem());
        menu.add(createGoBookMarkItem());
        menu.add(createGoNextBookmarkItem());
        menu.add(createGoPrevBookmarkItem());
        menu.add(createGoGoToItem());
        return menu;
    }

    private JMenuItem createGoBackItem() {
        JMenuItem item = new JMenuItem("Go Back");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goBack(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoForwardItem() {
        JMenuItem item = new JMenuItem("Go Forward");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goForward(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoItem() {
        JMenuItem item = new JMenuItem("Go");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.go(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoBookMarkItem() {
        JMenuItem item = new JMenuItem("set/clear Bookmark");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goBookMark(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoNextBookmarkItem() {
        JMenuItem item = new JMenuItem("Next Bookmark");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goNextBookmark(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoPrevBookmarkItem() {
        JMenuItem item = new JMenuItem("Previous Bookmark");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goPrevBookmark(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createGoGoToItem() {
        JMenuItem item = new JMenuItem("Go To ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 GoTools.goTo(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Cell menu
     * Disable Cell Mode
    Evaluate Cell
    Evaluate Cell and Advance
    Evaluate Entire File
    Insert Cell Break
    Insert Cell Breaks Around Selection
    Insert text markup
    next cell
    Previous Cell

     */
    private JMenu createCellMenu() {
        JMenu menu = new JMenu("Cell");
        menu.add(createCellItem());
        return menu;
    }

    private JMenuItem createCellItem() {
        JMenuItem item = new JMenuItem("Cell ");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cell");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Go menu
     */
    private JMenu createToolsMenu() {
        JMenu menu = new JMenu("Tools");
        menu.add(createGoItem());
        return menu;
    }

    private JMenuItem createToolsItem() {
        JMenuItem item = new JMenuItem("Tools ");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tools ");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Debug menu
     */
    private JMenu createDebugMenu() throws Exception {
        JMenu menu = new JMenu("Debug");
        menu.add(createDebugOpenWhenDebuggingItem());
        menu.add(createDebugStepItem());
        menu.add(createDebugStepInItem());
        menu.add(createDebugStepOutItem());
        menu.add(createDebugRunItem());
        menu.add(createDebugClearAllBPItem());
        menu.add(createDebugStopOnErrorItem());
        menu.add(createDebugExitItem());
        return menu;
    }

    private JMenuItem createDebugOpenWhenDebuggingItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Open Files When Debugging");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.openWhenDebugging(false);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugStepItem() {
        JMenuItem item = new JMenuItem("Step");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.debugStep(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugStepInItem() {
        JMenuItem item = new JMenuItem("Step Into");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.debugStepIn(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugStepOutItem() {
        JMenuItem item = new JMenuItem("Step out");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.debugStepOut(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugRunItem() throws Exception {
        JMenuItem item = new JMenuItem("Run"/* + (fileName == null?"":(" " + fileName))*/);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                EditWindow ew = (EditWindow) editWin.getSelectedComponent();
                try{
                    DebugTools.debugRun(ew);
                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }


    private JMenuItem createDebugClearAllBPItem() {
        JMenuItem item = new JMenuItem("Clear All Break Points");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.debugClear(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugStopOnErrorItem() {
        JMenuItem item = new JMenuItem("Stop if Errors/Warnings");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Stop if Errors/Warnings");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugExitItem() {
        JMenuItem item = new JMenuItem("Exit Debug Mode");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DebugTools.debugExit(((EditWindow) editWin.getSelectedComponent()).getDoc());
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Desktop menu
     */
    private JMenu createDesktopMenu() {
        JMenu menu = new JMenu("Desktop");
        menu.add(createDesktopMinCmdItem());
        menu.add(createDesktopMaxCmdItem());
        menu.add(createDesktopUndockCmdItem());
        menu.add(createDesktopMoveCmdItem());
        menu.add(createDesktopResizeCmdItem());
        menu.add(createDesktopLayoutMenu());
        menu.add(createDesktopSaveLayoutItem());
        menu.add(createDesktopCommandWinItem());
        menu.add(createDesktopCommandHistoryItem());
        menu.add(createDesktopCurrentFolderItem());
        menu.add(createDesktopWorkspaceItem());
        menu.add(createDesktopHelpItem());
        menu.add(createDesktopProfilerItem());
        menu.add(createDesktopFileExchangeItem());
        menu.add(createDesktopEditorItem());
        menu.add(createDesktopFiguresItem());
        menu.add(createDesktopWebBrowserItem());
        menu.add(createDesktopVariableEditorItem());
        menu.add(createDesktopComparisonToolItem());
        menu.add(createDesktopToolbarsMenu());
        menu.add(createDesktopTitlesItem());
        return menu;
    }

    private JMenuItem createDesktopMinCmdItem() {
        JMenuItem item = new JMenuItem("Minimize Cmd Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.minInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopMaxCmdItem() {
        JMenuItem item = new JMenuItem("Maximize Cmd Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.maxInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopUndockCmdItem() {
        JMenuItem item = new JMenuItem("Undock Cmd Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.undockInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopMoveCmdItem() {
        JMenuItem item = new JMenuItem("Move Cmd Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.moveInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopResizeCmdItem() {
        JMenuItem item = new JMenuItem("Resize Cmd Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.resizeInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Debug menu
     */
    private JMenu createDesktopLayoutMenu() {
        JMenu menu = new JMenu("Layout");
        menu.add(createLayoutDefaultItem());
        menu.add(createLayoutCmdWinOnlyItem());
        menu.add(createLayoutHistoryAndCmdItem());
        menu.add(createLayoutAllTabbedItem());
        menu.add(createLayoutAllButCmdMinItem());
        return menu;
    }

    private JMenuItem createLayoutDefaultItem() {
        JMenuItem item = new JMenuItem("Default");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.layoutDefault();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createLayoutCmdWinOnlyItem() {
        JMenuItem item = new JMenuItem("Command Window Only");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.layoutInterOnly();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createLayoutHistoryAndCmdItem() {
        JMenuItem item = new JMenuItem("History and Cmd");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.layoutHistAndInter();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createLayoutAllTabbedItem() {
        JMenuItem item = new JMenuItem("All Tabbed");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.layoutAllTabbed();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createLayoutAllButCmdMinItem() {
        JMenuItem item = new JMenuItem("All But Cmd Win Minimized");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.layoutAllButInterMin();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopSaveLayoutItem() {
        JMenuItem item = new JMenuItem("Save Layout");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.saveLayout();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopCommandWinItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Command Window");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.interactions();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopCommandHistoryItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Command History");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.history();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopCurrentFolderItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Current Folder");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.files();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopWorkspaceItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Workspace");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.variables();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopHelpItem() {
        JMenuItem item = new JMenuItem("Desktop Help");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.help();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopProfilerItem() {
        JMenuItem item = new JMenuItem("Profiler");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopFileExchangeItem() {
        JMenuItem item = new JMenuItem("File Exchange");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.fileExchange();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopEditorItem() {
        JMenuItem item = new JMenuItem("Editor");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 try{
                    DesktopTools.editor();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopFiguresItem() {
        JMenuItem item = new JMenuItem("Figures");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.figures();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopWebBrowserItem() {
        JMenuItem item = new JMenuItem("Web Browser");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                  DesktopTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopVariableEditorItem() {
        JMenuItem item = new JMenuItem("Variable Editor");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.variableEditor();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopComparisonToolItem() {
        JMenuItem item = new JMenuItem("Comparison Tool");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 DesktopTools.doNothing();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Desktop menu
     */
    private JMenu createDesktopToolbarsMenu() {
        JMenu menu = new JMenu("Toolbars");
        menu.add(createToolbarsGTMatItem());
        menu.add(createToolbarsShortCutsItem());
        menu.add(createToollbarsCustomItem());
        return menu;
    }

    private JMenuItem createToolbarsGTMatItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("GT_mat");
        item.setState(true);
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("[k] GT_mat");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createToolbarsShortCutsItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Short Cuts");
        item.setState(true);
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("[k] Short Cuts");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createToollbarsCustomItem() {
        JMenuItem item = new JMenuItem("Customize ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Customize ...");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopTitlesItem() {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Titles");
        item.setState(true);
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("[k] Titles");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Debug menu
     */
    private JMenu createWindowMenu() {
        JMenu menu = new JMenu("Window");
        menu.add(createWindowCloseAllItem());
        menu.add(createWindowNextToolItem());
        menu.add(createWindowPreviousToolItem());
        menu.add(createWindowNextTabItem());
        menu.add(createWindowPreviousTabItem());
        menu.add(createWindowCmdWinItem());
        menu.add(createWindowCmdHistItem());
        menu.add(createWindowCurrentFolderItem());
        menu.add(createWindowWorkspaceItem());
        return menu;
    }

    private JMenuItem createWindowCloseAllItem() {
        JMenuItem item = new JMenuItem("Close All Documents");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 WindowTools.closeAll();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowNextToolItem() {
        JMenuItem item = new JMenuItem("Next Tool");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 WindowTools.nextTool();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowPreviousToolItem() {
        JMenuItem item = new JMenuItem("Previous Tool");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 WindowTools.previousTool();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowNextTabItem() {
        JMenuItem item = new JMenuItem("Next Tab");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 WindowTools.nextTab();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowPreviousTabItem() {
        JMenuItem item = new JMenuItem("Previous Tab");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                 WindowTools.previousTab();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowCmdWinItem() {
        JMenuItem item = new JMenuItem("0 Command Window");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                DesktopTools.interactions();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowCmdHistItem() {
        JMenuItem item = new JMenuItem("1 Command History");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                DesktopTools.history();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowCurrentFolderItem() {
        JMenuItem item = new JMenuItem("2 Current Folder");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                DesktopTools.files();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createWindowWorkspaceItem() {
        JMenuItem item = new JMenuItem("3 Workspace");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                DesktopTools.variables();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    /*
     * create the Help menu
     */
    private JMenu createHelpMenu() {
        JMenu menu = new JMenu("Help");
        menu.add(createHelpProductHelpItem());
        menu.add(createHelpFunctionBrowserItem());
        menu.add(createHelpUsingTheDesktopItem());
        menu.add(createHelpUsingTheCmdWinItem());
        menu.add(createHelpWebResourcesItem());
        menu.add(createHelpGetProductTrialsItem());
        menu.add(createHelpCheckForUpdatesItem());
        menu.add(createHelpLicensingItem());
        menu.add(createHelpDemosItem());
        menu.add(createHelpTermsOfUseItem());
        menu.add(createHelpPatentsItem());
        menu.add(createHelpAboutGT_MatItem());
        return menu;
    }

    private JMenuItem createHelpProductHelpItem() {
        JMenuItem item = new JMenuItem("Product help");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Product help");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpFunctionBrowserItem() {
        JMenuItem item = new JMenuItem("Function Browser");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Function Browser");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpUsingTheDesktopItem() {
        JMenuItem item = new JMenuItem("Using the Desktop");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Using the Desktop");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpUsingTheCmdWinItem() {
        JMenuItem item = new JMenuItem("Using the Cmd Window");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Using the Cmd Window");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpWebResourcesItem() {
        JMenuItem item = new JMenuItem("Web Resources");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Web Resources");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpGetProductTrialsItem() {
        JMenuItem item = new JMenuItem("Get Product Trials");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Get Product Trials");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpCheckForUpdatesItem() {
        JMenuItem item = new JMenuItem("Check for Updates");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Check for Updates");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpLicensingItem() {
        JMenuItem item = new JMenuItem("Licensing");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Licensing");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpDemosItem() {
        JMenuItem item = new JMenuItem("Demos");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Demos");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpTermsOfUseItem() {
        JMenuItem item = new JMenuItem("Terms of Use");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Terms of Use");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpPatentsItem() {
        JMenuItem item = new JMenuItem("Patents");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Patents");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createHelpAboutGT_MatItem() {
        JMenuItem item = new JMenuItem("About GT_Mat");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("About GT_Mat");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private class MyAction extends AbstractAction {

        String name;

        MyAction(String name, Icon icon) {
            super(name, icon);
            this.name = name;
        }

        MyAction(String name, Icon icon, String desc, Integer mnemonic,
                KeyStroke accelerator) {
            super(name, icon);
            putValue(Action.SHORT_DESCRIPTION, desc);
            putValue(Action.MNEMONIC_KEY, mnemonic);
            putValue(Action.ACCELERATOR_KEY, accelerator);
            this.name = name;
        }

        public void actionPerformed(ActionEvent e) {
            String fileName;
            if (name.equals("New File")) {
                try{
                    IOTools.newFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            } else if (name.equals("Open File")) {
                try{
                    fileName = IOTools.openFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            } else if (name.equals("Save File")) {
                IOTools.saveFile((EditWindow) editWin.getSelectedComponent());
            }
        }
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

    class UndoAction extends AbstractAction {

        public UndoAction() {
            super("Undo");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                EditWindow.getUndo().undo();
            } catch (CannotUndoException ex) {
                System.out.println("Unable to undo: " + ex);
                ex.printStackTrace();
            }
            updateUndoState();
            redoAction.updateRedoState();
        }

        protected void updateUndoState() {
            if (EditWindow.getUndo().canUndo()) {
                setEnabled(true);
                putValue(Action.NAME, EditWindow.getUndo().getUndoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Undo");
            }
        }
    }

    class RedoAction extends AbstractAction {

        public RedoAction() {
            super("Redo");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                EditWindow.getUndo().redo();
            } catch (CannotRedoException ex) {
                System.out.println("Unable to redo: " + ex);
                ex.printStackTrace();
            }
            updateRedoState();
            undoAction.updateUndoState();
        }

        protected void updateRedoState() {
            if (EditWindow.getUndo().canRedo()) {
                setEnabled(true);
                putValue(Action.NAME, EditWindow.getUndo().getRedoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Redo");
            }
        }
    }

    class CopyAction extends AbstractAction {

        public CopyAction() {
            super("Copy");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    class CutAction extends AbstractAction {

        public CutAction() {
            super("Cut");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    class PasteAction extends AbstractAction {

        public PasteAction() {
            super("Paste");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    class AllAction extends AbstractAction {

        public AllAction() {
            super("Select All");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    /*
     * Create the tool bar
     */
    private JToolBar makeToolBar() {
        JToolBar it = new JToolBar();
        it.setBorder(BorderFactory.createLineBorder(Color.black));
        it.add(new MyAction("New File",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/file_new.png")),
                "New File",
                new Integer(KeyEvent.VK_P),
                KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Open File",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/file_open.png")),
                "Open File",
                new Integer(KeyEvent.VK_O),
                KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Save File",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/file_save.png")),
                "Save File",
                new Integer(KeyEvent.VK_Z),
                KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Cut",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/cut.png")),
                "Cut",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Copy",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/copy.png")),
                "Copy",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Paste",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/paste.png")),
                "Paste",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Undo",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/arrow_move_up.png")),
                "Undo",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("redo",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/arrow_move_down.png")),
                "Redo",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Help",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/help.gif")),
                "help",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)));
        return it;
    }
    public void windowClosing(WindowEvent e) {
        displayMessage("WindowListener method called: windowClosing.");
    }
    
    public void windowClosed(WindowEvent e) {
        //This will only be seen on standard output.
        displayMessage("WindowListener method called: windowClosed.");
    }
    
    public void windowOpened(WindowEvent e) {
        displayMessage("WindowListener method called: windowOpened.");
    }
    
    public void windowIconified(WindowEvent e) {
        displayMessage("WindowListener method called: windowIconified.");
    }
    
    public void windowDeiconified(WindowEvent e) {
        displayMessage("WindowListener method called: windowDeiconified.");
    }
    
    public void windowActivated(WindowEvent e) {
        displayMessage("WindowListener method called: windowActivated.");
    }
    
    public void windowDeactivated(WindowEvent e) {
        displayMessage("WindowListener method called: windowDeactivated.");
    }
    
    private void displayMessage(String msg) {
        System.out.println(msg);
    }
    
}

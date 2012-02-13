/*
 * Main frame for GT_Mat GUI
 */
package main;

import gui.EditWindow;
import gui.FileTree;
import gui.MainSplitPane;
import gui.TabbedPane;

import java.util.logging.Level;
import java.util.logging.Logger;
import properties.*;
import plotting.*;
import utilities.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemEvent;
import java.net.URL;
import java.io.File;
import java.awt.event.ItemListener;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.StyleConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.System;
import java.util.Date;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author dsmith
 */
public class GT_Mat extends JFrame {

    private JFileChooser dirChooser =
            new JFileChooser(new File(Main.getCurrentDirectory()));
    private JComboBox patternList;
    private GT_Mat me = null;
    public static SimpleAttributeSet[] attrs;

    public GT_Mat(String s) {
        super(s);
        attrs = initAttributes(2);
        me = this;
        JMenuBar menuBar = new JMenuBar();
        JToolBar myToolBar = makeToolBar();
        MainSplitPane splitPane = new MainSplitPane();
        setJMenuBar(menuBar);
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createDebugMenu());
        menuBar.add(createDesktopMenu());
        menuBar.add(createWindowMenu());
        menuBar.add(createHelpMenu());
        add(myToolBar, BorderLayout.NORTH);
        add(splitPane.getSplitPane(), BorderLayout.CENTER);
        pack();
        String imgname = "../resources/images/GT.png";
        setIconImage(
                new ImageIcon(getClass().getResource(imgname)).getImage());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                IOTools.checkAllSaved();
            }
        });
        setVisible(true);
    }


    protected SimpleAttributeSet[] initAttributes(int length) {
        //Hard-code some attributes.
        SimpleAttributeSet[] attrs = new SimpleAttributeSet[length];
        attrs[0] = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attrs[0], PropertyHandler.getProperty(PropertyHandler.FONT_NAME, "Monospaced"));
        StyleConstants.setFontSize(attrs[0], Integer.parseInt(PropertyHandler.getProperty(PropertyHandler.FONT_SIZE, "12")));
        attrs[1] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setForeground(attrs[1], Color.red);

        return attrs;
    }

    public void updateAttrs() {
        StyleConstants.setFontFamily(attrs[0], PropertyHandler.getProperty(PropertyHandler.FONT_NAME, "Monospaced"));
        StyleConstants.setFontSize(attrs[0], Integer.parseInt(PropertyHandler.getProperty(PropertyHandler.FONT_SIZE, "12")));
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
        it.add(new MyAction("Save",
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
         it.addSeparator();
        it.addSeparator();
        it.add(new JLabel("Current Directory: "));

        //Create Directory ComboBox
        patternList = new JComboBox(PropertyHandler.getRecentDirectories());

        patternList.setSelectedItem(PropertyHandler.getDefaultWorkingDirectory());
        patternList.setEditable(true);
        patternList.addItemListener(new ComboListener());
        patternList.setPreferredSize(new Dimension(100, 20));
        it.add(patternList);
        it.addSeparator();
        it.add(new MyAction("Browse",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/browse.png")),
                "Browse for a folder",
                new Integer(KeyEvent.VK_B),
                KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK)));
        it.add(new MyAction("Up",
                new ImageIcon(getClass().getResource("../resources/images/toolbar/file_up.png")),
                "To Containing Directory",
                new Integer(KeyEvent.VK_U),
                KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK)));
        JLabel filler = new JLabel();
        filler.setPreferredSize(new Dimension(200, 20));
        it.add(filler);
        return it;
    }



    public JComboBox getPatternList(){
        return patternList;
    }

    /*
     * create the File Menu
     */
    /* File	Edit	Debug		Desktop		Window	Help
     */
    private JMenu createFileMenu() {
        JMenu menu = new JMenu("File");
        menu.add(createFileNewItem());
        menu.add(createFileOpenItem());
        menu.add(createFileCloseCmdWinItem());
        menu.add(createFileImportDataItem());
        menu.add(createFileSaveWSasItem());
        menu.add(createFileSetPathItem());
        menu.add(createFilePreferencesItem());
        menu.add(createFilePageSetupItem());
        menu.add(createFilePrintItem());
        menu.add(createFilePrintSelectionItem());
        menu.add(createFileExitItem());
        return menu;
    }

    private JMenuItem createFileOpenItem() {
        JMenuItem item = new JMenuItem("Open ...");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try{
                    Main.fileName = IOTools.openFile();
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

    private JMenuItem createFileCloseCmdWinItem() {
        JMenuItem item = new JMenuItem("Close Cmd Window");
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
                catch(Exception e2){
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
                IOTools.print();
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFileExitItem() {
        JMenuItem item = new JMenuItem("Exit");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                IOTools.checkAllSaved();
                System.out.println("Th..th..th..that's all, Folks!");
                System.exit(0);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }
    /*
     * create the Edit menu
     */

    private JMenu createEditMenu() {
        JMenu menu = new JMenu("Edit");
        menu.add(createEditUndoItem());
        menu.add(createEditRedoItem());
        menu.add(createEditCutItem());
        menu.add(createEditCopyItem());
        menu.add(createEditPasteItem());
        menu.add(createEditPasteToWSItem());
        menu.add(createEditSelectAllItem());
        menu.add(createEditFindItem());
        menu.add(createEditFindFilesItem());
        menu.add(createEditClearCmdWinItem());
        menu.add(createEditClearHistoryItem());
        menu.add(createEditClearWSItem());
        return menu;
    }

        private JMenuItem createEditUndoItem() {
        JMenuItem item = new JMenuItem("Undo");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Undo Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditRedoItem() {
        JMenuItem item = new JMenuItem("Redo");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Redo Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditCutItem() {
        JMenuItem item = new JMenuItem("Cut");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Cut Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditCopyItem() {
        JMenuItem item = new JMenuItem("Copy");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Copy Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditPasteItem() {
        JMenuItem item = new JMenuItem("Paste");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Paste Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditPasteToWSItem() {
        JMenuItem item = new JMenuItem("Paste to WS");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Paste to WS Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditSelectAllItem() {
        JMenuItem item = new JMenuItem("Select All");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Select All Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditDeleteItem() {
        JMenuItem item = new JMenuItem("Delete");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditFindItem() {
        JMenuItem item = new JMenuItem("Find");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Find Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditFindFilesItem() {
        JMenuItem item = new JMenuItem("Find Files ...");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Find Files Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditClearCmdWinItem() {
        JMenuItem item = new JMenuItem("Clear Command Window");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Clear Command Window Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

        private JMenuItem createEditClearHistoryItem() {
        JMenuItem item = new JMenuItem("Clear History");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Clear History Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }


        private JMenuItem createEditClearWSItem() {
        JMenuItem item = new JMenuItem("Clear WorkSpace");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Clear WorkSpace Action");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }


    /*
     * create the Debug menu
     */
    private JMenu createDebugMenu() {
        JMenu menu = new JMenu("Debug");
        menu.add(createDebugOpenWhenDebuggingItem());
        menu.add(createDebugStepItem());
        menu.add(createDebugStepInItem());
        menu.add(createDebugStepOutItem());
        menu.add(createDebugContinueItem());
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
                System.out.println("[k] Open Files When Debugging");
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
                System.out.println("Step");
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
                System.out.println("Step Into");
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
                System.out.println("Step Out Of");
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDebugContinueItem() {
        JMenuItem item = new JMenuItem("Continue");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Continue");
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
                System.out.println("Clear All Break Points");
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
                System.out.println("Exit Debug Mode");
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
        menu.add(createDesktopImageItem());
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
                    EditWindow.open(null);
                }
                catch (Exception e1){
                    e1.printStackTrace();
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
                DesktopTools.doNothing();
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
                DesktopTools.doNothing();
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
                DesktopTools.doNothing();
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
                 DesktopTools.doNothing();
           }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createDesktopImageItem() {
        JMenuItem item = new JMenuItem("Save Image");
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                PlotTools.save(me);
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
                WindowTools.doNothing();
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
            if (name.equals("New File")) {
                try{
                    IOTools.newFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
//                plotWin.figure.axes.mode = Axes.PAN;
            } else if (name.equals("Open File")) {
                try{
                    IOTools.openFile();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            } else if (name.equals("Save File")) {
                IOTools.saveFile();
            } else if (name.equals("Browse")) {
                System.out.println("Browse for a file");
                dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if (dirChooser.showOpenDialog(Main.frame)
                        == JFileChooser.APPROVE_OPTION) {
                    Main.setCurrentDirectory(dirChooser.getSelectedFile().getAbsolutePath());
                    patternList.addItem(Main.getCurrentDirectory());
                    TabbedPane.fileTree = new FileTree(
                            new File(Main.getCurrentDirectory()));
                }
            } else if (name.equals("Up")) {
                System.out.println("Directory up");
                String newDir = (new File(Main.getCurrentDirectory())).getParent();

                if((newDir != null)) {
                    Main.setCurrentDirectory(newDir);
                    TabbedPane.fileTree.updateTree(Main.getCurrentDirectory());
                }
            }
        }
    }

    private class ComboListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JComboBox cb = (JComboBox) e.getSource();
                String newSelection = (String) cb.getSelectedItem();
                File f = new File(newSelection);
                if (!(f == null) && f.isDirectory()) {
                    Main.setCurrentDirectory(newSelection);
                    TabbedPane.fileTree.updateTree(f);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid path, check your spelling and try again.");
                }
            }
        }
    }
}

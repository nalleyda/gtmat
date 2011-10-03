/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plotting;

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
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.*;

/**
 *
 * @author dsmith
 */
public class GT_Frame extends JFrame
        implements WindowListener, WindowFocusListener {

    private PlotWindow plotWin = null;
    private GT_Frame me;
    private Figure myFigure;

    public GT_Frame(Figure fig, String s) {
        super(s);
        myFigure = fig;
        JMenuBar menuBar = new JMenuBar();
        JToolBar myToolBar = makeToolBar();
        setJMenuBar(menuBar);
        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());
        add(myToolBar, BorderLayout.NORTH);
        me = this;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        String imgname = "../resources/images/GT.png";
        setIconImage(
                new ImageIcon(getClass().getResource(imgname)).getImage());
        addWindowListener(this);
        addWindowFocusListener(this);
    }

    public void addWin(PlotWindow pl) {
        plotWin = pl;
        add(pl);
    }

    public void closeAll() {
        me.removeAll();
    }
    /*
     * Create the tool bar
     */

    private JToolBar makeToolBar() {
        JToolBar it = new JToolBar();
        it.setBorder(BorderFactory.createLineBorder(Color.black));
        Class cl = getClass();
        URL handAt = getClass().getResource("../resources/images/toolbar/hand.gif");
        ImageIcon panImage = new ImageIcon(handAt);
        ImageIcon zoomImage =
                new ImageIcon(getClass().getResource("../resources/images/toolbar/zoom.png"));
        ImageIcon rotateImage =
                new ImageIcon(getClass().getResource("../resources/images/toolbar/rotate_3D.png"));
        Action panAction = new MyAction("Pan", panImage,
                "Pan the picture",
                new Integer(KeyEvent.VK_P),
                KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        Action zoomAction = new MyAction("Zoom", zoomImage,
                "Zoom the picture",
                new Integer(KeyEvent.VK_Z),
                KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        Action rotAction = new MyAction("Rotate", rotateImage,
                "Rotate the picture",
                new Integer(KeyEvent.VK_R),
                KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        it.add(panAction);
        it.add(zoomAction);
        it.add(rotAction);
        return it;
    }

    /*
     * create the File Menu
     */
    private JMenu createFileMenu() {
        JMenu menu = new JMenu("File");
        menu.add(createFileSaveItem());
        menu.add(createFilePrintItem());
        menu.add(createFileExitItem());
        return menu;
    }

    private JMenuItem createFileSaveItem() {
        JMenuItem item = new JMenuItem("Save");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                PlotTools.save(me);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createFilePrintItem() {
        JMenuItem item = new JMenuItem("Print");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                PlotTools.print(me);
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
                PlotTools.close(me, plotWin);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }
    /*
     * create the view menu
     */

    private JMenu createViewMenu() {
        JMenu menu = new JMenu("View");
        menu.add(createViewPanItem());
        menu.add(createViewZoomItem());
        menu.add(createViewRotItem());
        menu.add(createViewResetItem());
        return menu;
    }

    private JMenuItem createViewPanItem() {
        JMenuItem item = new JMenuItem("Pan");
        class MenuItemListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                PlotTools.pan(plotWin);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createViewZoomItem() {
        JMenuItem item = new JMenuItem("Zoom");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                PlotTools.zoom(plotWin);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createViewRotItem() {
        JMenuItem item = new JMenuItem("Rotate");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                PlotTools.rotate(plotWin);
            }
        }
        ActionListener al = new MenuItemListener();
        item.addActionListener(al);
        return item;
    }

    private JMenuItem createViewResetItem() {
        JMenuItem item = new JMenuItem("Reset");
        class MenuItemListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                PlotTools.reset(plotWin);
                repaint();
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

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Action performed on " + this.toString());
            if (name.equals("Pan")) {
                PlotTools.pan(plotWin);
            } else if (name.equals("Zoom")) {
                PlotTools.zoom(plotWin);
            } else if (name.equals("Rotate")) {
                PlotTools.rotate(plotWin);
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        ((GT_Frame) e.getWindow()).plotWin.figure.showing = false;
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //This will only be seen on standard output.
//        System.out.println("WindowListener method called: windowClosed.");
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        System.out.println("WindowListener method called: windowOpened.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        System.out.println("WindowListener method called: windowIconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("WindowListener method called: windowDeiconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        System.out.println("WindowListener method called: windowActivated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        System.out.println("WindowListener method called: windowDeactivated.");
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println("WindowFocusListener method called: windowGainedFocus.");
//        Figure.setFigure(myFigure);
        
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
//        System.out.println("WindowFocusListener method called: windowLostFocus.");
    }

    public void windowStateChanged(WindowEvent e) {
//        System.out.println (
//                "WindowStateListener method called: windowStateChanged.");
    }
}

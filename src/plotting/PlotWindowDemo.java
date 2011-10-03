package plotting;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;

public class PlotWindowDemo extends JPanel {

    public JTextPane pane;
    public JMenuBar menuBar;
    public JToolBar toolBar;
    public JFrame theFrame;
    String fonts[] = {
        "Serif", "SansSerif", "Monospaced", "Dialog", "DialogInput"
    };

    public PlotWindowDemo() {
        menuBar = new JMenuBar();

        // Create a set of actions to use in both the menu and toolbar
        DemoAction leftJustifyAction = new DemoAction("Left", "Left justify text", 'L');
        DemoAction rightJustifyAction = new DemoAction("Right", "Right justify text", 'R');
        DemoAction centerJustifyAction = new DemoAction("Center", "Center justify text", 'M');
        DemoAction fullJustifyAction = new DemoAction("Full", "Full justify text", 'F');

        JMenu formatMenu = new JMenu("RKG - MenuBar");
        formatMenu.add(leftJustifyAction);
        formatMenu.add(rightJustifyAction);
        formatMenu.add(centerJustifyAction);
        formatMenu.add(fullJustifyAction);

        menuBar.add(formatMenu);

        toolBar = new JToolBar("Formatting");
        toolBar.add(leftJustifyAction);
        toolBar.add(rightJustifyAction);
        toolBar.add(centerJustifyAction);
        toolBar.add(fullJustifyAction);

        toolBar.addSeparator();
        JLabel label = new JLabel("Font");
        toolBar.add(label);

        toolBar.addSeparator();
        JComboBox combo = new JComboBox(fonts);
        combo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    pane.getStyledDocument().insertString(
                            0,
                            "Font [" + ((JComboBox) e.getSource()).getSelectedItem() + "] chosen!\n",
                            null);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        toolBar.add(combo);

        //  Disable one of the Actions
        fullJustifyAction.setEnabled(true);
    }

    public static void main(String s[]) {
        try {

            PlotWindowDemo example = new PlotWindowDemo();
            example.pane = new JTextPane();
            example.pane.setPreferredSize(new Dimension(250, 250));
            example.pane.setBorder(new BevelBorder(BevelBorder.LOWERED));
            example.toolBar.setMaximumSize(example.toolBar.getSize());

            JFrame frame = new JFrame("RKG - Menu and ToolBar Sample");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setJMenuBar(example.menuBar);
            frame.getContentPane().add(example.toolBar, BorderLayout.NORTH);
            frame.getContentPane().add(example.pane, BorderLayout.CENTER);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(frame);
            frame.pack();
            frame.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlotWindowDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PlotWindowDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PlotWindowDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PlotWindowDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    class DemoAction extends AbstractAction {

        public DemoAction(String text, String description, char accelerator) {
            super(text);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accelerator,
                    Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            putValue(SHORT_DESCRIPTION, description);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                pane.getStyledDocument().insertString(0,
                        "Action [" + getValue(NAME) + "] performed!\n", null);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

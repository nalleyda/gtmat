/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package properties;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
/**
 *
 * @author Taylor
 */
public class CurrentDirectoryPanel extends JPanel{
    JPanel historyPanel;
    JTextField numRecentDirectories;
    JLabel history;
    JButton clearHistory;

    JPanel workingDirectoryPanel;
    JButton changeDefault;
    JLabel chooseDefault;
    JLabel currentDefault;


    public CurrentDirectoryPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        historyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numRecentDirectories = new JTextField(2);
        numRecentDirectories.setHorizontalAlignment(JTextField.RIGHT);
        numRecentDirectories.setText(PropertyHandler.getProperty(PropertyHandler.NUM_RECENT_DIRECTORIES, "20"));
        history = new JLabel("Number of recent directories to save: ");
        clearHistory = new JButton("Clear History");
        JPanel histCenter = new JPanel();
        histCenter.add(history);
        histCenter.add(numRecentDirectories);
        historyPanel.add(histCenter);
        historyPanel.add(new JPanel().add(clearHistory));

        historyPanel.setBorder(BorderFactory.createTitledBorder("History"));

        workingDirectoryPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        chooseDefault = new JLabel("Default working directory: ");
        currentDefault = new JLabel(PropertyHandler.getDefaultWorkingDirectory());
        changeDefault = new JButton("..");
        workingDirectoryPanel.add(chooseDefault);
        workingDirectoryPanel.add(currentDefault);
        workingDirectoryPanel.add(changeDefault);
        workingDirectoryPanel.setBorder(BorderFactory.createTitledBorder("Working Directory"));

        MyListener m = new MyListener();
        changeDefault.addActionListener(m);
        clearHistory.addActionListener(m);

        setLayout(new BorderLayout()); //Using a border layout, since only the center component is auto-resized, it makes for a much nicer appearance.
        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));

        top.add(historyPanel);
        top.add(workingDirectoryPanel);
        add(top, BorderLayout.NORTH);
        
    }


    public static void main(String[] args) {
        PropertyHandler.initProperties();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new CurrentDirectoryPanel());
        f.pack();
        f.setVisible(true);
    }

    private class MyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == changeDefault) {
                JFileChooser jfc = new JFileChooser();
                jfc.setSelectedFile(new File(PropertyHandler.getDefaultWorkingDirectory()));
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int i = jfc.showOpenDialog(new JFrame());
                if(i == JFileChooser.APPROVE_OPTION) {
                    PropertyHandler.setDefaultWorkingDirectory(jfc.getSelectedFile().toString());
                    currentDefault.setText(jfc.getSelectedFile().toString());
                }
            } else if(e.getSource() == clearHistory) {
                PropertyHandler.clearRecentDirectories();
            } else if(e.getSource() == numRecentDirectories) {
                PropertyHandler.setProperty(PropertyHandler.NUM_RECENT_DIRECTORIES, numRecentDirectories.getText());
            }

        }
    }
}

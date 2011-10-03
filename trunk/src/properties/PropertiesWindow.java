package properties;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.*;
@SuppressWarnings("serial")
public class PropertiesWindow extends JPanel {
	public static final String FONT = "Font";
	public static final String CURRENT_DIRECTORY = "Current Directory";
	JSplitPane pane;
	JTree propertiesSelector;
	JPanel left;
	JPanel right;
	JFrame container;
	CardLayout cardLayout;
	JPanel south;
	JButton ok;
	JButton cancel;
	JButton apply;

        public static PropertiesWindow open() {
            	JFrame f = new JFrame("Preferences");
		PropertiesWindow pw = new PropertiesWindow(f);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.add(pw);
		f.pack();
		f.setVisible(true);
                return pw;
        }

        public static void openFirstTime() {
            PropertiesWindow pw = new PropertiesWindow(new JFrame());
        }

        public void setVisible() {
            container.setVisible(true);
        }

	/**
	 * Constructor for the properties window.
	 * @param container The containing element, used for closing the frame.
	 */
	public PropertiesWindow(JFrame container) {
		setLayout(new BorderLayout());
		ok = new JButton("OK");
		cancel = new JButton("Cancel");
		apply = new JButton("Apply");
		south = new JPanel();
		south.add(ok);
		south.add(cancel);
		south.add(apply);
		ChangeListener cl = new ChangeListener();
		ok.addActionListener(cl);
		cancel.addActionListener(cl);
		apply.addActionListener(cl);
		this.container = container;
		pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		createLeftPanel();
		createRightPanel();
		pane.add(new JScrollPane(left));
		pane.add(new JScrollPane(right));
		add(pane, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
	}

	/**
	 * Creates the JTree on the left.
	 */
	private void createLeftPanel() {
		left = new JPanel();
		Object[] treeHeirarchy = { "root", FONT, CURRENT_DIRECTORY };
		propertiesSelector = new JTree(processHierarchy(treeHeirarchy));
		propertiesSelector.addTreeSelectionListener(new TreeListener());
		propertiesSelector.setRootVisible(false);
		left.add(propertiesSelector);
	}

	/**
	 * Creates the cardLayout on the right.
	 */
	private void createRightPanel() {
		cardLayout = new CardLayout();
		right = new JPanel(cardLayout);
		right.add(new FontPanel(), FONT);
		right.add(new CurrentDirectoryPanel(), CURRENT_DIRECTORY);
		cardLayout.show(right, FONT);
	}

	
	/**
	 * Method to process an Object[] into a DefaultMutableTreeNode.
	 * @param hierarchy the Object[] to process, with leaves as Strings, and branches as Object[], with the root as the first String in the Object[]
	 * @return the DefaultMutableTreeNode to add to the JTree.
	 */
	private DefaultMutableTreeNode processHierarchy(Object[] hierarchy) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(hierarchy[0]);
		DefaultMutableTreeNode child;
		for (int i = 1; i < hierarchy.length; i++) {
			Object nodeSpecifier = hierarchy[i];
			if (nodeSpecifier instanceof Object[])
				child = processHierarchy((Object[]) nodeSpecifier);
			else
				child = new DefaultMutableTreeNode(nodeSpecifier);
			node.add(child);
		}
		return node;
	}

	/**
	 * Close the window.
	 */
	public void close() {
		container.dispose();
	}

	/**
	 * This class listens for changes to the JTree, and then changes what the CardLayout is showing based on the change.
	 * @author Taylor Hope
	 * @version 1.0 5/30/2011
	 */
	private class TreeListener implements TreeSelectionListener {
		
		/**
		 * Fires when the tree selection is changed.  Updates the cardLayout to show the user's selection.
		 * @param tse the TreeSelectionEvent that is fired.
		 */
		@Override
		public void valueChanged(TreeSelectionEvent tse) {
			cardLayout.show(right, propertiesSelector
					.getLastSelectedPathComponent().toString());
		}

	}

	/**
	 * This class listens for the user pressing the ok, cancel or apply buttons, and acts accordingly.
	 * @author Taylor Hope
	 * @version 1.0 5/30/2011
	 */
	private class ChangeListener implements ActionListener {
		
		/**
		 * Fires when the user presses either ok, cancel or apply, and acts accordingly.
		 * @param e the ActionEvent fired.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == ok) {  //Store the data and close.
				PropertyHandler.store();
                                Main.getGT_Mat().updateAttrs();
                                Main.interactions.reload();
				close();
			} else if (e.getSource() == cancel) {  //Close and dispose of changes.
				PropertyHandler.disposeOfChanges();
				close();
			}
			else if (e.getSource() == apply) //Just make the changes, don't close the window.
				PropertyHandler.store();
		}
	}

}

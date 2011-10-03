package properties;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
@SuppressWarnings("serial")
public class FontPanel extends JPanel{
	JTree tree;
	JLabel fontLabel;
	JComboBox fontList;
	JComboBox fontStyle;
	JComboBox fontSize;
	JScrollPane fontPane;
	JLabel testFont;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //Grab a list of all fonts supported by the machine.
	String[] fontSizes = new String[] {"8","9","10","11","12","14","18","24","36","48"};
	String[] fontTypes = new String[] {"Plain", "Bold", "Italic", "Bold Italic"};
	
	/**
	 * Constructor for the font panel
	 */
	public FontPanel() {
		setLayout(new BorderLayout());
		PropertyHandler.initProperties();
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		fontLabel = new JLabel("Font: ");
		fontList = new JComboBox(fonts);
		fontList.setEditable(false);
		fontList.setSelectedItem(PropertyHandler.getProperty(PropertyHandler.FONT_NAME, "Monospaced"));
		fontStyle = new JComboBox(fontTypes);
		fontStyle.setEditable(false);
		fontStyle.setSelectedItem(PropertyHandler.getProperty(PropertyHandler.FONT_STYLE, "Plain"));
		fontSize = new JComboBox(fontSizes);
		fontSize.setSelectedItem(PropertyHandler.getProperty(PropertyHandler.FONT_SIZE, "12"));
		testFont = new JLabel();
		testFont.setText("The quick brown fox jumps over the lazy dog. 1234567890");
		testFont.setFont(PropertyHandler.getFont());
		north.add(fontLabel);
		north.add(fontList);
		north.add(fontStyle);
		north.add(fontSize);
		center.add(testFont);
		center.setPreferredSize(new Dimension((int)(screenSize.width*.6),(int)(screenSize.height*.3)));
		center.setBorder(BorderFactory.createTitledBorder("sample"));
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		ChangeListener cl = new ChangeListener();
		fontList.addActionListener(cl);
		fontStyle.addActionListener(cl);
		fontSize.addActionListener(cl);
	}
	
	/**
	 * Listener for changes to font name, style and size.  Propagates changes to the PropertyHandler.
	 * @author Taylor Hope
	 * @version 1.0 5/30/2011
	 */
	private class ChangeListener implements ActionListener {
		/**
		 * Method to deal with changes to the font properties.
		 * @param e the event that was fired
		 */
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == fontList)
				PropertyHandler.setProperty("Font Name",
						(String) fontList.getSelectedItem());
			else if (e.getSource() == fontStyle)
				PropertyHandler.setProperty("Font Style",
						(String) fontStyle.getSelectedItem());
			else if (e.getSource() == fontSize)
				PropertyHandler.setProperty("Font Size",
						(String) fontSize.getSelectedItem());
			testFont.setFont(PropertyHandler.getFont());

		}
		
	}
}

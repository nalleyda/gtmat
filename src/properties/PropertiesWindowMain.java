package properties;

import javax.swing.JFrame;
import javax.swing.UIManager;
public class PropertiesWindowMain {

	public static void main(String[] args) {
		try{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {}
	}
}

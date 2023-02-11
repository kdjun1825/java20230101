import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class NumFrame {

	public static void main(String[] args) {

		Frame mf = new Frame("MENU");
		mf.setSize(1920, 1080);
		mf.setLayout(null);
		mf.setBackground(Color.DARK_GRAY);
		mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mf.setUndecorated(true);
		mf.setVisible(true);
		
		
	}

}

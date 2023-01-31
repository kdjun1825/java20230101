package ex3.ui.frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_frame {
	public static void main(String[] args) {
		
		Frame frame = new Frame("나의 첫 프레임");
		frame.setSize(400, 300);
		frame.setLocation(500,200);
		
		frame.setBackground(Color.cyan);
		
		frame.setVisible(true);//화면에 프레임을 띄우자
		
		
	}
}

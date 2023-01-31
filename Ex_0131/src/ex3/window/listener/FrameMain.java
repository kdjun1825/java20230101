package ex3.window.listener;

import java.awt.Frame;

public class FrameMain {

	public static void main(String[] args) {

		Frame f = new Frame();
		
		f.setBounds(400, 200, 300, 300);
		
		//프레임에 우상단 버튼클릭을 감지하는 감지자를 부착
		f.addWindowListener(new Mylistener());
		
		
		
		f.setVisible(true);
		
		
	}

}

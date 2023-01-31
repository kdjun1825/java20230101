package ex3.window.listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Mylistener implements WindowListener{
	int exitCount = 0;

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		if (exitCount == 0) {
			System.out.println("한 번 더 누르면 종료");
			exitCount++;
		}else { 
			System.exit(0);
		}
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼 클릭");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래 사이즈로 돌아옴");
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	
	
	
}

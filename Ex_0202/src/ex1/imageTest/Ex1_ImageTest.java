package ex1.imageTest;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex1_ImageTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);
		
		
		ImageIcon img1 = new ImageIcon("cheetah.jpg");
		ImageIcon img2 = new ImageIcon("uncia.jfif");
		
		//imageicon을 추가할 수 있는 객체는 jlabel과 jbutton
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 10, 500, 500);
		
		
		//버튼생성
		JButton jb = new JButton();
		jb.setIcon(img1);
		jb.setBounds(250, 200, 50, 50);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
				f.repaint();
			}
		});
		
		
		
		f.add(jl);
		f.add(jb);
		
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			};
		});
		
		
		
		
		f.setVisible(true);
		
		
	}
}

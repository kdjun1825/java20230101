package ex1.imageTest;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);
		
		//�̹��� �غ�
		ImageIcon img1 = new ImageIcon("cheetah.jpg");
		ImageIcon img2 = new ImageIcon("uncia.jfif");
		
		//ImageIcon�� �߰��� �� �ִ� ��ü�� JLabel, JButton���̴�
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 0, 500, 500);
		
		//��ư����
		JButton btn = new JButton();
		btn.setIcon(img1);
		btn.setBounds(10, 50, 50, 50);
		
		//��ưŬ�� ����
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jl.setIcon(img2);
				f.repaint();//�������� ��ü������ ����
			}
		} );
		
		//f�� �̹����� ���� JLable�� �߰�
		f.add(btn);
		f.add(jl);
		
		f.addWindowListener( new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);//�����ִ� ��� �������� ����

			};

		} );
		
		f.setVisible(true);
		
	}//main
}

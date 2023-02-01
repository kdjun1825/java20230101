package ex1.button2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex1_Button {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 1000, 500);
		f.setVisible(true);//보이게
		f.setLayout(null);//자동배치 끄기
		
		Button btn1 = new Button("button1");
		btn1.setBounds(100, 200, 200, 100);
		Button btn2 = new Button("button2");
		btn2.setBounds(400, 200, 200, 100);
		Button btn3 = new Button("button3ㅁㄴㅇ");
		btn3.setBounds(700, 200, 200, 100);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		
		//버튼들에게 추가할 감시자 생성
		ActionListener click = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				
				
				switch (str) {
				case "button1":
					System.out.println("버튼 1을 클릭함");
					break;
				case "button2":
					System.out.println("버튼 2을 클릭함");
					break;
				case "button3ㅁㄴㅇ":
					System.out.println("버튼 3을 클릭함");
					System.out.println("종료함");
					System.exit(0);
					break;

				default:
					break;
				}
			}
		};
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);
		
		

		f.addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			};
		});
		
	}

}

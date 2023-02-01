package ex1.button2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex2_CheckBox2 {

	public static void main(String[] args) {

		Frame f = new Frame("quest");
		f.setBounds(500,200,800,250);
		f.setLayout(null);
		
		//폰트
		Font font = new Font("궁서체", Font.BOLD, 20);
		
		
		//고정텍스트를 보여주기
		Label question1 = new Label("취미가 뭔가요?");
		question1.setBounds(10, 50, 300, 50);
		question1.setBackground(Color.cyan);
		
		
		//각종 컴포넌트들을 f에추가
		f.add(question1);
		
		
		
		f.addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			};
		});
		
		
		
		
	}

}

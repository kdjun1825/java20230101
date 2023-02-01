package ex2.choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex2_Choice {

	public static void main(String[] args) {

		Frame f = new Frame("choice");
		f.setBounds(500, 200, 300, 200);
		// x, y, w, h
		f.setVisible(true);

		// Frame클래스는 추가된 컴포넌트(자식)을 화면에 가득 채우려고 하는 속성을 가지고있
		f.setLayout(null);// 자동배치를 끈다
		
		
		Choice day = new Choice();
		day.add("mon");
		day.add("thu");
		day.add("wen");
		day.add("thr");
		day.add("fri");
		day.add("sat");
		day.add("sun");
		day.setBounds(10, 40, 100, 0);
		
		
		//감지자 추가
		day.addItemListener( new Ex2_ChoiceListener());
		
		
		
		
		
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			};
		});
		
		f.add(day);

	}

}

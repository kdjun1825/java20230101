package ex2.choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex1_Choice {

	public static void main(String[] args) {

		String ss = "a TYPE";
		Frame f = new Frame();
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);
		f.setVisible(true);
		
		Choice bt = new Choice();
		bt.add("a");
		bt.add("b");
		bt.add("ab");
		bt.add("o");
		//초이스 객체 높이는 안에있는 요소 사이즈로 결정  0으로 해둬도 무관
		
		bt.setBounds(50, 70, 100, 0);
		
		Label res = new Label(ss);
		Font font = new Font("", Font.BOLD, 30);
		res.setFont(font);
		res.setBounds(250, 150, 200, 50);
		
		//혈액형 선택 choice객체 감지자 추가
		bt.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String ss = bt.getSelectedItem();
				
				res.setText(ss + "  TYPE");
				
			}
		});
		
		
		
		//컴포넌트를 프레임에 추가
		f.add(bt);
		f.add(res);
		
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			};
		});

	}

}

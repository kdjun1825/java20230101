package ex1.button2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex2_CheckBox {

	public static void main(String[] args) {

		Frame f = new Frame("quest");
		f.setBounds(500,200,800,500);
		f.setLayout(null);
		
		//폰트
		Font font = new Font("궁서체", Font.BOLD, 20);
		
		
		//고정텍스트를 보여주기
		Label question1 = new Label("favorite sports?");
		question1.setBounds(10, 50, 300, 50);
		question1.setBackground(Color.cyan);
		
		
		//체크박스의 선탯을 감지하는 감지자
		ItemListener check_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				String res = "";
				switch (str) {
				case "basketball":
					res = e.getStateChange() == 1 ? "basketball check" : "basketball uncheck";
					break;
				case "cycle":
					res = e.getStateChange() == 1 ? "cycle check" : "cycle uncheck";
					break;
				case "football":
					res = e.getStateChange() == 1 ? "football check" : "football uncheck";
					break;

				default:
					break;
				}
				System.out.println(res);
			}
		};
		
		
		
		//체크박스생성
		Checkbox basketball = new Checkbox("basketball");
		Checkbox cycle = new Checkbox("cycle");
		Checkbox football = new Checkbox("football");
		
		basketball.setBounds(10, 100, 50, 50);
		cycle.setBounds(70, 100, 50, 50);
		football.setBounds(130, 100, 500, 50);
		
		//체크박스 이벤트 등록
		basketball.addItemListener(check_click);
		cycle.addItemListener(check_click);
		football.addItemListener(check_click);
		
		
		Label question2 = new Label("gender?");
		question2.setBounds(10, 150, 300, 50);
		
		//라디오의 선탯을 감지하는 감지자
		ItemListener radio_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
			}
		};
		
		//radio버튼
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("male", group, false);
		male.setBounds(10, 200, 50, 50);
		Checkbox female = new Checkbox("female", group, false);
		female.setBounds(70, 200, 70, 50);
		
		
		female.addItemListener(radio_click);
		male.addItemListener(radio_click);
		
		
		
		
		
		
		//각종 컴포넌트들을 f에추가
		f.add(question1);
		f.add(basketball);
		f.add(cycle);
		f.add(football);
		f.add(question2);
		f.add(male);
		f.add(female);
		f.addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			};
		});
		f.setVisible(true);

		
		
		
	}

}

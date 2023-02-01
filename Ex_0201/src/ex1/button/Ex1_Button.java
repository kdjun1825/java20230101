package ex1.button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import com.sun.glass.events.WindowEvent;

public class Ex1_Button {

	public static void main(String[] args) {

		Frame f = new Frame("ButtonTest");
		f.setBounds(500, 400, 400, 400);
		//x,  y,   w,   h
		f.setVisible(true);
		
		//Frame클래스는 추가된 컴포넌트(자식)을 화면에 가득 채우려고 하는 속성을 가지고있
		f.setLayout(null);//자동배치를 끈다
		
		//버튼 생성
		//자동배치가 꺼져있는 Frame에 들어가게 될 자식 컴포넌트들은 
		//반드시 위치와 크기값이 설정되어 있어야 한다.
		Button btnOk = new Button("OK");
		btnOk.setBounds(70, 90, 100, 50);
		Button btnClose = new Button("Close");
		btnClose.setBounds(230, 90, 100, 50);
	
		//만들어둔 버튼들에 대해서 이벤트 감지자 추가
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();//프레임종료
			}
		});
		
		
		//생성된 버튼을 d에 추가
		f.add(btnOk);
		f.add(btnClose);
		
		f.addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			};
		});
		
		
	}

}

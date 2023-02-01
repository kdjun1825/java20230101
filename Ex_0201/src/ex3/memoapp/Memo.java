package ex3.memoapp;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import sun.net.www.content.text.plain;

public class Memo {

	public static void main(String[] args) {

		Frame f = new Frame("MEMO");
		f.setBounds(500, 200, 250, 400);
		// x, y, w, h

		// Frame클래스는 추가된 컴포넌트(자식)을 화면에 가득 채우려고 하는 속성을 가지고있
		f.setLayout(null);// 자동배치를 끈다
		f.setBackground(Color.DARK_GRAY);
		
		
		Font font = new Font("", Font.PLAIN, 20);
		
		//상단에 자리잡을 컴포넌트들
		TextField tf = new TextField();
		tf.setBounds(15, 40, 180, 20);
		
		Button btn = new Button("ok");
		btn.setBounds(200, 40, 35, 20);
		//-----------상단컴포넌트
		
		//중앙 컴포넌트--
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 300);
		ta.setFont(font);
		ta.setEditable(false);
		
		//--중앙컴포넌트
		
		//하단 컴포넌트--
		Button btnSave = new Button("save");
		btnSave.setBounds(25, 350, 90, 40);
		Button btnClose = new Button("close");
		btnClose.setBounds(135, 350, 90, 40);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		
		//--하단컴포넌트
		
		
		
		
		
		//frame에 컴포넌트들 추가
		f.add(tf);
		f.add(btn);
		f.add(ta);
		f.add(btnSave);
		f.add(btnClose);
		
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			};
		});
		
		
		f.setVisible(true);
	}

}

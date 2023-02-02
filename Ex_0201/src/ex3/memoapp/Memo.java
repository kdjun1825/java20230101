package ex3.memoapp;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

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
		btn.setEnabled(false);
		//-----------상단컴포넌트
		
		//중앙 컴포넌트--
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 230, 270);
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
		
		//TextField(tf)에 값이 있는 경우에만 ok버튼을 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				//공백이거나 아무것도 안넣거나
				if(  tf.getText().trim().length() == 0) {
					
					btn.setEnabled(false);//버튼비활성화
					
				}else {
					
					btn.setEnabled(true);//버튼 활성화
					
				}
				
			}
			
		});
		
		
		//ok버튼 클릭시 tf의 내용을 ta에 추가
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ta.append(tf.getText() + "\n");
				
				
				//입력이 완료 되면 field내용 비우기
				tf.setText("");
				
				//비우고 커서를 field로 옮기기
				tf.requestFocus();
				
			}
		});
		
		
		//enter key를 쳤을 때 텍스트 입력 시키기
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					
					ta.append(tf.getText() + "\n");
					
					
					//입력이 완료 되면 field내용 비우기
					tf.setText("");
					
					//비우고 커서를 field로 옮기기
					tf.requestFocus();
					
				}
				
			}
			
		});
		
		
		//저장 버튼 클릭시 이벤트
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String msg = ta.getText();
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
				
					FileDialog fd = new FileDialog(f, "SAVE", FileDialog.SAVE);
					fd.setVisible(true);//팝업 창 활성화 
					
					String path = fd.getDirectory() + fd.getFile();
					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(msg);//ㅍ파일 생성
					bw.flush();
					
					//저장,취소했을 때 알림
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(f, "seuccess SAVE");
						//f 위에 "" 알림창
					}
					
					System.out.println(fd.getFile());
					
				} catch (Exception e2) {
					// TODO: handle exception
				}finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
		
		
		
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

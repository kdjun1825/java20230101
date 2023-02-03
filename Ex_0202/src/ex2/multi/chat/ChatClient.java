package ex2.multi.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable{

	String pw = "asdfsadfasdf2jr289gh";
	JTextArea  area;
	JTextField input;
	JButton send_bt;
	
	//서버접속을 위한 객체
	Socket s;
	BufferedReader in = null;
	PrintWriter out = null;
	Thread t;
	
	
	public ChatClient() {
		
		setBounds(100,100,400,500);
		setLayout(null);
		
		area = new JTextArea();
		area.setBounds(10,20,360,360);
		
		input = new JTextField();
		input.setBounds(10, 395, 250, 50);
		
		send_bt = new JButton("SEND");
		send_bt.setBounds(270, 395, 100, 50);
		
		//현재 클라이언트를 서버에 접속
		connected();
		
		//전송버튼 클릭 시 서버에 데이터 전송 하는 감지자
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendDate();//서버로 메시지 전달하기 메서드 호출
			}

			
		});
		
		
		t = new Thread(this);//runnable에서 정의한 이 클래스 안의 run매서드
		t.start();
		
		
		add(area);
		add(input);
		add(send_bt);
		
		
		//사이즈변경 불가
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				//x버튼을 눌러서 종료하기 전에 서버와의 접속을 해제
				out.println("asdfsadfasdf2jr289gh");

			}
		});
		
		
		setVisible(true);
		
	}
	
	
	
	private void connected() {
		
		try {
			
			s = new Socket("192.168.111.7", 3500);
			
			//서버에서 넘어온 값을 읽어들이기 위한 inputstream
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//문자열을 서버로 전송하기 위한 스트림
//			PrintWriter out = null;
			out = new PrintWriter(s.getOutputStream(), true); //true 로 flush까지 하기 
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	private void sendDate() {
		
		String msg = input.getText();
		out.println(msg);
		input.setText("");
		
	}
	
	

	@Override
	public void run() {
		
		//서버로부터 전달되는 메시지를 기다린다
			
			try {
				while(true) {
					
					String msg = in.readLine();
					
					if(msg.equals("asdfsadfasdf2jr289gh")) {
						
						break;
						
					}
					
					
					if(msg != null) {
						area.append(msg + "\n");
					}
				}	
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					out.close();
					in.close();
					s.close();
					System.exit(0);
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		
	}

	
	
	
	
}

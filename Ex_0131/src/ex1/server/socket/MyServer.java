package ex1.server.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	
	ServerSocket ss;
	
	public MyServer() {
		
		try {
			
			//포트 지정
			ss = new ServerSocket(3000);	
			System.out.println("서버 준비 완료");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			
		
		try {
				//접속한 클라이언트의 정보를 서버가 accept메서드로 받아서 s객체에 넘겨준다.
				Socket s = ss.accept();
				//접속자의 ip가져오기
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

}

package ex2.multi.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread{

	ServerSocket ss;
	public ChatServer() {
		
		try {
			
			ss = new ServerSocket(3500);
			System.out.println("server ready");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void run() {

		while (true) {

			try {
				Socket s = ss.accept();//클라이언트를 기다림
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " 님 접속!!!");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
}

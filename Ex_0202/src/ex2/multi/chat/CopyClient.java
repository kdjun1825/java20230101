package ex2.multi.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {

	
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;
	ChatClient c;
	
	public CopyClient(Socket s, ChatServer cs) {
		//생성자를 통해 원본 클라이언트의 소켓정보 및 서버정보를 받는다

		this.s = s;
		this.server = cs;
		
		
		try {
			
			out = new PrintWriter(s.getOutputStream(), true);	//쓰기   TURE는 자동으로 flush
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//run메서드 오버라이딩
	@Override
	public void run() {

		try {
			
			while(true) {
				
				String msg = in.readLine();
				if(msg.equals("asdfsadfasdf2jr289gh")) {
					out.println("asdfsadfasdf2jr289gh");
					server.removeClient(this);//접속 종료 시 서버에 말해줌
					break;
				}
				
				server.sendMessage(ip + " : " + msg);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
}

package ex2.multi.chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{

	ServerSocket ss;
	
	//복사된 클라이언트를 담아줄 ArrayList준비 
	ArrayList<CopyClient> list;
	
	
	public ChatServer() {
		
		try {
			
			list = new ArrayList<CopyClient>();
			
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
				System.out.println(ip + " connect!!!");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);//cc로 add하고 다음 사람이 들어오면  기존 cc은 add되어있기 때문에 기억하고있다 
				cc.start();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
	//메시지 전달 메서드
	public void sendMessage(String msg) {
		
		//접속자들은 CopyClient상태로 ArrayList에 저장 되어있는 상태
		for(CopyClient cc : list) {
			
			cc.out.println(msg);//서버에 접속해있는 모든 접속자들에게 메시지를 전달
			
		}
		
		
	}
	
	
	//종료된 사용자를 ArrayList에서 제거
	public void removeClient(CopyClient cc) {
		
		list.remove(cc);//접속종료된 사용자 제거
		
		//남아있는 사용자들에게 메시지 전달
		sendMessage("***" + cc.ip + " disconnect!! ");
		
	}
	
	
	
	
	
	
}

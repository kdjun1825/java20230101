package ex5.work2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import ex3.object.output.Person;

public class RspMain {

	public static void main(String[] args) {

		/*
			id:aaa
			0승0무0패
			
			가위(s), 바위(r), 보(p):
			당신이 이겼습니다
			1승0무0패
			한 판 더? y|n : n
			종료
			
			
			id:aaa
			1승0무0패
			게임~~~~
			~~~
	
	
	
			아이디 입력
			있는지 조회
			없으면 만들기
			0/0/0
			있으면 맞는  값 출력
			ex)1/2/1
			
		 */
		
		Scanner sc = new Scanner(System.in);
		Rsp rsp  = new Rsp();
		String id = sc.next();
		rsp.setId(id);
		
		
		String path = "C:\\Users\\Cheetah\\embedded_kdj/Rsp.kdj";
		
		
		//객체를 통째로 출력하는데 사용하는 outputstream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(rsp);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}

}

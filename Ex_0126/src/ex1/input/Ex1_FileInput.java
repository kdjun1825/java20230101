package ex1.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.MyPath;

public class Ex1_FileInput {

	public static void main(String[] args) {

		String path = MyPath.PATH + "/test.txt";//자주 사용하는 경로 인터페이스에 상수로 선언했음!
		
		File f = new File(path);
		
		
		//접근 경로가 문제가 없으면 true
		if(f.exists()) {
			
			//파일 클래스와 연결된 InputStream을 생성
			//파일을 찾을 수 없을 수도 있기 때문에 try/catch
			try {
				
				FileInputStream fis = new FileInputStream(f);
				
				int code = -1;
				
				//inputstream은 1byte단위로 값을 가져온다  읽다 읽다가 끝까지 가서 읽을 게 없으면 -1이 된다 즉, 끝까지 읽으라는 뜻
				//한글은 2byte인데... 그래서 이상하게 나옴..
				//
				while( (code = fis.read()) != -1 ) {
					
					System.out.print((char)code);
					
				}
				
				//사용이 완료된 스트림은 반드시 닫아줘야 한다.
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}

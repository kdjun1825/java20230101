package ex2.charInput;

import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {

	public static void main(String[] args) {

		FileReader fr = null;
		
		
		try {
			
			fr = new FileReader("C:\\Users\\Cheetah\\embedded_kdj/test.txt");
			
			int code = -1;
			
			while( (code = fr.read()) != -1 ) {
				//기본적으로 2byte문자인 한글등을 유니코드 형태로 읽어오는 것이 가능하므로   byte[]	을 만들 필요가 없다
				System.out.print((char)code);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				
				fr.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}

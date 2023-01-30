package ex1.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_BufferedFileOutput {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\Users\\Cheetah\\embedded_kdj/bos의 예제.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "buffered스트림의 예제";
			bos.write(str.getBytes());
			
			bos.flush();//내용을 물리적으로 기록하기 위한 메서드
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				
				
				bos.close();//bos에서 fos를 참조하며 기록을 하는데 fos를 먼저 닫아버리면 실행되지 않는다. 역순으로 닫자!
				fos.close();
				
			} catch (IOException e2) {
				
				e2.printStackTrace();
			}
			
		}
		
		
	}

}

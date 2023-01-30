package ex1.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ex2_FIleOutput {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		String path = "C:\\Users\\Cheetah\\embedded_kdj/fileOutput예제.txt";
		
		File f = new File(path);
		
		try {
			
			fos = new FileOutputStream(f, true);//true면 기존에서 추가가 된다
			String msg = "파일 아웃풋 스트림의 ex입니다. 기존의 파일은 지워지고 다시 생성됩니다~";
			String msg2 = "\n fileoutputStream예제 ";
			
			
			//String 타입의 문장을 byte[] 로 변경해주는 메서드
			 fos.write(msg.getBytes());
			 fos.write(msg2.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			try {
				
				fos.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}

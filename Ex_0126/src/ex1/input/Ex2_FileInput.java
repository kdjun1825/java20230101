package ex1.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import util.MyPath;

public class Ex2_FileInput {

	public static void main(String[] args) {

		String path = MyPath.PATH + "/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int) f.length()];
		System.out.println(f.length());
		
		try {
			
			if(f.exists()) {
				
				fis = new FileInputStream(f);
			
				
				//fis가 1byte씩 읽은 내용을 b_read에 순차적으로 저장
				//
				fis.read(b_read);
				
				//배열을 출력가능한 String 타입으로 변환 해야한다.
				String res = new String(b_read);
				System.out.println(res);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {

			//try를 진행하던 도중 중도 오류가 나면 close 가 안되서 finally 에 넣는다.
			try {
				
				fis.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
			
	}

}

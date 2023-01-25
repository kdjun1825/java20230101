package ex2.io.file;

import java.io.File;

public class Ex2_File {

	public static void main(String[] args) {

		String path = "E:\\embeded_kdj";
		File f = new File(path);
		
		//f가 접근한 path경로가 폴더일 경우 true
		if(f.isDirectory()) {
			
			System.out.println("하위 목록----" );
			
			//f가 접근한 폴더의 하위 내용들의 이름을 모아두는 메서드
			//파일이 몇개 있을지 모르니 배열로 받아야 된다.
			String[] str =  f.list();
			
			for(int i = 0; i < str.length; i++) {
				
				System.out.println(str[i]);
				
			}
			
		}
		
		
	}

}

package ex2.io.file;

import java.io.File;

public class Ex4_File {

	public static void main(String[] args) {

		String path = "E:\\embeded_kdj";
		File f = new File(path);
		
		//1차 적으로  접근하는 경로가 폴더 경로인지 확인!
		if(f.isDirectory()) {
			
			//접근하는 경로의 하위 목록들을 File클래스 구조로 받을것.
			File[] fileArr =  f.listFiles();
			
			
			//하위 목록들을 출력하되, 폴더 구조만 보여주기
			for(int i = 0; i < fileArr.length; i++) {
				
				//폴더인지 확인 후 출력
				if(fileArr[i].isDirectory()) {
					
					System.out.println(fileArr[i].getName());
					
				}
					
			
			}
			
			
		}
		
		
	}

}

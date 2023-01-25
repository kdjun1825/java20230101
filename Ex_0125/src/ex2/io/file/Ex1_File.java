package ex2.io.file;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
			/*
				IO(input,output
				입출력 스트림
				스트림: 데이터를 입출력하기 위한 통로
				콘솔(c:, d:, 키보드)에서
				JVM의 데이터를 콘솔로 내보내는 등의 작업을 할 수 있도록 하는 클래스들
				
			 */
		
		String path = "E:\\embeded_kdj/test.txt";
		File f1 = new File(path);	//특정 경로로 접근하기 위한 클래스
		
		
		//f1이 접근한 경로가 파일 형식일 경우 true
		//폴더 형식일 경우 false
		if(f1.isFile()) {
			
			System.out.println("용량  " + f1.length());
			
			
		}
		
		
		
	}

}

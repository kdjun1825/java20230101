package ex2.io.file;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {

		String path = "E:\\embeded_kdj/aaa/bbb";
		
		
		File f = new File(path);
		
		
		//파일 경로가 물리적으로 존재하지를 확인하는 메서드
		if(f.exists()) {
			System.out.println("맞습니다!");
		}else {
			System.out.println("존재하지 않습니다");
//			f.mkdir();///폴더 생성
			f.mkdirs();//폴더들 생성 (1개도 가능해서 dirs만 사용해도 됨
			
		}
		
	}

}

package ex2.charOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_fileWriter {

	public static void main(String[] args) {

		FileWriter fr = null;
		
		try {
			//fileReader는 기본적으로 2byte를 지원하기 때문에 getBytes(	를 통해 바이트 배열로 안해도 기록이 가능
			fr = new FileWriter("C:\\Users\\Cheetah\\embedded_kdj/fileWriter의 예제.txt");
			
			String str = "첫째 줄 \n";
			
			String str2 = "secondline";
			
			fr.write(str);
			fr.write(str2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}

}

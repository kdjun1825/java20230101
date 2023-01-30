package ex2.charOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2_BufferedWriter {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			
			fw  = new FileWriter("C:\\Users\\Cheetah\\embedded_kdj/버퍼라이터예제.txt");
			bw = new BufferedWriter(fw);
			
			String str = "안녕 난 bufferedWriter";
			String str2 = "안녕 난 2번째 bufferedWriter";
			
			bw.write(str);
			bw.newLine();
			bw.write(str2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			
			try {
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

}

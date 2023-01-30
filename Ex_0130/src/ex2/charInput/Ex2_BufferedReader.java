package ex2.charInput;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2_BufferedReader {

	public static void main(String[] args) {

		FileReader fr  = null;
		BufferedReader br = null;
		
		
		try {
			
			fr = new FileReader("C:\\Users\\Cheetah\\embedded_kdj/test.txt");
			br = new BufferedReader(fr);
			
			String msg = "";
			
			
			//한 줄을 읽어서 문장으로 저장
			while( (msg = br.readLine()) != null  ) {
			
				System.out.println(msg);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
			
		}finally {
			
			try {

				br.close();
				fr.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
			
			
		}
		
		
	}

}

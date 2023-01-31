package ex5.work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamWork {

	public static void main(String[] args) {

		/*
			byte기반의 스트림을 사용
			아무경로에 file.txt만들고 저장
			읽어서 회문수 판단
		
		 */

		String path = "C:\\Users\\Cheetah\\embedded_kdj\\txtfile/bytework.txt";

		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {

			if (f.exists()) {

				fis = new FileInputStream(f);

				// 단독 사용 불가
				bis = new BufferedInputStream(fis);

				bis.read(b_read);
				String res = new String(b_read);
				System.out.println(res);
				
				int i = 0;
				int half = res.length() / 2;	//half = 2
				
				for(i = 0; i < half; ) {		//i 0~1
					char c = res.charAt(i);		// i a i b
					int index = res.lastIndexOf(c);	
					if(index == res.length() - i - 1) {
						i++;
					}else {
						break;
					}
					
				}
				
				if(i == half) {
					System.out.println("회문수입니다.");
				}else {
					System.out.println("회문수아닙니다.");
					
				}

			}

		} catch (Exception e) {

			// TODO: handle exception

		} finally {

			try {
				// 역순으로 닫자!
				bis.close();
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

/*		 
 	
  
		 */
		
		
		
	}

}

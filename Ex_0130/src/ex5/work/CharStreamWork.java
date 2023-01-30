package ex5.work;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharStreamWork {

	public static void main(String[] args) {

		/*
		
			특정경로의 char.txt파일을 만들고 아무 내용이나 넣는다
			char.txt를 읽어서 내용에 알파바ㅔㅅ 대문자와 소문자 갯수를 각각 출력
			
			ㄷ
		
		 */

		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader("C:\\Users\\Cheetah\\embedded_kdj\\txtfile/charwork.txt");
			br = new BufferedReader(fr);

			int code = -1;

			int ACount = 0;
			int aCount = 0;
			
				
				while ((code = fr.read()) != -1) {
					// 기본적으로 2byte문자인 한글등을 유니코드 형태로 읽어오는 것이 가능하므로 byte[] 을 만들 필요가 없다
					if ( code >= 'a' && code <= 'z') {
						aCount++;
					}else if ( code >= 'A' && code <= 'Z') {
						ACount++;
					}
				}
				System.out.println("소문자의 개수는 : " + aCount + " 개 입니다.");
				System.out.println("대문자의 개수는 : " + ACount + " 개 입니다.");
				
				

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}

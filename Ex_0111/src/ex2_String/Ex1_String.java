package ex2_String;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {
		//주민번호
		//001223-
		//당시능ㄴ 00ㅇ년00월 00일 에 태어났습니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주빈번호입력");

		
		String id = sc.next();
		if(id.trim().length() < 14 || id.trim().charAt(6) != ('-')) {
			
			System.out.println("주빈번호 입력 형식이 맞지 않습니다");
		}else {
			
			//년월일 01, 23, 45 자리 
			
			//남녀 확인 = 7
			
		}
		
	}

}

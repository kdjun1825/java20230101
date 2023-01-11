package ex2_String;

import java.util.Scanner;

public class Ex3_work {

	public static void main(String[] args) {

		
		/*
		 * 회문수 판단 
		 * 앞으로일겅도 뒤로 읽어도 똑같은
		 * */

		
		Scanner sc = new Scanner(System.in);
		String sys = sc.next();
		int i = sys.length() / 2;
		//ex 가나다나가
		//0 4
		//1 3
		//i < 2
		
		System.out.println(sys.length());
		for(i = 0; i < sys.length() / 2; ) {
			System.out.println(i);
			char c = sys.charAt(i);
			//i = 0 : 가
			int index = sys.lastIndexOf(c);
			if(index == sys.length() - i - 1) {
				i++;
			}else {
				break;
			}
			
		}
		
		if(i == sys.length() / 2) {
			System.out.println("회문수입니다.");
		}else {
			System.out.println("회문수아닙니다.");
			
		}
		
		
		
	}

}

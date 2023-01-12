package ex2_String;

import java.util.Scanner;

public class Ex3_work2 {

	public static void main(String[] args) {

		
		/*
		 * 회문수 판단 
		 * 앞으로일겅도 뒤로 읽어도 똑같은
		 * */

		
		Scanner sc = new Scanner(System.in);
		String sys = sc.next();
		String rev = "";
		
		for( int i = sys.length() - 1; i >= 0; i--) {
			
			rev += sys.charAt(i);
			
		}
		
		
	}

}

package ex2_String;

import java.util.Scanner;

public class Ex2_work2 {

	public static void main(String[] args) {

		
		/*
		 *키보드로 아무값을 받고
		 *소문자 'a'의 갯수를 출력 
		 * */
		
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("문자열을 입력하시오");
		String s1 = sc.next();
		int count = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i) == 'a') {
				
				count++;
				
			}
				
			
		}
		System.out.println(count);
		
		
	}
}

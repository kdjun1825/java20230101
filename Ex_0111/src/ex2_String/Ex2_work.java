package ex2_String;

import java.util.Scanner;

public class Ex2_work {

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
			System.out.println(s1);
			int index = s1.indexOf('a');//첫번 쨰'o'가 몇번 째 index에 있는지
			
			if(index == -1) {
				
				 break;
				
			}else {
				
				s1 = s1.substring(index + 1);
				System.out.println(s1);
				count++;
				i--;
				
			}
			
		}
		if(count == 0) {
			System.out.println("'a'는 없습니다.");
		
		}else {
			
			System.out.println(count + "개");
		}
		
		
	}

}

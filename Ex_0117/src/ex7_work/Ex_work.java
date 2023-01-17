package ex7_work;

import java.util.Scanner;

public class Ex_work {

	public static void main(String[] args) {
		
		
		
		/*

		키보드에서 입력받은 값을
		암호표 대로 암호화 하시오
		값 : abc123
		결과 : `~!@wer

		 */
		Scanner sc = new Scanner(System.in);
		String a = "";
		String before = "abcdefghijklmnopqrstuvwxyz0123456789";
		String after  = "`~!@#$%^&*()-_+=|[]{};:,./qwertyuiop";
		boolean b = true;
	a:	while (b) {
			System.out.println("입력");
			String str = sc.next();
			for(int i = 0; i < str.length(); i++) {
				if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9') && !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
					System.out.println("대문자 쓰지 말아라");
					continue a;
				}	
				
			}
			
			
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < before.length(); j++) {
					if(str.charAt(i) == before.charAt(j)) {
						a += String.valueOf(after.charAt(j)) ;
						break;
					}
				}
			}
			
			System.out.println(a);
			break;
		}			
		
		
		
		
		
		
		
		
		
		
		
	}
}

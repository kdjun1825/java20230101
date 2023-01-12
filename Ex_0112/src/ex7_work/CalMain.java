package ex7_work;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {

		/*

		  수1수2연산자 를받고
		  메서드로 전달 후 결과 출력
		  
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		
		System.out.println("첫번째");
		int first = sc.nextInt();
		System.out.println("두번째");
		int second = sc.nextInt();
		System.out.println("연산자");
		String oper = sc.next();
		
		c1.getResult(first, second, oper);
				
				
		
		
	}

}

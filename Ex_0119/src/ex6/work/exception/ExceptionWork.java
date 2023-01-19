package ex6.work.exception;

import java.util.Scanner;

public class ExceptionWork {

	public static void main(String[] args) {

		/*
		 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		String sys = sc.next();
		try {
			Integer.parseInt(sys);
			System.out.println(sys);
		} catch (Exception e) {
			System.out.println(sys + " 는 정수가 아닙니다 ! 정수만 입력하세요");
		}
		
		
	}

}

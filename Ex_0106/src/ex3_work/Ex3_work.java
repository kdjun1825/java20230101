package ex3_work;

import java.util.Scanner;

public class Ex3_work {

	public static void main(String[] args) {

		/*

		 
		 키보드로 정수를 입력받고
		 받은 숫자가 소수인지 판단
		 1은 소수 아니라고 출력
		 
		 
		 10
		 5
		 
		 20
		 10
		 
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오.");
		int n1 = sc.nextInt();
		int count = 0;
		if(n1 == 1) {
			System.out.println("1은 소수가 아닙니다.");
		}else {
			
			for(int i = 1; i <= n1; i++) {
				
				if(n1 % i == 0) {
					count += 1;
				}
				
			}
			if(count == 2) {
				System.out.println(n1 + " 은 소수입니다.");
			}else {
				System.out.println(n1 + " 은 소수가 아닙니다.");
			}
		
			
		}
		System.out.println("정수값을 입력하시오.");
		int n2 = sc.nextInt();
		int i = 0;
		for(i = 2; i <= n2; i++) {
			
			if(n2 % i == 0) {
				break;
			}
			
		}
		
		if( i == n2 ) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}

		
		
	}

}

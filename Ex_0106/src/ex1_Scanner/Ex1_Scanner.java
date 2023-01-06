package ex1_Scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String res = sc.next();
		System.out.println(res + "을 입력했습니다");
		
		System.out.println("정수입력:");
		int n = sc.nextInt();
		System.out.println(n + "을 입력했습니다");
		
		
	}

}

package ex2_exception;

import java.util.Scanner;

public class Ex2_TryCatch3 {

	public static void main(String[] args) {

		/*

			키보드에서 입력받고 정수인지 아닌지 판단하세요
			//정수 :

		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		String sys = sc.next();
		try {
			Integer.parseInt(sys);
			System.out.println(sys);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("정수만 입력하세요");
		}
		
		
		try {
			int n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("정수만입력하세요");
			// TODO: handle exception
		}
		
	}

}

package ex5_thread;

import java.util.Scanner;

public class TMain {

	public static void main(String[] args) {

		/*
			키보드에서 값을 받고 1초에 1씩 감소되는 값을 출력하다가 0이 되었을 때 스레드 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요!");
		int n = sc.nextInt();
		T1 t1 = new T1(n);
		t1.start();
		
		
	}

}

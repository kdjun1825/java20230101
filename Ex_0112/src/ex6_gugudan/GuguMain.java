package ex6_gugudan;

import java.util.Scanner;

public class GuguMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단 :" );
		int dan = sc.nextInt();
		
		Gugu gu = new Gugu();
		gu.getGugu(dan);
		
		
	}

}

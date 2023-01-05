package ex6_random;

import java.util.Random;

public class Ex1_random {

	public static void main(String[] args) {

		
		// 난수를 만들어주는 클래스 Random
		Random rd = new Random();
		
		
		//1 ~ 3사이의 난수
		//괄호안에는 범위 즉 (끝수-시작수+1) , + 뒤에는 시작 수 
		int n = rd.nextInt(3) + 1	;
		System.out.println(n);
		System.out.println("--------------");

		
		//A~Z사이의 알파벳이 랜덤으로 출력되도록 하세요
		
		char c = (char) (rd.nextInt('Z'-'A' +1) + 'A');
		System.out.println(c);
	}

}

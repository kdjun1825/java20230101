package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {

	public static void main(String[] args) {

		/*
		 
		 1~9중 겹치지 않도록 숫자 세개를 만들어서 컴퓨터만 알고있는다.
		 com: 324
		 
		 수1:1
		 수2:5
		 수3:3
		 숫자는 같은데 자릿수가 같으면 ball
		 둘다 같으면 strike
		 
		 */

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int n1, n2, n3;
		int u1, u2, u3;

		//do while을 이용해 난수 생성 후 와일에서 조건식  조건 만족시 다시 do
		do {
				
			n1 = rnd.nextInt(9) + 1;
			n2 = rnd.nextInt(9) + 1;
			n3 = rnd.nextInt(9) + 1;
			
		}while(n1 == n2 || n2 == n3 || n3 == n1);
		System.out.println( ""+ n1+n2+n3);
		
		int count = 1 ;//몇번만의 정답을 맞추었는지 count 변수 선언
		
		while(true) {
			
		//사용자 입력값
		System.out.println("첫번째 숫자를 입력하시오");
		u1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		u2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력하시오");
		u3 = sc.nextInt();
		
		//스트라이크와 볼 갯수 저장
		int strike = 0;
		int ball = 0;
		
		//경우의 수 
		if(u1 == n1) {
			strike++;
		}else if(u1 == n2 || u1 == n3) {
			ball++;
		}
		if(u2 == n2) {
			strike++;
		}else if(u2 == n1 || u2 == n3) {
			ball++;
		}
		if(u3 == n3) {
			strike++;
		}else if(u3 == n1 || u3 == n2) {
			ball++;
		}

		
		//정답여부
		//정답과 정답이 아닌 경우
		if(strike == 3) {
			System.out.println("정답!");
			System.out.println(count + " 회 만에 정답");
			break;
		}else{
			if(strike == 0 && ball == 0) {
				System.out.println("out!");//아무것도 못맞추면 아웃  아웃이 아니면 힌트
			}else {
				System.out.println(strike + "strike " + ball + " ball");
				
			}
		}
		++count;
		System.out.println("----------------------------");
		
		}
		
		
	}

}

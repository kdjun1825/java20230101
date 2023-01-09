package ex3_work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		/*
		 이전에 제작한 숫자야구 게임을 배열을 사용하여 코드를 줄여보자
		 
		 
		  */
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] sys = new int[3];
		int[] user = new int[3];

		//1~9까지의 난수 생성
		for(int i = 0; i < sys.length; i++) {
			
			sys[i] = rnd.nextInt(9) + 1;
			// 중복제거 후 다시 생성
			for( int j = 0;  j < i; j++ ) {
				
				if(sys[j] == sys[i]) {
					
					--i;
					break;
					
				}
				
			}
			
		}
		//sys 숫자 출력
		System.out.println(Arrays.toString(sys));
		int count = 1 ;//몇번만의 정답을 맞추었는지 count 변수 선언

		while (true){
			
		for(int i = 0; i < user.length; i++) {
			
			System.out.println((i+1) + " 번째 숫자를 입력하시오");
			user[i] = sc.nextInt();
			
			for( int j = 0;  j < i; j++ ) {
				
				if(user[j] == user[i]) {
					System.out.println("중복입니다 ");
					
					--i;
					break;
					
				}
				
			}
			
		}
		int strike = 0;
		int ball = 0;
		//경우의 수 
		
		for(int i = 0; i < sys.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(user[j] == sys[i]) {
					if(j == i) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		
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

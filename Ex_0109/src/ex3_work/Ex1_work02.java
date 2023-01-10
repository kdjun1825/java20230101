package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_work02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		
		int [] com = new int[3];	//컴퓨터 난수 저장 배열
		int [] user = new int[3];	//사용자 입력 정수 저장 배열
		
		//컴퓨터 난수 생성 및 중복 시 다시 생성
		do	{
			
			for(int i = 0; i < com.length; i++) {
				
				com[i] = rnd.nextInt(9) + 1;
				
			}
			
		}while(com[0] == com[1] || com[1] == com[2] || com[2] == com[0]);
		
		
		int count = 1;
		//언제 끝날지 모를 게임을 위해 무한반복하는 while문 작성
		while(true) {
			
			//3자리를 한 번에 받아 각 자리 별로 배열에 넣음
			System.out.print("입력(ex:123) : ");
			int num = sc.nextInt();
			
			user[0] = num / 100;	//백의자리
			user[1] = num % 100 / 10;	//십의자리
			user[2] = num % 100 % 10;	//일의자리
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < com.length; i++) {
				
				for(int j = 0; j < user.length; j++) {
					
					if(i == j) {
						if(com[i] == user[j]) {
							strike++;
						}
					}else {
						if(com[i] == com[j]) {
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

package ex6.work.thread;

import java.util.Random;
import java.util.Scanner;


public class WorkMain {

	public static void main(String[] args) {

		/*
			1~100난수 두개를 더하는 문제를 출제
			키보드에서 답을 입력하여 다섯문제가 정답 처리 될 때까지 코드가 반복
			최종적으로 다섯문제를 모두 맞히는데 몇 초 걸렸는지 화면에 출력하며 코드를 종료
		 
		 
		 	sleep통해서 초 세기
		 
		 ------20 + 15 = 답은?    
		 사용자:35
		 정답! 다음문제 ~~~~~
		 .
		 .
		 .
		 다섯번째 정답!
		 총 몇 초 걸렸습니다!
		 */

		Random rd = new Random();
		
		boolean b = true;
		System.out.println("답을 입력해주세요!");
		Scanner sc = new Scanner(System.in);
		int n1, n2, answer;
		int count = 0;
		ThreadWork tw = new ThreadWork();
		tw.start();
		
		while(b) {
			//언제 다 맞출지 모르는 루프 시작!
			//타임어택 시작
			
			
			//랜덤 두개 ,  두개 더한 값 변수 생성
			n1 = rd.nextInt(100) + 1;
			n2 = rd.nextInt(100) + 1;
			answer = n1 + n2;
			
			//문제 출력
			System.out.print("문제 :  " + n1 + " + " + n2 + " =  ? ");
			//유저 입력값 받기
			int user = sc.nextInt();
			
			//정답여부 아닐 시 그냥 계속 while
			if(user == answer) {
				System.out.println("정답!");
				//정답 시 카운트 
				count++;
				
			}
			//5개 맞히면 false 후 스레드의 while 도 false
			if(count == 5) {
				b = false;
				tw.setB(b);
			}
			
			
		}

	}
}

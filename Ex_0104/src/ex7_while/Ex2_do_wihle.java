package ex7_while;

import java.util.Random;

public class Ex2_do_wihle {

	public static void main(String[] args) {

		
		//do-while : 선처리, 후비교
		//제어문들 중 ;으로 끝
		
		
		Random rd = new Random();
		int i;
		do {
			i = rd.nextInt(10);
			
			System.out.println(i);
			
		}while(i <4);
		System.out.println(i);
		//변수 java, jsp, android 에 랜덤으로 0~130사이의 값을 담는다
		// do-while을 통해 세 과목의 점수가 모두 0~100사이일 때만
		//while을 빠져나와 각 과목별 랜덤 성정 출력
		
		
		int java, jsp, android;
		do {
			java = rd.nextInt(131);
			jsp = rd.nextInt(131);
			android = rd.nextInt(131);
			
			
		} while (java > 100 || jsp > 100 || android > 100);
		//java 가 100보다 크거나  jsp가 100보다 크거나 android가 100보다 클 때 다시 do 로 이동
		System.out.printf("java: %d 점\n jsp : %d 점 \n android %d 점", java, jsp, android);
	}
	

}

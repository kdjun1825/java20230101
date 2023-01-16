package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {

	public static void main(String[] args) {

		/*
		 1~50사이의 난수 발생
		 main에서 키보드 정수값 받기
		 받은 값이 up,down,정답  판단
		 정답 시 main의 while문을 빠져나가도록 처리
		 
		 
		 ex)  난수 ???
		 user: 30
		 down
		 user : 15
		 up
		 user : 20
		 몇회 만에 정답 입니다!
		 */
		
		//필요한 객체 생성
		Random rd = new Random();
		//int rd = new Random().nextInt() + 1;
		Scanner sc = new Scanner(System.in);
		UpdownMethod udm = new UpdownMethod();
		
		
		//난수 생성
		udm.setSys(rd.nextInt(10) + 1);

		
		//method에서의 bool값에 따라 루프를 돌고 안돔
		//초기는 true
		//정답일 떄에 false로 method에서 바뀌기 떄문에 main에서는 get만 해온다
		while (udm.getB()) {

			System.out.print("정답은 몇일까요?: ");
			int user = sc.nextInt(); 	//사용자 값 입력 받고 method로 넘김
			udm.numCheck(user);			//입력받은 값 확인 후 피드백 출력
			
			
			
		}
		
	}

}

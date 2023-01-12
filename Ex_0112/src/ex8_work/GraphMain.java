package ex8_work;

import java.util.Random;

public class GraphMain {

	public static void main(String[] args) {

		/*
		
			0~9사이의 난수를 100개 만들어서 저장
			
			///1235687364
			 
			0의 갯수 : ######6개
			1의 갯수 : #####5개
			...
			9의 갯수 : #######7개
			
			난수 생성
			갯수 카운팅
			
			출력
			
			
			
		
		 */
		

		System.out.println("--------");
		GMethod gm = new GMethod();
		gm.newRnd();
		gm.numCount();
		
		
		
		
	}
	
	

}

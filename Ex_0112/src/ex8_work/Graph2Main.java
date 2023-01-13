package ex8_work;

import java.util.Random;

public class Graph2Main {

	public static void main(String[] args) {

		//배열 사용 
		
		Random rd = new Random();
		int [] arr = new int[10];
		
		for(int i = 0; i < 100; i++) {
			
			int r = rd.nextInt(10);
			arr[r]++;
			//나오는 난수의 방으로 들어가서 값을 1씩 올린다
			//이렇게 하면 ex)난수 0이면 0의 방을 카운트 하기 때문에 배열[0]을 조회하면 0의 갯수를 알 수 있다. 
			
			
		}
		GMethod2 gm = new GMethod2();
		gm.print(arr);
		
	}

}

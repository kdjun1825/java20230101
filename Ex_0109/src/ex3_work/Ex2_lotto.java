package ex3_work;

import java.util.Arrays;
import java.util.Random;

public class Ex2_lotto {

	public static void main(String[] args) {

		
		/*
		 1~45에서 중복되지 않는 난수 6개를 만들어서 담고 
		 최종적으로 배열에 담긴 값들을 출력하시오
		 
		 
		 
		  */
		
		int[] lotto = new int[6];
		Random rnd = new Random();
		
		
		
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = rnd.nextInt(45) + 1;

			System.out.println(lotto[i]);
			for( int j = 0;  j < i; j++ ) {
				if(lotto[j] == lotto[i]) {
					--i;
					break;
				}
			}
			
		System.out.println(Arrays.toString(lotto));
		}
		
	}

}

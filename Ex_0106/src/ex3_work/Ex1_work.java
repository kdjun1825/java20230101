package ex3_work;

import java.util.Arrays;

public class Ex1_work {

	public static void main(String[] args) {

		
		/*
		 
			배열 arr에 담겨있는 모든 값들의 합 출력
		
		
		
		  */
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 1;
		arr[2] = 4;
		arr[3] = 7;
		arr[4] = 3;
		int res = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			res += arr[i];
			
			
			
		}
		System.out.println(res);
		
		System.out.println("------------");
		char[] cArr = {'j', 'a', 'v', 'a'};

		//향상된 포문 foreach
		//배열에 담긴 모든 내용에 접근하고자 하는 목적으로 만들어진 for문
		for( char c : cArr) {
			System.out.print(c);
		}
		
		
		
	}

}

package ex3_work;

import java.util.Arrays;

public class Ex2_work {

	public static void main(String[] args) {

		/*

		배열중 가장 큰 값을 출력


		  */
		
		int[] arr = new int[6];
		arr[0] = 3;   
		arr[1] = 2;
		arr[2] = 7;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;    
		int i = 0;
		int n1;
		for(i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i+1]) {
				n1 = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = n1;
				i = -1;
				System.out.println(Arrays.toString(arr));
				
			}
			
		}
		System.out.println(arr[0]);
	}

}

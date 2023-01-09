package ex3_work;

import java.util.Arrays;

public class Ex2_work {

	public static void main(String[] args) {

		/*

		배열중 가장 큰 값을 출력


		  */
		
		int[] arr = {3, 2, 7, 4, 5, 6};
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
		
		
		//arr이 가진 값을 오름차순으로 정렬
		for( i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++) {
				
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

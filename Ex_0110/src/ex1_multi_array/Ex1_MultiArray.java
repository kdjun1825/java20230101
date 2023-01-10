package ex1_multi_array;

import java.util.Arrays;

public class Ex1_MultiArray {

	public static void main(String[] args) {

		//다차원 배열
		//1차원 배열이 2개 모이면 2차원배열
		//     stack   /  heap 
		//     
		
		int [][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.println(arr[i][j]);
			}
			
		}
			
			System.out.println(arr.length);
			System.out.println(Arrays.toString(arr[0]));
			System.out.println(Arrays.toString(arr)); //각 배열의 주소가 나온다
		
		
	}

}

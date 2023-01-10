package ex1_multi_array;

public class Ex4_MultiArray {

	public static void main(String[] args) {

		/*
		 2차원 배열의 정수값들을 모든 값을 구하고 평균(소숫점 첫째 까지) 출력		 
		  */
		
		int[][] arr	= { { 1, 234 , 34589, 99, 22341 },
						{ 3, 46, 544, 32, 8234, 99812, 12 },
						{ 41, 486, 10} };
		
		int num = 0,	//합들을 저장할 변수
			count =0;	//행들의 총 갯수
		float avg;		//평균을 저장할 변수
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length;	j++ ) {
				
				//합들을 loof를 돌리며 저장
				num += arr[i][j];
				//행 count
				count++;
				
			}
			
		}
		//구하고 저장한 num을 count로 나누면 평균 avg
		avg = (float)num / count;
		System.out.println("행들의 총 합: " + num);
		System.out.println("총 행의 갯수: " + count);
		System.out.printf("합의 평균: %.1f", avg);
		
	}

}

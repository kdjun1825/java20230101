package ex2_work;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_work {

	public static void main(String[] args) {

		/*
		 
		 키보드에서 입력값 만큼 행,열 을 가지는 홀수 마방진만들기
		 1은 첫번 째 행의 가운 데 
		 다음 숫자는 오른쪽 위 
		 오른쪽 위가 숫자라면 아래로

		1이
		 가운데로 오려면 3 일 때 0,1   5일 떄 0,2   7일 때 0, 3		9일 때 0,4
		               x1x	     xx1xx     xxx1xxx    xxxx1xxxxx		
		 나누기 2 한 몫 위치 
		 
		 8 1 6 
		 3 5 7 
		 4 9 2 
		 
		 
		 17 24 01 08 15
		 23 05 07 14 16
		 04 06 13 20 22
		 10 12 19 21 03
		 11 18 25 02 09
		 
		 0,2
		 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력해주세요.");
		int n1 = sc.nextInt();
		int[][] arr = new int[n1][n1];
		System.out.println(arr[0].length);
		
		//좌표를 저장해둘 변수 (시작은 첫 줄 가운데 이기 때문에 po1 = 0 po2 는 2로나눈 몫)
		int po1 = 0,
			po2 = n1/2;  
		
		arr[po1][po2] = 1;	//시작 좌표에 1을 넣고 시작
		
		System.out.println("시작 좌표: [" + po1 + "," + po2 + "]");
		//0,1을 시작으로 loof  시작
		for(int i = 2; i <= n1*n1; i++) {
			//i = 2,3,4,5,.... 9
			
			//입력값의 배수 여부 
			if(i % n1 == 1) {
				
				//배수의 다음수에 적용시켜야 됨 그래서 나머지 1일 때 실행
				//행만 +1
				po1++;
				arr[po1][po2] = i;
				System.out.println("[" + po1 + "," + po2 + "] 에들어갈 수 : " + i );
				
			}else {
				
				//배수가 아닌 나머지 들
				//일반 상황 행은 -1, 열은 +1
				--po1;
				++po2;
				System.out.println("좌표진행 중: " + po1 + "," + po2);// 행열 좌표 정리 전 좌표 확인
				//행이 0에서 -1이 진행될 떄
				if(po1 < 0) {
					po1 = n1-1; //입력값의 -1  즉 인덱스의 최대
				}
				//열이 인덱스 최대값에서 +1이 될 때
				if(po2 > n1-1) {
					po2 = 0;	//0 즉 인덱스의 최소
				}
				System.out.println("행열 정리 후 좌표: " + po1 + "," + po2);//좌표 정리 후 좌표 확인
				
				arr[po1][po2] = i;
				System.out.println("[" + po1 + "," + po2 + "] 에들어갈 수 : " + i );
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;	j++ ) {
				System.out.printf("%02d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

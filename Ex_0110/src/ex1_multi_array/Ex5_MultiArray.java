package ex1_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_MultiArray {

	public static void main(String[] args) {

		/*
		 
		 학생들의 이름, 수학, 영어성적 을 등록하고 한번에 출력하고싶다.'
		 첫 실행 시 몇명의 정보를 입력할 것인지 입력받고 정보 등록 및 출력 진행
		 
		 등록인원 : 2  
		 이름 : hong
		 수학 : 30
		 영어 : 50
		 ----
		 이름: gil
		 수학 : 40
		 영어 : 90
		 
		 ----
		 2명 등록 완료
		 hong 30 50
		 gil 40 90
		 출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록 할 인원 수 : ");
		int n = sc.nextInt();
		
		String[] info = {"이름: ", "수학: ", "영어: "};		//등록이 필요한 정보 배열
		String[][] str = new String[n][info.length];	//정보를 저장해둘 배열
		
		for(int i = 0; i < str.length; i++) {
			
			for(int j = 0; j <str[i].length; j++) {
				
				System.out.print(info[j]);
				str[i][j] = sc.next();
				System.out.println(Arrays.toString(str[i]));
				
			}
			System.out.println(n + "명 등록 완료");
			System.out.println(Arrays.toString(str[i]));
		}
		
		
		
	}

}

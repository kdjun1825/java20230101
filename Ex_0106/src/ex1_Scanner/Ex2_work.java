package ex1_Scanner;

import java.util.Scanner;

public class Ex2_work {

	public static void main(String[] args) {

		/*
		 
		 키보드에서 n1, n2를 정수로 받고 
		 n1부터 n2 까지 의 합을 출력
		 
		 n1이 n2보다 커도 같은결과가 나오게 ㄱㄱ
		 
		 
		  */
		Scanner sc = new Scanner(System.in);
		System.out.println("n1입력:");
		int n1 = sc.nextInt();
		System.out.println("n2입력:");
		int n2 = sc.nextInt();
		
		int res = 0;//합을 저장할 변수 
		
		//n1이 n2보다 작을 때
		if(n1 <= n2) {
			
			//i를 n1으로 시작 ~ n2까지 더하기
			for(int i = n1; i <= n2; i ++) {
				
				res += i;
				
			}
			
			
		//n1이 n2보다 클 때
		}else{
			
			//i를 n2으로 시작 ~ n1까지 더하기
			for(int i = n2; i <= n1; i ++) {
				
				res += i;
				
			
			}
		}
		System.out.println(res + "이 결과입니다");
		
		
		System.out.println("n1입력:");
		n1 = sc.nextInt();
		System.out.println("n2입력:");
		n2 = sc.nextInt();
		
		res = 0;//합을 저장할 변수 
		
		if(n1 > n2) {
			
			int n3 = n1;
			n1 = n2;
			n2 = n3;
			
			}			
		
		for(int i = n1; i <= n2; i ++) {
			
			res += i;
		}
		System.out.println(res + "이 결과입니다");
	}
}


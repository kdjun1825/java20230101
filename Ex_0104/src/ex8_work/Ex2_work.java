package ex8_work;

public class Ex2_work {

	public static void main(String[] args) {
		
		//2중 for문을 사용하여 아래의 결과를 도출하시오
		
		/*
		
		1 2 3 4 5 6 7 8 9 10
		2 3 4 5 6 7 8 9 10 1
		.
		.
		.
		10 1 2 3 4 5 6 7 8 9
		
		
		*/
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10-i; j++) {
				
				System.out.print(i+j+1 + " ");
			}
			
			for(int k = 0; k < i; k++) {
				
				System.out.print(k+1 + " ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("---------------");
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j <= 10-i; j++) {
				
				System.out.print(i+j + " ");
			}
			for(int k = 0; k < i-1; k++) {
				System.out.print(k+1 + " ");
				
			}
			
			System.out.println();
		}
		System.out.println("--------------------------");
		
		//1부터 n까지의 총 합 출력
		int n = 15;
		int plus = 0;
		for(int i = 1; i <= n; i++ ) {
			plus += i;
			
			System.out.println(plus);
			
		}
		
		
		
		
	}
}

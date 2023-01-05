package ex8_work;

public class Ex1_work {

	public static void main(String[] args) {
		/*
		  2중 for문을 사용하여 아래의 결과 출력
    1)    * 
		  * *
		  * * *
		  * * * *
	2)	
		   *
		 * * *
	   * * * * * 
	 * * * * * * *  
	   

	   
	   
		 */
		for(int i = 0; i < 10; i++) {
			
			
			
			for(int j = 0; j < i+1; j++	) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
		
		for(int i = 0; i < 5; i++) {
			
			for(int k = 0; k < 5-i-1; k++	) {
				
				
				System.out.print("  ");
			} 
			
			
			for(int j = 0; j < (i+1)*2-1; j++	) {
				
				System.out.print("* ");
			}
			
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
		
		
		
		
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 10; j > i; j--	) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
	}

}

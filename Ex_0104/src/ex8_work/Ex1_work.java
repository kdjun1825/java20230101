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
		System.out.println("-------v1---------");
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5+i; j++	) {
				
				if( i + j > 3 ) 
				{
					
					System.out.print("* ");
					
				}else {
					
					System.out.print("  ");
					
				}
				
			} 
			
			
		
			
			
			System.out.println();
			
		}
		System.out.println("-------v2---------");
		
		
		
		
		
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 10; j > i; j--	) {
				
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
		for(int i = 4; i > 0; i-- ) {
			
			for(int k = 0; k < 5-i; k++	) {
				
				
				System.out.print("  ");
			} 
			for(int j = 0; j < i*2-1; j++	) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
	}

}

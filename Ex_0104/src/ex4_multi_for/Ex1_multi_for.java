
package ex4_multi_for;

public class Ex1_multi_for {

	public static void main(String[] args) {

		
		//123
		//123
		//바깥쪽 for = y줄
		//안 쪽 for = x줄
		
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j ++	) {
				
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 5; j ++	) {
				
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		
		
		int k = 0;
		for(int i = 0; i < 3; i++) {
			
			
			for(int j = 0; j < 3; j ++	) {
				
				System.out.print(++k);
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
		
		
		char c = 64;
		for(int i = 0; i < 3; i++) {
			
			
			for(int j = 0; j < 3; j ++	) {
				
				System.out.print(++c);
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
		
		for(int i = 0; i < 10; i++) {
			
			
			for(int j = 0; j < 10-i; j ++	) {
				
				System.out.print(" ");
			}
			for(int k2 = 0; k2 < i; k2 ++	) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println("----------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

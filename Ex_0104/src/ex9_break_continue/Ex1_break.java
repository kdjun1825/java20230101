package ex9_break_continue;

public class Ex1_break {

	public static void main(String[] args) {

		//break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때 사용하는 키워드
		
		
		for(int i = 0; i <2; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				if((j+1) % 2 == 0) {
					
					break;
					
				}
				
				System.out.print((j+1) + " ");
				
			}
			for(int j = 0; j < 10; j++) {
				
				if(j % 2 == 1) {
					
					break;
					
				}
				
				System.out.print(j + " ");
				
			}
			System.out.println("엔터");
			
		}
		
		
	}

}

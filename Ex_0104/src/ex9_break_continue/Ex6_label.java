package ex9_break_continue;

public class Ex6_label {

	public static void main(String[] args) {

		out : for(int i= 0; i <3; i++) {
			
			for(int j = 0; j <5; j++) {
				
				if((j+1) % 2 == 0){
					continue out;//out 이라는 label을 가진 반복문을 빠져나간다
				}
				System.out.print(j+1 + " ");
				
			}
			
			
			System.out.println("엔터");
		}
		
		
	}

}

package ex9_break_continue;

public class Ex5_label {

	public static void main(String[] args) {

		//labe: 반복문에 식뵬자를 지정하는 형태
		
		out : for(int i= 0; i <3; i++) {
			
			for(int j = 0; j <5; j++) {
				
				if((j+1) % 2 == 0){
					break out;//out 이라는 label을 가진 반복문을 빠져나간다
				}
				System.out.print(j + " ");
				
			}
			
			
			System.out.println();
		}
		
		
	}

}

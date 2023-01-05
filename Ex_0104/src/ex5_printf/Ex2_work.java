package ex5_printf;

public class Ex2_work {

	public static void main(String[] args) {

		/*
		 3 * 1 = 3
		 3 * 2 = 6
		 .
		 .
		 .
		 2~9사이의 값만 넣어주세요
		 
		 
		 
		 
		 
		 
		  */
		
		
		int n1 = 3;
		
		if(n1 >=3 && n1 <= 9) {
			
		for(int i = 0; i < 9; i++) {
			System.out.printf("%d * %d =  %d \n", n1, i+1, n1*(i+1));
		}
		
		}else {
			System.out.println("2~9사이의 값만 넣어주세요");
		}
		
		
		
		
	}

}

package ex3_work;

public class Ex4_work {

	public static void main(String[] args) {
		
		/*
		 
		 2중포문으로 구구단 세로 출력  2단 세로 3단 세로  4단 세로 
		 
		 
		 
		 
		  */
		
		for(int i = 0; i < 9; i++) {
			
			for(int j = 0; j < 8; j++) {
				
				System.out.print((j+2) +  " * " + (i+1) + " = " + (j+2) * (i+1) + "\t");
				
			}
			System.out.println();
		}
		
	}
	
}

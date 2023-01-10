package ex1_multi_array;

public class Ex2_MultiArray {

	public static void main(String[] args	) {
		
		//2차원배열의 선언 및 생성, 초기화 한 번에 하기
		
		 char[][] chArr = { { 'j', 'a', 'v', 'a' } ,
				 			{ 'e', 'c', 'l', 'i', 'p', 's', 'e'} };
		 
		 
		 for(int i = 0; i < chArr.length; i++)	{
			 
			 for(int j = 0; j < chArr[i].length; j++) {
				 
				 System.out.print(chArr[i][j] + " ");
				 
			 }
			 System.out.println();
			 
		 }
		
		 
		 
		
	}
	
}

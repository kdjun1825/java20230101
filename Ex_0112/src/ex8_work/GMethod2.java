package ex8_work;

public class GMethod2 {



	public void print(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "갯수: ");
			
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("#");
				
			}
			System.out.println(arr[i] + "개 입니다");
		}
		
		
		
	}

}

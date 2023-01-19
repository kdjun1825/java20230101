package ex2_exception;

public class Ex2_TryCatch {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30}	;
		
		try {
			
			for(int i = 0; i  <= arr.length; i++){
				System.out.println(arr[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("프로그램종료");
		
	}

}

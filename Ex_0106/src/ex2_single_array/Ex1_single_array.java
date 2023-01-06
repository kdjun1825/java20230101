package ex2_single_array;

public class Ex1_single_array {

	public static void main(String[] args) {

		/*
		 
		 array : 같은 자료형 끼리 모아둔 하나의 묶음
		 효율족인 자료관리를 위해 반드시 알고 있어야 한다
		 
		 
		 
		  */
		
		
		int[] arr;	//배열선언
		arr = new int[4];	//배열생성
//		int[] arr = new int[5];

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
//		arr[4] = 500;  배열에 존재하지않는 index에는 값을 추가하거나 가져다 쓸 수 없다.
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10;
			
			
			System.out.println(arr[i]);
			
		}
		
		
		int n[] = {100,200,300,400};
		System.out.println(n[1]);
		
	}

}

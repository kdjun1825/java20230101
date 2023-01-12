package ex4_method;

public class Ex1_param_main {

	public static void main(String[] args) {

		Ex1_param e1 = new Ex1_param();
		String str = "안녕";
		e1.test01(str);
		
		System.out.println("main : " + str);
		System.out.println("---------------");
		
		
		int[] arr = {1,2,3};
		
		e1.test02(arr);
		//배열의 복사본이 아니라 배열은 주소를 넘겨서  원본도 수정 됨
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}

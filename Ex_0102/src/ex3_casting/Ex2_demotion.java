package ex3_casting;

public class Ex2_demotion {

	public static void main(String[] args) {

		//디모션
		//작은자료형에 큰 자료형이 대입되는 것(자동으로 안됨
		char c = 'b'; //2byte
		int n = c + 11; //4byte
		c = (char)n;
		System.out.println(c);
		
		float ff = 5.9f; //4.?byte
		n = 0; //4byte
		n = (int)ff;//float의 .?byte 가 손실
		
		System.out.println(n);
		
		
		
	}

}

package ex3_casting;

public class Ex1_promotion {

	public static void main(String[] args) {

		//캐스팅(형변환)
		//서로 다른 자료형 간에 값을 주고받기 위한 문법(개념)
		
		//1. 프로모션
		// 큰 자료형에 작은 자료형을 대입하는 것(자동으로)
		double d = 100.5; //8byte
		int n = 200; // 4byte
		d = n; //d = 200
		System.out.println(d);
		
		
		char c = 'a';
		int n1 = 100;
		n1 = c;
		d = c;
		System.out.println(d);
		System.out.println(n1);
		
	}

}

package ex2_value_type;

public class Ex1_valueType {

	public static void main(String[] args) {

		//기본자료향(valueType)
	/*
	  논리형 : boolean - 1bit
	  문자형 : char - 2byte
	  정수형 : byte - 1byte
		  short - 2byte
		  int - 4byte
		  long - 8byte
	  실수형:  float - 4byte
	  		double - 8byte
	  
	  
	  
	  변수 : 특정 값을 저장하기 위한 공간
	  변수형을 구별하는 식별자
	  
	  변수 선언 규칙
	  1) 자료형 변수명; ex)int a;  (선언)
	  2) 변수명 = 값; ex)a = 1; (대입)
	  3) int a = 1; (변수의 초기화)
	  
	  변수 선언 주의사항
	  -같은 영역에서 변수명 중복x
	  - _를제외 특수문자 포함 x
	  - 변수명은 반드시 소문자로시작
	  - 변수명은 숫자로 시작x 영문으로 작성
	  
	  
	  
	 */
	
		boolean a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		
		
		char c = 'a';
		System.out.println(c);
		char c2 = 'a' + 1;
		System.out.println(c);
		
		//정수형
		int n = 210000000;
		
		long n2 = 22000000000l;
		//int 를 벗어나 long 에 저장하려면 뒤에 l 붙이기 
		
		System.out.println(n2);
	}

}

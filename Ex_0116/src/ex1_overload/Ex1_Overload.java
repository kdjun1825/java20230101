package ex1_overload;

public class Ex1_Overload {

	//오버로딩은 메서드의 '중복정의'. 하나의 클래스 내부에서
	//같은 이름을 가진 메서드가 여러개 정의되는 것을 말한다
	
	
	//오버로드를 위한 규칙
	//1.메서드의 인자의 갯수가 달라야 한다.
	//2.인자의 갯수가 같아도 데이터 타입이 다르면 인정해준다
	//3.여러 인자가 있을 때 순서만 바뀌어도 오버로드로 인정
	public void result() {
		
		System.out.println("인자가 없는 메서드 입니다.");
		
	}
	
	
	
	public void result(int n) {
		
		System.out.println("정수를 인자로 받는 메서드 입니다");
		
	}
	
	public void result( char c ) {
		
		System.out.println("문자를 인자로 받는 메서드");
		
	}
	
	public void result ( String s) {
		System.out.println("문장을 인자로 받는 메서드");
	}
	
	public void result ( String s, int n ) {
		
		System.out.println("문자열, 정수 를 인자로 받는 메서드");
		
	}
	public void result ( int n , String s ) {
		
		System.out.println("문자열, 정수 를 인자로 받는 메서드");
		
	}
	
	
	
	
	
	
}

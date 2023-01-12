package ex3_method;

public class Method01 {

	public void test1() {
		
		System.out.println("안녕하세요");
		
	}
	
	
	//void가 아니면 무조건 return 값이 존재해야한다
	//return값은  반환형 타입이랑 맞춘다
	//값을 가져오려면 parameter가 필요하고
	//return이 있으면 돌려받을 수 있다
	public  int test2( int a ) {
		a+=100;
		System.out.println( " a : " + a);
		return a;
	}
	
	public String test3(String s, int n) {
		String str = "s 는 : " + s + "n은 : " + n;
		return str;
	}
	
}

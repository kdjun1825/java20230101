package ex6_generic;

public class GenMain {

	public static void main(String[] args) {

		//generic타입이 String 타입으로 지정된 gen1객체
		GenEx<String> gen1 = new GenEx<String>();
		gen1.setValue("hi");
		String res = gen1.getValue();
		
		//제네릭 타입은 클래스만을 넣어줄 수 있기 때문에
		//기본 자료형을 사용하려면 wrapper 를 넣어줘야 한다
		
		GenEx<Integer> gen2 = new GenEx<Integer>();
		gen2.setValue(10);
		int n = gen2.getValue();
		System.out.println(n);
		
		
	}

}

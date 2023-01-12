package ex3_method;

public class Method_Main {

	public static void main(String[] args) {

		Method01 m1 = new Method01();
		m1.test1();
		
		int su = 100;
		
		su = m1.test2(su);
		System.out.println("su: " + su);
		
		
		String t3 = m1.test3("스트링", 10);
		System.out.println(t3);
		
	}

}

package ex2_switch;

public class Ex5_work {

	public static void main(String[] args) {

		
		/*

		연산자 넣어서 계산하기	

		 */
		
		
		int n1 = 123;
		int n2 = 312;
		char op = '%';
		
		
		switch (op) {
		case '+':
			System.out.println(n1 + " + " + n2 + " 의 결과는 " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " 의 결과는 " + (n1 - n2));
			break;
		case '*':
			System.out.println(n1 + " * " + n2 + " 의 결과는 " + (n1 * n2));
			break;
		case '/':
			System.out.println(n1 + " / " + n2 + " 의 결과는 " + (n1 / n2));
			break;
		case '%':
			System.out.println(n1 + " % " + n2 + " 의 결과는 " + (n1 % n2));
			break;

		default:
			System.out.println("올바른 산술연산자를 입력하시오.");
			break;
		}
		
		
		
		
	}
	

}

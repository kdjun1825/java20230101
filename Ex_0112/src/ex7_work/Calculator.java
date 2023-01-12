package ex7_work;

public class Calculator {

	public void getResult(int fir, int sec, String op) {
		
		switch (op) {
		case "+":
			System.out.println(fir + " + " + sec + " 의 결과는 " + (fir + sec));
			break;
		case "-":
			System.out.println(fir + " - " + sec + " 의 결과는 " + (fir - sec));
			break;
		case "*":
			System.out.println(fir + " * " + sec + " 의 결과는 " + (fir * sec));
			break;
		case "/":
			System.out.println(fir + " / " + sec + " 의 결과는 " + (fir / sec));
			break;
		case "%":
			System.out.println(fir + " % " + sec + " 의 결과는 " + (fir % sec));
			break;

		default:
			System.out.println("올바른 산술연산자를 입력하시오.");
			break;
		}
	}
	
}

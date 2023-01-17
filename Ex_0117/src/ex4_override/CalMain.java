package ex4_override;

public class CalMain {

	public static void main(String[] args) {

		int res = 0;
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		
		res = cp.getResult(10, 5);
		System.out.println(res);
		
		res = cm.getResult(10, 5);
		System.out.println(res);
		
		
		
	}

}

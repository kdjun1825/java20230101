package ex5_method;

public class VMethod {

	public void vTest(int...n) {
		//갯수제한 없는 parameter (int...n)
		//variable argument
		//
		//n = {1, 123, 142, 12}
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		
	}
	
}

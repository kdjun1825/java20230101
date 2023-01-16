package ex2_overload;

public class Bread {

	/*
		


	 */
	//1
	public void makeBread() {
		
		System.out.println("빵을 만들었습니다.");
		System.out.println("---------------");
		
	}
	//2
	public void makeBread(int n) {
		
		for(int i = 0; i < n; i ++) {
			
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("빵을 " + n + " 개 만들었습니다.");
		System.out.println("---------------");
	}
	//3
	public void makeBread(int n , String s) {
		
		for(int i = 0; i < n; i ++) {
			
			System.out.println(s + "을 만들었습니다.");
		}
		System.out.println(s + "을 " + n + " 개 만들었습니다.");
		System.out.println("---------------");
		
		
	}
	
	
	
	
	
	
	
}

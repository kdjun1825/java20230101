package ex7.runnable;

public class T1 /*extends 로 다른 것을 사용하다가 implenments 로 thread사용 가능*/ implements Runnable{

	
	/*

		상속 말고 구현으로 thread를 이용할 수도 있다.
	
	 */
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10000; i++) {
			
			System.out.println(i);
		}
		
	}

	
	
	
}

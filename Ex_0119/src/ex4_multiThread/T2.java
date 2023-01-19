package ex4_multiThread;

public class T2 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i ++) {
			
			System.out.print("2");
			
		}
		
	}
	
	
	
}

package ex5_thread;

public class T1 extends Thread{

	private int n;
	
	public T1(int n) {
		this.n = n;
		
	}
	
	@Override
	public void run() {
		
		for(int i = n; i >= 0; i--) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("스레드 종료");
	}
	
}

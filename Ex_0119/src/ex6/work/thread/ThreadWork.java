package ex6.work.thread;

public class ThreadWork extends Thread {

	
	private int n = 0;
	private boolean b = true;
	
	@Override
	public void run() {
		
		while(b) {
			
			try {
				
//				System.out.println(n);//0부터 시작
				Thread.sleep(1000);
				n++;//1초 에 1씩 
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		System.out.println(n + " 초 만에 clear!");
	}
	
	//setter,getter
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	
}

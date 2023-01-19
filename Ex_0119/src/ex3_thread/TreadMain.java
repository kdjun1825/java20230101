package ex3_thread;

public class TreadMain {

	public static void main(String[] args) {

		
		/*

			스레드는 하나의 프로그램에서 동시에 여러가지의 프로세스를 동시에
			사용할 수 있도록 해 주는 독립적인 실행단위
		 
		 */
		TreadEx te = new TreadEx();
		te.start();
		for(int i = 0; i < 100; i++) {
		System.out.println("메인스레드 종료");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
	}

}

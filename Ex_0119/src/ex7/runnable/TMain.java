package ex7.runnable;

public class TMain {

	public static void main(String[] args) {

		T1 t1 = new T1();
		
		
		/*
			runnable은 start()메서드를 가져올 수 없다
			이 때 Thread 객체를 하나 생성 해야한다.
			그리고 parameter로 runnable객체를 준다
		 */
		Thread thread = new Thread(t1);
		
		//그 다음 thread객체로 start메서드를 사용한다
		thread.start();
		
		
	}

}

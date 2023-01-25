package ex3.work;


public class Work {

	public static void main(String[] args) {

		/*
		 	arraylist 배열에 있는 단어 목록에서 새로운 배열로 배열롤 단어목록에서
			3초마다 배열에 단어가 추가된다
			이거는 쓰레드로 돌리고
			
			메인에서 배열에 있는 단어를 키보드 입력으로 줄이고
			배열 사이즈가 0이 되면 
			clear!

		 */
		
	
		WorkThread wt = new WorkThread();
		wt.start();
		wt.game();
		
		
		
	}

}

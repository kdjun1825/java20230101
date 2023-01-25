package ex3.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkThread extends Thread {

	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	//기본 단어 정보들 배열
	private String[] sys = new String[] {"포도", "사과", "오렌지", "레몬", "수박", "귤", "배", "감", "딸기", "바나나"};
	
	//랜덤으로 단어들이 들어올 list
	private ArrayList<String> word = new ArrayList<String>();
	
	



	// start를 해서 3초마다 단어가 나오게 하는 run
	@Override
	public void run() {
		
		
		
		while (true) {
			
			//랜덤한 단어 뽑기
			int num = rd.nextInt(sys.length);
			//word 에 단어 넣기
			word.add(sys[num]);
			//word 현 상황 출력!
			System.out.println(word);
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}
	
	
	public void game() {
		
		System.out.println("게임시작!");
		
		while(true) {
		
			System.out.println("-------------삭제할 단어-------------");
			String user = sc.next();
			for(int i = 0; i < word.size(); i++) {
				
				if(user.equalsIgnoreCase(word.get(i))) {
					
					System.out.println("-------------  ᕙ( ︡’︡ 益 ’︠)ง▬▬█  -------------");
					word.remove(i);
					
					//만약 지웠는데 사이즈가 0이라면!
					if(word.size() == 0) {
						
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.out.println("모든 단어를 제거했습니다!!   ദി ᷇ᵕ ᷆ )♡  ");
						System.exit(0);
						
					}
					
					break;
						
				}
					
			}
		}
		
	}
	

}

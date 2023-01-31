package ex5.work2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

import ex3.object.output.Person;

public class RspMain {

	public static void main(String[] args) {

		/*
			id:aaa
			0승0무0패
			
			가위(s), 바위(r), 보(p):
			당신이 이겼습니다
			1승0무0패
			한 판 더? y|n : n
			종료
			
			
			id:aaa
			1승0무0패
			게임~~~~
			~~~
	
	
	
			아이디 입력
			있는지 조회
			없으면 만들기
			0/0/0
			있으면 맞는  값 출력
			ex)1/2/1
			
		 */
		
		Scanner sc = new Scanner(System.in);
		Rsp rsp = new Rsp();
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		rsp.setId(id);
		
		//게임 로드
		GameLoad gl = new GameLoad();
		rsp = gl.scoreLoad(id);
		if(rsp == null) {
			
			rsp = new Rsp();
			rsp.setId(id);
			
		}else {
			win = rsp.getWin();
			lose = rsp.getLose();
			draw = rsp.getDraw();
		}
		
		
		
		
		
		
		System.out.println(win + " / " + draw + " / " + lose);
		
		
		//언제끝낼지 모르는 반복문
		while(true) {
			
			//랜덤으로 가위바위보 뽑기
			int rnd = new Random().nextInt(3);	//가위/바위/보 0/1/2 일 떄 값이 같으면 비기고  유저-시스템  -2 or 1이면 이긴다 나머지는 지는경우
			
			System.out.println("가위(s)/바위(r)/보(p)");
			String user = sc.next();
			int userCnt = 0;
			
			if(user.equalsIgnoreCase("s")) {
				
				userCnt = 0;
				
			}else if(user.equalsIgnoreCase("b")) {
				
				userCnt = 1;
				
			}else if(user.equalsIgnoreCase("p")){
				
				userCnt = 2;
				
			}
			
			//이기는 경우
			if(userCnt - rnd == -2 || userCnt - rnd == 1 ) {
				
				System.out.println("이겼습니다 win+");
				rsp.setWin(++win);
				
			}else if(userCnt - rnd == 0) {
				System.out.println("비겼습니다 draw+");
				rsp.setDraw(++draw);
			}else {
				System.out.println("졌습니다 lose+");
				rsp.setLose(++lose);
			}
			
			
			System.out.println(win + " / " + draw + " / " + lose);
			System.out.println("한판 더 하려면  y를 입력하세요");
			String select = sc.next();
			
			if(!select.equalsIgnoreCase("y")) {
				
				System.out.println("게임종료");
				break;
			}
			
		}
		
		//종료 후 저장]
		GameSave gs = new GameSave();
		gs.scoreWriter(rsp);	//여기 까지 하면 저장은 되지만 불러와야 이어서 게임을 할 수 있다. setId 다음에 로드를 해야함
			
		
		
		
		
		
	}

}

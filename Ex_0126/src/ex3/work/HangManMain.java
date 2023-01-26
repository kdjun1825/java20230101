package ex3.work;

import java.util.ArrayList;
import java.util.Scanner;

public class HangManMain {

	public static void main(String[] args) {

		/**
			준비된 단어 배열
			행맨~~~
			단어: ex) apple   일 떄  ☆ ☆ ☆ ☆ ☆
			유저: a 
			단어 : a ☆  ☆  ☆  ☆ 
			유저: pp
			시스템: 한글자의 영 소문자만 가능합니다
			단어 : a ☆  ☆  ☆  ☆ 
			유저: p
			단어 : a p p ☆  ☆
			유저 : b
			시스템: b는 없습니다
			단어 : a p p ☆  ☆
			유저: 

		 */
		//단어 배열
		String[] sys = {"samsung", "apple", "razer", "logitech", "corsair"};
		
		//별로 단어의 길이만큼 대체 정답 맞추면 해당 index 정답 글자로 바꿈!
		ArrayList<String> starWords = new ArrayList<String>();
		
		//스캐너와 class객체 생성
		Scanner sc = new Scanner(System.in);
		//단어 배열 넘기기
		HangMainClass hm = new HangMainClass(sys);
		
		//단어와 별 배열 이 생성자 생성 시 만들어지기 때문에 뒤에 작성 별 list가져오기
		starWords = hm.getStarWord();
		
		//유저의 입력값
		String user = "";
		
		//문제 현황 출력 후 입력 받아서 전달 --> 클래스에서 판단, 정답이 아니면 list 갱신 후 main으로 전달 하고 과정 반복  
		//전달---> 클래스에서 정답 시 바로 정답여부 출력 후 반복문 종료
		while(hm.getB()) {
			
			
			
			
			//단순 starWords출력문 배열로 출력하면 안이뻐서 
			System.out.println("(´･ʖ̫･`)==문제==(´･ʖ̫･`)");
			for(int i = 0; i < starWords.size(); i++) {
				
			System.out.print(starWords.get(i));
			}
			System.out.println("\n--------------------");
			
			
			//입력값 받아서 
			System.out.print("୧(๑•̀ᗝ•́)૭  정답입력 >>>");
			user = sc.next();
			System.out.println("--------------------");
			
			//비교 하는 메서드 로 전달
			hm.hangStart(user);
			
		
		}
		
		
	
		
	}

}

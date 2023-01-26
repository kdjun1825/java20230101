package ex3.work;

import java.util.ArrayList;
import java.util.Random;

public class HangMainClass {

	private String[] sys;	//		String[] sys = {"samsung", "apple", "razer", "logitech", "corsair"};
	private Random rd = new Random();
	private String word = "";
	private Boolean b = true;	//
	private ArrayList<String> starWords = new ArrayList<String>();
	
	
	



	public HangMainClass(String[] sys) {
		
		//단어 배열 가져오고
		this.sys = sys;
		
		//안에 있는 단어 중 랜덤 뽑기 
		this.word = sys[rd.nextInt(sys.length)];
		
		for(int i = 0; i < word.length(); i++) {
			this.starWords.add(" ★ ");
		}
		
		System.out.println(word);
		
		
	}
	
	
	public void hangStart(String user) {
		
		//정답을 도전했는지 글자유무 확인했는지
		if(user.length() == word.length()) {
			
			//영단어를 입력했을 때
			wordHang(user);
			
		}else if(user.length() == 1 && user.charAt(0) >='a' && user.charAt(0) <='z') {
			//알파벳 한 글자만 입력했을 때
			alphaHang(user);
		}else{
			
			System.out.println("꒰(ꐦ •᷅ ‎(ｪ)•᷄ )꒱  문제 길이에 맞는 영단어 or 알파벳 한 글자를 입력해주세요! \n--------------------");
			
		}
		
		
		
	}
	
	
	//영단어를 입력했을 때
	public void wordHang(String user) {
		
		Boolean check = true;

		for(int i = 0; i < user.length(); i++) {
			
			if(user.charAt(i) < 'a' || user.charAt(i) > 'z') {
				check = false;
				
			}
		}
		
		//입력값이 모두 맞아 떨어질 때
		if(check) {
			
			System.out.println("ʕ •̀ o •́ ʔ 정답에 도전! \n--------------------");
			System.out.println(word + " 이(가) 정답이었습니다!");
			b = false;
			
		}else {
			
			System.out.println("꒰(ꐦ •᷅ ‎(ｪ)•᷄ )꒱  문제 길이에 맞는 영단어 or 알파벳 한 글자를 입력해주세요! \n--------------------");

		}
		
	}
	
	
	
	
	//알파벳 한 글자만 입력했을 때
	public void alphaHang(String user) {
		
		/* 이미 확인 된 알파벳  처리 기능도 추가 가능*/
		
		System.out.println("ʕ •̀ o •́ ʔ 알파벳 확인! ");
		Boolean check = false;
		
		//정답과 비교 후 알파벳 치환 
		for(int i = 0; i < word.length(); i++) {
			
			//문제의 단어 인덱스 알파벳과 입력값 알파벳 비교 같다면!
			if(word.charAt(i) == user.charAt(0)) {
				
				//해당 index의 별 문양을 user입력값으로 변경.
				starWords.set(i, user);
				check = true;
				
			}
			
		}
		
		//알파벳 여부에 따른 출력, 정답처리
		if(check) {
			System.out.println("ദ്ദി⑉¯ ꇴ ¯⑉ )    " + user + "  이(가) 포함되어 있습니다!");
			
			for(int i = 0; i < word.length(); i++) {
				
				//마지막 알파벳을 맞추면 정답을 맞추게 되니 비교 후 
				if(word.charAt(i) == starWords.get(i).charAt(0)) {
					
				}else {
					
					//체크 도중 정답이 아닌 값이 매치되면 false 변경 후 바로  break 
					check = false;
					break;
					
				}
				
			}
			
			//false가 되지 않았다면 모든 알파벳이 정답이기 때문에 정답 출력 후  main의 반복문 중단.
			if(check) {
				
				System.out.println(word + " 이(가) 정답이었습니다!");
				b = false;
				
			}
			
			
		}else {//알파벳이 포함이 되지 않을 때
			
			System.out.println("͡ ͜ʖ ͡ ╭∩╮      " + user + "   은(는) 포함되어 있지 않습니다");
			
		}
		
		System.out.println("--------------------");
		
	}
	
	
	
	



	
	/////-------g,setter---------------------------------------------
	






	public Boolean getB() {
		return b;
	}


	public void setB(Boolean b) {
		this.b = b;
	}


	public ArrayList<String> getStarWord() {
		return starWords;
	}


	public void setStarWord(ArrayList<String> starWord) {
		this.starWords = starWord;
	}
	
	
	public String getWord() {
		return word;
	}
	
	
	
	
	public void setWord(String word) {
		this.word = word;
	}
	

	
	
	
}

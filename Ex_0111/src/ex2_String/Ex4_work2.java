package ex2_String;

import java.util.Scanner;

public class Ex4_work2 {

	public static void main(String[] args) {

		
		/*
		 * 검색할 배우
		 * 대괄호빼고 
		 * 박쥐
		 * 괴물
		 * 관상
		 * 
		 *검색안되면
		 *해당배우 가없습니다
		 *
		 * 
		 * 
		 */
		
		String [][] act = { {"[송강호]", "박쥐", "괴물", "관상"},
							{"[이병헌]", "백두산", "내부자들", "광해"},
							{"[류해진]", "올빼미", "럭키", "타짜"} };
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배우 이름: ");
		String str = "[" + sc.next() + "]";
		
		for(int i = 0; i < act.length; i++) {
			if(str.equals(act[i][0])) {
				
				for(int j = 0; j < act[i].length; j++) {
					
					System.out.println(act[i][j]);
					
				}
				
			}else if(i == act.length - 1) {
				System.out.println("해당배우없음");
			}
			
		}
		
		
		
	}

}

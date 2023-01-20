package work.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {

	public static void main(String[] args) {

		/*
			아이디 입력
			비번 입력
			비밀번호 불일치
			
			아이디 입력
			비번 입력
			아이디가 존재하지 않습니다
			
			아이디 입력
			비번 입력 로그인 성공!
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김동준", 3807);
		map.put("동준김", 1111);
		map.put("똥준", 1222);
		map.put("jun", 0000);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("ID: ");
			String id = sc.next();
			System.out.println("PW: ");
			int pw = sc.nextInt();
		
		
		//아이디 존재 여부
		
		if(map.containsKey(id)) {
			//아이디 존재 시 
			if(map.containsValue(pw)) {
				System.out.println("로그인 성공");
				break;
			}else {
				
				System.out.println("비밀번호를 확인하시오");
			}
		}else {
			//아이디 미존재 시 
			System.out.println("아이디가 존재하지 않습니다");
		}
		
		
		
		}
		
		
	}

}

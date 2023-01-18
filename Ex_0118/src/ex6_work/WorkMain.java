package ex6_work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {

		
		/*
			arr = {"samsung", "apple", "LG"}
			배열에 단어를 저장하고 
			담긴 문장 하나를 골라서 랜덤으로 재 정렬
			재 정렬된 문장을 문제로 출제하고 원래의 단어를 맞히는 코드를 작성
			
			ex)samsung 을 고르면
			gunssam 이런식으로 나오게 하고 원래 단어를 알아맞추어 보기
			몇회만에 정답인가용
			
			배열에 새로운 단어가 추가되어도 구현되도록 해보자

		 */
		Random rd = new Random();
		String[] arr = {"LOGITECH", "RAZER", "SAMSUNG", "LG", "APPLE"};
		String str = "";
		System.out.println(arr[0].length());
		Scanner sc = new Scanner(System.in);
		System.out.print("1 부터 " + arr.length + "의 숫자를 입력해주시오.");
		int num = sc.nextInt() - 1;
		int ran[] = new int[arr[num].length()];
	
		//겹치지 않는 난수
		for(int j = 0; j < arr[num].length(); j++) {
			ran[j] = rd.nextInt( arr[num].length() );
			for(int k = 0; k < j; k++) {
				if(ran[k] == ran[j]) {
					j--;
				}
			}
		}
		
		//난수번째 문자를 이어붙이기
		for(int i = 0; i < arr[num].length(); i++) {
			
			str += arr[num].charAt(ran[i]);
			
		}
		System.out.println(str);
		
		while(true) {
			
			System.out.println("답은 뭘까요?");
			String user = sc.next();
			
			if(user.equalsIgnoreCase(arr[num])) {
				System.out.println("정답");
				break;
				
			}else {
				System.out.println("오답");
				
			}
			
		
			
		}
		
		
		
		
		
		
	}

}

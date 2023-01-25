package ex1.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {

	public static void main(String[] args) {

		/*

			추가:  키보드입력값
			출력문: [키보드입력값]
			추가:  키보드입력값2
			출력문: [키보드입력값, 키보드입력값2]
			추가:  키보드입력값3
			출력문: [키보드입력값, 키보드입력값2, 키보드입력값3]
			추가:  exit
			종료

		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int num = 0;
	b :	while(true) {
			
		System.out.println("추가----");
		String user = sc.next();
		if(user.equalsIgnoreCase("exit")) {
			System.exit(0);
		}
		
//		for(int i = 0; i < arr.size(); i ++) {
//			
//			if(user.equals(arr.get(i))) {
//				System.out.println("중복입니다 다시 입력해주세요");
//				continue b;
//			}
//			
//		}
		
		if(arr.contains(user)) {
			
			System.out.println("중복입니다");
			continue b;
		}
		
		
		arr.add(num++ , user);
		System.out.println(arr);
		
		}
		
		
	}

}

package work.ex1;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {

		/*
			정수 판단 코드 try/cdatch 없이
			
		 */
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("입력: ");
		 String user = sc.next();
		 boolean b = true;
		 for(int i = 0; i < user.length(); i++) {
			 if(user.charAt(i) >= '0' && user.charAt(i) <= '9') {
				 continue;
			 }else {
				 b = false;
				 break;
			 }
		 }
		 if(b == true ) {
			 
			 System.out.println(user + " 는 정수입니다.");
			 
		 }else {
			 
			 System.out.println(user + " 는 정수가 아닙니다.");
			 
		 }
		
	}

}

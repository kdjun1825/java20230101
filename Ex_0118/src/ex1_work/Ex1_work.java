package ex1_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		//0117암호화 숙제 
		char[] alCode = {'`','~','!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-',
				'+', '=', '|', '[', ']', '{', '}', ';' , ':', ',' , '.', '/'};         
		char[] numCode = {'q','w','e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};         
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주시오.");
		String str = sc.next();
		Work work = new Work();
		
		//결과를 저장할 변수
		String res = "";
		
		work.setEnc(str, alCode, numCode);
		
		
	}

}

package ex1_string;

import java.util.Arrays;

public class Ex2_method {

	public static void main(String[] args) {

		/*
		 
		 메서드란 ㅇ떤 작업을 수행하기 위한 명령문들의 집합
		 
		  
		 */
		
		String name = "Kim Dong Jun";
		int len = name.length();//길이
		System.out.println(name.length());
		
		int index = name.indexOf('o');//첫번 쨰'o'가 몇번 째 index에 있는지
		System.out.println(index);
		int last_index = name.lastIndexOf('n');//맨뒤에 있는 'n'의 인덱스
		System.out.println(last_index);
		
		char c = name.charAt(4);
		System.out.println(c);//인덱스 4의 문자만 출력
		
		String s1 = name.substring(5);
		System.out.println(s1);//인덱스 5 이후 를 잘라옴(5포함
		s1 = name.substring(5,8);
		System.out.println(s1);
		
		
		name = "Kim. Dong. Jun";
		s1 = name.replace('.', '/');//쌍따옴표 도가능
		System.out.println(s1);
		
		name = name.replaceAll("on", "iiii");
		System.out.println(name);
		
		
		String greet	=	"     h  i          ";
		greet = greet.trim();//앞뒤의 공백을 제거
						System.out.println(greet.length());
		
						
		//equalsIgnoreCase
						
						
		String n = "10";
		int a = Integer.parseInt(n);
		
		String id = " hi hello ";
		id = id.trim();//문장 앞뒤의 의미없는 공백을 제거
		System.out.println("trim사용한 후 길이 : " + id.length());
		
		//특정 문장을 기준으로 배열형태로 나눠서 저장해주는 메서드
		String[] id2 = id.split(" ");
		System.out.println( id2[0] + " / " + id2[1] );
		
		String sss = "abcabcabcabc";
		String[] sss2 = sss.split("a");
		System.out.println(Arrays.toString(sss2));
		
		
	}

}

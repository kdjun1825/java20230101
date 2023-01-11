package ex1_string;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {

		/*
		 
		 String은 두 가지 특징을 가지고 있다.
		 1)객체 생성 방법이 두 가지 (암시적, 명시적)
		 2)한 번 생성된 문자열의 내용은 변하지 않는다.
		 
		  
		 */
		
		String s1 = "abc";
		String s2 = "abc";
		//클래스로 객체를 만들면 heap메모리에 할당을 받아 생성
		//String클래스는 값이 같으면 주소를 같이 사용할 수 있다(이는 암시적 객체 생성
		//new가 없이 메모리 할당을 받을 수 있다
		String s3 = "bbb";
		// 같은 값을 가진 주소가 없으면 새로 생성 
		
		
		if(s1 == s2) {
			System.out.println("같습니다");
			
		}else {
			System.out.println("다릅니다");
		}
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		//new 가 있으면 명시적 객체생성 
		//명시적 은 같은 값을 가진 주소가 있어도 새로 생성
		
		//==은 기본자료형에서는 값을 비교하지만
		//객체에서는 주소값을 비교하기 때문에 명시적으로 생성하면 다르다고 나온다
		if(s1 == s4 || s2 == s4) {
			System.out.println("같습니다");
			
		}else {
			System.out.println("다릅니다");
		}
		
		//String 클래스의 값을 비교할 때에는 equals 사용!
		if(s5.equals(s4)) {
			System.out.println("같습니다");
			
		}else {
			System.out.println("다릅니다");
		}
		
		System.out.println("------------");
//		Scanner sc = new Scanner(System.in);
//		s3 = sc.next(); //scanner는 객체. 암시적으로가 불가능
//		
		//그래서 주소를 비교하면 당연히 다르다고 나옴 값을 비교하면 같다고 나옴
		if(s1 == s3) {
			System.out.println("같습니다");
			
		}else {
			System.out.println("다릅니다");
		}
		
		System.out.println("-------------");
		
		String greet = "안녕";
		greet += "하세요";
		// heap메모리에 "안녕"이라는 주소 가 저장되고
		// "안녕하세요" 가 되는 새로운 주소가 생성된다
		// 가비지컬렉터가 안쓰이는 "안녕"을 지워줌으로 메모리를 정리해준다
		System.out.println(greet);
		
		System.out.println("-------------");
		
		s1 = "bbb";
		s2 = "bbb";
		//"bbb"의 값을 가진 주소를 동시에 참조하는데
		//값을 바꿀 때 불변하지 않는다면 다른 값까지 바뀌기 때문에 String은 불변성을 가진다
		
		
		
		
		
		
		
	}

}

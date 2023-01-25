package ex1.list2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		
		/*
			이름: 김동준
			나이 20
			김동준  / 20
			------

			이름: 동준  김
			나이 32
			김동준  / 20
			동준  김  / 32
			------
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		ArrayList<User> list = new ArrayList<User>();
		//user클래스로만든 객체 저장
		
		
b:		while(true) {
			User u = new User();//유저 객체를 반복문 밖으로 입력하면 add시에  모든 index가 동일시 된다
			//리스트의 add 시에 u객체의 저장되어있는 주소를 참조하기 때문에 반복문 안에 있으면 새로 공간을 만들기 때문에 다른 주소의 값을 add해서 추가할 수가 있게 된다.
			//이 때 기존 값은 이미 list의 index에서 참조하고 있기 때문에 새로 u 객체 공간이 만들어져도 상관이 없다.
			
			System.out.println("이름?");
			String name = sc.next();
			
			for(int i = 0; i < list.size(); i++) {
				
				if(list.get(i).getName().equals(name)) {
					System.out.println("이름 중복입니다");
					continue b;
				}
				
			}
			
			System.out.println("나이?");
			int age = sc.nextInt();
			
			u.setName(name);
			u.setAge(age);
			list.add(u)	;//generic 타입 User객체로 저장 여러가지 자료형을 같이 저장할 때
			
			for(int i = 0; i < list.size(); i++) {
				
			System.out.println(list.get(i).getName() + " | " + list.get(i).getAge());
			
			
			}
			
			
			
			
			
		}
		
		
	}

}

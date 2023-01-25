package ex1.list;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {

		//ArrayList: 다른 컬렉션 객체들과 같이 size가 정해져 있지 않다.
		//index구조로 접근이 가능하여 목록 조회등이나 객체 관리가 편리
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(1011);
		list.add(0, 1);//기존의 index를 add로 추가시킬 수 있고 기존 값들은 하나씩 밀려난다 
		list.set(1, 15);//set으로 특정 index 수정 가능
		list.remove(1);//index의 값을 지우고 하나씩 앞당겨진다
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println("-----------------");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		
	}

}

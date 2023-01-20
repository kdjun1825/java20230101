package ex1.collection.map;

import java.util.HashMap;

public class Ex1_Map {

	public static void main(String[] args) {
		
		//키값을 통해서 value를 바로 검색할 때 , 원하는 값을 찾아낼 때 좋다
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		hm.put(1, "put으로 값을 넣어욧");
		hm.put(2, "add로 저장 안해용");
		hm.put(3, "너무 졸려요....");
		
		
		System.out.println(hm.get(1));
		//get으로 value 를 가져와유
		
		
		
		//hm에 key 값이 1이 있다면 true
		if(hm.containsKey(1)){
			System.out.println(hm.get(2));
		}
		if(hm.containsValue("너무 졸려요....")){
			System.out.println("키가 있다");
		}
		
		hm.remove(2);//키값으로 방을 지울 수 있다.
		
		
	}

}

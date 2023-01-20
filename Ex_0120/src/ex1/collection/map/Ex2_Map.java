package ex1.collection.map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {

	public static void main(String[] args) {

		HashMap<String, Character> hm = new HashMap<String, Character>();
		
		hm.put("k1", 'a');
		hm.put("k2", '3');
		hm.put("k4", 'b');
		hm.put("k3", 'e');
		System.out.println(hm.values());
		
		//값만 가지고 오려면 set과 마찬가지로 배열로 가지고 와야한다
		//<> 안에는 불러올 value의 wrapper클래스로 가져와야 한다.
		Collection<Character> values = hm.values();
		Character[] arr = values.toArray(new Character[0]);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		char res = hm.get("k1");
		System.out.println(res);
		
		
		
	}

}

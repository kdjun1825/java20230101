package ex1.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex1_set {

	public static void main(String[] args) {

		/*
			다수의 데이터를 쉬비게 처리할 수 있는 방법을 제공하는 클래스의 집합
			ArrayList
			HashSet, TreeSet
			HashMap
		 */
		
		HashSet<Integer> hash = new HashSet<Integer>();
		//collection은 모두 generic타입이라 꺽새 안에 클래스만 들어갈 수 있다.
		//Set : 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
		
		hash.clear();
		hash.add(20);
		hash.add(30);
		hash.add(10);
		//set은 들어가는 순서가 코드대로 진행이 되지는 않는다
		
		//메모리 상 추가할 때마다 주소가 하나씩 생긴다 중복을 지워줘
		System.out.println(hash);
		System.out.println(hash.size());
		//set은 배열처럼 index로 접근하는 것이 불가
		//접근하고 싶다면 배열로 변경한 뒤 배열에서 index접근
		
		Integer[] arr = hash.toArray( new Integer[0]);
		System.out.println(arr.length);
		System.out.println( arr[1]);
		
		
		
		
		
		
		
		
	}

}

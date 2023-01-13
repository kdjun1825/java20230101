package ex2_class_array;

public class PersonMain {

	public static void main(String[] args) {

		Person[] per = new Person[3]; //3개로 나뉘어진 공간만 생성됨
		//String 을 제외하고는 배열화를 하면 각 index 별로 메모리 할당을 해야된다
		for(int i = 0; i < per.length; i++) {
			per[i] = new Person();
			//클래스로 배열을만들면 여러가지 데이터 타입을 같이 담을 수 있다.
			
		}
		
		per[0].setAge(23);
		per[0].setName("김동준");
		
		
		per[1].setAge(20);
		per[1].setName("김");
		
		
		per[2].setName("김준");
		per[2].setAge(33);
		
		for(int i = 0; i < per.length; i++) {
			System.out.println(per[i].getAge());
			System.out.println(per[i].getName());
			
		}
		
		
		
		
		
		
		
	}

}

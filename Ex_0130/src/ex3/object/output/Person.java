package ex3.object.output;

import java.io.Serializable;


//객체의 직렬화를 serializable을 통해 한다
//객체를 스트림으로 통째로 저장하기 위해서는 새로운 메모리 영역에 속성과  메서드들을 일렬로 복사해서 저장해둬여한다.
//직렬화 자동으로 해줌
public class Person implements Serializable{

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

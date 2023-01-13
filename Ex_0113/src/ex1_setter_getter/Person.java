package ex1_setter_getter;

public class Person {
	//setter&getter : 의도적이지 않게 값이 바뀌는 경우를 막으려고
	//private속성으로 만들어진 것들
	private String name;
	private String phone;
	private int age;
	
	//this. : 현재 클래스 자신 내의 ~~
	//값을 바꾸지 않고 받아오고만 싶으면  getter만
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

package ex1_class;

public class Computer {

	//클래스의 구성요소
	//1.변수, 속성, 멤버...
	//2.메서드, 함수, 기능....
	
	//컴퓨터를 만들기 위한 설계작업
	
	private String brand = "HP";
	int ssd = 512;
	int ram = 32;
	float cpu = 4.1f;
	String color = "WHITE";
	
	
	//컴퓨터 성능을 확인하기 위한 메서드(기능
	//메서드: 반복으로 사용되는 코드를 줄이기 위함
	
	public void getInfo() {
		
		System.out.println("제조사 : " + brand);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		
	}
	
	
	//메서드 구성
	//public void getInfo()	
	//접근제한자 반환형 메서드명(파라미터, 인자, 매개변수)
	

	//접근제한자 
	//public : 같은 프로젝트 내의 모든 객체들에게 열려있음
	//private : 현재 클래스에서만 사용가능
	//protected : 상속관계의 객체들에게만 사용을 허가
	//default : 현재 패키지 객체들에게 허가 ( 아무것도 안쓰는 것이 default
	
	/*
		
		default나 public은 값 변경이 가능하므로
		바꿀 수 없게 만드려면 private을 사용


	 */
	
	
	
	
	
	
	
	
}

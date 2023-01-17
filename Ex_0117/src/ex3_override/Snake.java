package ex3_override;

public class Snake extends Animal{

	
	String sensor = "좋은센서";
	
	
	
	//method 의 override : 메서드의 재정의  라는 의미를 가지며 상속관계의 객체에서 
	//부모의 메서드를 가져와 자식의 사정에 맞게 내용만 재정의 할 수 있도록 하는 기능
	@Override
	public int getLeg() {
		
		return 0;
	}
}

package ex5_super;

public class Child extends Parent{

	
	
	public Child() {
		//super란 부모클래스.
		super(10);
		super.name = "홍길동";
		System.out.println("child 의 생성자" + name);
	}
	
	@Override
	public void getMsg() {
		
//		super.getMsg(); 부모의 getmsg를 사용
		System.out.println("나는 자식");
	}
	
}

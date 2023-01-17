package ex2_inheritance;

public class ExtendsMain {

	public static void main(String[] args) {

		//상속관계에서의 자식클래스는 부모가 가진 
		Child c1 = new Child();
		System.out.println(c1.money); 
//		System.out.println(c1.str);
		System.out.println(c1.car);
		//자식 클래스에서 부모의 속성들을 자신의 것처럼 쓸 수 있다. (상속 관계에서)
		
		//c1객체를 만들었을 때 부모 속성을 먼저 만들고 자식 영역이 생긴다
		//메모리 시작 주소가 같기 때문에 먼저 만들어진 부모 영역을 거칠 수 있다.
		
		
		Parent p1 = new Parent();
		//부모 클래스 객체 생성 때에는 자신의 영역만 생겨서 자식에게 접근 불가
		
		
		//최 상위의 object와도 같다고 나온다
		if(c1 instanceof Parent) {
			System.out.println("c1은 parent와 instance가 같습니다");
		}
		
		
		
	}

}

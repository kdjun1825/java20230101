package ex2_abstract;

public class AbsMain {

	public static void main(String[] args) {

		//추상화 클래스는 완성하지 못하면 메모리 할당을 못받는다.
		//직접적으로 메모리 할당받는 것이 불가하다
		/*		AbsEx parent = new AbsEx() {
					
					@Override
					public void setValue(int n) {
					}
				};
		*/		
		
		//추상클래스는 자식클래스가 생건 될 때 함께 메모리 할당을 받게 된다.
		AbsChild child = new AbsChild();
		child.setValue(10);
	}

}

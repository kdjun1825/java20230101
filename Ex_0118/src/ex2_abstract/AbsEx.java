package ex2_abstract;

public abstract class AbsEx {

	//추상클래스. 추상메서드를 한 개 이상 가지고 있는 클래스 
	//추상클래스는 abstract키워드를 통해 추상 클래스임을 명시해주어야 한다.
	
	int value = 100;
	int num	= 20;
	
	public int getNum() {
		return num;
	}
	
	
	//추상 메서드는 body 가 없다. 
	//abstract키워드를 통해 추상메서드임을 명시해주어야 한다.
	
	//추상 메서드는 몸체가 없기 때문에 '미완성의 개념' 이라고한다
	//미 완성된  메서드를 자식 클래스가 물려받아 완성시키는 것이 조건이 된다.
	public abstract void setValue(int n);
	
	
	
}

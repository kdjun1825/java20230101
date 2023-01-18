package ex4_interface;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public interface InterTest {

	//인터페이스
	//서비스 요청에 따른 중개자 역할을 하는 클래스
	//인터페이스 내부에는 상수, 추상 메서드만 추가가 가능
	
	final int VALUE = 100;
	// 상수. 변하지 않는 수  final
	//상수는 모든 대문자.
	abstract int getVALUE();
	
	
	

}

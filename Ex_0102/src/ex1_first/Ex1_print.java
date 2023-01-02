package ex1_first;

public class Ex1_print {

	public static void main(String[] args) {
		
		//주석: 컴파일할 때 JVM이 인지하지 못하는 메모 용도의 텍스트 영역
		System.out.println(100);
		System.out.println(200);
		System.out.println("안녕하세요.");
		System.out.println(200 + 100);
		System.out.println(200 * 100);
		System.out.println("200" + 100);
		System.out.println("200" + "100");
		System.out.println("200 + 100 = "  + 200 + 100);
		//문자열 뒤 + 다 이어붙이기
		System.out.println("200 + 100 = "  + (200 + 100));
		//괄호계산
		System.out.println("200 * 100 = "  + 200 * 100);
		
		
	}

}

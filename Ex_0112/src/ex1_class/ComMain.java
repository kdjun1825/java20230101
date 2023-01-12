package ex1_class;

public class ComMain {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		//new 로 명시적 객체생성
		//명시적은 heap에 새로 생성
		
		System.out.println(com.ssd);
		System.out.println(com.ram);
		System.out.println(com.cpu);
		System.out.println(com.color);
		
		System.out.println("-------------");
		
		Computer com2 = new Computer();
		//명시적 = 새로 heap에 생성 ( 같은 설계도 사용 똑같은 내용)
		
		System.out.println(com2.ssd);
		System.out.println(com2.ram);
		System.out.println(com2.cpu);
		System.out.println(com2.color);
		
		System.out.println("-------------");
		
		Computer com3 = new Computer();
		//명시적 = 새로 heap에 생성 ( 같은 설계도 사용 똑같은 내용)
		com3.ssd = 1024;
		System.out.println(com3.ssd);
		System.out.println(com3.ram);
		System.out.println(com3.cpu);
		System.out.println(com3.color);
		
		
		System.out.println("-------------");
		
		Computer com4 = new Computer();
		com4.ssd = 1024;
		com4.getInfo();//class에서 출력문 기[[[l
	}
	
}

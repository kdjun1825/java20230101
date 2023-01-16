package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {

		Bread bd = new Bread();
		
		
		//makeBread() 1  호출 시 
		//빵을 만들었습니다.
		
		//makeBread(정수) 2  호출 시 
		//빵을 만들었습니다
		//빵을 만들었습니다
		//x개의 빵을 만들었습니다
		
		//makeBread(정수, 스트링) 3  호출 시 
		//원하는 빵을 몇개 만들건디
		
		
		bd.makeBread();
		bd.makeBread(5);
		bd.makeBread(5, "소세지 빵");
		
	}

}

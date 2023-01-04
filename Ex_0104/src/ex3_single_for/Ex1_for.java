package ex3_single_for;

public class Ex1_for {

	public static void main(String[] args) {

		for( int i = 0; i < 10; i++) {
			int j = 10;
			System.out.println(i);
		}
		
		//for문 안에서 만들어진 지역변수 i는 for문의ㅡ 소속이므로 for영역 밖에서 사용불가
		//지역변수.
		
		int k = 0;
		
		for ( k = 1; k < 4; k++) {
			
			System.out.println("(for)k : " + k);
			
		}
		System.out.println("k : " + k);
		System.out.println("-----------------------");
		//10부터 1까지 감소되는 값 구하기
		//i 는 이전에 지역변수이기 때문에 다른 지역변수에서 같은이름으로 i를 만들어도 된다.
		for( int i = 10; i > 0; i--	) {
			System.out.println(i);
		}
		
		//혹은
		for ( int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
		System.out.println("-----------------------");

		
		//1부터 100까지 100회전 하는 for문을 만들되,
		//3의배수만 출력
		for( int i = 1; i <= 100; i++) {
			
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		//or
		for( int i = 0; i < 100; i++) {
					
					if(i == 0) {
						
					}else if(i % 3 ==0) {
						System.out.println(i);
					}
				}
		
	}

}

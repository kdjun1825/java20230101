package ex5_printf;

public class Ex1_formatter {

	public static void main(String[] args) {

		//formatter : 사용할 데이터의 결과를 원하는 구조로 출력 가능하게 해주는 문법
		
		//로늘은 23년 1월 5일 입니다.
		int y = 23;
		int m = 1;
		int d = 5;
		System.out.printf("오늘은 %d년 %02d월 %02d일 \n", y, m, d);
		//printf는 어떤 값을 출력할지 적어줘야 된다. 
		//%02d = 두자리로 표현하고 한 자리라면 앞을 0으로 채운다
		
		//오늘의 날씨는 13.5도 입니다.
		System.out.printf("오늘의 날씨는 %.1f도 입니다\n", 13.5f);
		
		//저는 A형 입니다.
		char c = 'A';
		System.out.printf("저는 %c형 입니다.\n", c);
		
		
		//제 이름은 홍길동 입니다.
		System.out.printf("제 이름은 %s입니다\n", "홍길동");
		
		//오늘은 100%이해했습니다
		System.out.printf("오늘은 %d%% 이해했습니다", 100);
		
				
		//%d는 정수
		//%f는 실수 
		//%c는 문자
		//%s는 문자열
		//%%는 %를 출력
		
		
		
		
	}

}

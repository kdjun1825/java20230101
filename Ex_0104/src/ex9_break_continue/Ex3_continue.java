package ex9_break_continue;

public class Ex3_continue {

	public static void main(String[] args) {

		//continue문 : 반복문 내에서 특정 문장을 무시하고 건너뛰고자 할 때 사용되는 키워드
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(j % 2 == 0) {
					
					continue;//for문 내부의 continue를 만나면  아래의 코드를 하지 않고 증감식 과정으로 이어진다
				}
				System.out.print(j + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}

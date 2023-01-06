package ex9_break_continue;

public class Ex2_break {

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {
			
			switch (i) {
			case 0:
				System.out.println("0");
				break;//switch문의 break;는 반복문이 아닌. switch문만 탈출
			case 1:
				System.out.println("1");
				break;

			}
			
		}
		
		
	}

}

package ex2_switch;

public class Ex4_work {

	public static void main(String[] args) {

		/*

 			1월부터 12월까지 월중에 
 			실행할 때 해당 월의 일수 나타내기
 			
 
		 */
		
		int mon = 2;
		
		
		
		switch (mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(mon + " 달은  31일 까지 있습니다.");
			break;
			
		case 2: 
			System.out.println(mon + " 달은  28 일 혹은 29일 까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(mon + " 달은  30일 까지 있습니다.");
			break;

		default:
			System.out.println(mon + " 달은  없습니다 다시 입력하시오.");
			break;
		}
	}

}

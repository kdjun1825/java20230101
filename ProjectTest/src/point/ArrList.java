package point;
import java.util.Scanner;

public class ArrList {

	public static void main(String[] args) {

		//적립 버튼 눌렀을 시 
		PointController pc = new PointController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("휴대폰 번호:");
		int pNum = sc.nextInt();
		pc.selectUser(pNum);
		
		System.out.println("사용? 적립?");
		String str = sc.next();
		if(str.equals("사용")) {
			System.out.println("얼마사용?");
			int point = sc.nextInt();
			pc.usePoint(point, pNum);
			
		}
		
		
		
	}

}

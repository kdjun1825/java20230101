package ex1_operator;

public class Ex2_work {

	public static void main(String[] args) {

		int a = 10;
		int b = 12;
		int c = 10%12;
		
		boolean  bool;
		
		bool = ++a >= b || 2 + 7 <= b && 13 - b >0 && (a += b) -       (a % b) > 10 ? true : false;
		System.out.println(bool);
//		11 >= 12 ||    9  <= 12 &&    1  >0 &&(a = 11+12)(23) - ( 11 )  > 10 ? 1 : 0;
//		 false   ||   true		&& true		&& true							 ? 1 : 0;
	//  답 : 1
	}

}

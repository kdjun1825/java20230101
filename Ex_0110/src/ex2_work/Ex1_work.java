package ex2_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		/*
		 
		 키보드에서 입력받은 값 만큼 피보나치 수열 출력
		 ex) 입력: 4
		0 1 1 2 3 5 8 13 21....
		 3까지 출력
		 
		  
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int user = sc.nextInt();
		int front = 0 ;
		int back = 1;
		int num = 1;
		//					4
		for(int i = 0; i < user; i++) {
			
			if( i == 0 ) {
				System.out.print(num);
			}else {
				num = front + back;
				System.out.print(", " +num);
				front = back;
				back =  num;
			}
				
// front = 1
// back = 0
// num = l;
			//  0  ~ length
			//front = back;
			//back = num;
			//num = front + back'
			//print(back)
			//i = 0  0,1,1  1
			//    1  1,1,2  1
			//    2  1,2,3  2
			
			
		}
		
	}

}

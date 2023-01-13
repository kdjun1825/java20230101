package ex3_account;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		int money;
		Atm atm = new Atm();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		
		while(b) {
			
			System.out.println("1. 입      금: ");
			System.out.println("2. 출      금: ");
			System.out.println("3. 잔액확인: ");
			System.out.println("종료");
			System.out.print(">>>");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("----입      금----");
				System.out.println("-입금액 : ");
				money = sc.nextInt();
				atm.push(money);
				break;
			case 2:
				System.out.println("----출      금----");
				System.out.println("-출금액 : ");
				money = sc.nextInt();
				atm.pull(money);
				break;
			case 3:
				System.out.println("----잔액확인----");
				
				System.out.println("-잔 액 : " + atm.getMoney());
				System.out.println("-------------");
				break;

			default:
				System.out.println("----종료----");
				b = false;
				break;
				
				
				
			}
		
		}
		
		
		
	}

}

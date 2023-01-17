package ex1_vending;

import java.util.Scanner;

public class VenMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vending vd = new Vending();
		
		System.out.println("투입기 : ");
		int money = sc.nextInt();
		
		vd.showCans(money);
		
		System.out.println("음료 선택 : ");
		String select = sc.next();
	}

}

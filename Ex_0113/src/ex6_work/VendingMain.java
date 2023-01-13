package ex6_work;

import java.util.Scanner;

import ex2_class_array.Person;

public class VendingMain {

	public static void main(String[] args) {
		/*
		 자판기 (객체 배열
		
		음료 정보 출력(이름, 가격)
		insert : 1000 - 유저 입력
		입력 값 으로 살 수 있는 음료수만 출력
		insert : 음료이름
		임료이름을 선택했습니다(음료반환
		잔액:xxx을 받으세요.(반환
		
		 
		 */
		Scanner sc = new Scanner(System.in);
		//정보가 있는 객체
		DrinkInfo di = new DrinkInfo();
		
		//기본 음료수 정보 출력
		VendingMethod[] vd = di.info();
		
		//사용자 금액 입력
		System.out.println("넣을 금액: ");
		int uCoin = sc.nextInt();
		di.coinInfo(uCoin, vd);
		
		//금액에 맞는 음료 출력
		
		//
		
		
		//구매할 음료 이름 입력
		System.out.println("구매할 음료 이름: ");
		String uName = sc.next();
		di.selectDrink(uName, vd, uCoin);
		
		//xx를 구매했습니다!
		//거스름돈 반환
		
	}

}

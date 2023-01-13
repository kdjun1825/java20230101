package ex5_work;

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
		
		//기본 음료수 정보 출력

		VendingMethod[]  dInfo = new VendingMethod[5];
		for(int i = 0; i < dInfo.length; i++) {
			
			dInfo[i] = new VendingMethod();
		}
		
		dInfo[0].setName("콜라");
		dInfo[0].setPrice(1600);
		dInfo[1].setName("생수");
		dInfo[1].setPrice(900);
		dInfo[2].setName("파워에이드");
		dInfo[2].setPrice(1200);
		dInfo[3].setName("딸기우유");
		dInfo[3].setPrice(1400);
		dInfo[4].setName("링티");
		dInfo[4].setPrice(2900);
		
		for(int i = 0; i < dInfo.length; i++) {
			System.out.println(dInfo[i].getName() + "\t |" + dInfo[i].getPrice() + "원");
		}
		System.out.println("--------------------");
		
		
		//사용자 금액 입력
		System.out.println("넣을 금액: ");
		int uCoin = sc.nextInt();

		
		//금액에 맞는 음료 출력
		for(int i = 0; i < dInfo.length;i++) {
			
			if(uCoin > dInfo[i].getPrice()) {
				System.out.println(dInfo[i].getName() + "\t |" + dInfo[i].getPrice() + "원");
				
			}
			
		}
		System.out.println("--------------------");
		
		
		//구매할 음료 이름 입력
		System.out.println("구매할 음료 이름: ");
		String uName = sc.next();
		for(int i = 0; i < dInfo.length; i++) {
			if(uName.equals(dInfo[i].getName())){
				System.out.println(dInfo[i].getName() + " 을 구매했습니다.");
				System.out.println("거스름 돈은 " + (uCoin - dInfo[i].getPrice()) + "원 입니다");
				break;
			}
			
		}
		
		
		//xx를 구매했습니다!
		//거스름돈 반환
		
	}

}

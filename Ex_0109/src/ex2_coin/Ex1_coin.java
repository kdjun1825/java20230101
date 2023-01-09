package ex2_coin;

import java.util.Random;

public class Ex1_coin {

	public static void main(String[] args) {
		
		/*
		 
		 변수 money에 10~5000 까지의 난수를 만들어 넣는다
		 단 1의자리는 0이 되어야 한다
		 발생된 난수 money를 동전으로 바꿨을 때,
		 500, 100, 50, 10으로 몇개 거슬러 지는지 구현
		 단, 가능한 한 
		 
		 
		 */
		int [] coin = {500, 100, 50, 10};
		Random rnd = new Random();
		int money; 
		
		
		money = rnd.nextInt(500) + 1;
		money *= 10;
		System.out.println(money);
		
		
		for(int i = 0; i < coin.length; i++) {
			
			int res = money / coin[i];
			if(res > 0) {
				System.out.println(coin[i] + "원 동전 : " + res + " 개");
				money %= coin[i];
			}
			
		}
		

		
		
		
	}

}

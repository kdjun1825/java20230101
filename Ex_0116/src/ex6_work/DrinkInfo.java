package ex6_work;

public class DrinkInfo {
	
	private VendingMethod[] ven = new VendingMethod[5];
	
	public DrinkInfo() {
		for(int i = 0; i < ven.length; i++) {
			
			ven[i] = new VendingMethod();
		}
		System.out.println("배열공간만들기 성공");
		
		ven[0].setName("콜라");
		ven[0].setPrice(1400);
		ven[1].setName("생수");
		ven[1].setPrice(900);
		ven[2].setName("파워에이드");
		ven[2].setPrice(1200);
		ven[3].setName("딸기우유");
		ven[3].setPrice(1400);
		ven[4].setName("링티");
		ven[4].setPrice(2900);
		
		
		for(int i = 0; i < ven.length; i++) {
			System.out.println(ven[i].getName() + "\t |" + ven[i].getPrice() + "원");
		}
		System.out.println("--------------------");
		
	}
		
		public void coinInfo(int uCoin) {
			
			for (int i = 0; i < ven.length; i++) {
				
				if(uCoin >= ven[i].getPrice()) {
					
					System.out.println(ven[i].getName() + "\t |" + ven[i].getPrice() + "원");
					
				}

			}
			System.out.println("--------------------");
			
		}
		
		public void selectDrink(String uName, int uCoin) {
			
			for(int i = 0; i < ven.length; i++) {
				if(uName.equals(ven[i].getName())){
					System.out.println(ven[i].getName() + " 을 구매했습니다.");
					System.out.println("거스름 돈은 " + (uCoin - ven[i].getPrice()) + "원 입니다");
					break;
				}
				
			}
			
		}
	
	
	
	
}

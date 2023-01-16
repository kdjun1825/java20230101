package ex6_work;

public class DrinkInfo {
	
	
	//private으로바꿔보기
	public VendingMethod[] info() {
			
			VendingMethod[]  dInfo = new VendingMethod[5];
			for(int i = 0; i < dInfo.length; i++) {
				
				dInfo[i] = new VendingMethod();
			}
			
			dInfo[0].setName("콜라");
			dInfo[0].setPrice(1400);
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
			return dInfo;
		}
		
		public void coinInfo(int uCoin, VendingMethod[] dInfo) {
			
			for (int i = 0; i < dInfo.length; i++) {
				
				if(uCoin >= dInfo[i].getPrice()) {
					
					System.out.println(dInfo[i].getName() + "\t |" + dInfo[i].getPrice() + "원");
					System.out.println("--------------------");
					
				}

			}
			
		}
		
		public void selectDrink(String uName, VendingMethod[] dInfo, int uCoin) {
			
			for(int i = 0; i < dInfo.length; i++) {
				if(uName.equals(dInfo[i].getName())){
					System.out.println(dInfo[i].getName() + " 을 구매했습니다.");
					System.out.println("거스름 돈은 " + (uCoin - dInfo[i].getPrice()) + "원 입니다");
					break;
				}
				
			}
			
		}
	
	
	
	
}

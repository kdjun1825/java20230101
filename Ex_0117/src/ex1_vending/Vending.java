package ex1_vending;

public class Vending {


		private int money;
		
		private Can[] can = new Can[5];
		
		public Vending() {
			
			can[0] = new Can ("콜라", 1400);
			can[1] = new Can ("사이다", 1100);
			can[2] = new Can ("환타", 1200);
			can[3] = new Can ("코코팜", 1600);
			can[4] = new Can ("데자와", 100);
			
		}
		
		public void showCans(int money) {
			
			this.money = money;
			
			for(int i = 0; i < can.length; i++) {
				
				if(can[i].getPrice() <= money) {
					
					System.out.println(can[i].getCanName() + "   |   " + can[i].getPrice());
					
					
				}
				
			}
			
		}
		
		
		//
		public int outCan(String name) {
			
			for(int i = 0; i < can.length; i++) {
				
				if(can[i].getPrice() <= money) {
					
					
					if(can[i].getCanName().equalsIgnoreCase(name)) {
						
						System.out.println(can[i].getCanName() + "을 구매했습니다.");
						money = money - can[i].getPrice();
						
					}
					
				}else {
					System.out.println("금액이 부족합니다");
				}
				
				System.out.println("잔액 : " + (money - can[i].getPrice()));
			}
			
			return money;
		}
		

}

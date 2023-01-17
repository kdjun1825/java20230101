package ex6_work;

import java.util.Arrays;

public class DrinkInfo {
	
	VendingMethod[] vm = new VendingMethod[5];	
	public void dInfo() {
		vm[0] = new VendingMethod("콜라", 1400);
		vm[1] = new VendingMethod("웰치스", 1000);
		vm[2] = new VendingMethod("사이다", 1200);
		vm[3] = new VendingMethod("링티", 2900);
		vm[4] = new VendingMethod("바나나우유", 1500);
		for(int i = 0; i < vm.length; i++) {
			System.out.println(vm[i].getName() + "\t |" + vm[i].getPrice() + "원");
		}
		
	}
		
		public void coinInfo(int uCoin) {
			
			for (int i = 0; i < vm.length; i++) {
				
				if(uCoin >= vm[i].getPrice()) {
					
					System.out.println(vm[i].getName() + "\t |" + vm[i].getPrice() + "원");
					
				}

			}
			System.out.println("--------------------");
			
		}
		
		public void selectDrink(String uName, int uCoin) {
			
			for(int i = 0; i < vm.length; i++) {
				if(uName.equals(vm[i].getName())){
					System.out.println(vm[i].getName() + " 을 구매했습니다.");
					System.out.println("거스름 돈은 " + (uCoin - vm[i].getPrice()) + "원 입니다");
					break;
				}
				
			}
			
		}
	
	
	
	
}

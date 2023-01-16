package ex7_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		int snack = 700; 
		int cream = 500;
		int coke = 400;
		int min = 1600;
		Scanner sc = new Scanner(System.in);
		System.out.print("가진돈: ");
		int money = sc.nextInt() - min;
		
		
		//2400/700   3
		for(int i = 0; i <= (money/snack); i++ ) {
			int num1 = money - (i * snack);
			for(int j = 0; j <= (num1/cream); j++) {
				int num2 = num1 - (j * cream);
				for(int k = 0; k <= (num2/coke); k ++) {
					int num3 = num2 - (k * coke);
					if(num3 == 0) {
						System.out.println("새우깡 : " + (i+1) + "개" + 
										   "크림빵 : " + (j+1) + "개" +
										   "콜   라 : " + (k+1) + "개");
					}
					
					
				}
			}
		}
		
		
	}

}

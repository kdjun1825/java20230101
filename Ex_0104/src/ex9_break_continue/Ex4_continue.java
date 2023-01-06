package ex9_break_continue;

import oracle.jrockit.jfr.tools.ConCatRepository;

public class Ex4_continue {

	public static void main(String[] args) {

		int n = 0;
		while(n < 5) {
			n++;
			
			if(n == 4) {	
				continue;//아래 코드 진행하지 않고 다시 while문 실행
			}
			
			System.out.println(n);
		}
		
		System.out.println("--------------");
		
		int n2 = 0;
		
		for(n2 = 0; n2 < 5; n2++) {
			
			switch (n2) {
			case 0:
				System.out.println("0임");
				continue;
			case 1:
				System.out.println("1임");
				continue;
			}
		
		}
		
		
		
	}

}

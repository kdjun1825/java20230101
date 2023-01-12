package ex8_work;

import java.util.Random;

public class GMethod {

	
	
	//난수 100개 생성
	public String newRnd() {
		
		int n;
		String num = "";
		
		Random rd = new Random();
		
		for(int i = 0; i < 100; i++) {
			
			n = rd.nextInt(10);
			num += n;
			
		}
		return num;
	}
	
	public void numCount() {
		
		String num = newRnd();
		System.out.println(num);
		//0~ 9 찾기
		for(int j = 0; j <10; j++) {
			
			int count = 0;
			//0~9 갯수찾기
			for(int i = 0; i < num.length(); i++) {
				
				if(num.charAt(i) == ((char)j + '0')) {
					
					count++;
					
				}
				
			}
			
			//#출력
			System.out.print(j + "의 갯수 : ");
			
			for(int k = 0; k < count; k++) {
				
				System.out.print('#');
				
			}
			
			System.out.println(" " + count + "개");
			
		}
		
		
	}
	
	
	
}

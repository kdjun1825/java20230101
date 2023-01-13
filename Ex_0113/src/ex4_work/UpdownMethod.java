package ex4_work;

public class UpdownMethod {

	private int loof = 0;
	private int sys;
	private boolean b = true;
	
	
	
	
	public boolean getB() {
		return b;
	}
	
	
	public void setSys(int sys) {
		this.sys = sys;
	}//생성한 난수 값  this.sys로 가져와서 쓰기 
	
	
	//실제 비교 기능
	public void numCheck(int user) {
		System.out.println(sys);
		
		loof++;//회차 카운트  입력한 순간 1회 이기 때문에 올리고 비교 시작
		
		
		if(user < sys) {
			
			System.out.println(user + "  보다 큽니다");
			
		}else if(user > sys) {
			
			System.out.println(user + "  보다 작습니다");
			
			
		}else {
			//정답
			System.out.println(loof + " 회만에 정답입니다");
			b = false;//b 를 false로 바꾸어 main의 loof 정지
		}
		
		
		
	}
	
	
}

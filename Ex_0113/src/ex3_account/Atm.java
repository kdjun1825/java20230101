package ex3_account;

public class Atm {

	private int money;
	
	//입금
	public void push(int money) {
		this.money += money;
		System.out.println("----입금성공----");
	}
	
	//출금
	public int pull(int money) {
		if(this.money - money < 0) {
			System.out.println("잔액부족");
			return 0;
		}else {
			
			this.money -= money;
			System.out.println("----출금성공----");
		}
		return money;
	}
	
	//잔액
	public int getMoney() {
		return money;
	}
	
}

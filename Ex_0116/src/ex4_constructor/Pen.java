package ex4_constructor;

public class Pen {

	private String color;
	private String brand;
	private int price;
	
	
	//특별하게 값을 설정하고 바꾸지 않고싶을 때 오버로드를 이용해 특별값을 만들 수 있다.
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		
	}
	
	//오버로드생성자와 기본생성자를 다 쓰고 싶다면 각각 생성자를 만들어 논다.
	public Pen() {
		brand = "monami";
		color = "red";
		price = 100000;
	}
	

	
	public void result() {
		
		System.out.println(color + ",  " + brand + ",   " + price);
		
	}
	
	
}

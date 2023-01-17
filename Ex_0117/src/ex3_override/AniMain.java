package ex3_override;

public class AniMain {

	public static void main(String[] args) {

		
		
		Bear bear = new Bear();
		System.out.println( "눈 : " + bear.getEye());
		System.out.println( "다리 : " + bear.getLeg());
		System.out.println(" 특징 : " + bear.woong);
		System.out.println("---------------");
		
		Lion lion = new Lion();
		System.out.println( "눈 : " + lion.getEye());
		System.out.println( "다리 : " + lion.getLeg());
		System.out.println(" 특징 : " + lion.hair);
		System.out.println("---------------");
		
		Elephant el = new Elephant();
		System.out.println( "눈 : " + el.getEye());
		System.out.println( "다리 : " + el.getLeg());
		System.out.println(" 특징 : " + el.nose);
		System.out.println("---------------");
		
		Snake snake = new Snake();
		System.out.println( "눈 : " + snake.getEye());
		System.out.println( "다리 : " + snake.getLeg());
		System.out.println(" 특징 : " + snake.sensor);
		System.out.println("---------------");
	}

}

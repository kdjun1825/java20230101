package ex1_operator;

public class Ex3_work {

	public static void main(String[] args) {

		/*
		 
		 결과)
		 하루생산량 = 17개
		 시간당 평균 = 17/24  0.xxxxx개
		 
		 과수원이 있다. 
		 배, 사과, 오렌지를 키우고 있는데, 하루생산량은 각각
		 5, 7, 5개이다.
		 
		 1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2)한시간에 몇개의 과일이 생산되는지 출력
		 
		 #단, 과일의 갯수와 하루생산량를 저장할 변수는 int
		 시간당 생산수를 출력할 변수는 float타입으로 만들 것.
		 
		 ##같은 결과의 두가지 이상의 코드를 작성
		 
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total;
		float avg;
		
		
		//1번
		total = pear + apple + orange;
		System.out.println("과수원에서 하루에 생산되는 과일의 총 갯수는 : " + total);
		
//		avg = total / 24f;
		avg = (float)total / 24;
		System.out.println("한시간에 평균 " + avg + "개의 과일이 생산됩니다.");
		
		
		//2번
		
		
	}

}

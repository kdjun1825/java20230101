package ex2_exception;

public class Ex1_TryCatch {

	
	public static void main(String[] args) {
		
		
		/*
		 try-catch : 프로그램 실행 중 예외 가 발생하면 
		 그 시점에서 프로그램이 강제적으로 종료된다.
		 때로는 예상 가능한 오류에 대해 예외가 발생해도 
		 이를 무시하거나 수정하여 계속 코드를 진행해야 될 때가 있다
		 예외처리 기법을 통해 프로그램의 비 정상적인 종료를 줄여보자
		 
		 */
		int res = 0;
		
		int[] arr = new int[3];
		
		//한 번에 하나의 오류만 처리 할 수 있다 
		//try 안에 아래의 오류구문이 들어가도 "0으로 못나누어요 " 가 출력된다.
		//e.printStacktrace로 오류 종류 나타내기!
		//모든 오류는 Exception 으로 처리 가능
		//상세 오류명으로도 접근 가능!
		//캐치 구문을 여러가지로 해서 처리도 가능
		arr[3]	= 1;
		
		
		try {
			//오류가 나지 않는다면 catch;구문으로 가지 않고 그대로 나간다
			res = 10/0;
		} catch (Exception e) {
			//위의 try영역에서 오류가 발생한다면 
			//반드시 catch구문을 실행한다 
			System.out.println("0으로 못나누어요");
			e.printStackTrace();
		}finally {
//			try영역의 오류 여부 상관없이 무조건 실행
		}
		
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

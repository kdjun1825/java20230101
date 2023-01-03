package ex1_operator;

public class Ex1_Operator {

	public static void main(String[] args) {

		/*
		 operatot(연산자)
		 
		 1.최고연산자: .  ()
		 2.증감연산자:  ++  ,  --
		 3.산술연산자: + , - , * , / , %
		 4.시프트연산자: >> , <<
		 5.비교연산자: > , < , >= , == , !=
		 6.비트연산자: & , | , ^
		 7.논리연산자: &&, || , !
		 8.삼항(조건)연산자: ? , :
		 9.대입연산자: = , *=, /=, %=, +=, -=
		 
		 
		 
		 */
		
		//신술연산자
		//4칙연산과 나머지 연산자를 가지고 있다.
		int n1 = 30;
		int n2 = 4;
		int n3 = n1 / n2;
		System.out.println("/ 했을 때에는 몫인 : " + n3 + "가 나온다");
		n3 = n1 % n2;
		System.out.println("% 했을 때에는 나머지인 : " + n3 + "가 나온다");
		System.out.println("--------------------------");
		
		
		//대입연산자
		//특정 값을 변수에 전달하여 기억시킬 떼 사용하는 연산자
		int i1 = 10;
		int i2 = 40;
		i1 += i2;
		System.out.println("i1 += i2 ---> i1 = i1 + i2 이다 그러므로 i1 : " + i1);
		i1 += i2;
		System.out.println("i1이 이미 50이 되어서 i1 : " + i1);
		System.out.println("-------------------------------");
		
		
		//비교연산자
		//값을 비교해서 참과 거짓을 판단하는 연산자
		int j1 = 25;
		int j2 = 50;
		int j3 = 50;
		boolean bool = j1  < j2;
		System.out.println("j1 < j2 : " + bool);
		bool = j2 >= j3;
		System.out.println("j2 >= j3 : " + bool);
		bool = j2 == j3; //같다면 true
		System.out.println("j2 == j3 : " + bool);
		bool = j2 != j3; //같지 않다면 true
		System.out.println("j2 != j3 : " + bool);
		
		
		System.out.println("--------------------");
		//논리연산자
		//비교연산자를 통한 연산이 두 개 이상 피룡할 때 사용
		
		int age = 23;
		int max = 30;
		int min = 20;
		bool = min > age && (max -= age) < max;	//&&는 앞 쪽이 false면 뒤 연산을 실행하지 앟는다
		System.out.println("&&은 둘 다 true 여야만 true 이기 때문에 bool : " + bool);
		System.out.println(max);// min < age 이 false 여서 뒤쪽 (max -= age) 실행X
		bool = age >30 || (max -= age) >= 5; // ||는 앞쪽이 true 면 뒤 연산을 실행하지 않는다. 
		System.out.println("||은 둘 중 하나만 true 여도 true 이기 때문에 bool : " + bool);
		System.out.println(max);// age > 30 이 false 여서 뒤쪽 (max -= age) 실행
		System.out.println("--------------------");
		
		

		//증감연산자
		//1씩 증가 or 1씩 감소  선행, 후행 증감 차이
		
		int a = 10;
		System.out.println( ++a );//1을 더하고 그다음 출력하므로11
		System.out.println( a++ );//출력하고 1을 더하므로 출력에서는 아직 11  
		System.out.println( a );//다시 출력하면 출력하고 1을 더했으므로 12
		System.out.println("--------------------");

		
		//삼항 연산자
		//조건의 참과 거짓에 대한 다른대답을 돌려주는 연산자
		int aa = 10;
		int bb = 20;
		int v = aa > bb ? 40 : 50;//조건 ? 참일때 값 : 거짓 때 값 
		System.out.println(v);
		
		
		
		
	}

}

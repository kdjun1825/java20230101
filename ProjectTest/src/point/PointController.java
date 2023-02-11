package point;

import java.util.ArrayList;
import java.util.HashMap;

public class PointController {

	HashMap<Integer, Integer> pMap = new HashMap<Integer, Integer>();
	
	
	public void selectUser(int pNum) {
		UserPoint up = new UserPoint();
		
		up.setpNum(8291);
		up.setPoint(100);
		
		pMap.put(up.getpNum(), up.getPoint());
		

	// 값 넣기----
		
		
		
	//전화번호로 조회 시 그 조회된 값 에 포인트 출력
		if(pMap.containsKey(pNum)){
			System.out.println(pMap.get(pNum));
		
		

		
		}else {
			System.out.println("해당 전화번호에 대한 포인트가 없습니다.");
		}
	
	
	
	
	
	
	}

	//사용
	public void usePoint(int point, int pNum) {
		
		pMap.put(pNum, pMap.get(pNum)-point);
		System.out.println("잔여 포인트는  " + pMap.get(pNum));
		//하고 결제내역으로 넘기기
	}
	
	
	
	//적립
	public void savePoint(int point, int pNum) {

		pMap.put(pNum, pMap.get(pNum) + point);
		System.out.println("적립 후 포인트 : " + pMap.get(pNum));
		
	}
}

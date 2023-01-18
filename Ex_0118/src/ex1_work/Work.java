package ex1_work;

public class Work {

	String res = "";
	
	
	public String setEnc(String str, char[] alCode, char[] numCode) {
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			//문장을 쪼갰을 때 알파벳 범위 안에 포함된 문자일 경우 아래 if로 접근
				if(ch >= 'a' && ch <= 'z') {
					
					res += alCode [ch - 'a'];
					
				}else if(ch >= '0' && ch <= '9') {
					
					res += numCode [ch - '0'];
					
					
				}
		}
		return res;
		
		
	}
	
	
	
}

package ex5_interface;

public class Kitchen implements AllMenu{
//allmenu에서 menu 1,2,3을 모두 상속하기 때문에 키친에서는 allmenu만 구현해도 가능하다.  ex)menu가 너무 많아 질 때 모든걸 합쳐놓은 allmenu 에 상속해서 깔끔하게 구현 가능하다.
//public class Kitchen implements Menu1, Menu2, Menu3{
//interface는 구현능력이 없기 때문에 하나의 클래스에서 다중 상속.(정확히는 구현) 이 가능하다
	@Override
	public String jjajang() {
		
		return  "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		
		return  "고추기름 + 해물";
	}

	@Override
	public String tangsu() {
		
		return "돼지고기 + 달달소스";
	}

	@Override
	public String phalbo() {
		
		return "팔보채는 뭐들어감?";
	}

	@Override
	public String tangpyung() {
		
		return "고기 들어가나";
	}

	@Override
	public String mandoo() {
		
		return "만두피+ 다진고기";
	}

	@Override
	public String rajogi() {
		
		return "라 + 조기";
	}

	
	
	
	
}

package ex3_abstract;

public class StarMain {

	public static void main(String[] args) {

		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		System.out.println("t1 =" + t1.getEnergy());
		
		Protoss p1 = new Protoss("질럿", 1110, false) {
		};
		p1.decEnergy();
		System.out.println("t1 =" + p1.getEnergy());
		
//		Terran t1 = new Terran("해병", 100, false);
//		t1.decEnergy();
//		System.out.println("t1 =" + t1.getEnergy());
	}

}

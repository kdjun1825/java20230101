package ex3_abstract;

public class Jerg extends Unit{

	public Jerg(String name, int energy, boolean fly) {
		
		super.name = name;
		super.energy = energy;
		super.fly = fly;
		
	}
	
	@Override
	public void decEnergy() {
		
		energy -= 5;
		
	}
	
	
	
	
}

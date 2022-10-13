package jdr;

public class Gobelin extends Personnage {

	public Gobelin() {
		force = (int) Math.round(Math.random()*(10-5)+5);
		pv = (int) Math.round(Math.random()*(15-10)+10);
	}
	
	public String typeOf()
	{
		return "Gobelin";
	}
	
}

package jdr;

public class Loup extends Personnage {

	public Loup() {
		force = (int) Math.round(Math.random()*(8-3)+3);
		pv = (int) Math.round(Math.random()*(10-5)+5);
	}
	
	public String typeOf()
	{
		return "Loup";
	}
	
}

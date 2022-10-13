package jdr;

public class Troll extends Personnage {

	public Troll() {
		force = (int) Math.round(Math.random()*(15-10)+10);
		pv = (int) Math.round(Math.random()*(30-20)+20);
	}
	
	public String typeOf()
	{
		return "Troll";
	}
}

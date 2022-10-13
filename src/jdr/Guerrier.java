package jdr;

public class Guerrier extends Personnage {

	public Guerrier(String name) {
		force = (int) Math.round(Math.random()*(20-16)+16);
		pv = (int) Math.round(Math.random()*(60-40)+40);
		this.name = name;
	}
	
	public String typeOf()
	{
		return "Guerrier";
	}
}

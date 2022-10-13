package jdr;

public class Mage extends Personnage {

	public Mage(String name) {
		force = (int) Math.round(Math.random()*(14-10)+10);
		pv = (int) Math.round(Math.random()*(40-20)+20);
		this.name = name;
	}
	
	public String typeOf()
	{
		return "Mage";
	}
}

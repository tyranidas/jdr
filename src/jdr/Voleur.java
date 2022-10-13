package jdr;

public class Voleur extends Personnage {

	

	public Voleur(String name) {
		force = (int) Math.round(Math.random()*(18-14)+14);
		pv = (int) Math.round(Math.random()*(50-30)+30);
		this.name = name;
	}
	
	public String typeOf()
	{
		return "Voleur";
	}
}

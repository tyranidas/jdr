package jdr;

public  abstract class Personnage {

	protected int force;
	protected int pv;
	protected int score;
	protected String name;
	
	public Personnage() {
		this.force = 18;
		this.pv = 50;
		this.score = 0;
		this.name = null;
	}
	
	public abstract String typeOf();
	
	public static Personnage debutCombat()
	{
		int advRandom = (int) Math.round(Math.random()*(3-1)+1);
		Personnage adv = null;
		switch (advRandom)
		{
		case 1 ->  adv = new Loup();
		case 2 ->  adv = new Gobelin();
		case 3 ->  adv = new Troll();
		default -> adv = null ;
		
		}
	
		
		
		System.out.println("Vous allez affronter un "+adv.typeOf());
		return adv;
	}
	
	public static void combat(Personnage player, Personnage adv)
	{
		int forcePlayer = (int) Math.round(Math.random()*(10-1)+1) + player.getForce();
		int forceAdv = (int) Math.round(Math.random()*(10-1)+1) + adv.getForce();
		int delta = 0;
		if (forcePlayer > forceAdv)
		{
			delta = forcePlayer-forceAdv;
			adv.setPv(adv.getPv()- delta);
		}
		else if (forcePlayer < forceAdv)
		{
			delta = forceAdv-forcePlayer;
			player.setPv(player.getPv()- delta);
		}
		else
		{
			
		}
		if (player.getPv() >0 && adv.getPv() > 0)
		{
		System.out.println("il reste à "+player.getName()+" encore "+player.getPv());
		System.out.println("il reste à "+adv.typeOf()+" encore "+adv.getPv());
		}
	}
	
	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}

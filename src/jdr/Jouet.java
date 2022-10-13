package jdr;

import java.util.Scanner;
import jdr.Personnage;

public class Jouet {

	public static void main(String[] args) {
		
		Scanner saisieUtilisateur = new Scanner(System.in);
		
		System.out.println("Veuillez choisir votre Classe, Voleur, Guerrier ou Mage");
		String classe = saisieUtilisateur.next();
		System.out.println("Choissisez un nom");		
		String name = saisieUtilisateur.next();
		
		Personnage perso = null;
		switch(classe)
		{
		case "Voleur" :
			perso = new Voleur (name);
			break;
		case "Guerrier" :
			perso = new Guerrier (name);
			break;
		case "Mage" :
			perso = new Mage (name);
			break;
		default :
			break;
		}
		System.out.println("Vous êtes le "+perso.typeOf()+" "+perso.getName());
		System.out.println("Vous avez "+perso.getForce()+" de force et "+perso.getPv()+" points de vie");
		
		
		Personnage adv = Personnage.debutCombat();
		System.out.println("Voulez vous l'affronter ? (Oui/Non)");
		String accept = saisieUtilisateur.next();
		
		while (accept.equals("Oui")|| accept.equals("oui")||accept.equals("O")||accept.equals("o"))
		{
			
			Personnage.combat(perso, adv);
			if (adv.getPv()<=0)
			{
			int advPoint = 0;
			switch (adv.typeOf())
			{
			case "Loup" -> advPoint = 1;
			case "Gobelin" -> advPoint = 2;
			case "Troll" -> advPoint = 5;
			}
			perso.setScore(perso.getScore()+advPoint);
			System.out.println("Bravo, vous avez battu le "+adv.typeOf()+". Votre score est de "+perso.getScore()+" points");
			adv = Personnage.debutCombat();
			System.out.println("Voulez vous l'affronter ? (Oui/Non)");
			accept = saisieUtilisateur.next();
			}
			else if (perso.getPv()<=0)
			{
				System.out.println("Fin de la partie, votre score est de "+perso.getScore()+" points");
				accept = "non";
			}
			else 
			{
			System.out.println("Voulez vous continuer ? (Oui/Non)");
			accept = saisieUtilisateur.next();
			}
			System.out.println("Fin de la partie, votre score est de "+perso.getScore()+" points");
		}
		
			
		
	
		
	}

}

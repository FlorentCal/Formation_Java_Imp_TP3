package fr.tp3.console;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Florent Callaou
 *	Classe permettant à l'utilisateur d'ajouter dans une liste et d'afficher celle-ci
 */
public class MenuUtilisateur {

	/**
	 * Méthode du menu
	 */
	public void menu(){
		
		// Affichage du menu
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		System.out.println("3. Quitter");

		// Initialisation de la liste
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		// Entiers du choix de l'utilisateur et du nombre à ajouter dans la liste
		int res, nbAjoute;
		
		// Scanner de lecture d'entrée
		Scanner sc = new Scanner(System.in);
		res = sc.nextInt();
		
		// Tant que le choix n'est pas "Quitter", on boucle
		do {
			// Condition du choix
			switch(res){
			case 1 :
				System.out.println("Entrez un nombre :");
				
				// Nombre à ajouter
				nbAjoute = sc.nextInt();
				
				// Ajout du nombre dans la liste
				list.add(nbAjoute);
				break;
			case 2 :
				// Affichage de la liste
				for (Integer i : list) {
					System.out.println(i);
				}
				break;
			case 3 :
				// Quitter
				return;
			default :
				System.out.println("Mauvaise entrée");
				break;
			}
			
			// Affichage du menu 
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			System.out.println("3. Quitter");
			// lecture du choix de l'utilisateur
			res = sc.nextInt();
				
		} while(res != 3);
			
		sc.close();
	}
	
}

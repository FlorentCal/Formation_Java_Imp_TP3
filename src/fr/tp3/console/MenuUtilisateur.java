package fr.tp3.console;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUtilisateur {

	public void menu(){
		
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		System.out.println("3. Quitter");

		ArrayList<Integer> list = new ArrayList<Integer>() ;
		int res, nbAjoute;
		
		Scanner sc = new Scanner(System.in);
		res = sc.nextInt();
		
		do {
			switch(res){
			case 1 :
				System.out.println("Entrez un nombre :");
				nbAjoute = sc.nextInt();
				list.add(nbAjoute);
				break;
			case 2 :
				for (Integer i : list) {
					System.out.println(i);
				}
				break;
			case 3 :
				return;
			default :
				System.out.println("Mauvaise entrée");
				break;
			}
			
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			System.out.println("3. Quitter");
			res = sc.nextInt();
			
			
		} while(res != 3);
	
		
	}
	
}

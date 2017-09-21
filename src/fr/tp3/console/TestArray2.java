package fr.tp3.console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Florent Callaou
 *	Classe d'affichage diverse des éléments d'un tableau (2ème partie)
 */
public class TestArray2 {

	/**
	 * Classe principale d'appel des méthodes d'affichage
	 */
	public void affichages(){
		// Tableau d'entier à manipuler
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Appel des méthodes
		affichageMoyenne(array);
		System.out.println("**************************");
		affichageIndexAt(array);
		System.out.println("**************************");
		affichageNbDoublon(array);
		System.out.println("**************************");
	}
	
	/**
	 * Méthode d'affichage de la moyenne du tableau  
	 * @param array : le tableau à manipuler
	 */
	public void affichageMoyenne(int[] array){
		System.out.println("Affichage de la moyenne du tableau :");
		
		// Initialisation de 2 variables entier pour stocker la somme et la moyenne
		int somme = 0;
		int moyenne;
		
		// Parcours du tableau
		for (int i : array) {
			// Ajout de l'élément parcouru à la somme
			somme += i;
		}
		
		// Calcul de la moyenne
		moyenne = somme / array.length;
		
		// Affichage de la moyenne
		System.out.println("Moyenne du tableau : " + moyenne);	
	}
	
	/**
	 * Méthode d'affichage de l'index de l'élement 15 
	 * @param array : le tableau à manipuler
	 */
	public void affichageIndexAt(int[] array){
		System.out.println("Affichage de l'index de l'élément 15 :");
	
		// Parcours du tableau
		for (int i = 0; i < array.length; i++) {
			// Quand l'élement parcouru est égal à 15, on l'affiche
			if(array[i] == 15){
				System.out.println("Index de l'élement 15 : " + i);
				
				// On quitte la boucle for
				break;
			}
		}	
	}
	
	/**
	 * Méthode d'affichage du nombre de doublon
	 * @param array : le tableau à manipuler
	 */
	public void affichageNbDoublon(int[] array){
		System.out.println("Affichage nombre de doublon du tableau :");
		
		// Initialisation d'un HashSet évitant les doublons
        Set<Integer> set = new HashSet<Integer>();
        int nbDoublon;
		
        // Liste de copie du tableau 
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		
		// Copie du tableau 
		for (int i : array) {
			list.add(i);
		}
		
		// Copie de la liste dans le set
        set.addAll(list) ;
                
        // Taille de la liste avec doublon - taille de la liste sans doublon = Nombre de doublons de la liste initiale
        nbDoublon =  list.size() - set.size();
		
		System.out.println("Nombre de doublon : " + nbDoublon);

	}
	
	
	
}

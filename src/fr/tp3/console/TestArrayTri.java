package fr.tp3.console;

import java.util.Arrays;

/**
 * @author Florent Callaou
 *	Classe d'affichage diverse des éléments trié d'un tableau
 */
public class TestArrayTri {
	
	/**
	 * Classe principale d'appel de la méthode d'affichage
	 */
	public void affichages(){
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
				
		affichageTri(array);
		System.out.println("\n**************************");

	}
	
	
	/**
	 * Méthode de tri et affichage du tableau
	 * @param array : le tableau à manipuler
	 */
	public void affichageTri(int[] array){
		System.out.println("Affichage du tableau trié :");
		
		// Tri du tableau
		Arrays.sort(array);
		
		// Affichage de chaque élément
		for (int i : array) {
			System.out.print(i + " ");
		}

	}
	

}

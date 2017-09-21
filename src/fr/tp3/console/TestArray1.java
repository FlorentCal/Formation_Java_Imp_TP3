package fr.tp3.console;


/**
 * @author Florent Callaou
 *	Classe d'affichage diverse des éléments d'un tableau
 */
public class TestArray1 {

	
	/**
	 * Classe principale d'appel des méthodes d'affichage
	 */
	public void affichages() {
		// Tableau d'entier à manipuler
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		// Appel des méthodes
		affichage(array);
		System.out.println("\n**************************");
		affichageInverse(array);
		System.out.println("\n**************************");
		affichageSup3(array);
		System.out.println("\n**************************");
		affichagePair(array);
		System.out.println("\n**************************");
		affichageMax(array);
		System.out.println("\n**************************");
		affichageMin(array);
	}

	
	/**
	 * Méthode d'affichage normal 
	 * @param array : le tableau à manipuler
	 */
	public static void affichage(int[] array){
		System.out.println("Affichage du tableau :");
		
		// Parcours du tableau
		for (int i : array) {
			// Affichage de l'élément 
			System.out.print(i + " ");
		}
	}

	/**
	 * Méthode d'affichage inverse
	 * @param array : le tableau à manipuler
	 */
	public static void affichageInverse(int[] array){
		System.out.println("Affichage du tableau inversé :");
		
		// Parcours du tableau
		for (int i = array.length -1; i>=0; i--) {
			// Affichage de l'élément 
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * Méthode d'affichage des éléments supérieurs à 3 
	 * @param array : le tableau à manipuler
	 */
	public static void affichageSup3(int[] array){
		System.out.println("Affichage des éléments supérieurs à 3 du tableau :");
		
		// Parcours du tableau
		for (int i : array) {
			// Si l'élément est supérieur à 3, on l'affiche
			if(i > 3){
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Méthode d'affichage des éléments pairs
	 * @param array : le tableau à manipuler
	 */
	public static void affichagePair(int[] array){
		System.out.println("Affichage des éléments pair tableau :");
		
		// Parcours du tableau
		for (int i : array) {
			// Si l'élément est pair, on l'affiche
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Méthode d'affichage de l'élément le plus grand
	 * @param array : le tableau à manipuler
	 */
	public static void affichageMax(int[] array){
		System.out.println("Affichage de la plus grande valeur du tableau :");

		// Initialisation de l'entier max à la première valeur du tableau
		int max = array[0];

		// Parcours du tableau
		for (int i : array) {
			// Si l'élément parcouru est supérieur à la valeur max antérieure, on remplace max par l'élément parcouru
			if(i > max){
				max = i;
			}
		}
		
		// Affichage de la valeur après parcours du tableau
		System.out.print(max);
	}

	/**
	 * Méthode d'affichage de l'élément le plus petit
	 * @param array : le tableau à manipuler
	 */
	public static void affichageMin(int[] array){
		System.out.println("Affichage de la plus petite valeur du tableau :");

		// Initialisation de l'entier min à la première valeur du tableau
		int min = array[0];

		// Parcours du tableau
		for (int i : array) {
			// Si l'élément parcouru est inférieur à la valeur max antérieure, on remplace min par l'élément parcouru
			if(i < min){
				min = i;
			}
		}
		
		// Affichage de la valeur après parcours du tableau
		System.out.println(min);
	}


}

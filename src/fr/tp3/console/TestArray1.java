package fr.tp3.console;

public class TestArray1 {

	public void affichages() {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		affichage(array);
		System.out.println("**************************");
		affichageInverse(array);
		System.out.println("**************************");
		affichageSup3(array);
		System.out.println("**************************");
		affichagePair(array);
		System.out.println("**************************");
		affichageMax(array);
		System.out.println("**************************");
		affichageMin(array);


	}

	public static void affichage(int[] array){
		System.out.println("Affichage du tableau :");
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void affichageInverse(int[] array){
		System.out.println("Affichage du tableau inversé :");
		for (int i = array.length -1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

	public static void affichageSup3(int[] array){
		System.out.println("Affichage des éléments supérieurs à 3 du tableau :");
		for (int i : array) {
			if(i > 3){
				System.out.println(i);
			}
		}
	}

	public static void affichagePair(int[] array){
		System.out.println("Affichage des éléments pair tableau :");
		for (int i : array) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}

	public static void affichageMax(int[] array){
		System.out.println("Affichage de la plus grande valeur du tableau :");

		int max = array[0];

		for (int i : array) {
			if(i > max){
				max = i;
			}
		}
		System.out.println(max);
	}

	public static void affichageMin(int[] array){
		System.out.println("Affichage de la plus petite valeur du tableau :");

		int min = array[0];

		for (int i : array) {
			if(i < min){
				min = i;
			}
		}
		System.out.println(min);
	}


}

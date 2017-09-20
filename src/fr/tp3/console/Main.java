package fr.tp3.console;

public class Main {

	public static void main(String[] args) {
		TestArray1 testArray1 = new TestArray1();
		TestArray2 testArray2 = new TestArray2();
		TestArrayTri testArrayTri = new TestArrayTri();
		MenuUtilisateur menu = new MenuUtilisateur();
		TestFibonacci fibonacci = new TestFibonacci();
		
		
		System.out.println("EXERCICE 1 : \n");
		testArray1.affichages();
		
		System.out.println("\nEXERCICE 2 : \n");
		testArray2.affichages();
		
		System.out.println("\nEXERCICE 3 : \n");
		testArrayTri.affichages();
		
		//System.out.println("\nEXERCICE 4 : \n");
		//menu.menu();
		
		System.out.println("\nEXERCICE 5 : \n");
		fibonacci.affichage();
		
		
		

	}

}

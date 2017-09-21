package fr.tp3.console;

import java.util.Scanner;

/**
 * @author Florent Callaou
 *	Classe permettant de calucler le fibonacci d'un nombre donné par l'utilisateur
 */
public class TestFibonacci {
	
	/**
	 * Méthode d'affichage du nombre
	 */
	public void affichage(){
		int nombre;
		
		System.out.println("Entrez un nombre :");
		
		// Lecture du nombre 
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextInt();
	
		System.out.println("Fibonacci de " + nombre + " : " + fibonacci(nombre));
		
		sc.close();
	}
	
	/**
	 * @param n : le nombre entré par l'utilisateur
	 * @return le fibonnaci du nombre
	 */
	public int fibonacci(int n){
		// Fiboncci(0) = 0, Fiboncacci(1) = 1
		if(n < 2) {
			return n;
		}
		// Algo de Fibonacci (récursif)
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);				
		}
	}
	
	
}

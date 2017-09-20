package fr.tp3.console;

import java.util.Scanner;

public class TestFibonacci {

	public void affichage(){
		int res;
		
		System.out.println("Entrez un nombre :");
		
		Scanner sc = new Scanner(System.in);
		res = sc.nextInt();
	
		System.out.println("Fibonacci de " + res + " : " + fibonacci(res));
		
	}
	
	public int fibonacci(int n){
		if(n < 2) {
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);				
		}
	}
}

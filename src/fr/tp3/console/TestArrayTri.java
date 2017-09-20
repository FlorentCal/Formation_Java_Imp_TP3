package fr.tp3.console;

import java.util.Arrays;

public class TestArrayTri {

	public void affichages(){
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
				
		affichageTri(array);
		System.out.println("**************************");

	}
	
	public void affichageTri(int[] array){
		System.out.println("Affichage du tableau trié :");
		
		Arrays.sort(array);
		
		for (int i : array) {
			System.out.println(i);
		}

	}
	

}

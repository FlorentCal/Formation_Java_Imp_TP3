package fr.tp3.console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestArray2 {

	public void affichages(){
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		affichageMoyenne(array);
		System.out.println("**************************");
		affichageIndexAt(array);
		System.out.println("**************************");
		affichageNbDoublon(array);
		System.out.println("**************************");
	}
	
	public void affichageMoyenne(int[] array){
		System.out.println("Affichage de la moyenne du tableau :");
		int somme = 0;
		int moyenne;
		
		for (int i : array) {
			somme += i;
		}
		moyenne = somme / array.length;
		System.out.println("Moyenne du tableau : " + moyenne);	
	}
	
	public void affichageIndexAt(int[] array){
		System.out.println("Affichage de l'index de l'élément 15 :");
	
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 15){
				System.out.println("Index de l'élement 15 : " + i);
				break;
			}
		}	
	}
	
	public void affichageNbDoublon(int[] array){
		System.out.println("Affichage nombre de doublon du tableau :");
        Set set = new HashSet();
        int nbDoublon;
		
		ArrayList list = new ArrayList() ;
		
		for (int i : array) {
			list.add(i);
		}
		
        set.addAll(list) ;
        ArrayList distinctList = new ArrayList(set) ;
        
        nbDoublon =  list.size() - distinctList.size();
		
		System.out.println("Nombre de doublon : " + nbDoublon);

	}
	
	
	
}

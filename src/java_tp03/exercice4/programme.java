package java_tp03.exercice4;

import java.util.Scanner;

public class programme {

	public static void main(String[] args) {
		int[] array = new int[0];
		/* Choix de l'option */
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		while(option != 3) {
			System.out.println("Option 1 : Ajouter un nombre\n");
			System.out.println("Option 2 : Afficher le tableaux\n");
			System.out.println("Option 3 : Quitter le programme\n");
			System.out.println("Choisissez une option (1, 2 ou 3) : ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("\nQuelle nombre voulez-vous ajouter? ");
				int elt = scanner.nextInt();
				array = addNumberToArray(elt,array);
				System.out.println("\nElement "+elt+" ajouté");
				break;
			case 2:
				displayArray(array);
				break;
			case 3:
				System.out.println("Fin du programme!");
				break;
			default:
				System.out.println("Cette option n'existe pas!");
				break;
			}
		}
	}

	public static int[] addNumberToArray(int elt, int[] array) {
		int[] newTab = new int[array.length+1];
		int j=0;
		for(int i=0;i<array.length;i++){
			newTab[j]=array[i];
			j++;
		}
		newTab[array.length]=elt;
		return newTab;

	}
	
	public static void displayArray(int[] array) {
		int size = array.length;
		for(int i=0;i<size;i++){
			System.out.print("|"+array[i]);	
		}
		System.out.print("|\n");
	}

}

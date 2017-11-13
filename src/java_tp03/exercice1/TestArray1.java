package java_tp03.exercice1;

public class TestArray1 {
	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		/* Eléments dans l'ordre */
		displayOrderTable(array);
		/* Tableau inversé */
		displayInverseTable(array);
		/* Valeurs du tableau > 3 */
		displayIntegerUp(array,3);
		/* Entiers pairs */
		displayEvenInteger(array);
		/* Valeur maximale */
		getMaxValue(array);
		/* Valeur minimale */
		getMinValue(array);
		
  
	}
	
	/**
	 * Methode qui affiche les valeurs du tableaux dans l'ordre
	 * @param array
	 */
	public static void displayOrderTable(int[] array) {
		System.out.println("parcours du tableau dans l'ordre: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * Methode qui affiche les valeurs du tableaux dans le sens inverse
	 * @param array
	 */
	public static void displayInverseTable(int[] array) {
		System.out.println("parcours du tableau dans le sens inverse: ");
		int index = array.length-1;
		while(index>=0) {
			System.out.println(array[index]);
			index--;
		}
	}
	
	/**
	 * Methode qui affiche les entiers supérieurs à une valeur
	 * @param array
	 * @param value
	 */
	public static void displayIntegerUp(int[] array,int value) {
		System.out.println("entiers supérieurs à 3 : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]>3 &&  array[i] == (int)array[i]){
				System.out.println(array[i]);
			}
		}	
	}
	
	/**
	 * Methode qui affiche les entiers paires
	 * @param array
	 * @param value
	 */
	public static void displayEvenInteger(int[] array) {
		System.out.println("entiers pairs : ");
		for(int i=0;i<array.length;i++) {
			double rest = array[i]%2;
			if(rest ==0) {
				System.out.println(array[i]);
			}
		}	
	}
	
	/**
	 * Methode qui affiche la valeur maximale
	 * @param array
	 */
	public static void getMaxValue(int[] array) {
		double maxi = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]> maxi ) {
				maxi = array[i];
			}
		}
		System.out.println("la valeur maximale est " + maxi);
	}
	
	/**
	 * Methode qui affiche la valeur minimale
	 * @param array
	 */
	public static void getMinValue(int[] array) {
		double mini = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]< mini ) {
				mini = array[i];
			}
		}
		System.out.println("la valeur minimale est " + mini);
	}
	
}

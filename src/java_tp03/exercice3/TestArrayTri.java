package java_tp03.exercice3;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayTri {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		/* tri du tableau dans l'ordre ascendant */
		int [] sortedArray = sortArrayAsc(array);
		afficherTableau(array);
		
		/* tri du tableau dans l'ordre ascendant ArrayList */
		ArrayList<Integer> arrayList = sortArrayAscArrayList(array);
		afficherArrayList(arrayList);

	}
	
	/**
	 * method to sort array (ascendant)
	 * @param array
	 * @return
	 */
	public static int[] sortArrayAsc(int[] array) {
		int size = array.length;
		int [] sortedArray = new int[size];
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){ 
				if(array[i]>array[j]){
					int perm=array[i];
					array[i]=array[j];
					array[j]=perm;
				}
			}
		}
		return sortedArray;
		
	}
	
	public static ArrayList<Integer> sortArrayAscArrayList(int[] array) {
		int size = array.length;
		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		for(int i=0;i<size;i++){
			sortedArray.add(array[i]);
		}
		Collections.sort(sortedArray);
		return sortedArray;
	}
	

	/**
	 * method to display array
	 * @param array
	 */
	public static void afficherTableau(int[] array){
		int size = array.length;
		for(int i=0;i<size;i++){
			System.out.print("|"+array[i]);	
		}
		System.out.print("|\n");
	}
	
	/**
	 * method to display arrayList
	 * @param array
	 */
	public static void afficherArrayList(ArrayList<Integer> array){
		int size = array.size();
		for(int i=0;i<size;i++){
			System.out.print("|"+array.get(i));	
		}
		System.out.print("|\n");
	}

}

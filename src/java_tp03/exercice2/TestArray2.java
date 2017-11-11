package java_tp03.exercice2;

public class TestArray2 {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		/* Mean */
		double mean = getMeantable(array);
		System.out.println("Moyenne: " + mean);
		
		/* Element position */
		int nb = 15;
		int index = getElementPosition(array, nb);
		System.out.println("Le nombre " + nb + " est à la position " + index);
		
		/* Doublons */
		int doublons = getDuplicationNumber(array);
		System.out.println("Le tableau contient " + doublons + " éléments dupliqués");
	}

	/**
	 * methods to get mean of array values
	 * 
	 * @param array
	 * @return
	 */
	public static double getMeantable(int[] array) {
		double mean = 0;
		double sum = 0;
		int nbreElt = array.length;
		for (int i = 0; i < nbreElt; i++) {
			sum = sum + array[i];
		}
		mean = sum / nbreElt;
		return mean;
	}

	/**
	 * methods to get element position from array
	 * 
	 * @param array
	 * @param nb
	 * @return
	 */
	public static int getElementPosition(int[] array, int nb) {
		int pos = 0;
		int nbreElt = array.length;
		for (int i = 0; i < nbreElt; i++) {
			if (array[i] == nb) {
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	 * method to get number of occurrence from specific number
	 * @param array
	 * @param nb
	 * @return
	 */
	public static int getOccurrenceFromNumber(int[] array, int nb){
		int ocNb=0;
		int size = array.length;
		for(int i=0;i<size;i++){
			if(array[i]==nb){
				ocNb++;
			}
		}
//		System.out.println("nb oc de "+ nb + ": "+ ocNb);
		return ocNb;
	}
	
	/**
	 * method to get number of duplicated elements
	 * @param array
	 * @return
	 */
	public static int getDuplicationNumber(int[] array) {
		int dupicatesNumber = 0;
		int size = array.length;
		int [] duplicatedElements = new int[size];
		int occO = 0;
		for(int i=0;i<size;i++) {
			int ocNb = getOccurrenceFromNumber(array, array[i]);
			if(ocNb > 1) {
				/* 0 management */
				if(array[i] == 0 ) {
					occO++;
				}
				/* test if element exists*/
				boolean test = contains(duplicatedElements,array[i]);
				if(test == false) {
					duplicatedElements[dupicatesNumber] = array[i];
					dupicatesNumber++;
				}
			}
		}
		if(occO > 1) {
			dupicatesNumber++;
		}
		return dupicatesNumber;
	}
	
	/**
	 * method to test if element exists into array
	 * @param array
	 * @param nb
	 * @return
	 */
	public static boolean contains(int[] array,int nb) {
		boolean test = false;
		for(int i=0;i<array.length;i++) {
			if(array[i] == nb) {
				test = true;
				break;
			}
		}
		return test;
	}

}

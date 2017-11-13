package java_tp03;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		System.out.print("|");
	}

}

package java_tp03.exercice5;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Suite de Fibonacci\n");
		System.out.println("Choisissez un rang N : ");
		int N = scanner.nextInt();
		int nb = getFibonacciNumber(N);
		System.out.println("Le nombre de rang N = " + N + " est " + nb);
	}
	
	/**
	 * method to get fibonacci number for N
	 * @param N
	 * @return
	 */
	public static int getFibonacciNumber(int N) {
		int nb = 0;
		nb = (N-1)+(N-2);
		System.out.println("nb = (" + N + " - 1) + (" + N + " - 2) = " + nb);
		return nb;
	}

}

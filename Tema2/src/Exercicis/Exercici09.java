package Exercicis;

/**
 * Exercici 9 
 * Donats tres sencers mostra el valor m�xim i el m�nim.
 * @author: Rafel Sastre Mas.
 */

public class Exercici09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 8;
		int c = 5;

		if (a > b && a > c) {
			System.out.println("a �s el valor m�xim.");

			if (b > c)
				System.out.println("c �s el valor m�nim.");

			else if (c > b)
				System.out.println("b �s el valor m�nim.");

			else
				System.out.println("b i c s�n el valor m�nim.");
		}

		else if (b > a && b > c) {
			System.out.println("b �s el valor m�xim.");

			if (a > c)
				System.out.println("c �s el valor m�nim");

			else if (c > a)
				System.out.println("a �s el valor m�nim");

			else
				System.out.println("a i c s�n el valor m�nim.");

		}

		else if (c > a && c > b) {
			System.out.println("c �s el valor m�xim.");

			if (b > a)
				System.out.println("a �s el valor m�nim.");

			else if (a > b)
				System.out.println("b �s el valor m�nim.");

			else
				System.out.println("a i b s�n el valor m�nim.");
		}

		else if (a == b && a > c) {
			System.out.println("a i b s�n el valor m�xim.");
			System.out.println("c �s el valor m�nim.");
		}

		else if (a == c && a > b) {
			System.out.println("a i c s�n el valor m�xim.");
			System.out.println("b �s el valor m�nim.");
		} else if (c == b && c > a) {
			System.out.println("b i c s�n el valor m�xim.");
			System.out.println("a �s el valor m�nim.");
		} else
			System.out.print("Tots els valors s�n iguals.");

	}

}

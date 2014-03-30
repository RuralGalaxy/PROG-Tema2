package Exercicis;

/**
 * Exercici 9 
 * Donats tres sencers mostra el valor màxim i el mínim.
 * @author: Rafel Sastre Mas.
 */

public class Exercici09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 8;
		int c = 5;

		if (a > b && a > c) {
			System.out.println("a és el valor màxim.");

			if (b > c)
				System.out.println("c és el valor mínim.");

			else if (c > b)
				System.out.println("b és el valor mínim.");

			else
				System.out.println("b i c són el valor mínim.");
		}

		else if (b > a && b > c) {
			System.out.println("b és el valor màxim.");

			if (a > c)
				System.out.println("c és el valor mínim");

			else if (c > a)
				System.out.println("a és el valor mínim");

			else
				System.out.println("a i c són el valor mínim.");

		}

		else if (c > a && c > b) {
			System.out.println("c és el valor màxim.");

			if (b > a)
				System.out.println("a és el valor mínim.");

			else if (a > b)
				System.out.println("b és el valor mínim.");

			else
				System.out.println("a i b són el valor mínim.");
		}

		else if (a == b && a > c) {
			System.out.println("a i b són el valor màxim.");
			System.out.println("c és el valor mínim.");
		}

		else if (a == c && a > b) {
			System.out.println("a i c són el valor màxim.");
			System.out.println("b és el valor mínim.");
		} else if (c == b && c > a) {
			System.out.println("b i c són el valor màxim.");
			System.out.println("a és el valor mínim.");
		} else
			System.out.print("Tots els valors són iguals.");

	}

}

package Exercicis;

/**
 * Exercici 7 
 * Donats tres sencers a, b i c, mostra quin �s el major.
 * @author: Rafel Sastre Mas.
 */

public class Exercici07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 8;
		int c = 5;

		if (a > b && a > c) {
			System.out.println("El major �s a --> " + a);
		}

		else if (b > a && b > c) {
			System.out.println("El major �s b --> " + b);
		}

		else if (c > a && c > b) {
			System.out.println("El major �s c --> " + c);
		}

		else if (a == b && a > c) {
			System.out.println("Els majors s�n a i b --> " + a);
		}

		else if (a == c && a > b) {
			System.out.println("Els majors s�n a i c --> " + c);
		}

		else if (b == c && b > a) {
			System.out.println("Els majors s�n b i c --> " + b);
		}

		else {
			System.out.println("S�n tots iguals");
		}

	}

}

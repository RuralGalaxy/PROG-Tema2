package Exercicis;

/**
 * Exercici 7 
 * Donats tres sencers a, b i c, mostra quin és el major.
 * @author: Rafel Sastre Mas.
 */

public class Exercici07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 8;
		int c = 5;

		if (a > b && a > c) {
			System.out.println("El major és a --> " + a);
		}

		else if (b > a && b > c) {
			System.out.println("El major és b --> " + b);
		}

		else if (c > a && c > b) {
			System.out.println("El major és c --> " + c);
		}

		else if (a == b && a > c) {
			System.out.println("Els majors són a i b --> " + a);
		}

		else if (a == c && a > b) {
			System.out.println("Els majors són a i c --> " + c);
		}

		else if (b == c && b > a) {
			System.out.println("Els majors són b i c --> " + b);
		}

		else {
			System.out.println("Són tots iguals");
		}

	}

}

package Exercicis;

/**
 * Exercici 6 
 * Donats dos sencers a i b, mostra quin és el major de dos sencers,
 * Per exemple El major és a.
 * @author: Rafel Sastre Mas.
 */

public class Exercici06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 8;
		int b = 2;

		if (a > b) {
			System.out.println("El major és a --> " + a);
		}

		else if (b > a) {
			System.out.println("El major és b --> " + b);
		}

		else {
			System.out.println("Són iguals");
		}
	}

}

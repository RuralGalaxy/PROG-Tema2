package Exercicis;

/**
 * Exercici 10 
 * Donat un sencer que representa el valor numèric d'una nota, mostra la qualificació corresponent en paraules.
 * Per exemple Aprovat.
 * @author: Rafel Sastre Mas.
 */

public class Exercici10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = 8;

		if (nota >= 0 && nota <= 4) {
			System.out.println("Suspes :(");
		}

		else if (nota <= 6) {
			System.out.println("Aprovat :)");
		}

		else if (nota <= 10) {
			System.out.println("Molt bé! :D");
		}

		else {
			System.out.println("Incorrecte :S");
		}
		
	}

}

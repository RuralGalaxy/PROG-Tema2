package Exercicis;

/**
 * Exercici 24
 * Comprova si un nombre recuperat de la l�nia de comandes �s primer o no utilitzant un while. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre = 5;
		int increment = 2;
		
		while ((nombre % increment) != 0)
		{increment=increment +1;}		
	
		if (nombre==increment) {
			System.out.println("�s primer!");
		} else {
			System.out.println("No �s primer!");

		}

	}

}

package Exercicis;

/**
 * Exercici 23
 * Comprova si un nombre recuperat de la l�nia de comandes �s primer o no utilitzant un for i un break.
 * @author: Rafel Sastre Mas.
 */

public class Exercici23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre = 12;
		boolean primer = true;

		for (int divisor = (nombre - 1); divisor > 1; divisor--) {
			if ((nombre % divisor) == 0) {
				primer = false;
				break;

			}
		}
		if (primer == true) {
			System.out.println("�s primer!");
		} else {
			System.out.println("No �s primer!");

		}

	}

}

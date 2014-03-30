package Exercicis;

/**
 * Exercici 20
 * Crea un programa que donat un nombre sencer mostri per pantalla tots els seus divisors.
 * Per exemple, per a 6 mostraria 1, 2, 3, 6.
 * @author: Rafel Sastre Mas.
 */


public class Exercici20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre = 55;
		int divisor = 1;

		while (divisor <= nombre) {

			if (nombre % divisor == 0)
				System.out.println(divisor);
			divisor++;
		}

	}

}

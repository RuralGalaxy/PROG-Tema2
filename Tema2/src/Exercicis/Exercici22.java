package Exercicis;

/**
 * Exercici 22
 * Donat un nombre natural n, mostrar els n primers nombres de la sèrie de Fibonnacci: 0, 1, 1, 2, 3, 5, 8, ...
 * @author: Rafel Sastre Mas.
 */


public class Exercici22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre = 30;
		int a = 0;
		int b = 1;
		int resultat;

		if (nombre == 0) {
			System.out.println("Introdueix un nombre major a 0!");

		} else if (nombre == 1) {
			System.out.println(a);
		} else {
			System.out.println(a);
			System.out.println(b);

			for (; nombre > 2; nombre--) {
				resultat = a + b;
				System.out.println(resultat);

				a = b;
				b = resultat;
			}

		}
	
	}

}

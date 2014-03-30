package Exercicis;

/**
 * Exercici 17 
 * Repeteix l'exercici 13 de forma que mostri només els nombres parells.
 * @author: Rafel Sastre Mas.
 */


public class Exercici17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fi = 100;

		for (int inici = 20; inici <= fi; inici++)
			if (inici % 2 == 0) {
				System.out.println(inici);
			}

	}

}

package Exercicis;

/**
 * Exercici 19 
 * Recupera un nombre passat com a argument des de la línia de comandes
 * i mostra la taula de multiplicar d'aquest nombre.
 * @author: Rafel Sastre Mas.
 */


public class Exercici19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiplica = 0;
		int resultat;

		for (int nombre = 9; multiplica <= 10; multiplica++) {
			resultat = nombre * multiplica;
			System.out.println(nombre + " x " + multiplica + " = " + resultat);
		}

	}

}

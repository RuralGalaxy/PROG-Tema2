package Exercicis;

/**
 * Exercici 21
 * Demana a l'usuari un nombre natural i calcula el seu factorial.
 * El factorial d'un nombre n és n*(n-1)*(n-2)* ... 3*2*1.
 * @author: Rafel Sastre Mas.
 */


public class Exercici21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre=10;
		int contador=1;
		int resultat=1;
		
		while (contador <= nombre) {
			resultat = resultat * contador;
			contador++;
		}
		
		System.out.println(resultat);

	}

}

package Exercicis;

/**
 * Exercici 37
 * Escriviu un altre classe que generi aleat�riament la longitud de dos arrays(m�nim 2).
 * Creau els arrays d'aquestes longituds i comparau-los.
 * Evidentment si no tenen la mateixa longitud no s�n iguals. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numero = new int[(int) (Math.random() * (100 - 2 + 1) + 2)];
		int[] numero2 = new int[(int) (Math.random() * (100 - 2 + 1) + 2)];

		System.out.println(numero.length);
		System.out.println(numero2.length);
		System.out.println("");

		if (numero.length == numero2.length) {
			System.out.println("S�n iguals!!!");
		} else {
			System.out.println("No s�n iguals!!!");
		}
		

	
	}
}

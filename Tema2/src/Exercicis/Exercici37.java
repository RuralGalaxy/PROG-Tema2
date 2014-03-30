package Exercicis;

/**
 * Exercici 37
 * Escriviu un altre classe que generi aleatòriament la longitud de dos arrays(mínim 2).
 * Creau els arrays d'aquestes longituds i comparau-los.
 * Evidentment si no tenen la mateixa longitud no són iguals. 
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
			System.out.println("Són iguals!!!");
		} else {
			System.out.println("No són iguals!!!");
		}
		

	
	}
}

package Exercicis;

/**
 * Exercici 4 
 * Intercanvia els valors de dues variables del mateix tipus.
 * Mostra-les per pantalla abans i després de fer el canvi. Per exemple si a=2 i
 * b=3, al final a=3 i b=2. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int c;

		a = 2;
		b = 3;

		System.out.println("a=" + a + " b=" + b);

		c = b;
		b = a;
		a = c;

		System.out.printf("\n" + "a=" + a + " b=" + b);

	}

}

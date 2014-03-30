package Exercicis;

/**
 * Exercici 12 
 * Donats tres números, a, b i c ordena-los de forma que al final a<=b<=c.
 * @author: Rafel Sastre Mas.
 */


public class Exercici12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 50;
		int c = 100;
		int temporal;

		if (a > c) {
			temporal = a;
			a = c;
			c = temporal;
		}
		if (b > c) {
			temporal = b;
			b = c;
			c = temporal;
		}
		if (a > b) {
			temporal = b;
			b = a;
			a = temporal;
		}

		System.out.println(a + "<=" + b + "<=" + c);

	}

}

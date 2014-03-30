package Exercicis;

/**
 * Exercici 34
 * Escriu una classe que crei un vector de 10 sencers, els inicialitzi de 1 a 10 i els mostri per pantalla. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int numero[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while (contador < 10) {
			System.out.println(numero[contador]);
			contador++;
		}

	}
}

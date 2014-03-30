package Exercicis;

/**
 * Exercici 35
 * Escriu una classe que crei un vector de 10 sencers, els inicialitzi aleatòriament
 * de 100 a 200 i els mostri per pantalla. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int[] numero = new int[10];

		while (contador < 10) {
			numero[contador] = 100 + (int) (Math.random() * ((200 - 100) + 1));
			System.out.println(numero[contador]);
			contador++;
		}

	}
}

package Exercicis;

/**
 * Exercici 38
 * Escriviu una classe que ompli aleatòriament un un array de tres sencers i l'ordeni (com a l'exercici 12).
 * Heu d'assegurar-vos que l'array tengui tres posicions.
 * Si es pot ordenar ha de mostrar per pantalla l'array ordenat.
 * Si no ha d'avisar que no ho pot ordenar. 
 * @author: Rafel Sastre Mas.
 */

public class Exercici38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numero = new int[3];
		int contador = 0;

		for (int i = 0; i < 3; i++) {
			numero[i] = (int) (Math.random() * (100 - 2 + 1) + 2);
		}

		if (numero[0] > numero[2]) {
			contador = numero[0];
			numero[0] = numero[2];
			numero[2] = contador;
		}
		if (numero[1] > numero[2]) {
			contador = numero[1];
			numero[1] = numero[2];
			numero[2] = contador;
		}
		if (numero[0] > numero[1]) {
			contador = numero[1];
			numero[1] = numero[0];
			numero[0] = contador;
		}

		System.out.println(numero[0] + "<=" + numero[1] + "<=" + numero[2]);
		

	
	}
}

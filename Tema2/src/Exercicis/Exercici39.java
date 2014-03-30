package Exercicis;

/**
 * Exercici 39
 * Creau una classe que defineixi una matriu quadrada, pe 4x4, i:
 * 1- Inicialitzau-la de forma que cada casella tengui la suma de les seves coordenades.
 * 2- Mostrau la diagonal principal, [1,1], [2,2]...
 * 3- Mostrau la diagonal secundària [4,1][3,2]...
 * @author: Rafel Sastre Mas.
 */

public class Exercici39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] numero = new int[4][4];

		for (int contador1 = 0; contador1 < 4; contador1++) {
			for (int contador2 = 0; contador2 < 4; contador2++) {
				numero[contador1][contador2] = contador1 + contador2;
				System.out.print(numero[contador1][contador2]);
			}
			System.out.println();
		}
		System.out.println();

		for (int contador1 = 0; contador1 < 4; contador1++) {
			System.out.print(numero[contador1][contador1]);
		}

		System.out.println();

		for (int contador1 = 0, contador2 = 3; contador2 >= 0; contador1++, contador2--) {
			System.out.print(numero[contador1][contador2]);
		}

	}
}

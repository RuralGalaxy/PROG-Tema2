package Exercicis;

import Exercicis.Llegir;

/**
 * Exercici 25
 * Fes un programa que llegeixi n�meros sencers del teclat fins que l'usuari pitgi un zero.
 * Calcula la mitjana d'aquests n�meros (sense incloure el 0 final).
 * @author: Rafel Sastre Mas.
 */

public class Exercici25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double suma = 0;
		double mitjana;
		int contador = 0;

		do {
			numero = Llegir.llegirTeclat("Escriu un n�mero");
			suma = suma + numero;
			contador++;
		} while (numero != 0);
		mitjana = suma / (contador-1);
		System.out.println("La mitjana dels nombres �s --> " + mitjana);
	}

}

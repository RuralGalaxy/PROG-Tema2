package Exercicis;

/**
 * Exercici 30
 * Utilitzant els m�todes de la classe String, per la cadena Aix� era i no era, fes un programa que
 * 1- Mostri la longitud de la cadena.
 * 2- Els dos primers car�cters.
 * 3- La compari amb una altre sense tenir en compte les difer�ncies maj�scules / min�scules.
 * 4- Trobi la posici� de la primera lletra e.
 * 5- Escrigui la lletra que ocupa la posici� 6.
 * @author: Rafel Sastre Mas.
 */

public class Exercici30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Aix� era i no era...";
		String cadena2 = "Garroves";
		int comparacio = cadena.compareToIgnoreCase(cadena2);

		System.out.println(cadena.length());

		System.out.println(cadena.charAt(0) + " " + cadena.charAt(1));

		System.out.println(comparacio);

		if (comparacio == 0) {
			System.out.println("S�n iguals");
		}

		System.out.println(cadena.indexOf('e'));

		System.out.println(cadena.charAt(6));

	}
}


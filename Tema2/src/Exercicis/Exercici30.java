package Exercicis;

/**
 * Exercici 30
 * Utilitzant els mètodes de la classe String, per la cadena Això era i no era, fes un programa que
 * 1- Mostri la longitud de la cadena.
 * 2- Els dos primers caràcters.
 * 3- La compari amb una altre sense tenir en compte les diferències majúscules / minúscules.
 * 4- Trobi la posició de la primera lletra e.
 * 5- Escrigui la lletra que ocupa la posició 6.
 * @author: Rafel Sastre Mas.
 */

public class Exercici30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Això era i no era...";
		String cadena2 = "Garroves";
		int comparacio = cadena.compareToIgnoreCase(cadena2);

		System.out.println(cadena.length());

		System.out.println(cadena.charAt(0) + " " + cadena.charAt(1));

		System.out.println(comparacio);

		if (comparacio == 0) {
			System.out.println("Són iguals");
		}

		System.out.println(cadena.indexOf('e'));

		System.out.println(cadena.charAt(6));

	}
}


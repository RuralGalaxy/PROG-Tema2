package Exercicis;

/**
 * Exercici 31
 * Donada una frase comprovau si és un palíndrom, és a dir simètrica, com pot ser S'és o no s'és
 * per evitar problemes amb espais i majúscules podeu tractar prèviament la cadena amb una instrucció com
 * cadena=cadena.replaceAll(" ", "").toLowerCase();
 * @author: Rafel Sastre Mas.
 */

public class Exercici31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "saco rocas";
		cadena = cadena.replaceAll(" ", "").toLowerCase();
		int longitud = cadena.length();
		int contador;
		boolean palindromo = false;

		for (contador = 0; contador < longitud && !palindromo; longitud--) {
			if (cadena.charAt(contador) == cadena.charAt(longitud - 1)) {
			} else {
				palindromo = true;
			}
			contador++;

		}
		if (palindromo) {
			System.out.println("No és un palíndromo!");
		} else {
			System.out.println("És palíndromo!");
		}
	}
}


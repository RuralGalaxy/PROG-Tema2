package Exercicis;

/**
 * Exercici 31
 * Donada una frase comprovau si �s un pal�ndrom, �s a dir sim�trica, com pot ser S'�s o no s'�s
 * per evitar problemes amb espais i maj�scules podeu tractar pr�viament la cadena amb una instrucci� com
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
			System.out.println("No �s un pal�ndromo!");
		} else {
			System.out.println("�s pal�ndromo!");
		}
	}
}


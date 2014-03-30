package Exercicis;

/**
 * Exercici 18 
 * Crea un programa que recorri els 10 primers sencers.
 * Si el nombre és 5 ha d'executar una instrucció continue,
 * si no l'ha de mostrar per pantalla.
 * Repeteix-lo amb un break. Quina és la diferència?
 * Mostra explicació per pantalla.
 * @author: Rafel Sastre Mas.
 */


public class Exercici18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre = 0;

		while (nombre <= 10) {
			nombre++;
			if (nombre == 5)
				continue;
			if (nombre > 10)
				break;
			else {
				System.out.println(nombre);
			}

		}

		/*
		 * int nombre=0;
		 * 
		 * while (nombre <= 10) { nombre++; if (nombre==5) break; if (nombre>10)
		 * break; else {System.out.println(nombre);}
		 * 
		 * }
		 */

		System.out
				.println("- Amb el primer cas ens mostra el valor de nombre mentre aquest sigui diferent a 5, si el valor es 5 no el mostra i segueix calculant.");
		System.out
				.println("- Amb el segon cas, cuant el valor de nombre arriba a 5 atura de calcular, per lo tant només mostra els 4 primers nombres.");

	}

}

package Exercicis;

import Exercicis.Llegir;

/**
 * Exercici 29
 * Modifica l'exercici anterior per a tenir en compte els anys de traspàs.
 * Són de traspàs els anys múltiples de 4.
 * Es múltiples de 100 no ho són excepte que siguin múltiples de 400.
 * @author: Rafel Sastre Mas.
 */

public class Exercici29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes=Llegir.llegirTeclat("Escriu un nombre de mes:");
		int any=Llegir.llegirTeclat("Escriu un any:");
		
		if (any % 4 == 0 && any % 100 != 0  || any % 100 != 0 && any % 400 == 0)
		{
			System.out.println("És any de transpàs! 366 Dies");
		}
		else {System.out.println("Any normal! 365 Dies");}
		
		switch (mes) {
		case 1:
			System.out.println("Gener 31 Dies");
			break;
		case 2:
			System.out.println("Febrer 28 Dies");
			break;
		case 3:
			System.out.println("Març 31 Dies");
			break;
		case 4:
			System.out.println("Abril 30 Dies");
			break;
		case 5:
			System.out.println("Maig 31 Dies");
			break;
		case 6:
			System.out.println("Juny 30 Dies");
			break;
		case 7:
			System.out.println("Juliol 31 Dies");
			break;
		case 8:
			System.out.println("Agost 31 Dies");
			break;
		case 9:
			System.out.println("Setembre 30 Dies");
			break;
		case 10:
			System.out.println("Octubre 31 Dies");
			break;
		case 11:
			System.out.println("Novembre 30 Dies");
			break;
		case 12:
			System.out.println("Desembre 31 Dies");
			break;			
		default:
			System.out.println("Mes incorrecte!");
			break;
	}
}
}


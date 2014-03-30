package Exercicis;

/**
 * Exercici 5 
 * A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa,
 * el preu en € de cada hora calcula que ha de cobrar aquesta persona en acabar la setmana.
 * Suposa que totes les hores extra, les que passen de 40, doblen el preu.
 * @author: Rafel Sastre Mas.
 */

public class Exercici05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hores = 50;
		double preu = 12.5;
		double sou;
		int horesExtra;
		
		if (hores <= 40)
		{sou = preu * hores;}
		
		else {
			horesExtra=hores-40;
			sou = 40 * preu + horesExtra * preu * 2;			
		}
		
	System.out.println(sou);
		
	}

}

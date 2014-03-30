package Exercicis;

/**
 * Exercici 32
 * Varem veure que l'api és una sèrie de classes ja fetes que ens faciliten la tasca de programar.
 * Entre elles hi ha la classe Math. Fes un programa que l'utilitzi per mostrar el sinus i el cosinus d'un angle,
 * una potència, pe 2 elevat a 8, i un número aleatori.
 * @author: Rafel Sastre Mas.
 */

public class Exercici32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double angle;
		double sinus;
		double cosinus;
		double potencia;
		double aleatori;
		
		angle=Math.toRadians(90);
		sinus=Math.sin(angle);
		cosinus=Math.cos(angle);
		potencia=Math.pow(2, 8);
		aleatori=Math.random();
		
		System.out.println(angle+" radians.");
		System.out.println(sinus);
		System.out.println(cosinus);
		System.out.println(potencia);
		System.out.println(aleatori);
		

	}
}


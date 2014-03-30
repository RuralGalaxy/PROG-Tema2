package Exercicis;

/**
 * Exercici 3
 * Donat un temps expressat en segons, descomposa'l en hores, minuts i segons.
 * 1 Hora = 3600 segons i 1 minut= 60 segons.
 * Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.
 * @author: Rafel Sastre Mas.
 */

public class Exercici03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int segons = 18000;
		int hores = segons / 3600;
		int minuts;

		segons = segons % 3600;
		minuts = segons / 60;
		segons = segons % 60;

		System.out.println(hores + " hores " + minuts + " minuts " + segons
				+ " segons ");

	}

}

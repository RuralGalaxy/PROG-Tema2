package Exercicis;

/**
 * Exercici 11 
 * A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%,
 * si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de
 * l'IRPF i el salari net.
 * @author: Rafel Sastre Mas.
 */

public class Exercici11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sou treballador
		int hores = 50;
		double preu = 12.5;
		double souBrut;
		int horesExtra;

		// Tipus salari
		double souNet;
		int irpf;

		// Calcul del sou brut
		if (hores <= 40) {
			souBrut = preu * hores;
		}

		else {
			horesExtra = hores - 40;
			souBrut = 40 * preu + horesExtra * preu * 2;
		}

		// Calcul de IRPF
		if (souBrut <= 300) {
			souNet = souBrut - (souBrut * 0.1);
			irpf = 10;
		}

		else if (souBrut <= 500) {
			souNet = souBrut - (souBrut * 0.2);
			irpf = 20;
		}

		else {
			souNet = souBrut - (souBrut * 0.3);
			irpf = 30;
		}

		System.out.println("Sòu brut = " + souBrut + " €");
		System.out.println("IRPF = " + irpf + " %");
		System.out.println("Sòu net = " + souNet + " €");
		
	}

}

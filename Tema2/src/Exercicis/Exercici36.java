package Exercicis;

import java.util.Arrays;

/**
 * Exercici 36
 * Escriviu una classe que generi dos vectors de sencers de la mateixa longitud i els inicialitzi.
 * 1- Comparau-los amb una igualtat v1==v2. Funciona? Escriviu l'explicació per pantalla utilitzant un println.
 * 2- Comparau-los correctament. Utilitzau una variable booleana per a guardar el resultat.
 * Imprimiu un println que ens informi del resultat de la comparació.
 * @author: Rafel Sastre Mas.
 */

public class Exercici36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero[] = {1,2,3,4,5,6,7,8,9,10};
		int numero2[] = {1,2,3,4,5,6,7,8,9,10};
		
		if (numero==numero2)
		{System.out.println("Són iguals!!!");}
		
		System.out.println("No funciona comparant els dos arrays.");
		System.out.println("=====================================");
		System.out.println("");
		
		if (Arrays.equals(numero, numero2)==true)
		{System.out.println("Són iguals!!!");}
		else {System.out.println("No són iguals!!!");}
		

	
	}
}

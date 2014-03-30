package Exercicis;

/**
 * Exercici 27
 * Al programa anterior elimina els break del switch. Que passa?
 * Torna'l a escriure de forma que amb el mínim de codi obtinguem el resultat correcte.
 * @author: Rafel Sastre Mas.
 */

public class Exercici27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Si llevam els break de cada case, es repeteixen valors amb diferent resultat.");

		for (char lletra = 'a'; lletra <= 'z'; lletra++) {
			switch (lletra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(lletra + " --> És vocal!");
				break;

			default:
				System.out.println(lletra + " --> És consonant!");
				break;

			}
		}
	}
}

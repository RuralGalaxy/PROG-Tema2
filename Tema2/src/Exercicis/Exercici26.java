package Exercicis;

/**
 * Exercici 26
 * Crea una classe que mostri les lletres de l'alfabet i al costat indiqui si es tracta d'una vocal o d'una consonant.
 * En farem tres versions:
 * 1- Amb un if per a cada vocal if() else if....
 * 2- Amb un sol if() else.
 * 3- Amb un switch. Recorda posar break a cada case.
 * @author: Rafel Sastre Mas.
 */

public class Exercici26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 - Amb un if per cada vocal.
		for (char lletra = 'a'; lletra <= 'z'; lletra++) {
			if (lletra == 'a' || lletra == 'A') {
				System.out.println(lletra + " --> És vocal!");
			} else if (lletra == 'e' || lletra == 'E') {
				System.out.println(lletra + " --> És vocal!");
			} else if (lletra == 'i' || lletra == 'I') {
				System.out.println(lletra + " --> És vocal!");
			} else if (lletra == 'o' || lletra == 'O') {
				System.out.println(lletra + " --> És vocal!");
			} else if (lletra == 'u' || lletra == 'U') {
				System.out.println(lletra + " --> És vocal!");
			} else {
				System.out.println(lletra + " --> És consonant!");

			}
		}

		System.out.println("===============================================");
		System.out.println("===============================================");
		
		// 2 - Amb un sol if i else.
		for (char lletra = 'a'; lletra <= 'z'; lletra++) {
			if (lletra == 'a' || lletra == 'e' || lletra == 'i'
					|| lletra == 'o' || lletra == 'u') {
				System.out.println(lletra + " --> És vocal!");
			} else {
				System.out.println(lletra + " --> És consonant!");
			}
		}

		System.out.println("===============================================");
		System.out.println("===============================================");

		// 3 - Amb un switch i posar break a cada case.
		for (char lletra = 'a'; lletra <= 'z'; lletra++) {
			switch (lletra) {
			case 'a':
				System.out.println(lletra + " --> És vocal!");
				break;

			case 'e':
				System.out.println(lletra + " --> És vocal!");
				break;

			case 'i':
				System.out.println(lletra + " --> És vocal!");
				break;

			case 'o':
				System.out.println(lletra + " --> És vocal!");
				break;

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

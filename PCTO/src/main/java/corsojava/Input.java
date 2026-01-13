
/*
	 * Importare java.util.Scanner
	 * creare oggetto scanner
	 * creare domande per utente: nome, cognome, eta, città
	 * 
	 * 
	 */

package corsojava;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual' è il tuo nome?");
		String nome = scanner.nextLine();
		System.out.println("Qual' è il tuo cognome?");
		String cognome = scanner.nextLine();
		System.out.println("Quanti anni hai?");
		int eta = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dove abiti?");
		String città = scanner.nextLine();
		System.out.println("Ciao " + nome + cognome);
		System.out.println("Hai " + eta);
		System.out.println("Abiti a " + città);

	}

}

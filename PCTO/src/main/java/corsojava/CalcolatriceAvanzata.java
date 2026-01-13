package corsojava;

import java.util.Scanner;

public class CalcolatriceAvanzata {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double risultato = 0;

		System.out.println("Benvenuto nella calcolatrice avanzata!");

		
		System.out.print("Inserisci il primo numero: ");
		double num1 = scanner.nextDouble();

		
		System.out.print("Inserisci il secondo numero: ");
		double num2 = scanner.nextDouble();

		
		System.out.print("Scegli l'operazione (+, -, *, /): ");
		String operatore = scanner.next();

		
		if (operatore.equals("+")) {
			risultato = num1 + num2;
			System.out.println("Il risultato dell'addizione è: " + risultato);
		} else if (operatore.equals("-")) {
			risultato = num1 - num2;
			System.out.println("Il risultato della sottrazione è: " + risultato);
		} else if (operatore.equals("*")) {
			risultato = num1 * num2;
			System.out.println("Il risultato della moltiplicazione è: " + risultato);
		} else if (operatore.equals("/")) {
			if (num2 != 0) {
				risultato = num1 / num2;
				System.out.println("Il risultato della divisione è: " + risultato);
			} else {
				System.out.println("Errore: Impossibile dividere per zero.");
			}
		} else {
			System.out.println("Errore: Operatore non valido. Riprova.");
		}
		scanner.close();
	}
}
package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio9 {

	public static void main(String[] args) {
				
		String testo = "Questa è la stringa da utilizzare per l'esercizio";
				
			Scanner scanner = new Scanner(System.in);
				
			System.out.println("La stringa contiene " + testo.length() + " caratteri.");
			System.out.print("Inserisci l'indice del carattere che vuoi visualizzare: ");
				
			int indice = Integer.parseInt(scanner.nextLine());
				
			if (indice < 0 || indice >= testo.length()) {
				System.out.println("AVVERTIMENTO: L'indice (" + indice + ") non esiste!");
				System.out.println("Inserisci un valore compreso tra 1 e " + (testo.length()) + ".");
			} else {
				char carattere = testo.charAt(indice-1);
				System.out.println("Il carattere all'indice " + indice + " è: '" + carattere + "'");
			}
				
			scanner.close();
	}
}

	


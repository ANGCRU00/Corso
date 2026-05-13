package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String scelta;
		String stop;

		do {
			System.out.println("Premi INVIO per continuare o digita 0 per interrompere il programma:");
			stop = scanner.nextLine();
			if (stop.equals("0")) { 
				break; 
			}
			
			System.out.println("Inserisci il primo numero:");
			double num1 = Double.parseDouble(scanner.nextLine());

			System.out.println("Inserisci il secondo numero:");
			double num2 = Double.parseDouble(scanner.nextLine());
			
			System.out.println("Scegli l'operazione da eseguire:");
			System.out.println("1. Somma");
			System.out.println("2. Sottrazione");
			System.out.println("3. Moltiplicazione");
			System.out.println("4. Divisione");
			
			scelta = scanner.nextLine();

			switch (scelta) {
				case "1":
					System.out.println("Risultato Somma: " + (num1 + num2));
					break;
				case "2":
					System.out.println("Risultato Sottrazione: " + (num1 - num2));
					break;
				case "3":
					System.out.println("Risultato Moltiplicazione: " + (num1 * num2));
					break;
				case "4":
					if (num2 != 0) {
						System.out.println("Risultato Divisione: " + (num1 / num2));
					} else {
						System.out.println("Errore: Impossibile dividere per zero!");
					}
					break;
				default:
					System.out.println("Opzione non valida! Riprova.");
					break;
			}

		} while (!stop.equals("0")); 
		
		System.out.println("Programma interrotto.");
		
		scanner.close();
	}
}




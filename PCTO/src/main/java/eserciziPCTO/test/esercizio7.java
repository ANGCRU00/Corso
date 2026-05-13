package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double saldo = 1200;
		String scelta;
		int num;

		System.out.println("Benvenuto al tuo sportello bancomat!");
		
		do {
			System.out.println("Cosa desideri fare?");
			System.out.println("1. Visualizzare saldo");
			System.out.println("2. Prelevare");
			System.out.println("3. Depositare");
			System.out.println("4. Uscire");
			
			scelta = scanner.nextLine();
			
			switch (scelta) {
				case "1":
					System.out.println("Il tuo saldo attuale è di: " + saldo + "€");
					break;
				case "2":
					System.out.println("Quanto vuoi prelevare?");
					num = Integer.parseInt(scanner.nextLine());
					
					if (num <= saldo) {
						saldo = saldo - num;
						System.out.println("Prelievo effettuato.");
					} else {
						System.out.println("Errore: Saldo insufficiente!");
					}
					break;
				case "3":
					System.out.println("Quanto vuoi depositare?");
					num = Integer.parseInt(scanner.nextLine());
					saldo = saldo + num;
					System.out.println("Deposito effettuato.");
					break;
				case "4":
					System.out.println("Grazie per aver utilizzato il nostro servizio. Arrivederci!");
					break;
				default:
					System.out.println("Opzione non valida! Riprova.");
					break;
			}
			
		} while (!scelta.equals("4"));
		
		scanner.close();
	}
}

	

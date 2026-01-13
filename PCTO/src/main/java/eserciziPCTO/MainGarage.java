package eserciziPCTO;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGarage {

	public static void main(String[] args) {

		String azione = "";
		Garage garage = new Garage();
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\n--- Menu Garage ---");
			System.out.println("[0] Inserisci veicolo");
			System.out.println("[1] Estrai veicolo");
			System.out.println("[2] Stampa situazione");
			System.out.println("[3] Esci");
			System.out.print("Seleziona un'azione: ");
			azione = scanner.nextLine();

			try {
				switch (azione) {
				case "0":
					inserisciVeicolo(garage, scanner);
					break;
				case "1":
					estraiVeicolo(garage, scanner);
					break;
				case "2":
					garage.stampaSituazione();
					break;
				case "3":
					System.out.println("Uscita dall'applicazione. Arrivederci!");
					break;
				default:
					System.out.println("Azione non valida. Riprova.");
					break;
				}
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("Input non valido. Assicurati di inserire il tipo di dato corretto.");
				// Clear the invalid input from the scanner
				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}
			}
		} while (!azione.equals("3"));

		scanner.close();
	}

	private static void inserisciVeicolo(Garage garage, Scanner scanner) {
		System.out.print("Che tipo di veicolo vuoi inserire? [auto, moto, furgone]: ");
		String tipoVeicolo = scanner.nextLine().toLowerCase();

		System.out.print("Inserisci marca: ");
		String marca = scanner.nextLine();
		System.out.print("Inserisci anno: ");
		// Use nextLine() and parseInt() to avoid scanner issues
		int anno = Integer.parseInt(scanner.nextLine());
		System.out.print("Inserisci cilindrata: ");
		int cilindrata = Integer.parseInt(scanner.nextLine());

		Veicolo nuovoVeicolo = null;
		switch (tipoVeicolo) {
		case "auto":
			System.out.print("Numero di porte: ");
			int porte = Integer.parseInt(scanner.nextLine());
			System.out.print("Alimentazione [benzina, diesel, elettrico]: ");
			String alimentazione = scanner.nextLine();
			nuovoVeicolo = new Auto(marca, anno, cilindrata, porte, alimentazione);
			break;
		case "moto":
			System.out.print("Numero di tempi: ");
			int tempi = Integer.parseInt(scanner.nextLine());
			nuovoVeicolo = new Moto(marca, anno, cilindrata, tempi);
			break;
		case "furgone":
			System.out.print("Capacità in Kg: ");
			int capacita = Integer.parseInt(scanner.nextLine());
			nuovoVeicolo = new Furgone(marca, anno, cilindrata, capacita);
			break;
		default:
			System.out.println("Tipo di veicolo non valido.");
			return;
		}

		int postoAssegnato = garage.immettiVeicolo(nuovoVeicolo); // Assuming this method exists and is correct
		if (postoAssegnato != -1) {
			System.out.println("Veicolo inserito con successo nel posto " + postoAssegnato + ".");
		} else {
			System.out.println("Impossibile inserire il veicolo. Il garage è pieno.");
		}
	}

	private static void estraiVeicolo(Garage garage, Scanner scanner) {
		System.out.print("Inserisci il numero del posto da cui estrarre il veicolo (0-14): ");
		try {
			int posto = Integer.parseInt(scanner.nextLine());
			Veicolo veicoloEstratto = garage.estraiVeicolo(posto); // Assuming this method exists and is correct
			if (veicoloEstratto != null) {
				System.out.println("Veicolo estratto con successo dal posto " + posto + ".");
				System.out.println("Dettagli del veicolo:");
				// Assuming the Veicolo class has a stampaDettagli() method
				veicoloEstratto.stampaDettagli();
			} else {
				System.out.println("Il posto specificato è vuoto o non valido.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Input non valido. Inserisci un numero per il posto.");
		}
	}
}
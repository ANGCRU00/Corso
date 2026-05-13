package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean[] posti = new boolean[10];
		int contatoreOccupati = 0; 
		int scelta;
		
		System.out.println("Benvenuto al cinema!");
		
		do {
			
			do {
				System.out.println("Che posto vuoi prenotare? (Digita -1 per uscire):");
				scelta = Integer.parseInt(scanner.nextLine());
				
				if (scelta == -1) {
					break;
				}
				
				int indiceArray = scelta - 1;
				
				if (indiceArray < 0 || indiceArray >= posti.length || posti[indiceArray] == true) {
					System.out.println("Errore: Il posto selezionato non è disponibile o non esiste! Riprova.");
				}
				
			} while ((scelta - 1) < 0 || (scelta - 1) >= posti.length || posti[scelta - 1] == true);
			
			if (scelta == -1) {
				break;
			}
			
			posti[scelta - 1] = true;
			contatoreOccupati++; 
			System.out.println("Posto " + scelta + " prenotato con successo!");
			
			if (contatoreOccupati == 10) {
				System.out.println("Sold out! Tutti i posti del cinema sono stati occupati.");
			}
			
		} while (scelta != -1 & contatoreOccupati < 10);
		
		System.out.println("Buona visione!");
		scanner.close();
	}
}


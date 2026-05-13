package esercitazioni;
import java.util.Scanner;


public class eserciziocinque {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int scelta = -1;

	        while (scelta != 0) {
	            System.out.println("\n--- MENU CALCOLATRICE ---");
	            System.out.println("1. Somma");
	            System.out.println("2. Sottrazione");
	            System.out.println("3. Moltiplicazione");
	            System.out.println("4. Divisione");
	            System.out.println("0. Esci");
	            System.out.print("Scegli un'operazione: ");
	            scelta = input.nextInt();

	            if (scelta == 0) break;
	            if (scelta < 1 || scelta > 4) {
	                System.out.println("Scelta non valida!");
	                continue;
	            }

	            System.out.print("Inserisci il primo numero: ");
	            double n1 = input.nextDouble();
	            System.out.print("Inserisci il secondo numero: ");
	            double n2 = input.nextDouble();

	            switch (scelta) {
	                case 1: System.out.println("Risultato: " + (n1 + n2)); break;
	                case 2: System.out.println("Risultato: " + (n1 - n2)); break;
	                case 3: System.out.println("Risultato: " + (n1 * n2)); break;
	                case 4: 
	                    if (n2 != 0) System.out.println("Risultato: " + (n1 / n2));
	                    else System.out.println("Errore: Divisione per zero!");
	                    break;
	            }
	        }
	        System.out.println("Programma terminato.");


	}

}
package esercitazioni;
import java.util.Scanner;

public class eserciziodieci {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        boolean[] posti = new boolean[10];
	        int postiOccupati = 0;
	        int scelta = 0;

	        while (postiOccupati < 10) {
	            System.out.print("Scegli un posto (1-10) o -1 per uscire: ");
	            scelta = input.nextInt();

	            if (scelta == -1) break;

	            if (scelta < 1 || scelta > 10) {
	                System.out.println("Posto inesistente!");
	            } else {
	                int index = scelta - 1;
	                if (posti[index]) {
	                    System.out.println("Spiacente, il posto è già occupato.");
	                } else {
	                    posti[index] = true;
	                    postiOccupati++;
	                    System.out.println("Posto " + scelta + " prenotato con successo!");
	                }
	            }
	        }
	        System.out.println("Programma terminato. Posti occupati: " + postiOccupati);
	    }
	}
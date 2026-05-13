package minimo;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int scelta;

        do {
        	System.out.println("Dati due numeri inseriti scegli l'operazione, 0 per terminare");
        	System.out.println("Inserisci il primo numero:");
        	double num1 = input.nextDouble();

        	System.out.println("Inserisci il secondo numero:");
        	double num2 = input.nextDouble();
        	
        	System.out.println("Scegli operazione: ");
        	System.out.println("1 - Somma");
        	System.out.println("2 - Sottrazione");
        	System.out.println("3 - Moltiplicazione");
        	System.out.println("4 - Divisione");
        	System.out.println("0 - Esci");
        	scelta = input.nextInt();
        	
        	switch(scelta) {
            case 1:
                System.out.println("Risultato: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Risultato: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Risultato: " + (num1 * num2));
                break;

            case 4:
                System.out.println("Risultato: " + (num1 / num2));
                break;

            case 0:
                System.out.println("Programma terminato");
                break;

            default:
                System.out.println("Scelta non valida");
                break;
        }
        } while (scelta != 0);
        
        input.close();
		
		
	}

}


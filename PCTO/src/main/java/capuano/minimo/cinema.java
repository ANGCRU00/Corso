package minimo;

import java.util.Scanner;

public class cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] posti = new boolean[10];

        int postiOccupati = 0;
        int scelta;

        do {
            System.out.println("Scegli un posto da 1 a 10 oppure -1 per uscire:");
            scelta = input.nextInt();

            if(scelta == -1) {
                System.out.println("Programma terminato.");
            } else if(scelta < 1 || scelta > 10) {
                System.out.println("Posto inesistente.");
            } else {
                int indice = scelta - 1;

                if(posti[indice] == true) {
                    System.out.println("Posto già occupato.");
                } else {
                    posti[indice] = true;
                    postiOccupati++;
                    System.out.println("Posto " + scelta + " prenotato correttamente.");
                }
            }

        } while(scelta != -1 && postiOccupati < 10);

        if(postiOccupati == 10) {
            System.out.println("Tutti i posti sono occupati.");
        }

        input.close();
    }
}

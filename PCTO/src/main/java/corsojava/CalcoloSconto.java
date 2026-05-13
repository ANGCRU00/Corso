package corsojava;

import java.util.Scanner;

public class CalcoloSconto {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Inserisci il prezzo del prodotto: ");
        double prezzoUnitario = input.nextDouble();

        System.out.print("Inserisci la quantità acquistata: ");
        int quantita = input.nextInt();

       
        double totaleLordo = prezzoUnitario * quantita;
        double sconto = 0;

       
        if (quantita >= 10 && quantita <= 20) {
            sconto = 0.05; // 5%
        } else if (quantita > 20) {
            sconto = 0.10; // 10%
        }

      
        double importoSconto = totaleLordo * sconto;
        double totaleFinale = totaleLordo - importoSconto;

        // Stampa dei risultati
        System.out.println("\n--- Resoconto ---");
        System.out.printf("Totale Lordo: €%.2f%n", totaleLordo);
        System.out.println("Sconto applicato: " + (int)(sconto * 100) + "%");
        System.out.printf("Totale Finale: €%.2f%n", totaleFinale);

        input.close();
    }
}
package virgola;

import java.util.Scanner;

public class Virgola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero con la virgola");
        double n = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero con la virgola");
        double n1 = scanner.nextDouble();

        int scelta;
        double risultato;

        do {

            System.out.println("\nScegli l'operazione");

            System.out.println("Digita 1 per l'addizione");
            System.out.println("Digita 2 per la sottrazione");
            System.out.println("Digita 3 per la divisione");
            System.out.println("Digita 4 per la moltiplicazione");
            System.out.println("Digita 0 per uscire");

            scelta = scanner.nextInt();

            if (scelta == 1) {
                risultato = n + n1;
                System.out.println("Il risultato è " + risultato);

            } else if (scelta == 2) {
                risultato = n - n1;
                System.out.println("Il risultato è " + risultato);

            } else if (scelta == 3) {
                risultato = n / n1;
                System.out.println("Il risultato è " + risultato);

            } else if (scelta == 4) {
                risultato = n * n1;
                System.out.println("Il risultato è " + risultato);

            } else if (scelta == 0) {
                System.out.println("Fine programma");

            } else {
                System.out.println("Scelta non valida");
            }

        } while (scelta != 0);

        scanner.close();
    }
}

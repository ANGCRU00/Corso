package paridisp;

import java.util.Scanner;

public class Paridisp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire?");
        int n = scanner.nextInt();

        int[] numeri = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        int pari = 0;
        int dispari = 0;

        for (int i : numeri) {

            if (i % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
        }

        System.out.println("Numeri pari: " + pari);
        System.out.println("Numeri dispari: " + dispari);

        scanner.close();
    }
}



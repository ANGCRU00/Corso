package minimo;

import java.util.Scanner;

public class stringa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String frase = "Questa è la stringa da utilizzare per l'esercizio";

        System.out.println("La frase è:");
        System.out.println(frase);

        System.out.println("Inserisci un indice:");
        int indice = input.nextInt();

        if(indice >= 0 && indice < frase.length()) {
            System.out.println("Il carattere in posizione " + indice + " è: " + frase.charAt(indice));
        } else {
            System.out.println("Indice non valido. La stringa è lunga " + frase.length() + " caratteri.");
        }

        input.close();
    }
}
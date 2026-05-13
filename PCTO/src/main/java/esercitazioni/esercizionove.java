package esercitazioni;
import java.util.Scanner;

public class esercizionove {

	public static void main(String[] args) {
	    String testo = "Questa è la stringa da utilizzare per l'esercizio";
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci l'indice del carattere che vuoi vedere: ");
        int indice = input.nextInt();

        if (indice >= 0 && indice < testo.length()) {
            System.out.println("Il carattere all'indice " + indice + " è: " + testo.charAt(indice));
        } else {
            System.out.println("Errore: L'indice inserito eccede la lunghezza della stringa!");
        }
    }
}
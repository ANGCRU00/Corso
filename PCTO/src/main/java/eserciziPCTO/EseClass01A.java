package eserciziPCTO;

public class EseClass01A {

	/*
	 * Istruzioni per eseguire questo programma da linea di comando: 1. Apri il
	 * Terminale 
	 *
	 * 2. Spostati nella cartella in cui si trova il tuo file sorgente. Ad esempio,
	 * se il tuo file è in "C:\Users\angel\eclipse-workspace\PCTO\src\main\java",
	 * digita il comando seguente : cd C:\Users\angel\eclipse-workspace\PCTO
	 
	 *
	 * 3. Compila il codice Java. Questo comando crea il file "EseClass01A.class".
	 * javac EseClass01A.java
	 *
	 * 4. Esegui il programma. I dati che inserisci dopo il nome della classe
	 * verranno passati al metodo main come argomenti.
	 *
	 * Per eseguire l'Esercizio 2: java EseClass01A 5
	 *
	 * Per eseguire l'Esercizio 3: java EseClass01A 10 5 15
	 * 
	 * Se non dovesse funzionare bisogna utilizzare il comando java -cp bin
	 * EseClass01A seguito dagli argomenti
	 */

	// Esercizio 1: Somma degli elementi di un array
	public static void eseguiEsercizio1() {
		System.out.println("--- Esercizio 1 ---");
		int[] numbers = { 3, 4, 5, 7, 9 };
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("La somma degli elementi dell'array è: " + sum);
		System.out.println();
	}

	// Esercizio 2: Estrazione di un carattere da una stringa
	public static void eseguiEsercizio2(String[] args) {
	    System.out.println("--- Esercizio 2 ---");
	    String fixedString = "Questa è la stringa da utilizzare per l'esercizio";

	    // Dichiarazione e inizializzazione di una variabile per l'indice
	    int index = 8; 

	    if (index >= 0 && index < fixedString.length()) {
	        char character = fixedString.charAt(index);
	        System.out.println("Il carattere all'indice " + index + " è: " + character);
	    } else {
	        System.out.println("Attenzione: L'indice fornito (" + index + ") eccede la lunghezza della stringa.");
	    }

	    System.out.println();
	}

	// Esercizio 3: Valore minimo tra tre numeri
	public static void eseguiEsercizio3(String[] args) {
		System.out.println("--- Esercizio 3 ---");
		if (args.length < 3) {
			System.out.println("Errore: Devi fornire 3 numeri interi come argomenti per l'Esercizio 3.");
			return;
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			int min = Math.min(Math.min(num1, num2), num3);
			System.out.println("Il valore minore è: " + min);
		} catch (NumberFormatException e) {
			System.out.println("Errore: Uno degli argomenti forniti non è un numero intero valido.");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		

		eseguiEsercizio1();

		eseguiEsercizio2(args);

		eseguiEsercizio3(args);
	}
}
package eserciziPCTO;

import java.util.Scanner;

public class Scanner_numerico {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		int numUno = scanner.nextInt();
		System.out.println("Inserisci il secondo numero");
		int numDue = scanner.nextInt();
		int risultato = (Math.min(numUno, numDue));
		System.out.println("Il numero più basso è " + risultato);
		scanner.close();
	}
}

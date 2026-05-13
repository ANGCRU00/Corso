package esercitazioni;
import java.util.Scanner;

public class eserciziosei {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il punteggio (0-100): ");
        int voto = input.nextInt();

        if (voto >= 90 && voto <= 100) System.out.println("Voto A");
        else if (voto >= 80) System.out.println("Voto B");
        else if (voto >= 70) System.out.println("Voto C");
        else if (voto >= 60) System.out.println("Voto D");
        else if (voto < 60 && voto >= 0) System.out.println("Voto F");
        else System.out.println("Valore non valido");

	}

}

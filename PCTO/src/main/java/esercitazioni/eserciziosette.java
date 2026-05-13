package esercitazioni;
import java.util.Scanner;

public class eserciziosette {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double saldo = 1000.0; 
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("\n1. Controlla Saldo\n2. Preleva\n3. Deposita\n0. Esci");
            System.out.print("Scegli opzione: ");
            scelta = input.nextInt();

            if (scelta == 1) {
                System.out.println("Saldo attuale: " + saldo + "€");
            } else if (scelta == 2) {
                System.out.print("Quanto prelevare? ");
                double prelievo = input.nextDouble();
                if (prelievo <= saldo) {
                    saldo -= prelievo;
                    System.out.println("Prelievo effettuato.");
                } else {
                    System.out.println("Saldo insufficiente!");
                }
            } else if (scelta == 3) {
                System.out.print("Quanto depositare? ");
                double deposito = input.nextDouble();
                saldo += deposito;
                System.out.println("Deposito effettuato.");

	}

}
	}
}

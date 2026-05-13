package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final String USER_CORRETTO = "mikamika";
		final String PSW_CORRETTA = "lalalala";
				
		int tentativi= 3;
		boolean autenticato = false;

		System.out.println("Effettua il login.");

		while (tentativi> 0 & !autenticato) {
			System.out.print("Inserisci l'username: ");
			String username = scanner.nextLine();

			System.out.print("Inserisci la password: ");
			String password = scanner.nextLine();

			if (username.equals(USER_CORRETTO) & password.equals(PSW_CORRETTA)) {
				autenticato = true;
			} else {
				tentativi--; 
						
				if (tentativi > 0) {
				System.out.println("Credenziali errate! Ti rimangono " + tentativi + " tentativi.");
				}
			}
		}

	    if (autenticato == true) {
			System.out.println("Login effettuato con successo!");
		} else {
			System.out.println("Accesso bloccato! Hai esaurito i 3 tentativi disponibili.");
		}

		scanner.close();
    }
		
}



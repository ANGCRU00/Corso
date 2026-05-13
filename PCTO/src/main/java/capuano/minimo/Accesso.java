package minimo;

import java.util.Scanner;

public class Accesso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] username = new String[1];
		String[] password = new String[1];
		
		System.out.println ("Crea il tuo username: ");
		username[0] = input.nextLine();
		
		System.out.println ("Crea la tua password: ");
		password[0] = input.nextLine();
		
		System.out.println("Registrazione completata!");
		System.out.println("Ora effettua l'accesso");
		
		int tentativi = 0;
		boolean accesso = false;
		
		while(tentativi< 3 && accesso == false) {
			System.out.println("Inserisci username: ");
			String usernameInserito = input.nextLine();
			
			System.out.println("Inserisci password: ");
			String passwordInserita = input.nextLine();
			
			if(usernameInserito.equals(username[0]) && passwordInserita.equals(username[0])) {
				accesso = true;
				System.out.println ("Accesso consentito");
			}
			else {
				tentativi++;
				System.out.println("Credenziali errate");
                System.out.println("Tentativi rimasti: " + (3 - tentativi));
            }
			}
		if(accesso == false) {
			System.out.println("Accesso Negato, hai superato i 3 tentativi.");
			
			
			
		}
	}

}

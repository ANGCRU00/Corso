package esercitazioni;
import java.util.Scanner;

public class eserciziootto {

		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String userCorretto = "admin";
	        String passCorretta = "1234";
	        int tentativi = 3;
	        boolean accessGranted = false;

	        for (int i = 1; i <= tentativi; i++) {
	            System.out.print("Username: ");
	            String u = input.next();
	            System.out.print("Password: ");
	            String p = input.next();

	            if (u.equals(userCorretto) && p.equals(passCorretta)) {
	                System.out.println("Accesso consentito!");
	                accessGranted = true;
	                break;
	            } else {
	                System.out.println("Credenziali errate. Tentativi rimasti: " + (tentativi - i));
	            }
	        }

	        if (!accessGranted) {
	            System.out.println("Account bloccato per troppi tentativi.");
	        }
	    }
	}
package minimo;


import java.util.Scanner;


public class bancomat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scelta;
		
		System.out.println("Quanto vuoi depositare per creare il conto? ");
		double saldo = input.nextDouble();
		  do {
			    System.out.println("benvenuto utente");
	        	System.out.println("Scegli operazione: ");
	        	System.out.println("1 - Controllare saldo");
	        	System.out.println("2 - Prelevare");
	        	System.out.println("3 - Depositare");
	        	System.out.println("0 - uscire");
	        	scelta = input.nextInt();
	        	
	        	switch(scelta) {
	            case 1:

	                System.out.println("Il tuo saldo è: " + saldo);
	                break;

	            case 2:
	            	System.out.println("Quanto vuoi prelevare? ");
	                double prelievo = input.nextDouble();
	                if (prelievo > saldo) {
	                	System.out.println("Saldo Insufficente");
	                } else {
	                saldo = saldo - prelievo;
	                System.out.println("Prelievo andato a buon fine");
	                System.out.println("Il tuo saldo aggiornato è: " + saldo);
	                }
	                break;

	            case 3:
	            	System.out.println("Quanto vuoi depositare? ");
	                double deposito = input.nextDouble();
	                saldo = saldo + deposito;
	                System.out.println("Deposito andato a buon fine");
	                System.out.println("Il tuo saldo aggiornato è: " + saldo);
	                break;

	            case 0:
	                System.out.println("Programma terminato");
	                break;

	            default:
	                System.out.println("Scelta non valida");
	                break;
	        }
			  
		  } while (scelta != 0);
	}

}

package corsojava;

public class Errori {


	    public static void main(String[] args) {

	        int numeratore = 10;
	        int denominatore = 0;

	        try {
	            int risultato = numeratore / denominatore;
	            System.out.println("Il risultato è: " + risultato);
	        } catch (ArithmeticException e) {
	            System.out.println("Errore: Non puoi dividere un numero per zero!");
	            System.err.println(e.getMessage());
	        } finally {
	            System.out.println("Operazione di divisione terminata.");
	        }
	    }
	}


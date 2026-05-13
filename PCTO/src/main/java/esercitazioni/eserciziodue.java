package esercitazioni;

public class eserciziodue {

	public static void main(String[] args) {
		int[] numeri = {3,4,5,7,9,};
		int minimo  = numeri [0];
				for  (int i = 1; i < numeri.length; i++) {
					if ( numeri[i] < minimo) {
						minimo = numeri[i];
					}
				}
					
        System.out.println("Il valore minimo è: " + minimo);
    }
}

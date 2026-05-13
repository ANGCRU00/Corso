package minimo;

import java.util.Scanner;

public class media {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire?");
        int dimensione = input.nextInt();

        int[] numeri = new int[dimensione];
        		
        		
    	for(int i=0; i < numeri.length; i++) {
    		System.out.println("Inserisci un numero: ");
    		numeri[i] = input.nextInt(); 		
    	}
        
        
    	double media=0;
    	int somma=0;
    	
    	for(int i=0; i < numeri.length; i++) {
    	somma = somma + numeri[i];
        }
    	
    	media = somma / numeri.length;
    	System.out.println("La media e' " + media);
    	input.close();
    }

}
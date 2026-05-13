package minimo;

import java.util.Scanner;

public class paridispari {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Quanti numeri vuoi inserire?");
        int dimensione = input.nextInt();
        
        int[] numeri = new int[dimensione];
        
        for( int i=0; i < numeri.length ; i++) {
        	System.out.println("Inserisci un numero: ");
    		numeri[i] = input.nextInt(); 
        }
        
        int pari = 0;
        int dispari = 0;
        
    	for(int i=0; i < numeri.length; i++) {
    		if ( numeri[i] % 2 == 0) {
    			pari++;
    		}
    		else { 
    			dispari++;
    		}
    		
        }
    	System.out.println("Numeri pari: " + pari);
		System.out.println("Numeri dispari: " + dispari);
		
		input.close();
				
	}
        
        
}

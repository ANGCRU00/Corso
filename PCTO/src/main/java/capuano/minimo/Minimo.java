package minimo;

import java.util.Scanner;

public class Minimo {

    public static void main(String[] args) {
    	int min=Integer.parseInt(args[0]);
    	for(int i=0; i < args.length; i++) {
    		int numero = Integer.parseInt(args[i]);
    		if(numero < min ) { 
    		min = numero;
    	    }
    	}
    	System.out.println("Il minimo e' " + min);
    }

}


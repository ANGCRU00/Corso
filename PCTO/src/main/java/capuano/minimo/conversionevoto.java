package minimo;

import java.util.Scanner;

public class conversionevoto {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire Voto Preso in Numeri: ");
		int numero = input.nextInt();
		if(numero < 0 || numero > 100) {
		    System.out.println("Voto non valido");
		}
		    else if(numero >= 90 && numero <= 100) {
	            System.out.println("Voto A");
	        } else if(numero >= 80 && numero <= 89) {
	            System.out.println("Voto B");
	        } else if(numero >= 70 && numero <= 79) {
	            System.out.println("Voto C");
	        } else if(numero >= 60 && numero <= 69) {
	            System.out.println("Voto D");
	        } else {
	            System.out.println("Voto F");
	        }
	
		input.close();
	
	}
}

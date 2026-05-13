package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio2 {

	public static void main(String[] args) {
		
		System.out.println("Quanti numeri vuoi inserire?");
		Scanner scanner = new Scanner(System. in);
	    String input = scanner.nextLine();
	    
	    int num = Integer.parseInt(input);
	    int[] myArray = new int[num];
	    
	    int minimo = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < num; i++) {
			System.out.println("Inserisci il " + (i+1) + " numero:");
			myArray[i] = Integer.parseInt(scanner.nextLine());
	    
			
			if (myArray[i] < minimo) {
				minimo = myArray[i]; 
			}
	    }
			
		System.out.println("Valore minimo inserito: " + minimo);
		
		scanner.close(); 
	} 

}

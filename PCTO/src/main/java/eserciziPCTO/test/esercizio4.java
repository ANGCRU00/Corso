package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio4 {

	public static void main(String[] args) {
		
		System.out.println("Quanti numeri vuoi inserire?");
		Scanner scanner = new Scanner(System.in);
	    String input = scanner .nextLine();
	    
	    int num = Integer.parseInt(input);
	    int[] myArray = new int[num];
	    
	    int pari=0;
	    int dispari=0;
	    
	    
	    for (int i = 0; i < num; i++) {
			System.out.println("Inserisci il " + (i+1) + " numero:");
			int app = Integer.parseInt(scanner.nextLine());
			myArray[i] = app;
				
				if (app % 2 == 0) {
					pari ++;
				} else {
					dispari ++;
				}
	    }
			
		System.out.println("Numeri pari inseriti: " + pari);
		System.out.println("Numeri dispari inseriti: " + dispari);
		
		scanner.close(); 
	} 

}

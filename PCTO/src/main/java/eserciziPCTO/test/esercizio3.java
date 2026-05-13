package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		
		System.out.println("Quanti numeri vuoi inserire?");
		Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();
	    
	    int num = Integer.parseInt(input);
	    int[] myArray = new int[num];
	    
	    int tot = 0;
	    
	    for (int i = 0; i < num; i++) {
			System.out.println("Inserisci il " + (i+1) + " numero:");
			int app = Integer.parseInt(scanner.nextLine());
			myArray[i] = app;
			tot = tot + app;
	    }
	    
	    float media = tot / num;
			
		System.out.println("Media dei numeri: " + media);
		
		scanner.close(); 
	} 

}

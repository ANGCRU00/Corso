package Minimo;
import java.util.Scanner;
public class Minimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("quanti numeri vuoi inserire?");
		 int n =scanner.nextInt();
		 int [] numeri = new int [n];
		 for (int i = 0; i < n; i++) {
             System.out.print("Inserisci il numero " + (i + 1) + ": ");
             numeri[i] = scanner.nextInt();
		 }
	     int minimo = numeri[0];
	     for (int i = 1; i < n; i++) {
	            if (numeri[i] < minimo) {
	                minimo = numeri[i];
	            }
	        }
	     System.out.println("il numero piu piccolo è " + minimo);
	}

}

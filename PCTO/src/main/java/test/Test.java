package it.its.test;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("quanti numeri vuoi inserire?");
		 int n =scanner.nextInt();
		 int [] numeri = new int [n];
		 int somma = 0;
		 
		 for (int i = 0; i < n; i++) {
             System.out.print("Inserisci il numero " + (i + 1) + ": ");
             numeri[i] = scanner.nextInt();
             somma += numeri[i];
		 }
		 System.out.println("La somma degli elementi dell'array è: " + somma);

	}

}

package eserciziPCTO.test;
import java.util.Scanner;

public class esercizio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Inserisci un numero:");
			int num = scanner.nextInt();
			
			if (num<60) {
				System.out.println("VOTO F");}
			if (num<70) {
				System.out.println("VOTO D");}
			if (num<80) {
				System.out.println("VOTO C");}
			if (num<90) {
				System.out.println("VOTO B");}
			if (num<=100) {
				System.out.println("VOTO A");}
			
		scanner.close();
	}

	}



package voto;
import java.util.Scanner;
public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("inserire un numero da 1 a 100 per convertirlo in voto");
		 int numero = scanner.nextInt();
		 
		 if(numero>=90 && numero<=100) {
			System.out.print("il tuo voto è A");
		 }
		 if(numero>=80 && numero<=89) {
				System.out.print("il tuo voto è B");
			 }
		 if(numero>=70 && numero<=79) {
				System.out.print("il tuo voto è C");
			 }
		 if(numero>=60 && numero<=69) {
				System.out.print("il tuo voto è D");
			 }
		 if(numero<60) {
				System.out.print("il tuo voto è F");
			 }
		 
		 
	}

}

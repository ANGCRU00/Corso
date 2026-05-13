package eserciziPCTO.test;

public class Test {

	public static void main(String[] args) {
		
		int somma = 0;
		
		for (String num : args) {
			somma = somma + Integer.parseInt(num);
		}
		
		System.out.println("Somma = " + somma);
	}

}

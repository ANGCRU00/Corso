package corsojava;

public class Cicli {
public static void main(String[] args) {
	// Ciclo while
	int x = 10;
	while (x < 5) {
	  System.out.println("Questo non verrà mai stampato.");
	}

	// Ciclo do...while
	int y = 10;
	do {
	  System.out.println("Questo verrà stampato una volta.");
	} while (y < 5);
	
	
	
	// Stampa i numeri da 0 a 4
	for (int i = 0; i < 5; i++) {
	  System.out.println("Il valore di i è: " + i);
	}	
	String[] frutti = {"mela", "banana", "arancia"};

	
	for (String frutto : frutti) {
	  System.out.println("Oggi mangio una " + frutto);
	}
}

}

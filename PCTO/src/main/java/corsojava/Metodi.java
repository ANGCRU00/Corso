package corsojava;
/*
 * Cosa sono i metodi
 * Metodo void
 * parametri dei metodi
 * il return
 * Overloaded methods, cosa sono?
 * creiamo diversi metodi con num param differenti
 * creiamo diversi metoi con tipi dato differenti
 */
public class Metodi {
	static double x = 2;
	static double y= 3;
	static double risultato;
public static void main(String[] args) {
	Addizione(x, y);
	System.out.println(risultato);
}
	
	static int Addizione(int a, int b, int c) {
		int risultato = a +  b + c;
		return risultato;
	}
	
	static int Addizione(double a, double b) {
		double risultato = a +  b ;
		return 0;
		
	}
	
}

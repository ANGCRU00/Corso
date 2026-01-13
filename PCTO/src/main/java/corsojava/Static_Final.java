package corsojava;

public class Static_Final {
	final int a = 10; // Non può essere modificata.

	static int b; // è Condiviso tra le istanze

	String nome;
	String cognome;

	public Static_Final(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		b++;
	}

	public static void main(String[] args) {
		Static_Final persona = new Static_Final("Carlo", "Conti");
		Static_Final persona1 = new Static_Final("Carlo", "Conti");
		Static_Final persona2 = new Static_Final("Carlo", "Conti");
		System.out.println(Static_Final.b); //Si accede con il nome della classe perchè riguarda lo stampino e non l'oggetto

	}
}

package corsojava;

public class OggettiComeParametri extends Persona{

	
	public OggettiComeParametri(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Persona persona1= new Persona("Carlo", "Verdone", 12);
		persona1.Saluta(persona1);
		Saluta();
	}
}

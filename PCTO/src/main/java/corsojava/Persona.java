package corsojava;

public class Persona {
	 private static String nome;
	 public static String getNome() {
		return nome;
	}


	public static void setNome(String nome) {
		Persona.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getColorePreferito() {
		return colorePreferito;
	}


	public void setColorePreferito(String colorePreferito) {
		this.colorePreferito = colorePreferito;
	}
	private String cognome;
	 private int eta;
	 private String colorePreferito;

	public Persona(String nome, String cognome, int eta, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
		
	}
	
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
		
	}
	static void Saluta() {
		System.out.println("Ciao" + nome);
		
	}
	
	static void Saluta(Persona persona) {
		System.out.println("Ciao" + Persona.nome);
	}
}



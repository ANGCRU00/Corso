package eserciziPCTO;

public class Pizza {
	private String nome;
	private double prezzo;

	
	public Pizza(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	
	public void prepara() {
		System.out.println("Inizio preparazione di una pizza generica");
	}

	
	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}
}
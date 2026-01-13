package eserciziPCTO;

import java.util.HashMap;

public class Scuola {
	private String nome;
	private String via;
	private int civico;
	private String citta;
	private HashMap<String, Insegnante> corpoDocente;
	private HashMap<String, Materia> materieOfferte;

	public Scuola(String nome, String via, int civico, String citta) {
		this.nome = nome;
		this.via = via;
		this.civico = civico;
		this.citta = citta;
		this.corpoDocente = new HashMap<>();
		this.materieOfferte = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public String getVia() {
		return via;
	}

	public int getCivico() {
		return civico;
	}

	public String getCitta() {
		return citta;
	}

	public HashMap<String, Insegnante> getCorpoDocente() {
		return corpoDocente;
	}

	public void aggiungiInsegnante(Insegnante insegnante) {
		this.corpoDocente.put(insegnante.getCodiceUnivoco(), insegnante);
	}

	public void aggiungiMateria(Materia materia) {
		this.materieOfferte.put(materia.getCodice(), materia);
	}

	public HashMap<String, Materia> getMaterieOfferte() {
		return materieOfferte;
	}
}
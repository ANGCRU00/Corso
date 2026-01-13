package eserciziPCTO;

import java.util.HashMap;
import java.util.Map;

public class Insegnante {

   
    public static final String ATTIVO = "ATTIVO";
    public static final String MALATTIA = "MALATTIA";
    public static final String SOSPESO = "SOSPESO";

    private String codiceUnivoco;
    private String nome;
    private String cognome;
    private String stato; 
    private Map<String, Materia> materieInsegnate;

    public Insegnante(String codiceUnivoco, String nome, String cognome, String stato) {
        this.codiceUnivoco = codiceUnivoco;
        this.nome = nome;
        this.cognome = cognome;
        this.stato = stato;
        this.materieInsegnate = new HashMap<>();
    }

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public void aggiungiMateria(Materia materia) {
        this.materieInsegnate.put(materia.getCodice(), materia);
    }

    public void rimuoviMateria(Materia materia) {
        this.materieInsegnate.remove(materia.getCodice());
    }

    public Map<String, Materia> getMaterieInsegnate() {
        return materieInsegnate;
    }
}

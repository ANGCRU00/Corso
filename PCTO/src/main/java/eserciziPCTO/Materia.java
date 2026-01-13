package eserciziPCTO;

public class Materia {
    private String codice;
    private String descrizione;

    public Materia(String codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
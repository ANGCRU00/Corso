package eserciziPCTO;

public class Auto extends Veicolo {
    private int numeroPorte;
    private String alimentazione; 

    public Auto(String marca, int anno, int cilindrata, int numeroPorte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.numeroPorte = numeroPorte;
        this.alimentazione = alimentazione;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Tipo: Auto - Porte: " + numeroPorte + ", Alimentazione: " + alimentazione);
    }
}
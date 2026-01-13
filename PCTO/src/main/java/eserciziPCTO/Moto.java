package eserciziPCTO;

public class Moto extends Veicolo {
    private int numeroTempi;

    public Moto(String marca, int anno, int cilindrata, int numeroTempi) {
        super(marca, anno, cilindrata);
        this.numeroTempi = numeroTempi;
    }

    public int getNumeroTempi() {
        return numeroTempi;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Tipo: Moto - Tempi: " + numeroTempi);
    }
}
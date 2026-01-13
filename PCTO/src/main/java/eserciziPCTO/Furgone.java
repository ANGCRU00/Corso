package eserciziPCTO;

public class Furgone extends Veicolo {
    private int capacitaKg;

    public Furgone(String marca, int anno, int cilindrata, int capacitaKg) {
        super(marca, anno, cilindrata);
        this.capacitaKg = capacitaKg;
    }

    public int getCapacitaKg() {
        return capacitaKg;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Tipo: Furgone - Capacità: " + capacitaKg + " kg");
    }
}
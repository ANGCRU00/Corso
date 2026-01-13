package eserciziPCTO;

public class Veicolo {
    private String marca;
    private int anno;
    private int cilindrata;

    public Veicolo(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Anno: " + anno + ", Cilindrata: " + cilindrata);
    }
}

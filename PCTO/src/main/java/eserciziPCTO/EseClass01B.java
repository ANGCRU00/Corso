package eserciziPCTO;

public class EseClass01B {

    private String titolo; 
    private String autore; 
    private int numeroPagine; 
    private int prezzoCopertinaInCents; 

    // Costruttore
    public EseClass01B(String titolo, String autore, int numeroPagine) {


        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.prezzoCopertinaInCents = numeroPagine * 10;
    }

    // Metodi Get
    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public int getPagine() {
        return this.numeroPagine;
    }

    public double getPrezzo() {
        // Restituisce il prezzo in euro, convertendo da centesimi
        return (double) this.prezzoCopertinaInCents / 100;
    }

    // Metodi Set
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPagine(int pagine) {
        this.numeroPagine = pagine;
        // Se le pagine cambiano, il prezzo deve essere aggiornato 
        this.prezzoCopertinaInCents = pagine * 10;
    }

    public void setPrezzo(int prezzo) {
        this.prezzoCopertinaInCents = prezzo;
        // Se il prezzo cambia, anche le pagine devono essere modificate 
        this.numeroPagine = prezzo / 10;
    }
    
    // Metodo toString per stampare i dati dell'oggetto
    @Override
    public String toString() {
        return "Pubblicazione:\n" +
               " - Titolo: " + this.titolo + "\n" +
               " - Autore: " + this.autore + "\n" +
               " - Pagine: " + this.numeroPagine + "\n" +
               " - Prezzo: " + String.format("%.2f", this.getPrezzo()) + " EURO";
    }

   
    public static void main(String[] args) {
        // Istanziare l'oggetto con i dati iniziali 
        EseClass01B shining = new EseClass01B("Shining", "Stephen King", 450);
        
        // Stampare a video i dati della pubblicazione
        System.out.println("Dati iniziali:");
        System.out.println(shining.toString());
        
        System.out.println("\n--- Modifica dati ---\n");
        
        // Cambiare i dati della pubblicazione
        shining.setTitolo("Shining 2");
        shining.setPagine(600);
        
        // Ristampare la pubblicazione modificata
        System.out.println("Dati dopo la modifica:");
        System.out.println(shining.toString());
    }
}
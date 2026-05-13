package eserciziPCTO;

public class GestionePizzeria {
    public static void main(String[] args) {
        Pizza[] ordini = new Pizza[3];

        ordini[0] = new Margherita();
        ordini[1] = new Diavola();
        ordini[2] = new Margherita();

        System.out.println("--- ORDINI IN CUCINA ---");

        for (Pizza p : ordini) {
            if (p != null) {
                System.out.print(p.getNome() + " (€" + p.getPrezzo() + "): ");
                p.prepara();
            }
        }
    }
}
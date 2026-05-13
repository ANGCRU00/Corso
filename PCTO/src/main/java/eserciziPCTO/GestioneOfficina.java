package eserciziPCTO;

import java.io.*;
import java.util.Scanner;


public class GestioneOfficina {
    private static final String FILE_CONTATORE = "contatore_ordini.txt";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Veicolo[] officina = new Veicolo[3]; 
        Intervento[] storico = new Intervento[50]; 
        int totaleInterventi = caricaContatore();
        int interventiSalvati = 0; 
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("\n--- MENU OFFICINA (Ordini Totali: " + totaleInterventi + ") ---");
            System.out.println("1. Inserisci veicolo\n2. Fine intervento \n3. Costo Totale \n4. Report \n5. Statistiche \n0. Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1: 
                    
                    int postoLibero = -1;
                    for(int i=0; i<3; i++) { if(officina[i] == null) { postoLibero = i; break; } }
                    
                    if (postoLibero == -1) {
                        System.out.println("l'Officina è piena");
                        break;
                    }

                    int tipo = 0;
                    while (tipo != 1 && tipo != 2) {
                        System.out.print("Tipo (1-Auto, 2-Moto): ");
                        tipo = in.nextInt();
                    }

                    System.out.print("Targa: ");
                    String targa = in.next();
                    System.out.print("Marca: ");
                    String marca = in.next();

                    if (tipo == 1) {
                        String mot = "";
                        while (!(mot.equalsIgnoreCase("Diesel") || mot.equalsIgnoreCase("Benzina") || mot.equalsIgnoreCase("Elettrico"))) {
                            System.out.print("Motorizzazione (Diesel/Benzina/Elettrico): ");
                            mot = in.next();
                        }
                        System.out.print("Cilindrata: ");
                        int cil = in.nextInt();
                        officina[postoLibero] = new Auto(targa, marca, mot, cil);
                    } else {
                        int tempi = 0;
                        while (tempi != 2 && tempi != 4) {
                            System.out.print("Tempi (2/4): ");
                            tempi = in.nextInt();
                        }
                        officina[postoLibero] = new Moto(targa, marca, tempi);
                    }
                    System.out.println("Veicolo registrato nel posto " + postoLibero);
                    break;

                case 2: 
                    System.out.print("Targa veicolo in uscita: ");
                    String targaEsci = in.next();
                    boolean trovato = false;
                    for (int i = 0; i < officina.length; i++) {
                        if (officina[i] != null && officina[i].targa.equalsIgnoreCase(targaEsci)) {
                            
                            String tLavoro = "";
                            while (!(tLavoro.equals("motore") || tLavoro.equals("carrozzeria") || tLavoro.equals("elettrico"))) {
                                System.out.print("Tipo lavoro (motore/carrozzeria/elettrico): ");
                                tLavoro = in.next().toLowerCase();
                            }

                            System.out.print("Costo intervento: ");
                            double c = in.nextDouble();

                            totaleInterventi++;
                            storico[interventiSalvati] = new Intervento(totaleInterventi, targaEsci, tLavoro, c);
                            interventiSalvati++;
                            salvaContatore(totaleInterventi);
                            
                            officina[i] = null;
                            System.out.println("Intervento #" + totaleInterventi + " chiuso correttamente.");
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) System.out.println("Veicolo non trovato in lavorazione.");
                    break;

                case 3: 
                    System.out.print("Inserisci targa: ");
                    String tC = in.next();
                    double s = 0;
                    for (int i = 0; i < interventiSalvati; i++) {
                        if (storico[i].targaVeicolo.equalsIgnoreCase(tC)) s += storico[i].costo;
                    }
                    System.out.println("Spesa totale per la targa " + tC + ": " + s + "€");
                    break;

                case 4: 
                    System.out.print("Inserisci targa per report: ");
                    String tR = in.next();
                    System.out.println("--- STORICO INTERVENTI ---");
                    for (int i = 0; i < interventiSalvati; i++) {
                        if (storico[i].targaVeicolo.equalsIgnoreCase(tR)) {
                            System.out.println("ID: " + storico[i].nOrdine + " | Tipo: " + storico[i].tipologia + " | Prezzo: " + storico[i].costo);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Interventi totali dell'officina: " + totaleInterventi);
                    break;
            }
        }
        in.close();
    }

   
    private static int caricaContatore() {
        try {
            File f = new File(FILE_CONTATORE);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                if (s.hasNextInt()) { int val = s.nextInt(); s.close(); return val; }
                s.close();
            }
        } catch (Exception e) {}
        return 0;
    }

    private static void salvaContatore(int val) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_CONTATORE));
            pw.print(val); pw.close();
        } catch (Exception e) {}
    }
}
package eserciziPCTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class GestioneScuola {

    private static Scuola scuola;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        caricaDatiDaFile();

        int scelta;
        do {
            stampaMenu();
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    inserisciScuola();
                    break;
                case 2:
                    inserisciInsegnante();
                    break;
                case 3:
                    inserisciMateria();
                    break;
                case 4:
                    associaMateriaInsegnante();
                    break;
                case 5:
                    messaInMalattia();
                    break;
                case 6:
                    messaInSospensione();
                    break;
                case 7:
                    stampaSituazioneScuola();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        scanner.close();
    }

    private static void stampaMenu() {
        System.out.println("\n--- Menu Gestione Scuola ---");
        System.out.println("1. Inserisci scuola");
        System.out.println("2. Inserisci insegnante");
        System.out.println("3. Inserisci materia");
        System.out.println("4. Associa materia ad insegnante");
        System.out.println("5. Metti in malattia un insegnante");
        System.out.println("6. Metti in sospensione un insegnante");
        System.out.println("7. Stampa situazione scuola");
        System.out.println("0. Esci");
        System.out.print("Scegli un'opzione: ");
    }

    private static void caricaDatiDaFile() {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("scuola.txt"))) {
                String linea = br.readLine();
                if (linea != null) {
                    String[] dati = linea.split("\\|\\|");
                    String nome = dati[0].trim();
                    String via = dati[1].trim();
                    int civico = Integer.parseInt(dati[2].trim());
                    String citta = dati[3].trim();
                    scuola = new Scuola(nome, via, civico, citta);
                    System.out.println("Scuola caricata con successo.");
                }
            }

            try (BufferedReader br = new BufferedReader(new FileReader("insegnanti.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] dati = linea.split("\\|");
                    String codice = dati[0].trim();
                    String nome = dati[1].trim();
                    String cognome = dati[2].trim();
                    String stato = dati[3].trim().toUpperCase();
                    Insegnante i = new Insegnante(codice, nome, cognome, stato);
                    scuola.aggiungiInsegnante(i);
                }
                System.out.println("Insegnanti caricati con successo.");
            }

            try (BufferedReader br = new BufferedReader(new FileReader("materie.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] dati = linea.split("\\|");
                    String codice = dati[0].trim();
                    String descrizione = dati[1].trim();
                    Materia m = new Materia(codice, descrizione);
                    scuola.aggiungiMateria(m);
                }
                System.out.println("Materie caricate con successo.");
            }
        } catch (IOException e) {
            System.out.println("Errore nel caricamento dei dati da file. Verrà creata una scuola vuota.");
            scuola = new Scuola("Nome Scuola", "Via", 1, "Citta");
        }
    }

    private static void inserisciScuola() {
        if (scuola.getNome().equals("Nome Scuola")) {
            System.out.print("Inserisci nome scuola: ");
            String nome = scanner.nextLine();
            System.out.print("Inserisci via: ");
            String via = scanner.nextLine();
            System.out.print("Inserisci civico: ");
            int civico = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Inserisci città: ");
            String citta = scanner.nextLine();
            scuola = new Scuola(nome, via, civico, citta);
            System.out.println("Scuola inserita con successo.");
        } else {
            System.out.println("Una scuola è già stata inserita e non può essere modificata.");
        }
    }

    private static void inserisciInsegnante() {
        System.out.print("Inserisci codice univoco insegnante: ");
        String codice = scanner.nextLine().toUpperCase();
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        Insegnante insegnante = new Insegnante(codice, nome, cognome, Insegnante.ATTIVO);
        scuola.aggiungiInsegnante(insegnante);
        System.out.println("Insegnante " + nome + " " + cognome + " inserito con successo.");
    }

    private static void inserisciMateria() {
        System.out.print("Inserisci codice materia (es. 'INF'): ");
        String codice = scanner.nextLine().toUpperCase();
        System.out.print("Inserisci descrizione materia (es. 'Informatica'): ");
        String descrizione = scanner.nextLine();
        Materia materia = new Materia(codice, descrizione);
        scuola.aggiungiMateria(materia);
        System.out.println("Materia " + descrizione + " inserita con successo.");
    }

    private static void associaMateriaInsegnante() {
        System.out.print("Inserisci codice univoco insegnante: ");
        String codInsegnante = scanner.nextLine().toUpperCase();
        Insegnante insegnante = scuola.getCorpoDocente().get(codInsegnante);

        if (insegnante == null) {
            System.out.println("Insegnante non trovato.");
            return;
        }

        if (!insegnante.getStato().equals(Insegnante.ATTIVO)) {
            System.out.println("Impossibile associare materie a un insegnante non attivo.");
            return;
        }

        System.out.print("Inserisci codice materia da associare: ");
        String codMateria = scanner.nextLine().toUpperCase();
        Materia materia = scuola.getMaterieOfferte().get(codMateria);

        if (materia == null) {
            System.out.println("Materia non trovata.");
            return;
        }

        insegnante.aggiungiMateria(materia);
        System.out.println("Materia " + materia.getDescrizione() + " associata a " + insegnante.getNome() + " " + insegnante.getCognome() + ".");
    }

    private static void messaInMalattia() {
        System.out.print("Inserisci codice univoco insegnante da mettere in malattia: ");
        String codInsegnante = scanner.nextLine().toUpperCase();
        Insegnante insegnante = scuola.getCorpoDocente().get(codInsegnante);

        if (insegnante == null) {
            System.out.println("Insegnante non trovato.");
            return;
        }

        if (insegnante.getStato().equals(Insegnante.MALATTIA)) {
            System.out.println("L'insegnante è già in malattia.");
            return;
        }

        handleSostituzione(insegnante, Insegnante.MALATTIA);
    }

    private static void messaInSospensione() {
        System.out.print("Inserisci codice univoco insegnante da mettere in sospensione: ");
        String codInsegnante = scanner.nextLine().toUpperCase();
        Insegnante insegnante = scuola.getCorpoDocente().get(codInsegnante);

        if (insegnante == null) {
            System.out.println("Insegnante non trovato.");
            return;
        }

        if (insegnante.getStato().equals(Insegnante.SOSPESO)) {
            System.out.println("L'insegnante è già sospeso.");
            return;
        }

        handleSostituzione(insegnante, Insegnante.SOSPESO);
    }

    private static void handleSostituzione(Insegnante assente, String nuovoStato) {
        Map<String, Materia> materieDaSostituire = assente.getMaterieInsegnate();

        if (materieDaSostituire.isEmpty()) {
            assente.setStato(nuovoStato);
            System.out.println("Stato di " + assente.getNome() + " " + assente.getCognome() + " aggiornato a " + nuovoStato + ". Nessuna materia da riassegnare.");
            return;
        }

        Insegnante sostituto = null;
        if (assente.getCodiceUnivoco().equals("MARVER")) {
            sostituto = scuola.getCorpoDocente().get("ELIBIA");
        } else if (assente.getCodiceUnivoco().equals("ELIBIA")) {
            sostituto = scuola.getCorpoDocente().get("MARVER");
        } else if (assente.getCodiceUnivoco().equals("PAOROS")) {
            sostituto = scuola.getCorpoDocente().get("ELIBIA");
        }

        if (sostituto != null) {
            if (sostituto.getStato().equals(Insegnante.ATTIVO)) {
                for (Materia m : materieDaSostituire.values()) {
                    sostituto.aggiungiMateria(m);
                }
                assente.getMaterieInsegnate().clear();
                assente.setStato(nuovoStato);
                System.out.println("Stato di " + assente.getNome() + " " + assente.getCognome() + " aggiornato a " + nuovoStato + ".");
                System.out.println("Materie riassegnate a " + sostituto.getNome() + " " + sostituto.getCognome() + ".");
            } else {
                System.out.println("Il sostituto designato (" + sostituto.getNome() + ") non è ATTIVO. Necessaria attenzione del Preside.");
            }
        } else {
            System.out.println("Nessun sostituto designato per " + assente.getNome() + ". Necessaria attenzione del Preside.");
        }
    }

    private static void stampaSituazioneScuola() {
        System.out.println("\n--- Situazione Scuola ---");
        System.out.println("Scuola: " + scuola.getNome() + ", " + scuola.getVia() + " " + scuola.getCivico() + ", " + scuola.getCitta());

        System.out.println("\n--- Corpo Docente ---");
        for (Insegnante insegnante : scuola.getCorpoDocente().values()) {
            System.out.println("Insegnante: " + insegnante.getNome() + " " + insegnante.getCognome() + " (" + insegnante.getCodiceUnivoco() + ")");
            System.out.println("  Stato: " + insegnante.getStato());

            Map<String, Materia> materie = insegnante.getMaterieInsegnate();
            if (!materie.isEmpty()) {
                System.out.print("  Materie in carico: ");
                for (Materia materia : materie.values()) {
                    System.out.print(materia.getDescrizione() + " (" + materia.getCodice() + "), ");
                }
                System.out.println();
            } else {
                System.out.println("  Nessuna materia in carico.");
            }
            System.out.println("---------------------------------");
        }
    }
}
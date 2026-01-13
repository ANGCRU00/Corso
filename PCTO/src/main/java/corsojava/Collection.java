package corsojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {

        System.out.println("--- Esempio con ArrayList ---");
        ArrayList<String> nomiSquadre = new ArrayList<>();

        // Aggiunta di elementi con .add()
        nomiSquadre.add("Juventus");
        nomiSquadre.add("Milan");
        nomiSquadre.add("Inter");
        nomiSquadre.add("Juventus"); //ACCETTA DUPLICATI
        System.out.println("ArrayList iniziale: " + nomiSquadre); // Stampa la lista completa

        // Rimozione di elementi
        nomiSquadre.remove("Milan"); // Rimuove l'elemento "Milan" 
        System.out.println("Dopo la rimozione di 'Milan': " + nomiSquadre);

        // Altro metodo di rimozione, per indice
        nomiSquadre.remove(1); // Rimuove l'elemento all'indice 1 (ora è "Inter")
        System.out.println("Dopo la rimozione per indice: " + nomiSquadre);
        
        System.out.println("\n--- Esempio con HashMap ---");
        // HashMap: una mappa di coppie chiave-valore. Le chiavi sono UNICHE.
        HashMap<String, String> capitali = new HashMap<>();

        // Aggiunta di coppie chiave-valore con .put()
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Germania", "Berlino");
        System.out.println("HashMap iniziale: " + capitali);

        // Rimozione di una coppia con .remove()
        capitali.remove("Francia"); // Rimuove la coppia con chiave "Francia"
        System.out.println("Dopo la rimozione di 'Francia': " + capitali);

        // Aggiungere una chiave esistente sovrascrive il valore
        capitali.put("Italia", "Capitale del Bel Paese");
        System.out.println("Dopo la modifica della capitale italiana: " + capitali);

        System.out.println("\n--- Esempio con HashSet ---");
        // HashSet: una collezione di elementi unici, senza ordine
        HashSet<Integer> numeriUnici = new HashSet<>();

        // Aggiunta di elementi con .add()
        numeriUnici.add(10);
        numeriUnici.add(20);
        numeriUnici.add(30);
        numeriUnici.add(10); // Questo duplicato viene ignorato 
        System.out.println("HashSet iniziale: " + numeriUnici);

        // Rimozione di un elemento con .remove()
        numeriUnici.remove(20); // Rimuove l'elemento 20
        System.out.println("Dopo la rimozione del 20: " + numeriUnici);

        // Un altro tentativo di aggiunta di un duplicato non ha effetto
        boolean aggiunto = numeriUnici.add(30);
        System.out.println("Tentativo di aggiungere 30 (già presente): " + aggiunto); 
        System.out.println("HashSet finale: " + numeriUnici);
    }
}
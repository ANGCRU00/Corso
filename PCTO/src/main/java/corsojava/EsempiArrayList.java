package corsojava;


/*
 * Le arraylist sono ridimensionabili, ma accettano solo reference
 * Creare un arratylist
 * Aggiungere elementi add()
 * mandare a schermo elementi get()
 * modificare elementi set()
 * rimuovere elementi remove() clear()
 * arraylist 2d
 */
	
import java.util.ArrayList;

public class EsempiArrayList {

    public static void main(String[] args) {

        // 1. Creare un ArrayList
        ArrayList<Integer> numeri = new ArrayList<>();
        System.out.println("ArrayList creata: " + numeri);

        // 2. Aggiungere elementi con add()
        numeri.add(10);
        numeri.add(20);
        numeri.add(30);
        System.out.println("Dopo aver aggiunto elementi: " + numeri);

        
        numeri.add(1, 15); 
        System.out.println("Dopo aver aggiunto 15 all'indice 1: " + numeri);

        

        // 3. Mandare a schermo gli elementi con get()
        int primoNumero = numeri.get(0);
        System.out.println("Primo elemento: " + primoNumero);

        System.out.println("Tutti gli elementi con un ciclo for:");
        for (int i = 0; i < numeri.size(); i++) {
            System.out.println("Elemento all'indice " + i + ": " + numeri.get(i));
        }

        // 4. Modificare elementi con set()
        numeri.set(2, 25);
        System.out.println("Dopo aver modificato l'elemento all'indice 2: " + numeri);


        // 5. Rimuovere elementi con remove() e clear()
        numeri.remove(0); 
        System.out.println("Dopo aver rimosso l'elemento all'indice 0: " + numeri);

        numeri.clear(); 
        System.out.println("Dopo aver rimosso tutti gli elementi con clear(): " + numeri);

        System.out.println("--------------------");

    }
}
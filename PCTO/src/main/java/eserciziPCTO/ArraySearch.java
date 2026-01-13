package eserciziPCTO;

public class ArraySearch {
    static final int NON_TROVATO = -1;

    public static void main(String[] args) {
        String[] frutti =
            {"Apple", "Apricots", "Avocado", "Banana", "Blackberry", "Blueberries", "Cherries",
            "Coconut", "Cranberry", "Cucumber", "Currents", "Dates", "Durian", "Fig", "Gooseberry",
            "Grapefruit", "Grapes", "Jackfruit", "Kiwi", "Kumquat", "Lemon", "Lime", "Lucuma",
            "Lychee", "Mango", "Mangosteen", "Melon", "Mulberry", "Nectarine", "Orange", "Papaya",
            "Peach", "Pear", "Pineapple", "Plum", "Pomegranate", "Pomelo", "Prunes", "Raspberries",
            "Strawberries", "Watermelon"};

        String unFrutto = "Banana";
        String unAltroFrutto = "Clementine";

        int risultatoUno = ricercaLineare(frutti, unFrutto);
        stampaRisultato(risultatoUno, unFrutto);

        int risultatoDue = ricercaLineare(frutti, unFrutto, 1, 20);
        stampaRisultato(risultatoDue, unFrutto);

        int risultatoTre = ricercaLineare(frutti, unAltroFrutto);
        stampaRisultato(risultatoTre, unAltroFrutto);
    }
    

    public static int ricercaLineare(String[] array, String elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return NON_TROVATO;
    }

    public static int ricercaLineare(String[] array, String elemento, int inizio, int fine) {
        if (inizio < 0 || fine >= array.length || inizio > fine) {
            return NON_TROVATO;
        }

        for (int i = inizio; i <= fine; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return NON_TROVATO;
    }

    public static void stampaRisultato(int risultato, String elementoCercato) {
        if (risultato != NON_TROVATO) {
            System.out.println(elementoCercato + " found at index " + risultato);
        } else {
            System.out.println(elementoCercato + " not found in the range searched");
        }
    }
}
package eserciziPCTO;

public class EsercizioCorretto {
	static final int NON_TROVATO = -1;

	public static void main(String[] args) {
		String[] frutti = { "Mela", "Albicocche", "Avocado", "Banana", "Mora", "Mirtilli", "Ciliegie", "Noce di cocco",
				"Mirtillo rosso", "Cetriolo", "Ribes", "Datteri", "Durian", "Fico", "Uva spina", "Pompelmo", "Uva",
				"Jackfruit", "Kiwi", "Kumquat", "Limone", "Lime", "Lucuma", "Litchi", "Mango", "Mangostano", "Melone",
				"Gelso", "Nettarina", "Arancia", "Papaya", "Pesca", "Pera", "Ananas", "Prugna", "Melagrana", "Pomelo",
				"Prugne secche", "Lamponi", "Fragole", "Anguria" };

		String unFrutto = "Banana";
		String unAltroFrutto = "Lamponi";

		int risultatoUno = ricercaLineare1(frutti, unFrutto);
		stampaRisultato(risultatoUno, unFrutto);

		int risultatoDue = ricercaLineare(frutti, unFrutto, 10, 20);
		stampaRisultato(risultatoDue, unFrutto);

		int risultatoTre = ricercaLineare1(frutti, unAltroFrutto);
		stampaRisultato(risultatoTre, unAltroFrutto);
	}


	private static int ricercaLineare1(String[] frutti, String unFrutto) {
	    for (int i = 0; i < frutti.length; i++) {
	        if (frutti[i].equalsIgnoreCase(unFrutto)) {
	            return i;
	        }
	    }
	    return NON_TROVATO;
	}

	
	public static void stampaRisultato(int posizione, String elemento) {
		System.out.println("Il primo frutto è in : " + posizione);
		System.out.println("l'elemento è: " + elemento);
	}

	
	private static int ricercaLineare(String[] frutti, String unFrutto, int inizio, int fine) {
		for (int i = inizio; i <= fine && i < frutti.length; i++) {
			
			if (frutti[i].equals(unFrutto)) {
				return i;
			}
		}
		return NON_TROVATO;
	}
}

	
package eserciziPCTO;

public class Garage {
	private Veicolo[] posti;
	private static final int MAX_POSTI = 15;

	public Garage() {
		this.posti = new Veicolo[MAX_POSTI];
	}

	public int immettiVeicolo(Veicolo veicolo) {
		for (int i = 0; i < MAX_POSTI; i++) {
			if (posti[i] == null) {
				posti[i] = veicolo;
				return i;
			}
		}
		return -1;
	}

	public Veicolo estraiVeicolo(int posto) {
		if (posto >= 0 && posto < MAX_POSTI && posti[posto] != null) {
			Veicolo veicoloEstratto = posti[posto];
			posti[posto] = null;
			return veicoloEstratto;
		}
		return null;
	}

	public void stampaSituazione() {
		System.out.println("--- Situazione attuale del garage ---");
		for (int i = 0; i < MAX_POSTI; i++) {
			System.out.print("Posto " + i + ": ");
			if (posti[i] != null) {
				posti[i].stampaDettagli();
			} else {
				System.out.println("Vuoto");
			}
		}
		System.out.println("------------------------------------");
	}
}
package eserciziPCTO;

class Veicolo {
	String targa;
	String marca;

	public Veicolo(String targa, String marca) {
		this.targa = targa;
		this.marca = marca;
	}
}

class Auto extends Veicolo {
	String motorizzazione;
	int cilindrata;

	public Auto(String targa, String marca, String motorizzazione, int cilindrata) {
		super(targa, marca);
		this.motorizzazione = motorizzazione;
		this.cilindrata = cilindrata;
	}
}

class Moto extends Veicolo {
	int tempi;

	public Moto(String targa, String marca, int tempi) {
		super(targa, marca);
		this.tempi = tempi;
	}
}

class Intervento {
	int nOrdine;
	String targaVeicolo;
	String tipologia;
	double costo;

	public Intervento(int nOrdine, String targaVeicolo, String tipologia, double costo) {
		this.nOrdine = nOrdine;
		this.targaVeicolo = targaVeicolo;
		this.tipologia = tipologia;
		this.costo = costo;
	}
}
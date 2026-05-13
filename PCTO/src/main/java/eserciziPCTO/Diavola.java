package eserciziPCTO;

public class Diavola extends Pizza {
	public Diavola() {
		super("Diavola", 7.50);
	}

	@Override
	public void prepara() {
		System.out.println("Aggiunta di salame piccante per la Diavola");
	}
}
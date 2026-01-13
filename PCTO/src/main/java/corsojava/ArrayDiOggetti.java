package corsojava;

/*
 * Creare array di tipo oggetto vuoto
 * creare oggetti
 * assegnare oggetti come elementi array
 * accedere agli elementi
 * creare array con elementi già presenti
 */
public class ArrayDiOggetti {
	public static void main(String[] args) {
		Persona[] persone = new Persona[2];

		Persona persona1 = new Persona("Luca", "Gialli", 25);
		Persona persona2 = new Persona("Luca", "Verdi", 25);

		persone[0] = persona1;
		persone[1] = persona2;

		Persona[] array = {persona1,persona2};

	}

}

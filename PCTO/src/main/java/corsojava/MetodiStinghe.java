package corsojava;

import java.util.Arrays;

public class MetodiStinghe {

	public static void main(String[] args) {
		String miaStringa = "Hello, World!";
		String altraStringa = "hello, world!";
		String spazi = "   Spazi inutili   ";

		// length()
		System.out.println("Lunghezza di '" + miaStringa + "': " + miaStringa.length());
		// charAt(index)
		System.out.println("Carattere all'indice 1: " + miaStringa.charAt(1));
		// indexOf(substring)
		System.out.println("Indice di 'World': " + miaStringa.indexOf("World"));

		// contains(substring)
		System.out.println("Contiene 'World'?: " + miaStringa.contains("World"));

		// startsWith(prefix
		System.out.println("Inizia con 'Hello'?: " + miaStringa.startsWith("Hello"));

		// endsWith(suffix)
		System.out.println("Finisce con '!'?: " + miaStringa.endsWith("!"));

		// equals()
		System.out
				.println("'" + miaStringa + "' è uguale a '" + altraStringa + "'?: " + miaStringa.equals(altraStringa));

		System.out.println("Sono uguali (ignorando il caso)?: " + miaStringa.equalsIgnoreCase(altraStringa));

		// toUpperCase()
		System.out.println("Maiuscolo: " + miaStringa.toUpperCase());

		// toLowerCase()
		System.out.println("Minuscolo: " + miaStringa.toLowerCase());

		// trim()
		System.out.println("Stringa con spazi rimossi: '" + spazi.trim() + "'");

		// replace()
		System.out.println("Sostituisci 'o' con 'a': " + miaStringa.replace('o', 'a'));
		System.out.println("Sostituisci 'World' con 'Java': " + miaStringa.replace("World", "Java"));

		// substring()
		System.out.println("Sottostringa da indice 7: " + miaStringa.substring(7));
		System.out.println("Sottostringa da indice 7 a 12: " + miaStringa.substring(7, 12));

	}

}

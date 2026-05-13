package emanueletimbo;
import java.util.Arrays;

public class esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somma = 0;
		
		for (int i = 0; i < args.length; i++) {
			int numeri = Integer.parseInt(args[i]);
            somma += numeri;
        }
		System.out.println("la somma finale è " + somma);
	}

}

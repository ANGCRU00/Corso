package esercitazioni;

public class esercizioquattro {

	public static void main(String[] args) {
		int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pari = 0;
        int dispari = 0;

        for (int num : numeri) {
            if (num % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
        }
        System.out.println("Numeri pari: " + pari);
        System.out.println("Numeri dispari: " + dispari);

	}
}

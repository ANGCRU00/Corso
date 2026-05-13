package eserciziPCTO;

public class MotoreGioco {
	public static void main(String[] args) {
       
        Comandi[] oggettiDiGioco = new Comandi[2];

        oggettiDiGioco[0] = new Eroe("Link");
        oggettiDiGioco[1] = new Ascensore();

        System.out.println("--- INVIO COMANDO 'SU' A TUTTI ---");

        for (Comandi c : oggettiDiGioco) {
            
            c.muoviSu();
        }

        System.out.println("\n--- INVIO COMANDO 'GIÙ' A TUTTI ---");
        
        for (Comandi c : oggettiDiGioco) {
            c.muoviGiu();
        }
    }
}
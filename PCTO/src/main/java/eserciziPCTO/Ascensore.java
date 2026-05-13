package eserciziPCTO;

public class Ascensore implements Comandi {
 private int pianoAttuale = 0;

 @Override
 public void muoviSu() {
     pianoAttuale++;
     System.out.println("L'ascensore sale al piano: " + pianoAttuale);
 }

 @Override
 public void muoviGiu() {
     if (pianoAttuale > 0) pianoAttuale--;
     System.out.println("L'ascensore scende al piano: " + pianoAttuale);
 }
}
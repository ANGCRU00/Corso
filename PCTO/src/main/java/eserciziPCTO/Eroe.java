package eserciziPCTO;
public class Eroe implements Comandi {
    private String nome;

    public Eroe(String nome) {
        this.nome = nome;
    }

    @Override
    public void muoviSu() {
        System.out.println(nome + " spicca un grande balzo verso l'alto");
    }

    @Override
    public void muoviGiu() {
        System.out.println(nome + " si abbassa per schivare un colpo");
    }
}


package eserciziPCTO;

public class Impiegato2 {
        String nome;
        String cognome;
        double salarioOrario;
        String ruolo;
        int oreLavorate;
        Impiegato2 referente;
         

        public Impiegato2(String nome, String cognome, double salarioOrario, String ruolo, int oreLavorate, Impiegato2 referente) {
            this.nome = nome;
            this.cognome = cognome;
            this.salarioOrario = salarioOrario;
            this.ruolo = ruolo;
            this.oreLavorate = oreLavorate;
            this.referente = referente; 
        }
        
        public Impiegato2(String nome,String cognome, double salarioOrario, String ruolo, int oreLavorate) {
            this(nome,cognome,salarioOrario, ruolo, oreLavorate, null); 
        }

        public double calcolaStipendio(int oreLavorate) {
            double totaleStipendio = oreLavorate * salarioOrario;
            System.out.print("Il nome dell'impiegato è:" + nome + "\n" + " il cognome dell' impiegato è:" + cognome + "\n"+
            "il salario orario dell'impiegato è:" + salarioOrario + "\n" + " il ruolo dell'impiegato è:"+ ruolo + "\n"+ "le ore lavorate dell'impiegato è:" + oreLavorate + "\n"+ 
                    "lo stipendio dell'impiegato è:" + totaleStipendio);
            return totaleStipendio;
        }
    }
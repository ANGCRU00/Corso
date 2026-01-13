package corsojava;

public class OOP {

	
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("luca","rossi",23,"blu");
		persona1.Saluta();
		System.out.println(persona1.getNome());
		persona1.setNome("Franco");
		System.out.println(persona1.getNome());
		
	}
}
 

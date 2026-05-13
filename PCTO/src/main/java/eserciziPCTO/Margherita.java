package eserciziPCTO;

public class Margherita extends Pizza {
	public Margherita() {
		super("Margherita", 6.50);
	}

	@Override
	public void prepara() {
		System.out.println("Stendendo pomodoro e mozzarella per la Margherita!");
	}
}

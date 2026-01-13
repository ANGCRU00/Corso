package corsojava;

public class Animale {
 public static void main(String[] args) {
	
	 Leone leone = new Leone();
	 Gazzella gazzella = new Gazzella();
	 Pesce pesce = new Pesce();
	 
	 gazzella.scappa();
	 leone.caccia();
	 pesce.caccia();
	 pesce.scappa();
	 
}
}

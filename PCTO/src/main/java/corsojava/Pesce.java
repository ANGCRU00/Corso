package corsojava;

public class Pesce implements Preda,Predatore{

	@Override
	public void caccia() {
		System.out.println("Il pesce grande caccia quelli piccoli");
		
	}

	@Override
	public void scappa() {
	System.out.println("Il pesce piccolo fugge dal pesce grande");
		
	}

}

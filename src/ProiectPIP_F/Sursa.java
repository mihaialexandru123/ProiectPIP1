package ProiectPIP_F;

public class Sursa implements Reparatie{
	private final String numeDefect;
	public final int cost = 200;
	
	public Sursa(String numeDefect) {
		this.numeDefect = numeDefect;
	}
	public String numeDefect() {
		return numeDefect;
	}
	public int cost() {
		return cost;
	}
	public void afisare() {
		System.out.println("Se schimba sursa...");
	}
}

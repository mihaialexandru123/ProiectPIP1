package ProiectPIP_F;

public class Porturi implements Reparatie{
	private final String numeDefect;
	public final int cost = 100;
	
	public Porturi(String numeDefect) {
		this.numeDefect = numeDefect;
	}
	public String numeDefect() {
		return numeDefect;
	}
	public int cost() {
		return cost;
	}
	public void afisare() {
		System.out.println("Se schimba porturile...");
	}
}
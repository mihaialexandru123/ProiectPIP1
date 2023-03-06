package ProiectPIP_F;

public class Display implements Reparatie{
	private final String numeDefect;
	public final int cost = 300;
	
	public Display(String numeDefect) {
		this.numeDefect = numeDefect;
	}
	public String numeDefect() {
		return numeDefect;
	}
	public int cost() {
		return cost;
	}
	public void afisare() {
		System.out.println("Se schimba display-ul...");
	}
}

package ProiectPIP_F;

public class Difuzor implements Reparatie{
	private final String numeDefect;
	public final int cost = 150;
			;
	public Difuzor(String numeDefect) {
		this.numeDefect = numeDefect;
	}
	public String numeDefect() {
		return numeDefect;
	}
	public int cost() {
		return cost;
	}
	public void afisare() {
		System.out.println("Se schimba difuzoarele...");
	}
}

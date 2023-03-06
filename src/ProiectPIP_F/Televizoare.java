package ProiectPIP_F;

public abstract class Televizoare {
	
	public final Reparatie defect;
	public String numeTelevizor;
	
	public Televizoare(Reparatie defect, String numeTelevizor) {
		this.defect = defect;
		this.numeTelevizor = numeTelevizor;
	}
	public abstract void costReparatie();//
	public abstract float costReparatie1();
	
	public void afisareTelevizor() {
		System.out.println("Se solicita o reparatie la televizorul " + numeTelevizor + " cu urmatorul defect: " + defect.numeDefect());
	}
}
package ProiectPIP_F;

public class Samsung extends Televizoare{
	public final Reparatie defect;
	public final String numeTelevizor;
	public float multiplicator = (float) 2.0;
	
	public Samsung(Reparatie defect, String numeTelevizor) {
		super(defect,numeTelevizor);
		this.defect = defect;
		this.numeTelevizor = numeTelevizor;
	}
	@Override
	public void costReparatie() {
		defect.afisare();
		System.out.println("Televizorul "+numeTelevizor+" cu "+defect.numeDefect()+" defect a fost reparat cu succes si va costa: "+ multiplicator*defect.cost() + " lei");
	
	}
	@Override
	public float costReparatie1() {
		// TODO Auto-generated method stub
		return multiplicator*defect.cost();
	}
}

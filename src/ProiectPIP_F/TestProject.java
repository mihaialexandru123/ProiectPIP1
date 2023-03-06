package ProiectPIP_F;

public class TestProject {

	public static void main(String[] args) {

		Televizoare televizor1=new Samsung(new Display("Display"),"Samsung");
		Televizoare televizor2=new LG(new Porturi("Porturi"),"LG");
		Televizoare televizor3=new Vortex(new Sursa("Sursa"),"Vortex");
		Televizoare televizor4=new Vortex(new Difuzor("Difuzor"),"Vortex");
		
		televizor1.afisareTelevizor();
		televizor1.costReparatie();
		System.out.println("\n"); 
		televizor2.afisareTelevizor();
		televizor2.costReparatie();
		System.out.println("\n"); 
		televizor3.afisareTelevizor();
		televizor3.costReparatie();
		System.out.println("\n"); 
		televizor4.afisareTelevizor();
		televizor4.costReparatie();

	}

}

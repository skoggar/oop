
public class Main {

	public static void main(String[] args) {
		
		String osoba="laptop"; 
		
		PartDb podzespoly = new PartDb();

	
		podzespoly.addPart(new LaptopProcessor("Intel", 700,2000));
		podzespoly.addPart(new DesktopProcessor("Intel", 650,2500));
		podzespoly.addPart(new LaptopHardDrive("Samsung", 300,1000));
		podzespoly.addPart(new DesktopHardDrive("Samsung", 300,1000));
		podzespoly.addPart(new LaptopProcessor("AMD", 500,2600));
		podzespoly.addPart(new DesktopProcessor("AMD", 1200,3500));
		podzespoly.addPart(new DesktopProcessor("AMD", 1400,3800));
		podzespoly.addPart(new DesktopHardDrive("Toshiba", 4500,2000));
		
		if(osoba=="laptop")
		{
			System.out.println("Lista podzespo³ów dla twojego komputera("+osoba+")");
		LaptopView raport = new LaptopView(podzespoly);
		raport.giveProcessor();
		raport.giveHardDrives();
		}
		else if(osoba=="komputer")
		{
			System.out.println("Lista podzespo³ów dla twojego komputera("+osoba+")");
		DesktopView raport2 = new DesktopView(podzespoly);
		raport2.giveProcessor();
		raport2.giveHardDrives();
		
		}
		
	
	}

}

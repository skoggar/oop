
public class Main {

	public static void main(String[] args) {
		
		String osoba="laptop"; 
		
		PartDb podzespoly = new PartDb();

	
		podzespoly.addPart(new LaptopProcessor("Intel SSD", 550,2000));
		podzespoly.addPart(new DesktopProcessor("Intel HDD", 400,2500));
		podzespoly.addPart(new LaptopHardDrive("SanDisk SSD", 450,2000));
		podzespoly.addPart(new DesktopHardDrive("SanDisk HDD", 300,5000));
		podzespoly.addPart(new LaptopProcessor("Intel i5", 500,2600));
		podzespoly.addPart(new DesktopProcessor("Intel i7", 1800,3500));
		podzespoly.addPart(new DesktopProcessor("Intel i3", 1000,3800));
		podzespoly.addPart(new DesktopHardDrive("Samsung HDD", 4500,2000));
		
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


public class Main {

	public static void main(String[] args) {
		
		String osoba="laptop"; 
		
		PartDb komponenty = new PartDb();

	
		komponenty.addPart(new LaptopProcessor("Intel Atom", 550,2000));
		komponenty.addPart(new DesktopProcessor("Intel HDD", 400,2500));
		komponenty.addPart(new LaptopHardDrive("SanDisk SSD", 450,2000));
		komponenty.addPart(new DesktopHardDrive("SanDisk HDD", 300,5000));
		komponenty.addPart(new LaptopProcessor("Intel i5", 500,2600));
		komponenty.addPart(new DesktopProcessor("Intel i7", 1800,3500));
		komponenty.addPart(new DesktopProcessor("Intel i3", 1000,3800));
		komponenty.addPart(new DesktopHardDrive("Samsung HDD", 4500,2000));
		
		if(osoba=="laptop")
		{
			System.out.println("Twoja lista komponentow("+osoba+"):");
		LaptopView raport = new LaptopView(komponenty);
		raport.giveProcessor();
		raport.giveHardDrives();
		}
		else if(osoba == "komputer")
		{
			System.out.println("Twoja lista komponentow("+osoba+"):");
		DesktopView raport2 = new DesktopView(komponenty);
		raport2.giveProcessor();
		raport2.giveHardDrives();
		
		}
		
	
	}

}

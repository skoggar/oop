
public class DesktopHardDrive extends Part implements HardDrive {
	
	public DesktopHardDrive(String name, double price, double pojemnosc)
	{
		setName(name);
		setPrice(price);
		setPojemnosc(pojemnosc);
	}
	
	
	private double pojemnosc;
	private static String typ="Desktop";
	public String showDetails()
	{
		return "		Nazwa: "+ getName() + " Cena: "+getPrice()+" Typ: "+DesktopHardDrive.typ + " Pojemnoœæ: "+ getPojemnosc();
		
	}

	public double getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	
	

}

public class LaptopHardDrive extends Part implements HardDrive {
	
	public LaptopHardDrive(String name, double price, double pojemnosc)
	{
		setName(name);
		setPrice(price);
		setPojemnosc(pojemnosc);
	}
	
	private double pojemnosc;
	private static String typ="Laptop";
	public String showDetails()
	{
		return "		Nazwa: "+ getName() + " Cena: "+getPrice()+" Typ: "+LaptopHardDrive.typ + " Pojemnoœæ: "+ getPojemnosc();
		
	}

	public double getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	
	

}
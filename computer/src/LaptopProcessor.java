
public class LaptopProcessor extends Part implements Processor {
	public LaptopProcessor(String name, double price, double predkosc)
	{
		setName(name);
		setPrice(price);
		setPredkosc(predkosc);
	}
	
	
	private double predkosc;
	private static String typ="Laptop";
	public String showDetails()
	{
		return "		Nazwa: "+ getName() + " Cena: "+getPrice()+ " Typ: "+LaptopProcessor.typ + " Predkoœæ: "+ getPredkosc();
		
	}

	public double getPredkosc() {
		return predkosc;
	}

	public void setPredkosc(double predkosc) {
		this.predkosc = predkosc;
	}
	
}
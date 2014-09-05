
public class DesktopProcessor extends Part implements Processor {
	
	public DesktopProcessor(String name, double price, double predkosc)
	{
		setName(name);
		setPrice(price);
		setPredkosc(predkosc);
	}
	
	
	private double predkosc;
	private static String typ="Desktop";
	public String showDetails()
	{
		return "		Nazwa: "+ getName() + " Cena: "+getPrice()+" Typ: "+DesktopProcessor.typ + " Predkoœæ: "+ getPredkosc();
		
	}

	public double getPredkosc() {
		return predkosc;
	}

	public void setPredkosc(double predkosc) {
		this.predkosc = predkosc;
	}
	
	

}

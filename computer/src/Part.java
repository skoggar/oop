
public abstract class Part {
	private String name;
	private double price;
	
	public String showDetails() {
		return ("Nazwa: "+ getName() + "Cena : " + getPrice());
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

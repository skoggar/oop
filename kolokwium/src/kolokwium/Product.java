package kolokwium;

public class Product implements Visitable {
	String name;
	double price;
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	String getName()
	{
		return this.name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	double getPrice()
	{
		return this.price;
	}
	
	void setPrice(double price)
	{
		this.price = price;
	}

}

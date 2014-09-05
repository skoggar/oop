package kolokwium;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order implements Visitable {
	
	String number;
	double orderTotalPrice;
	Date orderDate = new Date();
	List<Product> products = new ArrayList<Product>();
	
	public Order(String number)
	{
		this.number = number;
		this.orderTotalPrice = 0;
		this.orderDate = new Date();
	}
	
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
		
		for (Iterator<Product> it=products.iterator(); it.hasNext();)
		{
			((Product)it.next()).accept(visitor);
		}
	}
	
	String getNumber()
	{
		return this.number;
	}
	
	double getOrderTotalPrice()
	{
		return this.orderTotalPrice;
	}
	
	Date getOrderDate()
	{
		return this.orderDate;
	}
	
	void addProduct(Product product)
	{
		this.products.add(product);
		this.orderTotalPrice+= product.price;
	}
	
}

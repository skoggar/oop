package kolokwium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client implements Visitable {
	String number;
	List<Order> orders = new ArrayList<Order>();
	
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
		
		for (Iterator<Order> it=orders.iterator(); it.hasNext();)
		{
			((Visitable)it.next()).accept(visitor);
		}	
	}
	
	public Client(String number)
	{
		this.number = number;
	}
	
	String getNumber()
	{
		return this.number;
	}
	
	void setNumber(String number)
	{
		this.number = number;
	}
	
	void addOrder(Order order)
	{
		this.orders.add(order);
	}
	
}

package kolokwium;

import java.util.List;

public class ReportMaker implements Visitor {
	int numberOfClients;
	int numberOfOrders;
	int numberOfProducts;
	
	
	public ReportMaker(List<Client> clients, List<Order> orders, List<Product> products)
	{
		this.numberOfClients = getNumberOfClients(clients);
		this.numberOfOrders = getNumberOfOrders(orders);
		this.numberOfProducts = getNumberOfProducts(products);
	}
	
	int getNumberOfClients(List<Client> clients)
	{
		return clients.size();
	}
	
	int getNumberOfOrders(List<Order> orders)
	{
		return orders.size();
	}
	
	int getNumberOfProducts(List<Product> products)
	{
		return products.size();
	}
	
	public void visit(Client client)
	{
		
	}
	
	public void visit(Product product)
	{
		
	}
	
	public void visit(Order order)
	{
		
	}
	
	public void visit(ClientGroup group)
	{
		
	}
	
	void showReport()
	{
		System.out.println("Liczba klientow: " + this.numberOfClients + "\r\n");
		System.out.println("Liczba zamowien: " + this.numberOfOrders + "\r\n");
		System.out.println("Liczba produktow: " + this.numberOfProducts + "\r\n");
	}
}

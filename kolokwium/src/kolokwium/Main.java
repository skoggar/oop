package kolokwium;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Client> allClients = new ArrayList<Client>();
		List<Order> allOrders = new ArrayList<Order>();
		List<ClientGroup> allClientGroups = new ArrayList<ClientGroup>();
		List<Product> allProducts = new ArrayList<Product>();
				
		for(int i=1; i<=10; i++)
		{
			double price = (i^2) * 100;
			allProducts.add(new Product("product"+i,price));
		}
		
		for(int i=1; i<=10; i++)
		{
			allOrders.add(new Order("o"+i));
			

			for(int j=1; j<=9; j++)
			{
				allOrders.get(i-1).addProduct(allProducts.get(j-1));
				allOrders.get(i-1).addProduct(allProducts.get(j)); // zeby troche namieszac w zamowieniach
				
			}
				
			
			
		}
		
		for(int i=1; i<=10; i++)
		{
			allClients.add(new Client("c"+i));
			
			if(i>2)
				allClients.get(i-1).addOrder(allOrders.get(i-2));
			
			allClients.get(i-1).addOrder(allOrders.get(i-1)); //a to po to zeby kazdy klient mial dwa zamowienia
			
		}

		for(int i=1; i<=3; i++)
		{
			allClientGroups.add(new ClientGroup("group"+i));
			allClientGroups.get(i-1).addClient(allClients.get(i));
			allClientGroups.get(i-1).addClient(allClients.get(i*2+1));
			allClientGroups.get(i-1).addClient(allClients.get(i*2+2)); // prawie kazdy klient ma w ten sposób jakąś grupę
			
		
		
		ReportMaker report = new ReportMaker(allClients, allOrders, allProducts);
		report.showReport();
		

		
		
		
		
		

	}

}

package kolokwium;

import java.util.ArrayList;
import java.util.List;

public class ClientGroup {
	String groupName;
	List<Client> clients = new ArrayList<Client>();
	
	public ClientGroup(String groupName)
	{
		this.groupName = groupName;
	}
	
	void addClient(Client client)
	{
		this.clients.add(client);
	}
}

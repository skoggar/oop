package kolokwium;

public interface Visitor {
	
	public void visit(Client client);
	public void visit(Product product);
	public void visit(Order order);
	public void visit(ClientGroup group);
	
}

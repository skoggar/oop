import java.util.ArrayList;

public class PartDb {
	
	ArrayList<Part> lista = new ArrayList<Part>();

	public void addPart(Part part)
	{

		lista.add(part);
		
	}
	public void getPart()
	{
		
		for(Part a: lista)
		{
			a.showDetails();
		}
	}
}


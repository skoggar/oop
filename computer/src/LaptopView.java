
public class LaptopView extends ComputerView {
	
	public LaptopView(PartDb db)
	{
		this.db=db;
	}

 private PartDb db;
	


	public void giveHardDrives()
	{
		System.out.println("	Dyski (laptop):");
		for (Part a: db.lista)
		{
			if(a instanceof LaptopHardDrive)
			{
				System.out.println(a.showDetails());
			}
		}
	
	}
	
	public void giveProcessor()
	{
		System.out.println("	Procesory (laptop):");
		for (Part a: db.lista)
		{
			if(a instanceof LaptopProcessor)
			{
				System.out.println(a.showDetails());
			}
		}
		
	}

}

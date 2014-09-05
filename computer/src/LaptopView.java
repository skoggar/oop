
public class LaptopView extends ComputerView {
	
	public LaptopView(PartDb db)
	{
		this.db=db;
	}

 private PartDb db;
	


	public void giveHardDrives()
	{
		System.out.println("	Lista Dysków dla laptopa:");
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
		System.out.println("	Lista Procesorów dla laptopa:");
		for (Part a: db.lista)
		{
			if(a instanceof LaptopProcessor)
			{
				System.out.println(a.showDetails());
			}
		}
		
	}

}

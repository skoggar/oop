
public abstract class ComputerView 
{
	
	PartDb db = new PartDb();
	


	public void giveHardDrives()
	{
		for (Part a: db.lista)
		{
			if(a instanceof HardDrive)
			{
				System.out.println(a.showDetails());
			}
		}
	
	}
	
	public void giveProcessor()
	{
		for (Part a: db.lista)
		{
			if(a instanceof Processor)
			{
				System.out.println(a.showDetails());
			}
		}
		
	}
	

}
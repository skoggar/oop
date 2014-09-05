
public class DesktopView {
	




	public DesktopView(PartDb db)
	{
		this.db=db;
	}

 private PartDb db;
	


	public void giveHardDrives()
	{
		System.out.println("	Lista Dysk�w dla komputera stacjonarnego:");
		for (Part a: db.lista)
		{
			if(a instanceof DesktopHardDrive)
			{
				System.out.println(a.showDetails());
			}
		}
	
	}
	
	public void giveProcessor()
	{
		System.out.println("	Lista Procesor�w dla komputera stacjonarnego:");
		for (Part a: db.lista)
		{
			if(a instanceof DesktopProcessor)
			{
				System.out.println(a.showDetails());
			}
		}
		
	}

}

package Com.feb04.hiddenclass;

public class HotDrink
{
	public void hotDrink()
	{
		System.out.println("Generic HotDrink");
	}
	
	public void addSugar()
	{
		System.out.println("Add Gerenic Sugar");
	}
     
	public static void main(String[] args)
	{
		HotDrink hd = new HotDrink()
		{
			public void hotDrink()
			{
				System.out.println("Tea IS hotDrink ");
			}
			
			public void addSugar()
			{
				System.out.println("Add sugar in the Tea");
			}
			
		};
		
		hd.hotDrink();
		hd.addSugar();
		
	}
}

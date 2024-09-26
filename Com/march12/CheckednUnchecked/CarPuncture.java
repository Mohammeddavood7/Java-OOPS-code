package Com.march12.CheckednUnchecked;

@SuppressWarnings("serial")
public class CarPuncture extends Exception 
{
	public CarPuncture()
	{
		super();
	}
	public CarPuncture(String errorMessage)
	{
		super(errorMessage);
	}
	
	
	public static void carPuncture(String str)
	{
		try
		{
			if(str == "puncture")
			{
				throw new CarPuncture("Car is punctured..");
			}
			else
			{
				System.out.println("Car is not punctured..");
			}
			
		}
		catch(CarPuncture cp)
		{
			System.err.println(cp.getMessage());
		}
	}

}













































































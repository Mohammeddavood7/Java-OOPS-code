package Com.march12.CheckednUnchecked;

public class CarTest
{
	public static void stop(String str) 
	{
		try
		{
			if(str == "stop")
			{
		       throw new CarStopped("Car is stopped..");
			}
			else 
			{
				System.out.println("car is not stopped...");
			}
		}
		catch(CarStopped c)
		{
			System.err.println(c.getMessage());
		}
	}
	
	

}

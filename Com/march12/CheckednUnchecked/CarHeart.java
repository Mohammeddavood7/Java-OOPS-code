package Com.march12.CheckednUnchecked;

@SuppressWarnings("serial")
public class CarHeart extends Exception
{
	public CarHeart()
	{
		super();
	}
	public CarHeart(String errorMessage)
	{
		super(errorMessage);
	}
	
	public static void carHeart(int num)
	{
		int celcious = num;
		try
		{
		
			if(celcious > 50)
			{
				throw new CarHeart("Car is heated more the 50deg invalid...");
			}
			else
			{
				System.out.println("Car is not heated for CarHeart");
			}
		}
		catch(CarHeart c)
		{
			System.err.println(c.toString());
			
		}
	}
	
	//main method
	public static void main(String[] args)
	{
		CarPuncture.carPuncture("puncture");
		CarTest.stop("stop");
		CarHeart.carHeart(51);
		
	}

}










































































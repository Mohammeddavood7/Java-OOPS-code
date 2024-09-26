package Com.feb22.test;

public class Uber extends Car
{

	@Override
	public void bookRid(String destination)
	{
		System.out.println("Uber booking Rid:\n1.car\n2.bike\nfor this destination availabel vehcile\n"+destination);
		
	}

	
	

}
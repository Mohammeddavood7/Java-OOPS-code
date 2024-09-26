package Com.feb22.test;

public class RiderServices 
{
	private Car car;
	
	RiderServices(Car car)
	{
		this.car = car;
	}
	
	void bookRideToDestination(String destination)
	{
		car.bookRid(destination);
	}

}

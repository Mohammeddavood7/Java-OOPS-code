package Com.feb12.abstraction;

abstract class Car
{
	protected int speed = 80;

	public Car()
	{
		System.out.println("Car class Constructor!!");
	}

	public void getDetails()
	{
		System.out.println("It has 4 wheels and one Engine");
	}
    //abstract method
	public abstract void run();
}

class Honda extends Car
{
	@Override
	public void run()
	{
		System.out.println("Honda Car is Running");
	}
}

public class InterviewQuestion 
{
	public static void main(String[] args) 
	{
		Car c = new Honda();
		System.out.println("Speed is :"+c.speed);
		c.getDetails();
		c.run();
	}
}
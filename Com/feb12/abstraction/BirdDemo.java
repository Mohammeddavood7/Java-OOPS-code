package Com.feb12.abstraction;


abstract class Bird
{
	public abstract void fly();
	
}

class Parrot extends Bird
{
	public void fly()
	{
		System.out.println("Parrot is fly ");
	}
	
}

class Sarrow extends Bird
{
	public void fly()
	{
		System.out.println("Sarrow is fly");
	}
	
}
public class BirdDemo 
{
	public static void main(String[] args)
	{
		Bird b;
	    b = new Parrot();
	    b.fly();
	    b = new Sarrow(); b.fly();
	}

}

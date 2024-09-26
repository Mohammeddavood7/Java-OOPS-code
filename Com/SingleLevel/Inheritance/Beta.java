package Com.SingleLevel.Inheritance;

public class Beta extends Alpha 
{

	public Beta(int x, int y) 
	{
		super(x, y);
		
	}
     
	public void show()
	{
		System.out.println("Adding two number: "+(getX()+getY()));
	}
}

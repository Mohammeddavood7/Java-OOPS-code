package Com.mar2.interview;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();	
}

abstract class Beta extends Alpha
{
	@Override
	public void show() 
	{
	 System.out.println("Show method implemented in Alpha class");		
	}		
}
class Gamma extends Beta
{
	
	@Override
	public void demo() 
	{
	  System.out.println("Demo method implemented in Beta class");		
	}
}

public class AbstractDemo 
{
	public static void main(String[] args)
	{
		Gamma g = new Gamma(); g.show(); g.demo();
	}

}
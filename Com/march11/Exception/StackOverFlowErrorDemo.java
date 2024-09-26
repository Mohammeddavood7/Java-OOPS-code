package Com.march11.Exception;

public class StackOverFlowErrorDemo
{
	
	public void display()
	{
		System.out.println("I am StackOverFlow...");
		display();
		
	}
	
	
	public static void main(String[] args)
	{
		StackOverFlowErrorDemo so = new StackOverFlowErrorDemo();
		try
		{
		  so.display();
		}
		catch(Throwable t)
		{
			System.err.println("Check, The program you have provided its encounter Stack Over Flow");
			
		}
		
	}

}

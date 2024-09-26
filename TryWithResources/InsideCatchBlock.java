package TryWithResources;

public class InsideCatchBlock 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(9/0);
		}
		catch(ArithmeticException e)
		{
			System.err.println("don't divide by zero...");
			
			try 
			{
				System.out.println("Output: "+9/2);
			}
			catch(ArithmeticException ee)
			{
			     System.err.println("don't don't divide by zero..");
			}
			
			
		}
		
	}

}

















































































































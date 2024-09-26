package Com.mar8.TryCatchFinally;

public class TryCatchFinally 
{
	public static void main(String[] args)
	{
		System.out.println("Main Started..");
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.err.println("don't divide by zero");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		
		System.out.println("Main Ended...");
		
	}

}

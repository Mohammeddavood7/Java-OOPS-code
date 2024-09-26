package Com.mar8.TryCatchFinally;

public class TryFinally
{
	public static void main(String[] args)
	{
		System.out.println("Main method started..");
		
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Finally block will be executed");
		}
		
		System.out.println("Main method ended...");
		
	}

}

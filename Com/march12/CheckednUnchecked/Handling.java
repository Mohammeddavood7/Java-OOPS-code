package Com.march12.CheckednUnchecked;

//@SuppressWarnings("serial")
public class Handling // extends Exception
{
	public static void nit(int num)
	{
		
		try 
		{
			String name = "Naresh";
			System.out.println(name);
			nit1(num);
			System.out.println("I");
			
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			
			
		}
		
		
	}
	
	public static void nit1(int num)
	{
		
		try
		{
			System.out.println(10/num);
			System.out.println("Completed...");
		}
		catch(Exception e)
		{
			throw e;
		}
		finally
		{
			System.out.println("Finally Message...");
		}
	}

}

//Naresh
// by zero
//Finally Message...
//1
//Completed...
//Finally Message...


























































































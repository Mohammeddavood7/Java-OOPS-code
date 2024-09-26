package TryWithResources;

public class TryResources implements AutoCloseable
{
	public static void main(String[] args)
	{
		DataBaseClass db = new DataBaseClass();
		FileResources fs = new FileResources();
		TryResources ts = new TryResources();
		
		try(db;fs;ts)
		{
			System.out.println(9/0);
		}
		catch(Exception e)
		{
			System.err.println("don't divide by zero..");
		}
		
	}

	@Override
	public void close() throws Exception 
	{
		System.out.println("TryResources class closed the resources...");
		
		
		
	}

}

package Com.march11.Exception;

public class MyAutoClosable implements AutoCloseable
{

	@Override
	public void close() throws Exception
	{
             System.out.println("MyAutoCloseable Resource is closed..");		
	}
	
	public void display(String str)
	{
		if (str == null)
		{
		  throw new RuntimeException();
		}
		else
		{
		  System.out.println("Yeh,I don't have exception");
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		MyAutoClosable m = new MyAutoClosable();
		
		try(m)
		{
			m.display(null);
		}
		catch(NullPointerException e)
		{
			System.err.println("Null pointer Exception...");
		}
		
		
	}

}













































































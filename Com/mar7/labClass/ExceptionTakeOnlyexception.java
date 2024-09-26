package Com.mar7.labClass;

public class ExceptionTakeOnlyexception
{
	public static void main(String[] args) 
	{
		try
		{
			throw new OutOfMemoryError();
			
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
		
	}

}

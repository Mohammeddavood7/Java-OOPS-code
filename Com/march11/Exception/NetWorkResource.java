package Com.march11.Exception;

public class NetWorkResource implements AutoCloseable
{

	@Override
	public void close() throws Exception
	{
           System.out.println("NetWorkResource is closed...");
	}
	

}

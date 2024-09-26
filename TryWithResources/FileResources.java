package TryWithResources;

public class FileResources implements AutoCloseable
{

	@Override
	public void close() throws Exception
	{
		
		System.out.println("FileResources closed the resources...");
	}
	

}

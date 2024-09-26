package TryWithResources;

import java.io.Closeable;
import java.io.IOException;

public class DataBaseClass implements Closeable
{

	@Override
	public void close() throws IOException 
	{
		System.out.println("DataBaseClass closed the resources...");		
	}

	

}

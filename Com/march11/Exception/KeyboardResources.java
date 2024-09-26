package Com.march11.Exception;

import java.io.Closeable;
import java.io.IOException;

public class KeyboardResources implements Closeable
{

	@Override
	public void close() throws IOException
	{
		System.out.println("KeyboardResources is closed...");
	}
	

}

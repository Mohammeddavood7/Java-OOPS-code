package Com.march11.Exception;

public class ElcClassOfNetWorknKeyboard 
{
	public static void main(String[] args) //throws Exception
	{
		NetWorkResource n = new NetWorkResource();
		KeyboardResources k = new KeyboardResources();
		try(n;k)
		{
			System.out.println(10/0);
			
		}
		catch(Exception e)
		{
			System.err.println("don't divided by zero...");
		}
	}

}

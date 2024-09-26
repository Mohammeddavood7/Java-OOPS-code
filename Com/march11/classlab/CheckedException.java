package Com.march11.classlab;

public class CheckedException
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class<?> forName;

		try
		{
			forName = Class.forName("java.lang.String");
			System.out.println(forName);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}

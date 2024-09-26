package Com.march14.test;

public class Test1 
{
    public static void m1() throws ClassNotFoundException
    {
    	System.out.println("Class Not Found Exception..");
    	
    }
	
	public static void main(String[] args)
	{
	
		try {
			m1();
		} catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		
	}
}

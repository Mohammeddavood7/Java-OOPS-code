package Com.march13.classs;

//public class Test3 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Main started.");
//		m1();
//		System.out.println("Main ended....");
//		
//	}
//
//	
//	static public void m1() throws ArithmeticException
//	{
//		System.out.println(10/0);
//	}
//}



public class Test3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started.");
		
		try
		{
			m1();
		}
		catch (Exception e)
		{
			System.err.println(e.toString());
		}
		
		System.out.println("Main ended....");
		
	}

	
	public static void m1() throws Exception
	{
		System.out.println("m1 started");
		int a = 5;
		
		if(a == 5)
		{ 
			throw new ArithmeticException("don't divided by zero.");  
		}
		else
		{
			System.out.println("valid.. m1");
		}
         
        System.out.println("m1 ended");	
    }
}









































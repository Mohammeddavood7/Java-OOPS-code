package Com.march13.classs;

public class Test1
{
	public static void m1()
	{
		System.out.println("m1 started..");
		m2();
		System.out.println("m1 ended..."); //not executed
	}
	
	public static void m2()
	{
		System.out.println("m2 started....");
		System.out.println(10/0);
		System.out.println("m2 ended.....");//not executed
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method is started....");
		try
		{
		    m1();
		}
		catch(Exception e)
		{
			System.err.println("handle in main.");
		}
		System.out.println("main method is ended....");
		
	}

}




























































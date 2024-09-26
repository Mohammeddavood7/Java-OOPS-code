package Com.march14.classs;

public class Test2 
{
	
	public static void m1()
	{
		throw new OutOfMemoryError();  
	}
	public static void main(String[] args)
	{
		try 
		{
			Test2.m1(); 
		}
		catch (Throwable e)
		{
			System.err.println(" .class file is missed..");
		}
		
		System.out.println("ended....");
		
	}

}









































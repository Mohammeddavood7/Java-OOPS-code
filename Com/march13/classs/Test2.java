package Com.march13.classs;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException
	{
		try {
			m1();
		} catch (Exception e) {
			System.err.println("don't divided by zero");
		}
		
		System.out.println("Main method is ended...");
		
	}
	
	public static void m1() throws InterruptedException
	{
		System.out.println(10/0);
	}

}

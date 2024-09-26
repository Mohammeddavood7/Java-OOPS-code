package Com.arrays.Task;

class A1
{
	final static int a;   //DEFAULT 
	
	//Class = String = null;
	
	static
	{
		System.out.println(a);
	}
}


public class StaticClassLoader
{
	public static void main(String[] args)
	{
		
		System.out.println(A1.a);
	}

}

package ClassLoaderANDInstanceBlock;

public class Recursion
{
	static void m1(int a )
	{
		if(a==0)
		{
			return;     //6 5 4 3 2 2 3 4 5 6
		}
		System.out.println(a+1);
		m1(a-1); //6 5 4 3 2 -1 
		System.out.println(a+1);
	}
	
	public static void main(String [] args)
	{
		Recursion.m1(5);
	}

}

package ClassLoaderANDInstanceBlock;

class Super
{
	static
	{
		System.out.println("super static block");
	}
	int x =10;
	{
		System.out.println("1st non-static block ");
	}
	
	{ 
		//System.out.println(b);
		System.out.println("2nd non-static block");
	}
    int y=10;
    
    public Super()
    {
    	System.out.println("super constructor invoked");
    }
}

 class Sub1 extends Super
{
	static
	{
		System.out.println("sub static block");
	}
	int a = 30;
	{
		System.out.println("sub 1st ns block");
	}
	
	{
		System.out.println("sub 2nd non-static block");
		//System.exit(1);
	}
	
	public Sub1()
	{
		System.out.println("sub constructor invoked ");
	}
     
	
	
	
}
public class Sub
{

	public static void main(String[] args)
	{
		System.out.println("main method");
		Sub1 s = new Sub1();
	}
}











































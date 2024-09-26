package ClassLoaderANDInstanceBlock;



class Parent
{
	public Parent()
	{
		System.out.println("constructor invoked");
	}

	static
	{
		System.out.println("static invoked");
	}
	
	{
		System.out.println("non static non static invoked");
	}
}

public class classload
{
	static
	{
		System.out.println("main static block");
	}
	
	public classload()
	{
		System.out.println("main constructor invoked");
	}
	{
		System.out.println("main non static block invoked");
	}
	
	public static void main(String[] args) 
	{
		new Parent();
		System.out.println("main method is invoked");
	}

}



















































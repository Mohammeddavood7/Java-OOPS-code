package Com.arrays.Task;

class Parent
{
	static
	{
		System.out.println("Parent static block");   // top to bottom
	}
	
	Parent()
	{
		super();
		//non static block
		System.out.println("Parent Class Constructor");
	}
	
	{
		System.out.println("Parent non-static block");
	}
}
class Sub extends Parent
{
	static
	{
		System.out.println("Sub static block");
	}
	
	Sub()
	{
		super();
		System.out.println("Sub Class Constructor");
	}
	
	{
		System.out.println("Sub non-static block");
	}
}
public class StaticLoader 
{
	public static void main(String[] args)
	{
		new Sub();    
	}

}

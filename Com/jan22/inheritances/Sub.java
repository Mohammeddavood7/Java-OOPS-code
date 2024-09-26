package Com.jan22.inheritances;

public class Sub extends Super
{
	
	public Sub()
	{
		super.show("Ravi");
		System.out.println("Sub class constructor");
		this.show();
	}
	
	public void show()
	{
		
	   System.out.println("Method of sub class");
	}

}
